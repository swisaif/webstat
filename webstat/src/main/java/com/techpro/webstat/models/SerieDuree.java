package com.techpro.webstat.models;

import javax.persistence.*;


@Entity
@Table(name = "serie_duree")
public class SerieDuree {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int sdu_id;
    @Column(name = "sdu_periode")
    public String sdu_periode;
    @Column(name = "sdu_numero")
    public String sdu_numero;
    @Column(name = "sdu_stat_duree")
    public int sdu_stat_duree;
    @Column(name = "sdu_appels")
    public int sdu_appels;
    @Column(name = "sdu_retour")
    public String sdu_retour;

    public SerieDuree() {
    }

    public SerieDuree(String sdu_periode, String sdu_numero, int sdu_stat_duree, int sdu_appels, String sdu_retour) {
        this.sdu_periode = sdu_periode;
        this.sdu_numero = sdu_numero;
        this.sdu_stat_duree = sdu_stat_duree;
        this.sdu_appels = sdu_appels;
        this.sdu_retour = sdu_retour;
    }

    public int getSdu_id() {

        return sdu_id;

    }

    public void setSdu_id(int sdu_id) {
        this.sdu_id = sdu_id;
    }

    public String getSdu_periode() {
        return sdu_periode;
    }

    public void setSdu_periode(String sdu_periode) {
        this.sdu_periode = sdu_periode;
    }

    public String getSdu_numero() {
        return sdu_numero;
    }

    public void setSdu_numero(String sdu_numero) {
        this.sdu_numero = sdu_numero;
    }

    public int getSdu_stat_duree() {
        return sdu_stat_duree;
    }

    public void setSdu_stat_duree(int sdu_stat_duree) {
        this.sdu_stat_duree = sdu_stat_duree;
    }

    public int getSdu_appels() {
        return sdu_appels;
    }

    public void setSdu_appels(int sdu_appels) {
        this.sdu_appels = sdu_appels;
    }

    public String getSdu_retour() {
        return sdu_retour;
    }

    public void setSdu_retour(String sdu_retour) {
        this.sdu_retour = sdu_retour;
    }




}
