package ru.pip.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user_tb", schema = "lab9", catalog = "pip_lab9")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "nickname")
    private String nickname;

    @Column(name = "password")
    private String password;

    @OneToMany(mappedBy = "user")
    private List<Dot> dots;

    public User() {
    }

    public User(String nickname, String password) {
        this.nickname = nickname;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Dot> getDots() {
        return dots;
    }

    public void setDots(List<Dot> dots) {
        this.dots = dots;
    }
}
