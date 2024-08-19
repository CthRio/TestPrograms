package com.ch01.testprogram.T2;

import java.util.HashMap;
import java.util.Map;

class InventoryManager {
    private Map<Integer, Item> inventory;

    public InventoryManager() {
        this.inventory = new HashMap<>();
    }

    // 添加物品
    public void addItem(int itemId, String itemName, int quantity, int minStock, int maxStock) {
        if (inventory.containsKey(itemId)) {
            System.out.println("Item already exists. Use updateItem to update the existing item.");
        } else {
            Item item = new Item(itemId, itemName, quantity, minStock, maxStock);
            inventory.put(itemId, item);
            System.out.println("Item added successfully.");
        }
    }

    // 更新物品信息
    public void updateItem(int itemId, int quantity, int minStock, int maxStock) {
        if (inventory.containsKey(itemId)) {
            Item item = inventory.get(itemId);
            item.setQuantity(quantity);
            item.setMinStock(minStock);
            item.setMaxStock(maxStock);
            System.out.println("Item updated successfully.");
        } else {
            System.out.println("Item not found. Use addItem to add the item first.");
        }
    }

    // 删除物品
    public void removeItem(int itemId) {
        if (inventory.containsKey(itemId)) {
            inventory.remove(itemId);
            System.out.println("Item removed successfully.");
        } else {
            System.out.println("Item not found in inventory.");
        }
    }

    /*// 检查库存水平
    public void checkStockLevels(int itemId) {
        if (inventory.containsKey(itemId)) {
            Item item = inventory.get(itemId);
            int quantity = item.getQuantity();
            int minStock = item.getMinStock();
            int maxStock = item.getMaxStock();

            if (quantity < minStock) {
                System.out.println("Stock for " + item.getItemName() + " is below the minimum level.");
            } else if (quantity > maxStock) {
                System.out.println("Stock for " + item.getItemName() + " exceeds the maximum level.");
            } else {
                System.out.println("Stock level for " + item.getItemName() + " is within the normal range.");
            }

            if (quantity == 0) {
                System.out.println("Stock for " + item.getItemName() + " is depleted.");
            } else if (quantity == minStock) {
                System.out.println("Stock for " + item.getItemName() + " is at the minimum threshold.");
            } else if (quantity == maxStock) {
                System.out.println("Stock for " + item.getItemName() + " is at the maximum threshold.");
            } else if (quantity < 10) {
                System.out.println("Low stock for " + item.getItemName());
            } else if (quantity > 200) {
                System.out.println("Overstock for " + item.getItemName());
            }

            if (minStock > maxStock) {
                System.out.println("Minimum stock is greater than maximum stock for " + item.getItemName());
            } else if (minStock < 0) {
                System.out.println("Minimum stock is negative for " + item.getItemName());
            }

            if (quantity == minStock + 1) {
                System.out.println("Stock for " + item.getItemName() + " is just above the minimum level.");
            } else if (quantity == maxStock - 1) {
                System.out.println("Stock for " + item.getItemName() + " is just below the maximum level.");
            } else if (quantity == (minStock + maxStock) / 2) {
                System.out.println("Stock for " + item.getItemName() + " is at the midpoint.");
            }
        } else {
            System.out.println("Item not found in inventory.");
        }
    }*/

    // 检查库存水平
    public void checkStockLevels(int itemId) {
        if (inventory.containsKey(itemId)) {
            Item item = inventory.get(itemId);
            checkStockBounds(item.getQuantity(), item.getMinStock(), item.getMaxStock(), item.getItemName());
            checkStockThresholds(item.getQuantity(), item.getMinStock(), item.getMaxStock(), item.getItemName());
        } else {
            System.out.println("Item not found in inventory.");
        }
    }

    private void checkStockBounds(int quantity, int minStock, int maxStock, String itemName) {
        if (quantity < minStock) {
            System.out.println("Stock for " + itemName + " is below the minimum level.");
        } else if (quantity > maxStock) {
            System.out.println("Stock for " + itemName + " exceeds the maximum level.");
        } else {
            System.out.println("Stock level for " + itemName + " is within the normal range.");
        }
    }

    private void checkStockThresholds(int quantity, int minStock, int maxStock, String itemName) {
        if (quantity == 0) {
            System.out.println("Stock for " + itemName + " is depleted.");
        } else if (quantity == minStock) {
            System.out.println("Stock for " + itemName + " is at the minimum threshold.");
        } else if (quantity == maxStock) {
            System.out.println("Stock for " + itemName + " is at the maximum threshold.");
        } else if (quantity < 10) {
            System.out.println("Low stock for " + itemName);
        } else if (quantity > 200) {
            System.out.println("Overstock for " + itemName);
        }

        if (minStock > maxStock) {
            System.out.println("Minimum stock is greater than maximum stock for " + itemName);
        } else if (minStock < 0) {
            System.out.println("Minimum stock is negative for " + itemName);
        }

        if (quantity == minStock + 1) {
            System.out.println("Stock for " + itemName + " is just above the minimum level.");
        } else if (quantity == maxStock - 1) {
            System.out.println("Stock for " + itemName + " is just below the maximum level.");
        } else if (quantity == (minStock + maxStock) / 2) {
            System.out.println("Stock for " + itemName + " is at the midpoint.");
        }
    }

    // 复杂检查方法
    public void complexCheck(int a, int b, int c, int d, int e) {
        if (a > b && b > c && c > d && d > e) {
            System.out.println("Numbers are in descending order.");
        } else if (a < b && b < c && c < d && d < e) {
            System.out.println("Numbers are in ascending order.");
        } else if (a == b && b == c && c == d && d == e) {
            System.out.println("All numbers are equal.");
        } else if (a != b && b != c && c != d && d != e) {
            System.out.println("All numbers are different.");
        }


        if ((a + b + c + d + e) % 2 == 0) {
            System.out.println("The sum of the numbers is even.");
        } else {
            System.out.println("The sum of the numbers is odd.");
        }

        if (a > 0 && b > 0 && c > 0 && d > 0 && e > 0) {
            System.out.println("All numbers are positive.");
        } else if (a < 0 && b < 0 && c < 0 && d < 0 && e < 0) {
            System.out.println("All numbers are negative.");
        }

        if (a * b * c * d * e > 1000) {
            System.out.println("The product of the numbers is greater than 1000.");
        } else {
            System.out.println("The product of the numbers is less than or equal to 1000.");
        }

        if (a % 2 == 0 || b % 2 == 0 || c % 2 == 0 || d % 2 == 0 || e % 2 == 0) {
            System.out.println("At least one number is even.");
        }

        if (a % 2 != 0 && b % 2 != 0 && c % 2 != 0 && d % 2 != 0 && e % 2 != 0) {
            System.out.println("All numbers are odd.");
        }
    }

    // 打印库存
    public void printInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            for (Item item : inventory.values()) {
                System.out.println("ID: " + item.getItemId() + ", Name: " + item.getItemName()
                        + ", Quantity: " + item.getQuantity() + ", Min Stock: " + item.getMinStock()
                        + ", Max Stock: " + item.getMaxStock());
            }
        }
    }
}