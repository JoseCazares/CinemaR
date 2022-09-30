package com.example.cinemar.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cinemar.model.Horarios;
import com.example.cinemar.service.HorarioService;

@RestController
@RequestMapping("/horarios")
public class HorarioController {
    
    @Autowired
    private HorarioService horarioService;

    @GetMapping("/all")
    public ResponseEntity<List<Horarios>> getallHorarios(){
        try {
            return ResponseEntity.ok(horarioService.findAll());
        } catch (Exception e) {
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Horarios>> getById(@PathVariable("id") Long id){
        try {

            return ResponseEntity.status(HttpStatus.CREATED).body(horarioService.findById(id));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
