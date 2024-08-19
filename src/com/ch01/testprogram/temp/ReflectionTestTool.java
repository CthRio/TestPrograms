package com.ch01.testprogram.temp;

import java.util.*;
import java.lang.reflect.*;

// Data generator interface
interface DataGenerator<T> {
    T generate();
}

// CharSequence -> Integer Map generator
class StringIntegerMapGenerator implements DataGenerator<Map<CharSequence, Integer>> {
    private int size;

    public StringIntegerMapGenerator(int size) {
        this.size = size;
    }

    @Override
    public Map<CharSequence, Integer> generate() {
        Map<CharSequence, Integer> map = new HashMap<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            map.put("key" + i, random.nextInt(10) + 1);
        }
        return map;
    }
}

// List generator
class ListGenerator<T> implements DataGenerator<List<T>> {
    private int size;
    private DataGenerator<T> elementGenerator;

    public ListGenerator(int size, DataGenerator<T> elementGenerator) {
        this.size = size;
        this.elementGenerator = elementGenerator;
    }

    @Override
    public List<T> generate() {
        List<T> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(elementGenerator.generate());
        }
        return list;
    }
}

// Set generator
class SetGenerator<T> implements DataGenerator<Set<T>> {
    private int size;
    private DataGenerator<T> elementGenerator;

    public SetGenerator(int size, DataGenerator<T> elementGenerator) {
        this.size = size;
        this.elementGenerator = elementGenerator;
    }

    @Override
    public Set<T> generate() {
        Set<T> set = new HashSet<>();
        for (int i = 0; i < size; i++) {
            set.add(elementGenerator.generate());
        }
        return set;
    }
}

// Custom Object generator
class CustomObject {
    private String name;
    private int value;

    public CustomObject(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return "CustomObject{name='" + name + "', value=" + value + '}';
    }
}

class CustomObjectGenerator implements DataGenerator<CustomObject> {
    @Override
    public CustomObject generate() {
        Random random = new Random();
        return new CustomObject("Name" + random.nextInt(100), random.nextInt(100));
    }
}

public class ReflectionTestTool {

    public static void main(String[] args) {
        try {
            // Specify the method to test
            Method method = ReflectionTestTool.class.getMethod("cosineSimilarity", Map.class, Map.class);

            // Generate test data and invoke the method
            Object[] params = generateTestData(method);
            Double result = (Double) method.invoke(null, params);

            // Print the result
            System.out.println("Result: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Method to generate test data based on method parameters
    private static Object[] generateTestData(Method method) throws Exception {
        Parameter[] parameters = method.getParameters();
        Object[] testData = new Object[parameters.length];

        for (int i = 0; i < parameters.length; i++) {
            testData[i] = generateData(parameters[i].getParameterizedType());
        }

        return testData;
    }

    // Recursive method to generate data based on parameter type
    private static Object generateData(Type type) throws Exception {
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type rawType = parameterizedType.getRawType();

            if (rawType.equals(Map.class)) {
                Type keyType = parameterizedType.getActualTypeArguments()[0];
                Type valueType = parameterizedType.getActualTypeArguments()[1];
                return generateMap((Class<?>) keyType, (Class<?>) valueType, 5);
            } else if (rawType.equals(List.class)) {
                Type elementType = parameterizedType.getActualTypeArguments()[0];
                return generateList((Class<?>) elementType, 5);
            } else if (rawType.equals(Set.class)) {
                Type elementType = parameterizedType.getActualTypeArguments()[0];
                return generateSet((Class<?>) elementType, 5);
            }
        } else if (type instanceof Class<?>) {
            Class<?> clazz = (Class<?>) type;
            if (clazz.equals(Integer.class)) {
                return new Random().nextInt(100);
            } else if (clazz.equals(String.class)) {
                return "String" + new Random().nextInt(100);
            } else if (clazz.equals(CustomObject.class)) {
                return new CustomObjectGenerator().generate();
            }
        }
        throw new IllegalArgumentException("Unsupported type: " + type);
    }

    private static Map<CharSequence, Integer> generateMap(Class<?> keyType, Class<?> valueType, int size) {
        Map<CharSequence, Integer> map = new HashMap<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            map.put((CharSequence) ("key" + random.nextInt(100)), random.nextInt(10) + 1);
        }
        return map;
    }

    private static <T> List<T> generateList(Class<T> elementType, int size) throws Exception {
        List<T> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(elementType.cast(generateData(elementType)));
        }
        return list;
    }

    private static <T> Set<T> generateSet(Class<T> elementType, int size) throws Exception {
        Set<T> set = new HashSet<>();
        for (int i = 0; i < size; i++) {
            set.add(elementType.cast(generateData(elementType)));
        }
        return set;
    }

    // Cosine similarity method
    public static Double cosineSimilarity(final Map<CharSequence, Integer> leftVector,
                                          final Map<CharSequence, Integer> rightVector) {
        if (leftVector == null || rightVector == null) {
            throw new IllegalArgumentException("Vectors must not be null");
        }

        final Set<CharSequence> intersection = getIntersection(leftVector, rightVector);

        final double dotProduct = dot(leftVector, rightVector, intersection);
        double d1 = 0.0d;
        for (final Integer value : leftVector.values()) {
            d1 += Math.pow(value, 2);
        }
        double d2 = 0.0d;
        for (final Integer value : rightVector.values()) {
            d2 += Math.pow(value, 2);
        }
        final double cosineSimilarity;
        if (d1 <= 0.0 || d2 <= 0.0) {
            cosineSimilarity = 0.0;
        } else {
            cosineSimilarity = dotProduct / (Math.sqrt(d1) * Math.sqrt(d2));
        }
        return cosineSimilarity;
    }

    // Method to get intersection of keys
    private static Set<CharSequence> getIntersection(final Map<CharSequence, Integer> leftVector,
                                                     final Map<CharSequence, Integer> rightVector) {
        Set<CharSequence> intersection = new java.util.HashSet<>(leftVector.keySet());
        intersection.retainAll(rightVector.keySet());
        return intersection;
    }

    // Method to calculate dot product
    private static double dot(final Map<CharSequence, Integer> leftVector,
                              final Map<CharSequence, Integer> rightVector,
                              final Set<CharSequence> intersection) {
        long dotProduct = 0;
        for (final CharSequence key : intersection) {
            dotProduct += leftVector.get(key) * rightVector.get(key);
        }
        return dotProduct;
    }
}