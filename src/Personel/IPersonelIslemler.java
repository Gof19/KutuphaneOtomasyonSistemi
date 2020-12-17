package Personel;

public interface IPersonelIslemler {

    void Ekle(Personel personel);

    void Sil(int id);

    void Güncelle(Personel personel, int id);

    void Ara(Personel personel);

    void Listele();
}
