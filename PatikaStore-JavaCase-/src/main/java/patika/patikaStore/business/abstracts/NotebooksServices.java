package patika.patikaStore.business.abstracts;

import java.util.ArrayList;
import patika.patikaStore.entities.Notebooks;


public interface NotebooksServices {
    ArrayList<Notebooks> getAllNotebooks();
    ArrayList<Notebooks> getOneNotebooks(int id);
    ArrayList<Notebooks> postOneNotebooks(Notebooks notebooks);
    void deleteNotebooks(int id);
}
