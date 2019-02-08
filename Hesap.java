package ATM;

public class Hesap {
    private String isim;
    private String parola;
    private String hesapNo;
    private double cuzdan;

    public Hesap(String isim,String parola, String hesapNo, double cuzdan) {
        this.isim = isim;
        this.hesapNo = hesapNo;
        if(cuzdan>0){
            this.cuzdan = cuzdan;
        }
        else{
            System.out.println("Sıstem de Hata var");
           System.exit(1);
        }
        this.parola=parola;
    }

    public void paraCek(int miktar){
        if((cuzdan-miktar) <0)
        {
            System.out.println("Bakiye Yetersiz !");
        }
        else{
            cuzdan -=miktar;
            System.out.println("Yeni Bakiye..:" + cuzdan);
        }
    }
    public void paraYatir(int miktar)
    {
        if(miktar <0){
            System.out.println("Lütfen 0'dan büyük bir tutar giriniz.");
        }
        else{
            cuzdan +=miktar;
            System.out.println("yeni bakiye..:" + cuzdan);
        }

    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    public double getCuzdan() {
        return cuzdan;
    }

    public void setCuzdan(double cuzdan) {
        this.cuzdan = cuzdan;
    }
}
