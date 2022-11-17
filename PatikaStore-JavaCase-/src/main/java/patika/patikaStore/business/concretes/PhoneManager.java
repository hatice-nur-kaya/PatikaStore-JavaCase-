package patika.patikaStore.business.concretes;
import java.util.ArrayList;
import java.util.List;

import patika.patikaStore.business.abstracts.PhoneServices;
import patika.patikaStore.entities.Phone;
import patika.patikaStore.entities.models.ApiResponse;

public class PhoneManager implements PhoneServices {

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
    public ArrayList<Phone> getOnePhone(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ArrayList<Phone> postOnePhone(Phone phone) {
        ArrayList<Phone> phones = new ArrayList<>();
        phones.add(new Phone(phone.getId(),phone.getName(),phone.getMemory(),phone.getScreenSize(),phone.getBattery(),phone.getRam(),phone.getColor()));
        for(Phone phone2:phones)  {
            System.out.format(phone2.getName(),phone.getMemory(),phone.getScreenSize(),phone.getBattery(),phone.getRam());  
         }   
         return phones;
    }

    @Override
    public void deletePhone(int id) {
        // TODO Auto-generated method stub
        
    }

    
}
