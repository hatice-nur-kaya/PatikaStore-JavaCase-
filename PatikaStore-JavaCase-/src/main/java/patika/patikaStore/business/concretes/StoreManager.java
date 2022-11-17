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
                BrandManager brandManager = new BrandManager();
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
            NotebooksManager notebooksManager = new NotebooksManager();
            notebooksManager.getAllNotebooks();
                break;
            case 2:
                break;
            case 3:
                NotebooksManager notebooksManager2 = new NotebooksManager();
                Scanner scanner =new Scanner(System.in);
                System.out.print("Silmek İstediğiniz Ürün Id: ");
                n = scan.nextInt();
                notebooksManager2.deleteNotebooks(n);
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
            PhoneManager phoneManager = new PhoneManager(null);
            phoneManager.getAllPhone();
                break;
            case 2:
            PhoneManager phoneManager2 = new PhoneManager(null);
            phoneManager2.getAllPhone();
                break;
            case 3:
            PhoneManager phoneManager3 = new PhoneManager(null);
            System.out.print("Silmek İstediğiniz Ürün Id: ");
            n = scan.nextInt();
            phoneManager3.deletePhone(n);
                break;
            case 4:
                break;
            default:
                System.out.println("Yanlış seçim yaptınız !!");
        }
    }

}
