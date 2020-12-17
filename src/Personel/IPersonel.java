package Personel;

public interface IPersonel extends IInsan {
    
    int getId();
    void setId(int id);
    
    boolean getYetki();
    void setYetki(boolean yetki);
    
    String getParola();
    void setParola(String parola);
}
