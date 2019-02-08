package ATM;

public class Main {
    public static void main(String[] args){
        Hesap hesap=new Hesap("mehmet" ,"123456" , "685566" , -11000);
        Atm atm=new Atm();
        atm.calistir(hesap);
    }
}
