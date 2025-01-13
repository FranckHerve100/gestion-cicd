package com.example.gestion.Controller;


import com.example.gestion.Service.EtudiantService;
import com.example.gestion.entites.Etudiant;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = "etudiant")
public class EtudiantController {
    private final EtudiantService etudiantService;

    public EtudiantController(EtudiantService etudiantService) {
        this.etudiantService = etudiantService;
    }

    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    public void Create (@RequestBody Etudiant etudiant) {
        this.etudiantService.Create (etudiant);
    }


    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public List<Etudiant> Search() {
        return this.etudiantService.Search();
    }

    @GetMapping(path="{id}", produces = APPLICATION_JSON_VALUE)
    public Etudiant Read (@PathVariable int id) {
        return this.etudiantService.Read(id);
    }

    @DeleteMapping (path = "{id}")
    public void Drop (@PathVariable int id) {
        this.etudiantService.Drop (id);
    }
}
