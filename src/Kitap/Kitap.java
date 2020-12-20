package Kitap;

import java.util.ArrayList;

public class Kitap implements IKutuphaneKitap {

    public static ArrayList<String> idlist = new ArrayList<String>();
    private int id;
    private String adi;
    private String yazar;
    private String yayinevi;
    private String tur;
    private String barkod;
    private String rafNo;

    public Kitap(int id, String adi, String yazar, String yayinevi, String tur, String barkod, String rafNo) {
        this.id = id;
        this.adi = adi;
        this.yazar = yazar;
        this.yayinevi = yayinevi;
        this.tur = tur;
        this.barkod = barkod;
        this.rafNo = rafNo;
    }

    public Kitap(String adi, String yazar, String yayinevi, String tur, String barkod, String rafNo) {
        this.adi = adi;
        this.yazar = yazar;
        this.yayinevi = yayinevi;
        this.tur = tur;
        this.barkod = barkod;
        this.rafNo = rafNo;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getBarkod() {
        return this.barkod;
    }

    @Override
    public void setBarkod(String barkod) {
        this.barkod = barkod;
    }

    @Override
    public String getRafNo() {
        return this.rafNo;
    }

    @Override
    public void setRafNo(String rafNo) {
        this.rafNo = rafNo;
    }

    @Override
    public String getAd() {
        return this.adi;
    }

    @Override
    public void setAd(String ad) {
        this.adi = adi;
    }

    @Override
    public String getYazar() {
        return this.yazar;
    }

    @Override
    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    @Override
    public String getYayinevi() {
        return this.yayinevi;
    }

    @Override
    public void setYayinevi(String yayinevi) {
        this.yayinevi = yayinevi;
    }

    @Override
    public String getTur() {
        return this.tur;
    }

    @Override
    public void setTur(String tur) {
        this.tur = tur;
    }

    @Override
    public String toString() {
        idlist.add(String.valueOf(this.id));
        return this.barkod;
    }

}
