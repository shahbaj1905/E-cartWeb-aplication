package ecart.com.model;

import jakarta.persistence.*;

@Entity
@Table
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ordersId;
    private  String ordersDate;
    private String items;
    private double totalPrice;
    private int userId;
    private String status;

    @Override
    public String toString() {
        return "Orders{" +
                "ordersId=" + ordersId +
                ", ordersDate='" + ordersDate + '\'' +
                ", items='" + items + '\'' +
                ", totalPrice=" + totalPrice +
                ", userId=" + userId +
                ", status='" + status + '\'' +
                '}';
    }

    public Orders(int ordersId, String ordersDate, String items, double totalPrice, int userId, String status) {
        this.ordersId = ordersId;
        this.ordersDate = ordersDate;
        this.items = items;
        this.totalPrice = totalPrice;
        this.userId = userId;
        this.status = status;
    }




    public int getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(int ordersId) {
        this.ordersId = ordersId;
    }

    public String getOrdersDate() {
        return ordersDate;
    }

    public void setOrdersDate(String ordersDate) {
        this.ordersDate = ordersDate;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
