CREATE DATABASE GES;

CREATE TABLE ETUDIANT (
    ID SERIAL PRIMARY KEY,    -- Utilisation de SERIAL pour auto-incrémentation
    NOM varchar(50),
    PRENOM varchar(50),
    DATEOFBIRTH DATE,
    LIEU varchar(50),         -- Correction de "vachar" en "varchar"
    SEXE char(1),
    EST_INSCRIT BOOLEAN
);

-- Requête de sélection avec formatage de la date
SELECT NOM, PRENOM, TO_CHAR(DATEOFBIRTH, 'DD-MM-YYYY') AS DATE_FORMATTEE
FROM ETUDIANT;