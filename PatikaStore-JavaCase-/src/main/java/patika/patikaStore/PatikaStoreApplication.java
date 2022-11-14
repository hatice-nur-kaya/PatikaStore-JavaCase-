package patika.patikaStore;

import patika.patikaStore.business.concretes.BrandManager;

public class PatikaStoreApplication {

	public static void main(String[] args) {
	    BrandManager brandManager=new BrandManager(null);
		brandManager.getAllBrands();
		System.out.println("Hello");
		Menu();

		// switch (key) {
		// 	case 1:
		// 		brandManager.getAll();
		// 		break;
		// 	case 2:
		// 		brandManager.getAll();
		// 		break;
		// 	case 3:
		// 		brandManager.getAll();
		// 		break;
		// 	case 4:
		// 		brandManager.getAll();
		// 		break;
		// 	default:
		// 		break;
		// }

	}

	public static void Menu() {

		System.out.println("***PatikaStore Ürün Yönetim Paneli***");
		System.out.println("1 - Notebook İşlemleri");
		System.out.println("2 - Cep Telefonu İşlemleri");
		System.out.println("3 - Marka Listele");
		System.out.println("4 - Çıkış Yap");
		System.out.println("Lütfen Seçim Yapınız..");
		try {
			char menu = (char) System.in.read();
		} catch (Exception ex) {
			System.out.print("Hatalı giriş. Hata Kodu" + ex);
		}
	}

}
