package day26;

public class MainApp {
    public static void main(String[] args) {

        Kare kare=new Kare(7);
        Daire daire=new Daire(7);

        double alanFarki= kare.alanHesapla()- daire.alanHesapla();
        double cevreFarki= kare.cevreHesapla()- daire.cevreHesapla();

        System.out.printf("Alanlarin mutlak farki = %3.2f cm^2\n",Math.abs(alanFarki));
        System.out.printf("Cevrelerin mutlak farki = %3.2f cm",Math.abs(cevreFarki));

    }
}
