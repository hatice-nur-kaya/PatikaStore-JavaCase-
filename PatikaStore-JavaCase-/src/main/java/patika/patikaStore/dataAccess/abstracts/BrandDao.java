package patika.patikaStore.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import patika.patikaStore.entities.Brand;

public interface BrandDao extends JpaRepository<Brand, Integer> {
    
}
