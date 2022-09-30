package com.example.cinemar.Controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cinemar.model.Pelicula;
import com.example.cinemar.service.PeliculaService;

@RestController
@RequestMapping("/peliculas")
public class PeliculaController {

    @Autowired
    private PeliculaService peliculaService;

    @GetMapping("/all")
    public ResponseEntity<List<Pelicula>> getAllPelicula() {
        try {
            return ResponseEntity.ok(peliculaService.findAll());
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    public ResponseEntity<Pelicula> savePelicula(@RequestBody Pelicula pelicula) {

        try {
            Pelicula newpel = peliculaService.save(pelicula);

            return ResponseEntity.created(new URI("/peliculas/" + newpel.getId())).body(newpel);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Pelicula>> getById(@PathVariable("id") Long id) {
        try {

            return ResponseEntity.status(HttpStatus.CREATED).body(peliculaService.findById(id));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PutMapping("/update")
    public ResponseEntity<Pelicula> updatePelicula(@RequestBody Pelicula pelicula) {
        try {
            Pelicula upPel = peliculaService.save(pelicula);

            return ResponseEntity.created(new URI("/peliculas/" + upPel.getId())).body(upPel);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deletePelicula(@PathVariable("id") Long id) {
        try {
            peliculaService.deleteById(id);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

}
