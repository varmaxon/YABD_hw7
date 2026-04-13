package ru.bmstu.yabd.model;

// TODO 1: Замените класс на Java Record
// Поля: orderId (String), product (String), quantity (int), price (double)
public class OrderEvent {
    private String orderId;
    private String product;
    private int quantity;
    private double price;

    public OrderEvent() {}

    public OrderEvent(String orderId, String product, int quantity, double price) {
        this.orderId = orderId;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public String getOrderId() { return orderId; }
    public void setOrderId(String orderId) { this.orderId = orderId; }
    public String getProduct() { return product; }
    public void setProduct(String product) { this.product = product; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}
