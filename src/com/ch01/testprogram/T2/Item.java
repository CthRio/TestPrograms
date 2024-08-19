package com.ch01.testprogram.T2;

class Item {
    private int itemId;
    private String itemName;
    private int quantity;
    private int minStock;
    private int maxStock;

    public Item(int itemId, String itemName, int quantity, int minStock, int maxStock) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.minStock = minStock;
        this.maxStock = maxStock;
    }

    // Getters and Setters
    public int getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getMinStock() {
        return minStock;
    }

    public void setMinStock(int minStock) {
        this.minStock = minStock;
    }

    public int getMaxStock() {
        return maxStock;
    }

    public void setMaxStock(int maxStock) {
        this.maxStock = maxStock;
    }
}