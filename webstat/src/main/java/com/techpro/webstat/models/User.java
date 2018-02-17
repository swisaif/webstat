package com.techpro.webstat.models;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    public Role ro;
    public int user_id;
    public String username;
    public String password;
    public String usernumero;
    public int homepage = 1;



    public User() {

    }



    public User(String username, String password, int enabled) {
        this.username = username;
        this.password = password;
        this.homepage = enabled;

    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "username", referencedColumnName = "username", insertable = false, updatable = false)
    public Role getRo() {
        return ro;
    }

    public void setRo(Role ro) {
        this.ro = ro;
    }






    @Column(name = "user_numero")
    public String getUsernumero() {
        return usernumero;
    }

    public void setUsernumero(String usernumero) {
        this.usernumero = usernumero;
    }

    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "enabled")
    public int getEnabled() {
        return homepage;
    }

    public void setEnabled(int enabled) {
        this.homepage = enabled;
    }





}
