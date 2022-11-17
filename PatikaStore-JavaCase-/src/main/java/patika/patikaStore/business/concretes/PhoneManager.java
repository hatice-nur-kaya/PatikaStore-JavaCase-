package patika.patikaStore.business.concretes;
import java.util.ArrayList;
import java.util.List;

import patika.patikaStore.business.abstracts.PhoneServices;
import patika.patikaStore.dataAccess.abstracts.PhoneDao;
import patika.patikaStore.entities.Phone;
import patika.patikaStore.entities.models.ApiResponse;

public class PhoneManager implements PhoneServices {
    private final PhoneDao phoneDao;
    public PhoneManager(PhoneDao phoneDao) {
        this.phoneDao = phoneDao;
    }
    @Override
    public ArrayList<Phone> getAllPhone() {
        ArrayList<Phone> phones = new ArrayList<>();
        phones.add(new Phone(1,"Iphone","256","55","100","4","siyah\n"));
        phones.add(new Phone(2,"Iphone","256","11","100","4","siyah\n"));
        for(Phone phone2:phones)  {
            System.out.format("%10s%15d%15s%15s%20s",phone2.getName(),phone2.getBrandInformation(),phone2.getScreenSize(),phone2.getBattery(),phone2.getRam(),phone2.getRam());  
         }   
         return phones;
    }

    @Override
    public ApiResponse<Phone> getOnePhone(int id) {
        Phone phone = phoneDao
        .findById(id).get();
        return ApiResponse.default_OK(phone);
    }

    @Override
    public ApiResponse<Phone> postOnePhone(Phone phone) {
        Phone data = phoneDao.save(phone);
        return ApiResponse.default_CREATED(data);
    }

    @Override
    public void deletePhone(int id) {
        getOnePhone(id);
        phoneDao.deleteById(id);
        return; 
        
    }

    
}
