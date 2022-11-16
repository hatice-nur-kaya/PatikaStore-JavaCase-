package patika.patikaStore.dataAccess.abstracts;
import org.springframework.data.jpa.repository.JpaRepository;

import patika.patikaStore.entities.Store;

public interface StoreDao extends JpaRepository<Store, Integer> {
    
}
