package Personel;

import java.util.ArrayList;

public interface IPersonelIslemler {

    void Ekle(Personel personel);

    void Sil(int id);

    void Güncelle(Personel personel, int id);

    ArrayList<Personel> Ara(String text);

    void Listele();
}
