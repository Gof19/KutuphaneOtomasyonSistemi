package Uye;

public class Uye implements IUye {

    private int id;
    private String ad;
    private String soyad;
    private int tel;
    private String mail;
    private int okitap;

    public Uye(int id, String ad, String soyad, int tel, String mail, int okitap) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.tel = tel;
        this.mail = mail;
        this.okitap = okitap;
    }

    public Uye(String ad, String soyad, int tel, String mail, int okitap) {
        this.ad = ad;
        this.soyad = soyad;
        this.tel = tel;
        this.mail = mail;
        this.okitap = okitap;
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
    public String getSoyad() {

        return this.soyad;
    }

    @Override
    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    @Override
    public int getTel() {
        return this.tel;
    }

    @Override
    public void setTel(int tel) {
        this.tel = tel;
    }

    @Override
    public String getMail() {
        return this.mail;
    }

    @Override
    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public int getOkitap() {
        return this.okitap;
    }

    @Override
    public void setOkitap(int okitap) {
        this.okitap = okitap;
    }

    @Override
    public String getAd() {
        return this.ad;
    }

    @Override
    public void setAd(String ad) {
        this.ad = ad;
    }

}
