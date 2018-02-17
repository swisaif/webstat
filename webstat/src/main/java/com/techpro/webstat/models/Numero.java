package com.techpro.webstat.models;


import javax.persistence.*;

@Entity
@Table(name = "numero")
public class Numero {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int numero_id;
    @Column(name = "numero")
    public String numero;
    @Column(name = "description")
    public String description;
    @Column(name = "type")
    public String type;
    @Column(name = "operateur")
    public String operateur;
    @Column(name = "regle_tarifiaire")
    public String regle_tarifiaire;


    public Numero() {
    }

    public int getNumero_id() {
        return numero_id;
    }

    public Numero(String numero, String description, String type, String operateur, String regle_tarifiaire) {
        this.numero = numero;
        this.description = description;
        this.type = type;
        this.operateur = operateur;
        this.regle_tarifiaire = regle_tarifiaire;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOperateur() {
        return operateur;
    }

    public void setOperateur(String operateur) {
        this.operateur = operateur;
    }

    public String getRegle_tarifiaire() {
        return regle_tarifiaire;
    }

    public void setRegle_tarifiaire(String regle_tarifiaire) {
        this.regle_tarifiaire = regle_tarifiaire;
    }
}
