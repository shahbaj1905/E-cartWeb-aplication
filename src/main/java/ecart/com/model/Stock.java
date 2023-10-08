package ecart.com.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Stock")
public class Stock {
    public Stock(int stockId, int prodId, int quantity, int totalSold) {
        StockId = stockId;
        this.prodId = prodId;
        this.quantity = quantity;
        this.totalSold = totalSold;
    }

    public int getStockId() {
        return StockId;
    }

    public void setStockId(int stockId) {
        StockId = stockId;
    }

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTotalSold() {
        return totalSold;
    }

    public void setTotalSold(int totalSold) {
        this.totalSold = totalSold;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int StockId;
    private int prodId;
    private int quantity;
    private int totalSold;


    @Override
    public String toString() {
        return "Stock{" +
                "StockId=" + StockId +
                ", prodId=" + prodId +
                ", quantity=" + quantity +
                ", totalSold=" + totalSold +
                '}';
    }
}
