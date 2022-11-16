package patika.patikaStore;

import patika.patikaStore.business.concretes.BrandManager;
import patika.patikaStore.business.concretes.StoreManager;


public class PatikaStoreApplication {

	public static void main(String[] args) {
		StoreManager storeManager = new StoreManager();
	    BrandManager brandManager = new BrandManager(null);
		storeManager.menu();
		brandManager.getAllBrands();

	}

}