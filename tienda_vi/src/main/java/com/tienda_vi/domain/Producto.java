

package com.tienda_vi.domain;


import jakarta.persistence.*;
import lombok.Data;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Data
@Entity
@Table(name="producto")
public class Producto implements Serializable {
    private static final long serialVersionUID=1L;
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
     @Column(name="id_categoria")
    private Interger IdCategoria;
     private Interger IdProducto;
    
    @Column(unique=true, nullable=false, length=50)
    @NotNull
    @Size(max=50)
    private String descripcion;
    
    @Column(columnDefinition="Text")
      private String detalle;
    
    @Column(precision=12, scale=2)
    @Notnull(message="el precio debe ser definido...")
    @DecimalMin(value="0.00", inclusive=true,message="el precio debe ser mayor o igual a 0.00")
      private BigDecimal precio;
    
     
   
    @Notnull(message="las existencias debe ser definido...")
    @DecimalMin(value="0.00", inclusive=true,message="el precio debe ser mayor o igual a 0.00")
      private BigDecimal existencias;
    
    
    
    @Column(length=1024)
    @Size(max=1024)
    private String rutaImagen;
    
     @Column(name="activo")
    private boolean activo;
     
     @ManyToOne
     @JoinColumn(name="id_categoria")
     private Categoria categoria;

}
