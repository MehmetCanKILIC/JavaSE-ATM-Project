package ATM;


import java.util.Scanner;

public class Login {
    static Scanner scanner = new Scanner(System.in);

    /*
    Bura
     */
    public boolean login(Hesap hesap){
        System.out.printf("Kullanici Adinizi Giriniz :");
        String k_ad = scanner.nextLine();
        System.out.println("Sifrenizi Giriniz :");
        String sıfre = scanner.nextLine();

        if (hesap.getIsim().equals(k_ad) && hesap.getParola().equals(sıfre))
            return true;
        return false;

    }
}
