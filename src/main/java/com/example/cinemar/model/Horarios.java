package com.example.cinemar.model;

import java.sql.Time;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.FetchType;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "m_horarios")
public class Horarios {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Column(name = "horainicio")
    private Time horainicio;

    @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST })
    @JoinTable(
    name = "m_pelicula_horarios",
    joinColumns = { @JoinColumn(name="id_pelicula")},
    inverseJoinColumns = { @JoinColumn(name="id_horario")})
    private Set<Pelicula> peliculas = new HashSet<>();

    public Horarios() {

    }

    public Horarios(Long id, Time horainicio, Set<Pelicula> peliculas) {
        Id = id;
        this.horainicio = horainicio;
        this.peliculas = peliculas;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Time getHorainicio() {
        return horainicio;
    }

    public void setHorainicio(Time horainicio) {
        this.horainicio = horainicio;
    }

    public Set<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(Set<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    

    
}
