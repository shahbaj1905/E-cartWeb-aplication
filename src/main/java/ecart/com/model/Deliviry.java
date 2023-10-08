package ecart.com.model;

import jakarta.persistence.*;

@Entity
@Table
public class Deliviry {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int delivryId;
    private int orderId;
    private String deliveryStatus;
    private  String deliveryDate;
    public Deliviry(int delivryId, int orderId, String deliveryStatus, String deliveryDate) {
        this.delivryId = delivryId;
        this.orderId = orderId;
        this.deliveryStatus = deliveryStatus;
        this.deliveryDate = deliveryDate;
    }

    public int getDelivryId() {
        return delivryId;
    }

    public void setDelivryId(int delivryId) {
        this.delivryId = delivryId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }



    @Override
    public String toString() {
        return "Deliviry{" +
                "delivryId=" + delivryId +
                ", orderId=" + orderId +
                ", deliveryStatus='" + deliveryStatus + '\'' +
                ", deliveryDate='" + deliveryDate + '\'' +
                '}';
    }
}
