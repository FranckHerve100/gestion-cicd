package com.example.gestion.Service;

import com.example.gestion.Repository.EtudiantRepository;
import com.example.gestion.entites.Etudiant;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EtudiantService {
    private EtudiantRepository etudiantRepository;
    private EtudiantRepository EtudiantDansLaBD;

    public EtudiantService(EtudiantRepository etudiantRepository) {
        this.etudiantRepository = etudiantRepository;
    }

    public void Create (Etudiant etudiant) {
        Etudiant EtudiantDansLaBD = this.etudiantRepository.findById(etudiant.getId()).orElse(null);
        if (EtudiantDansLaBD == null) {
            this.etudiantRepository.save(etudiant);
        }
    }

    public List<Etudiant> Search() {
        return this.etudiantRepository.findAll();
    }

    public Etudiant Read(int id) {
        Optional<Etudiant> optionalEtudiant = this.etudiantRepository.findById(id);
        return optionalEtudiant.orElse(null);
    }


    public void Drop(int id) {
        this.etudiantRepository.deleteById(id);
    }
}
