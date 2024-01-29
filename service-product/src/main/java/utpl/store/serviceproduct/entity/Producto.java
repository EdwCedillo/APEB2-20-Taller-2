package utpl.store.serviceproduct.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data //gettes y setters
public class Producto {


    @Id
    private Long identificacion;
    private String name;
    private String descripcion;
    private String image;

}
