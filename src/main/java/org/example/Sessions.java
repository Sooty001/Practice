package org.example;
import jakarta.persistence.*;

@Entity
@Table(name = "сеансы")
public class Sessions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "Время начала")
    private String start_time;
    @Column(name = "Дата")
    private String date;


    public Sessions(String start_time, String date) {
        this.start_time = start_time;
        this.date = date;
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


    public String getStart_time() {
        return start_time;
    }
    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }


    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
}