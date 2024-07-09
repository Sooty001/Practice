package org.example;
import jakarta.persistence.*;

@Entity
@Table(name = "фильмы")
public class Movies {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "Название")
    private String title;
    @Column(name = "Год выпуска")
    private int releaseYear;
    @Column(name = "Жанр")
    private String genre;
    @Column(name = "Режиссер")
    private String director;
    @Column(name = "Продолжительность")
    private int duration;
    @Column(name = "Рейтинг")
    private float rating;
    @Column(name = "Возрастное ограничение")
    private int ageLimit;


    public Movies(String title, int releaseYear, String genre, String director, int duration, float rating, int ageLimit){
        this.title = title;
        this.releaseYear = releaseYear;
        this.genre = genre;
        this.director = director;
        this.duration = duration;
        this.rating = rating;
        this.ageLimit = ageLimit;
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }


    public int getReleaseYear() {
        return releaseYear;
    }
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }


    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }


    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }


    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }


    public float getRating() {
        return rating;
    }
    public void setRating(float rating) {
        this.rating = rating;
    }


    public int getAgeLimit() {
        return ageLimit;
    }
    public void setAgeLimit(int ageLimit) {
        this.ageLimit = ageLimit;
    }
}
