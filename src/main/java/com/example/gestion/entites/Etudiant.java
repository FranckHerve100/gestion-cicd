package com.example.gestion.entites;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table (name = "ETUDIANT")
public class Etudiant {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String prenom;
    private Date dateofbirth;
    private String lieu;
    private String sexe;
    private Boolean est_inscrit;

    public Etudiant() {
    }

    public Etudiant(String sexe, int id, String nom, String prenom, Date dateofbirth, String lieu, Boolean est_inscrit) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateofbirth = dateofbirth;
        this.lieu = lieu;
        this.sexe = sexe;
        this.est_inscrit = est_inscrit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(Date dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public Boolean getEst_inscrit() {
        return est_inscrit;
    }

    public void setEst_inscrit(Boolean est_inscrit) {
        this.est_inscrit = est_inscrit;
    }
}
