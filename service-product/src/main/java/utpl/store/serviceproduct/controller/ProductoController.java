package utpl.store.serviceproduct.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import utpl.store.serviceproduct.entity.Producto;
import utpl.store.serviceproduct.service.ProductoService;

import java.util.List;

@RestController
@RequestMapping (path = "api/v1/productos")
public class ProductoController {

    private final ProductoService productoService;
    @Autowired //para enlazar nuestro servicios
    public ProductoController(ProductoService productoService){//constructor

        this.productoService = productoService;
    }
    @GetMapping
    public List<Producto> obtenerTodosClientes(){

        return productoService.getProductos();
    }
    @GetMapping("/{identificacion}")
    public Producto getProductosID(@PathVariable String identificacion){
        return productoService.getProductosID(identificacion);
    }

    @PostMapping
    public Producto guardarProducto (@RequestBody Producto producto){

        return productoService.saveProducto(producto);
    }

    @DeleteMapping ("/{identificacion}")
    public void eliminarProducto(@PathVariable String identificacion){
        productoService.eliminarProducto(identificacion);
    }


}
