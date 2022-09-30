package com.example.cinemar.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "m_pelicula")
public class Pelicula implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nombrepelicula", nullable = false)
    private String nombrepelicula;

    @Column(name = "imagen", nullable = false)
    private String imagen;

    @Column(name = "duracion", nullable = false)
    private String duracion;

    @Column(name = "clasificacion", nullable = false)
    private String clasificacion;

    // @ManyToMany(fetch = FetchType.LAZY,
    // cascade = CascadeType.ALL, mappedBy = "peliculas")
    // private Set<Horarios> horarios = new HashSet<>();

    public Pelicula() {
    }

    public Pelicula(Long id, String nombrepelicula, String imagen, String duracion, String clasificacion) {
        this.id = id;
        this.nombrepelicula = nombrepelicula;
        this.imagen = imagen;
        this.duracion = duracion;
        this.clasificacion = clasificacion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombrepelicula() {
        return nombrepelicula;
    }

    public void setNombrepelicula(String nombrepelicula) {
        this.nombrepelicula = nombrepelicula;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    
}
