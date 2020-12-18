package Kitap;

import java.util.ArrayList;

public interface IKitapIslemler {

    void Ekle(Kitap kitap);

    void Sil(int id);

    void Güncelle(Kitap kitap, int id);

    ArrayList<Kitap> Ara(String text);

    ArrayList<Kitap> Listele();

}
