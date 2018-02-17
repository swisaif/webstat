package com.techpro.webstat.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "user_roles")
public class Role implements Serializable {

    public int user_role_id;
    public String username;
    public String role;
    public User user;

    public void setUser_role_id(int user_role_id) {
        this.user_role_id = user_role_id;
    }

    @OneToOne(mappedBy = "ro", cascade = CascadeType.ALL)
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getUsername() {
        return username;
    }

    public Role(String username, String role) {
        this.username = username;
        this.role = role;
    }

    public Role() {
    }


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getUser_role_id() {
        return user_role_id;
    }



    public void setUsername(String username) {
        this.username = username;
    }

    @Column(name = "role")
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }



}
