package ru.likekey.ytbot.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "computers")
public class Computer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "photo")
    private String photo;

    @Column(name = "price")
    private int price;

    @Column(name = "power")
    private int power;

    @ManyToMany(cascade = CascadeType.MERGE)
    @JoinTable(name = "user_computer",
            joinColumns = @JoinColumn(name = "computer_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id"))
    private List<User> users;

    public Computer() {
    }

    public Computer(String name, String photo, int price, int power) {
        this.name = name;
        this.photo = photo;
        this.price = price;
        this.power = power;
    }

    public void addUserToComputer(User user) {
        if (users == null) users = new ArrayList<>();
        users.add(user);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
