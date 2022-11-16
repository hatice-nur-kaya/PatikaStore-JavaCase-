package patika.patikaStore.business.concretes;

import java.util.Scanner;

import patika.patikaStore.business.abstracts.StoreServices;

public class StoreManager implements StoreServices {

    @Override
    public void menu() {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("");
        System.out.println("PatikaStore Ürün Yönetim Paneli !");
        System.out.println("");

        System.out.println("1 - Notebook İşlemleri");
        System.out.println("2 - Cep Telefonu İşlemleri");
        System.out.println("3 - Marka Listele");
        System.out.println("0 - Çıkış Yap");

        System.out.print("Tercihiniz: ");
        n = scan.nextInt();

        switch (n) {
            case 0:
                System.exit(0);
                break;
            case 1:
                notebookmenu();
                break;
            case 2:
                phonemenu();
                break;
            case 3:
                BrandManager brandManager = new BrandManager(null);
                brandManager.getAllBrands();
                break;
            case 4:
                break;
            default:
                System.out.println("Yanlış seçim yaptınız !!");
        }
    }

    @Override
    public void notebookmenu() {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("");
        System.out.println("PatikaStore Ürün Yönetim Paneli !");
        System.out.println("");

        System.out.println("1 - Notebook List Items");
        System.out.println("2 - Notebook Add Items");
        System.out.println("3 - Notebook Delete Items");
        System.out.println("4 - Notebook Filter Items");
        System.out.println("0 - Çıkış Yap");

        System.out.print("Tercihiniz: ");
        n = scan.nextInt();

        switch (n) {
            case 0:
                System.exit(0);
                break;
            case 1:

                break;
            case 2:
                break;
            case 3:
                BrandManager brandManager = new BrandManager(null);
                brandManager.getAllBrands();
                break;
            case 4:
                break;
            default:
                System.out.println("Yanlış seçim yaptınız !!");
        }
    }

    @Override
    public void phonemenu() {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("");
        System.out.println("PatikaStore Ürün Yönetim Paneli !");
        System.out.println("");

        System.out.println("1 - Phone List Items");
        System.out.println("2 - Phone Add Items");
        System.out.println("3 - Phone Delete Items");
        System.out.println("4 - Phone Filter Items");
        System.out.println("0 - Çıkış Yap");

        System.out.print("Tercihiniz: ");
        n = scan.nextInt();

        switch (n) {
            case 0:
                System.exit(0);
                break;
            case 1:
            ProductManager productManager = new ProductManager(null);
            System.out.format("%10s%15s%15s%15s%20s",
            "Grade", "Last Name", "First Name", "Student Number", "Parent Email");
            productManager.getAllProduct();
                break;
            case 2:
            ProductManager productManager2 = new ProductManager(null);
            productManager2.postOneProduct(null);
                break;
            case 3:
            ProductManager productManager3 = new ProductManager(null);
            productManager3.deleteProduct(n);
                break;
            case 4:
                break;
            default:
                System.out.println("Yanlış seçim yaptınız !!");
        }
    }

}
