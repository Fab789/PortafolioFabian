

package com.tienda_vi.domain;

import jakarta.persistence.*;
import lombok.Data;
import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GeneratedType;
import jakarta.validation.constraints.Size;

@Data
@Entity
@Table(name="categoria")
public class Categoria implements Serializable {
    private static final long serialVersionUID=1L;
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
     @Column(name="id_categoria")
    private Interger IdCategoria;
    
    @Column(unique=true, nullable=false, length=50)
    @NotNull
    @Size(max=50)
    private String descripcion;
    
    @Column(length=1024)
    @Size(max=1024)
    private String rutaImagen;
    
     @Column(name="activo")
    private boolean activo;
}

