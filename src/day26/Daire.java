package day26;

public class Daire {
    public int yariCap;


    public Daire(int yariCap){
        this.yariCap=yariCap;
    }


    public double alanHesapla(){
        return Math.PI*yariCap*yariCap;
    }
    public double cevreHesapla(){
        return 2*Math.PI*yariCap;
    }
}
