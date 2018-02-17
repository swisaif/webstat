package com.techpro.webstat.models;

import javax.persistence.*;


@Entity
@Table(name = "serie_proto")
public class SerieProto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int spr_id;
    @Column(name = "spr_periode")
    public String spr_periode;
    @Column(name = "spr_numero")
    public String spr_numero;
    @Column(name = "spr_appels")
    public int spr_appels;
    @Column(name = "spr_duree")
    public int spr_duree;
    @Column(name = "spr_retour")
    public String spr_retour;
    @Column(name = "spr_version")
    public String spr_version;
    @Column(name = "spr_vitesse")
    public String spr_vitesse;

    public SerieProto() {
    }

    public SerieProto(String spr_periode, String spr_numero, int spr_appels, int spr_duree, String spr_retour, String spr_version, String spr_vitesse) {
        this.spr_periode = spr_periode;
        this.spr_numero = spr_numero;
        this.spr_appels = spr_appels;
        this.spr_duree = spr_duree;
        this.spr_retour = spr_retour;
        this.spr_version = spr_version;
        this.spr_vitesse = spr_vitesse;
    }



    public int getSpr_id() {
        return spr_id;
    }

    public void setSpr_id(int spr_id) {
        this.spr_id = spr_id;
    }

    public String getSpr_periode() {
        return spr_periode;
    }

    public void setSpr_periode(String spr_periode) {
        this.spr_periode = spr_periode;
    }

    public String getSpr_numero() {
        return spr_numero;
    }

    public void setSpr_numero(String spr_numero) {
        this.spr_numero = spr_numero;
    }

    public int getSpr_appels() {
        return spr_appels;
    }

    public void setSpr_appels(int spr_appels) {
        this.spr_appels = spr_appels;
    }

    public int getSpr_duree() {
        return spr_duree;
    }

    public void setSpr_duree(int spr_duree) {
        this.spr_duree = spr_duree;
    }

    public String getSpr_retour() {
        return spr_retour;
    }

    public void setSpr_retour(String spr_retour) {
        this.spr_retour = spr_retour;
    }

    public String getSpr_version() {
        return spr_version;
    }

    public void setSpr_version(String spr_version) {
        this.spr_version = spr_version;
    }

    public String getSpr_vitesse() {
        return spr_vitesse;
    }

    public void setSpr_vitesse(String spr_vitesse) {
        this.spr_vitesse = spr_vitesse;
    }






}
