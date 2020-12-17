package Personel;

public interface IPersonelIslemler {

    void Ekle(Personel personel);

    void Sil(Personel personel);

    void Güncelle(Personel personel,int id);

    void Ara(Personel personel);

    void Listele();
}
