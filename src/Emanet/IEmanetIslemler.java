
package Emanet;

import java.util.ArrayList;

public interface IEmanetIslemler {
    
     void Ekle(Emanet emanet);

    void Sil(int id);

    void Güncelle(Emanet emanet, int id);

    ArrayList<Emanet> Ara(String text);

    ArrayList<Emanet> Listele();
    
}
