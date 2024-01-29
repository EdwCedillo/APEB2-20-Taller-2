package utpl.store.serviceproduct.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import utpl.store.serviceproduct.entity.Producto;

@Repository
public interface ProductoRepository extends MongoRepository <Producto, String> {

}
