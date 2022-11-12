package patika.patikaStore.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import patika.patikaStore.entities.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {
    
}
