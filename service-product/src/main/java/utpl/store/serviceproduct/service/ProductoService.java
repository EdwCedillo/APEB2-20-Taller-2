package utpl.store.serviceproduct.service;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utpl.store.serviceproduct.entity.Producto;
import utpl.store.serviceproduct.repository.ProductoRepository;

import java.util.List;

@Service
@Data
public class ProductoService {

    private final ProductoRepository productoRepository;
    @Autowired
    public ProductoService(ProductoRepository productoRepository){
        this.productoRepository = productoRepository;
    }

    public List<Producto> getProductos(){
        return productoRepository.findAll(); //busca todos los elementos y retornarlos
    }

    public Producto getProductosID(String identificacion){

        return productoRepository.findById(identificacion).orElse(null);
    }

    public Producto saveProducto(Producto producto){

        return productoRepository.save(producto);
    }
    public void eliminarProducto (String identificacion) {
        productoRepository.deleteById(identificacion);
    }

}
