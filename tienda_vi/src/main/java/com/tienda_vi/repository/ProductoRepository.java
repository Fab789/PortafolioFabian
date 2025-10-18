
package com.tienda_vi.repository;

import com.tienda_vi.domain.Producto;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;        
import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {
    
     public List <Producto> findByActivoTrue();
    

}
