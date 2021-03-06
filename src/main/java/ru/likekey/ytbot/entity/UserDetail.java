package ru.likekey.ytbot.entity;

import javax.persistence.*;

@Entity
@Table(name = "users_detail")
public class UserDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "subscribers")
    private int subscribers;

    @Column(name = "views")
    private int views;

    @Column(name = "videos")
    private int videos;

    @Column(name = "power")
    private int power;

    @Column(name = "rating")
    private int rating;

    @Column(name = "coolness")
    private int coolness;

    @Column(name = "mes_sent")
    private int mes_sent;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "users_id")
    private User users_id;

    public UserDetail() {
        this.subscribers = 0;
        this.views = 0;
        this.videos = 0;
        this.mes_sent = 1;
        this.rating = 0;
        this.power = 10;
        this.coolness = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(int subscribers) {
        this.subscribers = subscribers;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getVideos() {
        return videos;
    }

    public void setVideos(int videos) {
        this.videos = videos;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getMes_sent() {
        return mes_sent;
    }

    public void setMes_sent(int mes_sent) {
        this.mes_sent = mes_sent;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getCoolness() {
        return coolness;
    }

    public void setCoolness(int coolness) {
        this.coolness = coolness;
    }

    public User getUsers_id() {
        return users_id;
    }

    public void setUsers_id(User users_id) {
        this.users_id = users_id;
    }
}
