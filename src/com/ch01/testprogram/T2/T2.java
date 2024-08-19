package com.ch01.testprogram.T2;

public class T2 {
    /*样例输出：
    Item added successfully.
    Item added successfully.
    Item updated successfully.
    Stock level for Screws is within the normal range.
    Stock level for Nails is within the normal range.
    Item removed successfully.
    ID: 101, Name: Screws, Quantity: 70, Min Stock: 20, Max Stock: 100
    All numbers are different.
    The sum of the numbers is odd.
    All numbers are positive.
    The product of the numbers is greater than 1000.
    At least one number is even.
    Numbers are in ascending order.
    The sum of the numbers is odd.
    All numbers are positive.
    The product of the numbers is less than or equal to 1000.
    At least one number is even.
    All numbers are equal.
    The sum of the numbers is odd.
    All numbers are positive.
    The product of the numbers is greater than 1000.
    All numbers are odd.
    Numbers are in descending order.
    The sum of the numbers is odd.
    All numbers are negative.
    The product of the numbers is less than or equal to 1000.
    At least one number is even.
    Numbers are in ascending order.
    The sum of the numbers is even.
    All numbers are positive.
    The product of the numbers is greater than 1000.
    At least one number is even.
    * */
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        manager.addItem(101, "Screws", 50, 20, 100);
        manager.addItem(102, "Nails", 150, 50, 200);
        manager.updateItem(101, 70, 20, 100);
        manager.checkStockLevels(101);
        manager.checkStockLevels(102);

        manager.removeItem(102);
        manager.printInventory();

        manager.complexCheck(10, 5, 15, 20, 25);
        manager.complexCheck(1, 2, 3, 4, 5);
        manager.complexCheck(5, 5, 5, 5, 5);
        manager.complexCheck(-1, -2, -3, -4, -5);
        manager.complexCheck(100, 200, 300, 400, 500);
    }
}
