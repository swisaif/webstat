package com.techpro.webstat.models;

import javax.persistence.*;

@Entity
@Table(name = "serie_horaire")
public class SerieHoraire {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int sho_id;
    @Column(name = "sho_periode")
    public String sho_periode;
    @Column(name = "sho_heure")
    public String sho_heure;
    @Column(name = "sho_appels")
    public int sho_appels;
    @Column(name = "sho_duree")
    public int sho_duree;
    @Column(name = "sho_numero")
    public String sho_numero;
    @Column(name = "sho_retour")
    public String sho_retour;


    public SerieHoraire( String sho_periode, String sho_heure, int sho_appels, int sho_duree, String sho_numero, String sho_retour) {
        this.sho_periode = sho_periode;
        this.sho_heure = sho_heure;
        this.sho_appels = sho_appels;
        this.sho_duree = sho_duree;
        this.sho_numero = sho_numero;
        this.sho_retour = sho_retour;
    }


    public SerieHoraire() {
    }


    public int getSho_id() {
        return sho_id;
    }

    public void setSho_id(int sho_id) {
        this.sho_id = sho_id;
    }

    public String getSho_periode() {
        return sho_periode;
    }

    public void setSho_periode(String sho_periode) {
        this.sho_periode = sho_periode;
    }

    public String getSho_heure() {
        return sho_heure;
    }

    public void setSho_heure(String sho_heure) {
        this.sho_heure = sho_heure;
    }

    public int getSho_appels() {
        return sho_appels;
    }

    public void setSho_appels(int sho_appels) {
        this.sho_appels = sho_appels;
    }

    public int getSho_duree() {
        return sho_duree;
    }

    public void setSho_duree(int sho_duree) {
        this.sho_duree = sho_duree;
    }

    public String getSho_numero() {
        return sho_numero;
    }

    public void setSho_numero(String sho_numero) {
        this.sho_numero = sho_numero;
    }

    public String getSho_retour() {
        return sho_retour;
    }

    public void setSho_retour(String sho_retour) {
        this.sho_retour = sho_retour;
    }
}
