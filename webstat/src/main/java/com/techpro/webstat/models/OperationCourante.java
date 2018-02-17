package com.techpro.webstat.models;


import javax.persistence.*;

@Entity
@Table(name = "operation_courante")
public class OperationCourante {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int ope_id;
    @Column(name = "ope_serveur")
    public String ope_serveur;
    @Column(name = "ope_port")
    public String ope_port;
    @Column(name = "ope_retour")
    public String ope_retour;
    @Column(name = "ope_version")
    public String ope_version;
    @Column(name = "ope_duree")
    public int ope_duree;
    @Column(name = "ope_type_adresse")
    public String ope_type_adresse;
    @Column(name = "ope_adresse")
    public String ope_adresse;
    @Column(name = "ope_contrat")
    public String ope_contrat;
    @Column(name = "ope_telephone")
    public String ope_telephone;
    @Column(name = "ope_sda")
    public String ope_sda;
    @Column(name = "ope_operation")
    public String opeOperation;
    @Column(name = "ope_info")
    public String ope_info;
    @Column(name = "ope_itp")
    public String ope_itp;
    @Column(name = "ope_vitesse")
    public String ope_vitesse;
    @Column(name = "ope_max_cv")
    public int ope_max_cv;
    @Column(name = "ope_info2")
    public String ope_info2;
    @Column(name = "ope_date")
    public String ope_date;
    @Column(name = "ope_stat_date")
    public String ope_stat_date;
    @Column(name = "ope_stat_heure")
    public String ope_stat_heure;
    @Column(name = "ope_numero")
    public String ope_numero;
    @Column(name = "ope_stat_duree")
    public int ope_stat_duree;
    @Column(name = "ope_banque")
    public String ope_banque;
    @Column(name = "ope_file")
    public String ope_file;
    @Column(name = "ope_msgstx")
    public String ope_msgstx;
    @Column(name = "ope_msgsrx")
    public String ope_msgsrx;
    @Column(name = "ope_octetstx")
    public String ope_octetstx;
    @Column(name = "ope_octetsrx")
    public String ope_octetsrx;
    @Column(name = "ope_modulation")
    public String ope_modulation;
    @Column(name = "ope_mode")
    public String ope_mode;
    @Column(name = "ope_operateur")
    public String ope_operateur;


    public OperationCourante() {
    }

    public OperationCourante(String ope_serveur, String ope_port, String ope_retour, String ope_version, int ope_duree, String ope_type_adresse, String ope_adresse, String ope_contrat, String ope_telephone, String ope_sda, String opeOperation, String ope_info, String ope_itp, String ope_vitesse, int ope_max_cv, String ope_info2, String ope_date, String ope_stat_date, String ope_stat_heure, String ope_numero, int ope_stat_duree, String ope_banque, String ope_file, String ope_msgstx, String ope_msgsrx, String ope_octetstx, String ope_octetsrx, String ope_modulation, String ope_mode, String ope_operateur, String ope_nop) {
        this.ope_serveur = ope_serveur;
        this.ope_port = ope_port;
        this.ope_retour = ope_retour;
        this.ope_version = ope_version;
        this.ope_duree = ope_duree;
        this.ope_type_adresse = ope_type_adresse;
        this.ope_adresse = ope_adresse;
        this.ope_contrat = ope_contrat;
        this.ope_telephone = ope_telephone;
        this.ope_sda = ope_sda;
        this.opeOperation = opeOperation;
        this.ope_info = ope_info;
        this.ope_itp = ope_itp;
        this.ope_vitesse = ope_vitesse;
        this.ope_max_cv = ope_max_cv;
        this.ope_info2 = ope_info2;
        this.ope_date = ope_date;
        this.ope_stat_date = ope_stat_date;
        this.ope_stat_heure = ope_stat_heure;
        this.ope_numero = ope_numero;
        this.ope_stat_duree = ope_stat_duree;
        this.ope_banque = ope_banque;
        this.ope_file = ope_file;
        this.ope_msgstx = ope_msgstx;
        this.ope_msgsrx = ope_msgsrx;
        this.ope_octetstx = ope_octetstx;
        this.ope_octetsrx = ope_octetsrx;
        this.ope_modulation = ope_modulation;
        this.ope_mode = ope_mode;
        this.ope_operateur = ope_operateur;
    }

    public int getOpe_id() {
        return ope_id;
    }

    public void setOpe_id(int ope_id) {
        this.ope_id = ope_id;
    }

    public String getOpe_serveur() {
        return ope_serveur;
    }

    public void setOpe_serveur(String ope_serveur) {
        this.ope_serveur = ope_serveur;
    }

    public String getOpe_port() {
        return ope_port;
    }

    public void setOpe_port(String ope_port) {
        this.ope_port = ope_port;
    }

    public String getOpe_retour() {
        return ope_retour;
    }

