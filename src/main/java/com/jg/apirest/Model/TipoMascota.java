package com.jg.apirest.Model;

import javax.persistence.*;

@Entity
@Table(name = "tipo_mascota")
public class TipoMascota {

    @Id
    @Column(name = "idtipo_mascota")
    private final String id;

    @Column(name = "descripcion", length = 45)
    private final String comentarios;

    public TipoMascota(String id, String comentarios) {
        this.id = id;
        this.comentarios = comentarios;
    }

    public String getId() {
        return id;
    }

    public String getComentarios() {
        return comentarios;
    }

    @Override
    public String toString() {
        return "TipoMascota{" +
                "id='" + id + '\'' +
                ", comentarios='" + comentarios + '\'' +
                '}';
    }
}
