package ecart.com.model;

import jakarta.persistence.*;

@Entity
@Table
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String userName;
    private String password;


    private String stetus;

    public Admin(int id, String userName, String password, String stetus) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.stetus = stetus;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", stetus='" + stetus + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStetus() {
        return stetus;
    }

    public void setStetus(String stetus) {
        this.stetus = stetus;
    }


}