    public void setOpe_retour(String ope_retour) {
        this.ope_retour = ope_retour;
    }

    public String getOpe_version() {
        return ope_version;
    }

    public void setOpe_version(String ope_version) {
        this.ope_version = ope_version;
    }

    public int getOpe_duree() {
        return ope_duree;
    }

    public void setOpe_duree(int ope_duree) {
        this.ope_duree = ope_duree;
    }

    public String getOpe_type_adresse() {
        return ope_type_adresse;
    }

    public void setOpe_type_adresse(String ope_type_adresse) {
        this.ope_type_adresse = ope_type_adresse;
    }

    public String getOpe_adresse() {
        return ope_adresse;
    }

    public void setOpe_adresse(String ope_adresse) {
        this.ope_adresse = ope_adresse;
    }

    public String getOpe_contrat() {
        return ope_contrat;
    }

    public void setOpe_contrat(String ope_contrat) {
        this.ope_contrat = ope_contrat;
    }

    public String getOpe_telephone() {
        return ope_telephone;
    }

    public void setOpe_telephone(String ope_telephone) {
        this.ope_telephone = ope_telephone;
    }

    public String getOpe_sda() {
        return ope_sda;
    }

    public void setOpe_sda(String ope_sda) {
        this.ope_sda = ope_sda;
    }

    public String getOpeOperation() {
        return opeOperation;
    }

    public void setOpeOperation(String opeOperation) {
        this.opeOperation = opeOperation;
    }

    public String getOpe_info() {
        return ope_info;
    }

    public void setOpe_info(String ope_info) {
        this.ope_info = ope_info;
    }

    public String getOpe_itp() {
        return ope_itp;
    }

    public void setOpe_itp(String ope_itp) {
        this.ope_itp = ope_itp;
    }

    public String getOpe_vitesse() {
        return ope_vitesse;
    }

    public void setOpe_vitesse(String ope_vitesse) {
        this.ope_vitesse = ope_vitesse;
    }

    public int getOpe_max_cv() {
        return ope_max_cv;
    }

    public void setOpe_max_cv(int ope_max_cv) {
        this.ope_max_cv = ope_max_cv;
    }

    public String getOpe_info2() {
        return ope_info2;
    }

    public void setOpe_info2(String ope_info2) {
        this.ope_info2 = ope_info2;
    }

    public String getOpe_date() {
        return ope_date;
    }

    public void setOpe_date(String ope_date) {
        this.ope_date = ope_date;
    }

    public String getOpe_stat_date() {
        return ope_stat_date;
    }

    public void setOpe_stat_date(String ope_stat_date) {
        this.ope_stat_date = ope_stat_date;
    }

    public String getOpe_stat_heure() {
        return ope_stat_heure;
    }

    public void setOpe_stat_heure(String ope_stat_heure) {
        this.ope_stat_heure = ope_stat_heure;
    }

    public String getOpe_numero() {
        return ope_numero;
    }

    public void setOpe_numero(String ope_numero) {
        this.ope_numero = ope_numero;
    }

    public int getOpe_stat_duree() {
        return ope_stat_duree;
    }

    public void setOpe_stat_duree(int ope_stat_duree) {
        this.ope_stat_duree = ope_stat_duree;
    }

    public String getOpe_banque() {
        return ope_banque;
    }

    public void setOpe_banque(String ope_banque) {
        this.ope_banque = ope_banque;
    }

    public String getOpe_file() {
        return ope_file;
    }

    public void setOpe_file(String ope_file) {
        this.ope_file = ope_file;
    }

    public String getOpe_msgstx() {
        return ope_msgstx;
    }

    public void setOpe_msgstx(String ope_msgstx) {
        this.ope_msgstx = ope_msgstx;
    }

    public String getOpe_msgsrx() {
        return ope_msgsrx;
    }

    public void setOpe_msgsrx(String ope_msgsrx) {
        this.ope_msgsrx = ope_msgsrx;
    }

    public String getOpe_octetstx() {
        return ope_octetstx;
    }

    public void setOpe_octetstx(String ope_octetstx) {
        this.ope_octetstx = ope_octetstx;
    }

    public String getOpe_octetsrx() {
        return ope_octetsrx;
    }

    public void setOpe_octetsrx(String ope_octetsrx) {
        this.ope_octetsrx = ope_octetsrx;
    }

    public String getOpe_modulation() {
        return ope_modulation;
    }

    public void setOpe_modulation(String ope_modulation) {
        this.ope_modulation = ope_modulation;
    }

    public String getOpe_mode() {
        return ope_mode;
    }

    public void setOpe_mode(String ope_mode) {
        this.ope_mode = ope_mode;
    }

    public String getOpe_operateur() {
        return ope_operateur;
    }

    public void setOpe_operateur(String ope_operateur) {
        this.ope_operateur = ope_operateur;
    }


}



