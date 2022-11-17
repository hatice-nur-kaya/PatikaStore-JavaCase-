package patika.patikaStore.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import patika.patikaStore.business.abstracts.NotebooksServices;
import patika.patikaStore.entities.Notebooks;

public class NotebooksManager implements NotebooksServices {

    @Override
    public ArrayList<Notebooks> getAllNotebooks() {
        ArrayList<Notebooks> notebooks= new  ArrayList<Notebooks>();
        notebooks.add(new Notebooks(1,"Apple ","256","44","22"));
        notebooks.add(new Notebooks(2,"Lenovo","256","44","22"));
        for(Notebooks notebooks2:notebooks)  {
        System.out.println("id"+" "+ "Brand"+"  "+ "Ram"+" "+ "Storage"+" "+ "ScreenSize");
        System.out.println(notebooks2.getId()+" "+notebooks2.getName()+"   "+notebooks2.getRam()+"   "+notebooks2.getStorage()+"   "+notebooks2.getScreenSize());  
        }   
        return notebooks;
    }

    @Override
    public ArrayList<Notebooks> getOneNotebooks(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ArrayList<Notebooks> postOneNotebooks(Notebooks notebooks) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public void deleteNotebooks(int id) {
        // TODO Auto-generated method stub
        
    }

    

}
