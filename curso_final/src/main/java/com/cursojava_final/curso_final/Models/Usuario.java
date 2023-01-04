package com.cursojava_final.curso_final.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity // es una entidad que da referencia a la base de datos
@Table(name = "usuarios") //con esto sabe que tiene que ir a esa tabla de la base de datos
@ToString  @EqualsAndHashCode
public class Usuario{

    //hibernate nose da cuenta de la columna

    @Getter @Setter @Column(name = "nombre")
    private String nombre;
    @Getter @Setter @Column(name = "apellido")
    private String apellido;
    @Getter @Setter @Column(name = "email")
    private String email;
    @Getter @Setter @Column(name = "telefono")
    private String telefono;
    @Getter @Setter @Column(name = "password")
    private String contrasena;
    @Id //con esto le indico que va ser la clave primaria
    @Getter @Setter @Column(name = "id")
    private Long id;

    //tengo que agregar algunas anotaciones para ver que tabla debo usar
 }
