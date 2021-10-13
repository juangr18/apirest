package com.jg.apirest.Model;

import javax.persistence.*;

@Entity
@Table(name = "mascota")
public class Mascota {

    @Id
    @Column(name = "idmascota")
    private final int id;

    @Column(name = "nombre", length = 45)
    private final String nombre;

    @Column(name = "tipo_mascota")
    private final int tipoMascota;

    @ManyToOne
    @Column(name = "propietario")
    private final String propietario;

    public Mascota(int id, String nombre, int tipoMascota, String propietario) {
        this.id = id;
        this.nombre = nombre;
        this.tipoMascota = tipoMascota;
        this.propietario = propietario;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTipoMascota() {
        return tipoMascota;
    }

    public String getPropietario() {
        return propietario;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "idMascota=" + id +
                ", nombre='" + nombre + '\'' +
                ", tipoMascota=" + tipoMascota +
                ", propietario=" + propietario +
                '}';
    }
}
