package Personel;

public class Personel implements IPersonel {

    private String ad;
    private String soyad;
    private String parola;
    private boolean yetki;

    public Personel(String ad, String soyad, String parola, boolean yetki) {
        this.ad = ad;
        this.soyad = soyad;
        this.parola = parola;
        this.yetki = yetki;
    }

    @Override
    public String getParola() {
        return this.parola = parola;
    }

    @Override
    public void setParola(String parola) {
        this.parola = parola;
    }

    @Override
    public boolean getYetki() {
        return this.yetki = yetki;
    }

    @Override
    public void setYetki(boolean yetki) {
        this.yetki = yetki;
    }

    @Override
    public String getAd() {
        return this.ad = ad;
    }

    @Override
    public void setAd(String ad) {
        this.ad = ad;
    }

    @Override
    public String getSoyad() {
        return this.soyad = soyad;
    }

    @Override
    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

}
