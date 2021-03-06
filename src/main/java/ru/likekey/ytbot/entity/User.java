package ru.likekey.ytbot.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "vkId")
    private int vkId;

    @Column(name = "place")
    private String place;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "details_id")
    private UserDetail details_id;

    @ManyToMany(cascade = CascadeType.MERGE)
    @JoinTable(name = "user_computer",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "computer_id"))
    private List<Computer> computers;

    public User() {
    }

    public User(int vkId) {
        this.vkId = vkId;
        this.place = "MAIN";
    }

    public void addComputerToUser(Computer computer) {
        if (computers == null) computers = new ArrayList<>();
        computers.add(computer);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVkId() {
        return vkId;
    }

    public void setVkId(int vkId) {
        this.vkId = vkId;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public UserDetail getDetails_id() {
        return details_id;
    }

    public void setDetails_id(UserDetail details_id) {
        this.details_id = details_id;
    }

    public List<Computer> getComputers() {
        return computers;
    }

    public void setComputers(List<Computer> computers) {
        this.computers = computers;
    }
}
