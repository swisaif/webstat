package com.techpro.webstat.models;

import javax.persistence.*;

@Entity
@Table(name = "sdas")
public class SDAs {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int sda_id;
    @Column(name = "sda")
    public String sda;
    @Column(name = "oper_sda")
    public String oper_sda;
    @Column(name = "num_sda")
    public String num_sda;
    @Column(name = "oper_num")
    public String oper_num;


    public SDAs() {
    }

    public SDAs(String sda, String oper_sda, String num_sda, String oper_num) {
        this.sda = sda;
        this.oper_sda = oper_sda;
        this.num_sda = num_sda;
        this.oper_num = oper_num;
    }

    public String getSda() {
        return sda;
    }

    public void setSda(String sda) {
        this.sda = sda;
    }

    public String getOper_sda() {
        return oper_sda;
    }

    public void setOper_sda(String oper_sda) {
        this.oper_sda = oper_sda;
    }

    public String getNum_sda() {
        return num_sda;
    }

    public void setNum_sda(String num_sda) {
        this.num_sda = num_sda;
    }

    public String getOper_num() {
        return oper_num;
    }

    public void setOper_num(String oper_num) {
        this.oper_num = oper_num;
    }

    public int getSda_id() {
        return sda_id;
    }
}
