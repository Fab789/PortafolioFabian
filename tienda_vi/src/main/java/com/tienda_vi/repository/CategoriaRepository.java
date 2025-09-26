

package com.tienda_vi.repository;

import com.tienda_vi.domain.Categoria;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;        
import java.util.List;
@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
    
    public List <Categoria> findByActivoTrue();

}
