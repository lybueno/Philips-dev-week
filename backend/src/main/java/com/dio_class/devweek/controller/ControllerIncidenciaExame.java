package com.dio_class.devweek.controller;

import com.dio_class.devweek.entity.IncidenciaExame;
import com.dio_class.devweek.repository.IncidenciaExameRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ControllerIncidenciaExame {

    private final IncidenciaExameRepository repository;

    public ControllerIncidenciaExame(IncidenciaExameRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/incidencias")
    public ResponseEntity<List<IncidenciaExame>> findAllIncidencias(){
        List<IncidenciaExame> listaIncidencias = repository.findAll();
        if(listaIncidencias.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
        }
        return new ResponseEntity<>(listaIncidencias, HttpStatus.OK);
    }

    @GetMapping("/incidencia/{id}")
    public ResponseEntity<IncidenciaExame> findByIdIncidencia(@PathVariable Long id){
        Optional<IncidenciaExame> incidenciaExameOptional = repository.findById(id);
        if(incidenciaExameOptional.isPresent()){
            IncidenciaExame incidenciaUnid = incidenciaExameOptional.get();
            return new ResponseEntity<>(incidenciaUnid, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
