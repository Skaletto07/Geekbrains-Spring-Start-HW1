package com.kostkin.homework1;

public class Product {
    private final long id;
    private final String title;
    private final int cost;

    public Product(long id, String title, int cost) {
        this.id = id;
        this.title = title;
        this.cost = cost;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", cost=" + cost +
                '}';
    }
}
