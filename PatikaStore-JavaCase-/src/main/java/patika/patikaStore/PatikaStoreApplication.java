package patika.patikaStore;

import patika.patikaStore.business.concretes.BrandManager;
import patika.patikaStore.business.concretes.StoreManager;


public class PatikaStoreApplication {

	public static void main(String[] args) {
		StoreManager storeManager = new StoreManager();
		storeManager.menu();

	}

}