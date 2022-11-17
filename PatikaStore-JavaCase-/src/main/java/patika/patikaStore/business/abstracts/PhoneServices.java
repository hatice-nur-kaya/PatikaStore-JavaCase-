package patika.patikaStore.business.abstracts;

import java.util.ArrayList;
import java.util.List;

import patika.patikaStore.entities.Phone;
import patika.patikaStore.entities.models.ApiResponse;

public interface PhoneServices {
    ArrayList<Phone> getAllPhone();
    ArrayList<Phone> getOnePhone(int id);
    ArrayList<Phone> postOnePhone(Phone phone);
    void deletePhone(int id);
}
