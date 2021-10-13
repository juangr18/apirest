package com.jg.apirest.Model;

import javax.persistence.*;

@Entity
@Table(name = "propietario")
public class Propietario {
    @Id
    @Column(name = "idpropietario")
    private final int id;


    @Column(name = "nombre", length = 45)
    private final String nombre;

    @Column(name = "direccion", length = 45)
    private final String direccion;

    @Column(name = "telefono", length = 10)
    private final String telefono;

    @Column(name = "correo", length =60)
    private final String correo;

    @Column(name = "comentarios")
    private final String comentarios;

    public Propietario(int id, String nombre, String direccion, String telefono, String correo, String comentarios) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.comentarios = comentarios;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getComentarios() {
        return comentarios;
    }

    @Override
    public String toString() {
        return "Propietario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correo='" + correo + '\'' +
                ", comentarios='" + comentarios + '\'' +
                '}';
    }
}
