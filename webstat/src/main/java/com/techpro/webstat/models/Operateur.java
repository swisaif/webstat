package com.techpro.webstat.models;

import javax.persistence.*;

@Entity
@Table(name = "operateur")
public class Operateur {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int oper_id;
    @Column(name = "oper_name")
    public String oper_name;

    public Operateur() {
    }


    public Operateur(String oper_name) {
        this.oper_name = oper_name;
    }

    public int getOper_id() {
        return oper_id;
    }

    public void setOper_id(int oper_id) {
        this.oper_id = oper_id;
    }

    public String getOper_name() {
        return oper_name;
    }

    public void setOper_name(String oper_name) {
        this.oper_name = oper_name;
    }







}
