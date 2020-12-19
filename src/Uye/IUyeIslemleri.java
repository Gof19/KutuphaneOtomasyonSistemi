package Uye;

import java.util.ArrayList;

public interface IUyeIslemleri {

    void Ekle(Uye uye);

    void Sil(int id);

    void Güncelle(Uye uye, int id);

    ArrayList<Uye> Ara(String text);

    ArrayList<Uye> Listele();
}
