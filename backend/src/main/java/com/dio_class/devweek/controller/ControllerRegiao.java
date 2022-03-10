package com.dio_class.devweek.controller;

import com.dio_class.devweek.entity.Regiao;
import com.dio_class.devweek.repository.RegiaoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ControllerRegiao {

    private final RegiaoRepository repository;

    public ControllerRegiao(RegiaoRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/regioes")
    public ResponseEntity<?> findAllRegioes(){
        try{
            List<Regiao> allRegioes = repository.findAll();
            if(allRegioes.isEmpty()){
                System.out.println("Lista de regiões está vazia");
            }
            return new ResponseEntity<>(allRegioes, HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/regioes/{id}")
    public ResponseEntity<Regiao> findRegiaoById(@PathVariable Long id){
        Optional<Regiao> regiaoOptional = repository.findById(id);
        if(regiaoOptional.isPresent()){
            Regiao regiaoUnid = regiaoOptional.get();
            return new ResponseEntity<>(regiaoUnid, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping("/regiao/novo")
    public Regiao newRegiao(@RequestBody Regiao newRegiao){
        return repository.save(newRegiao);
    }

    @DeleteMapping("/regiao/remover/{id}")
    public void deleteRegiao(@PathVariable Long id){
        repository.deleteById(id);
    }
}
