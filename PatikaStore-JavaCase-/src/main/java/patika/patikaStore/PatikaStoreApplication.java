package patika.patikaStore;

import patika.patikaStore.business.concretes.BrandManager;

public class PatikaStoreApplication {

	public static void main(String[] args) {
		BrandManager brandManager =new BrandManager();
        Menu();
		brandManager.getAll();
		System.out.println("Hello world");
		System.out.println("Hello world");

	}
	public static void Menu(){

		System.out.println("***PatikaStore Ürün Yönetim Paneli***");
		System.out.println("1 - Notebook İşlemleri");
		System.out.println("2 - Cep Telefonu İşlemleri");
		System.out.println("3 - Marka Listele");
		System.out.println("Çıkış Yap");





		
 
	}

}
