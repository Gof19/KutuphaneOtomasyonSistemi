
public class Personel {
    private int id;
    private String personel_adi;
    private String personel_soyadi;
    private String personel_password;
    private boolean personel_yetki;

    public Personel(int id, String personel_adi, String personel_soyadi, String personel_password, boolean personel_yetki) {
        this.id = id;
        this.personel_adi = personel_adi;
        this.personel_soyadi = personel_soyadi;
        this.personel_password = personel_password;
        this.personel_yetki = personel_yetki;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPersonel_adi() {
        return personel_adi;
    }

    public void setPersonel_adi(String personel_adi) {
        this.personel_adi = personel_adi;
    }   

    public String getPersonel_soyadi() {
        return personel_soyadi;
    }

    public void setPersonel_soyadi(String personel_soyadi) {
        this.personel_soyadi = personel_soyadi;
    }

    public String getPersonel_password() {
        return personel_password;
    }

    public void setPersonel_password(String personel_password) {
        this.personel_password = personel_password;
    }

    public boolean isPersonel_yetki() {
        return personel_yetki;
    }

    public void setPersonel_yetki(boolean personel_yetki) {
        this.personel_yetki = personel_yetki;
    }
}


