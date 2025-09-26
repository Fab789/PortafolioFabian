
package com.tienda_vi.Service;
import com.tienda_vi.domain.Categoria;
import com.tienda_vi.repository.CategoriaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class CategoriaService {
    
    @Autowired
    private CategoriaRepository categoriaRepository;
    
    @Transactional(readOnly= true)
    public List <Categoria> getCategorias (boolean activo){
        if (activo){
            return categoriaRepository.findByActicoTrue();
            
        }
        return categoriaRepository.findAll();
    }

}