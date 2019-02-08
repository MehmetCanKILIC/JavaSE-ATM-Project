package ATM;

import sun.rmi.runtime.Log;

import java.util.Scanner;

public class Atm {
    static Scanner scanner = new Scanner(System.in);
    Login girisYap = new Login();


    public void calistir(Hesap hesap){

        baslik();
        while(true){
            if (girisYap.login(hesap)){
                System.out.println("Gırıs Basarılı");
                menu();
                gir(hesap);

                break;
            }else {
                System.out.println("Gırıs Basarısız !");
                return;
            }
        }
    }
    public void gir(Hesap hesap){

        while (true){
            System.out.println("Bır Islem Secınız :");
            int secim = scanner.nextInt();
            if (secim == 4){
                System.out.println("Programdan Cıkılıyor !");
                return;
            }
            else if(secim==1){
                System.out.println("Hesabınız..:"+hesap.getCuzdan());
            }
            else if (secim==2){
                System.out.println("Çekmek istediğiniz tutarı giriniz :");
                int miktar=scanner.nextInt();
                hesap.paraCek(miktar);
            }
            else if(secim==3)
            {
                System.out.println("Yatirmak istediğiniz tutarı giriniz :");
                int miktar=scanner.nextInt();
                hesap.paraYatir(miktar);
            }

        }

    }


    public void menu(){
        System.out.println("1-Bakiye Goruntule");
        System.out.println("2-Para çek");
        System.out.println("3-Para yatır");
        System.out.println("4-Çıkış ");
    }

    public void baslik(){
        System.out.println("Bankamıza Hosgeldiniz :");
        System.out.println("***********************");
        System.out.println("Kullanıcı Girisi :");
        System.out.println("***********************");
    }
}
