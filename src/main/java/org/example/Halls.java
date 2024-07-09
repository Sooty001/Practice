package org.example;
import jakarta.persistence.*;

@Entity
@Table(name = "залы")
public class Halls {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "Количество мест")
    private int seats;
    @Column(name = "Тип зала")
    private String type;
    @Column(name = "Номер зала")
    private int hallNumber;


    public Halls(int seats, String type, int hallNumber) {
        this.seats = seats;
        this.type = type;
        this.hallNumber = hallNumber;
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


    public int getSeats() {
        return seats;
    }
    public void setSeats(int seats) {
        this.seats = seats;
    }


    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }


    public int getHallNumber() {
        return hallNumber;
    }
    public void setHallNumber(int hallNumber) {
        this.hallNumber = hallNumber;
    }
}