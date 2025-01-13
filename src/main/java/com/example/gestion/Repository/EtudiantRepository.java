package com.example.gestion.Repository;

import com.example.gestion.entites.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EtudiantRepository extends JpaRepository<Etudiant, Integer> {
    Optional<Etudiant> findById (int id);
}
