package patika.patikaStore.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import patika.patikaStore.entities.Notebooks;

public interface NotebooksDao extends JpaRepository<Notebooks, Integer> {
    
}
