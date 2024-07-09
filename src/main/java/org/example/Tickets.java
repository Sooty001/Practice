package org.example;
import jakarta.persistence.*;

@Entity
@Table(name = "билеты")
public class Tickets {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "Цена")
    private float price;
    @Column(name = "Статус")
    private String status;
    @Column(name = "Место")
    private String place;


    public Tickets(float price, String status, String place){
        this.price = price;
        this.status = status;
        this.place = place;
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }


    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }


    public String getPlace() {
        return place;
    }
    public void setPlace(String place) {
        this.place = place;
    }

}