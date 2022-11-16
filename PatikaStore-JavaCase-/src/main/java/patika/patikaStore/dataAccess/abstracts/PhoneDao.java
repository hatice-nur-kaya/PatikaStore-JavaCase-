package patika.patikaStore.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import patika.patikaStore.entities.Phone;

public interface PhoneDao extends JpaRepository<Phone, Integer> {
    
}
