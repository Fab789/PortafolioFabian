

package com.tienda_vi.Service;

import com.tienda_vi.domain.Producto;
import com.tienda_vi.repository.CategoriaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ProductoService {
     @Autowired
    private ProductoRepository productoRepository;
    
    @Transactional(readOnly= true)
    public List <Categoria> getCategorias (boolean activo){
        if (activo){
            return productocategoriaRepository.findByActicoTrue();
            
        }
        return productoRepository.findAll();
    }

}
