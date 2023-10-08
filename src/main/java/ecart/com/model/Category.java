package ecart.com.model;

import jakarta.persistence.*;

@Entity
@Table
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int catId;
    private String catName;
    private String catDes;
    private String status;

    public int getCatId() {
        return catId;
    }

    @Override
    public String toString() {
        return "Category{" +
                "catId=" + catId +
                ", catName='" + catName + '\'' +
                ", catDes='" + catDes + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public Category(int catId, String catName, String catDes, String status) {
        this.catId = catId;
        this.catName = catName;
        this.catDes = catDes;
        this.status = status;
    }

    public void setCatId(int catId) {
        this.catId = catId;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getCatDes() {
        return catDes;
    }

    public void setCatDes(String catDes) {
        this.catDes = catDes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }





}
