package com.example.butterfield3;

class ItemsModel {
    String items;
    String prices;
    String descriptions;
    int image;

    public ItemsModel(final String items, final String prices, final String descriptions, final int images) {
        this.items = items;
        this.prices = prices;
        this.descriptions = descriptions;
        this.image = image;
    }

    public ItemsModel(String items, String prices, String descriptions) {
    }

    public String getItems() {
        return this.items;
    }

    public String getPrices() {
        return this.prices;
    }

    public String getDescriptions() {
        return this.descriptions;
    }

    public int getImage() {
        return this.image;
    }
}
