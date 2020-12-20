
package Emanet;

//import Kitap.Kitap;
import KutuphaneOtomasyon.DbHelper;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

//public class EmanetIslemler implements IEmanetIslemler{
/*
    @Override
    public void Ekle(Emanet emanet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Sil(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Güncelle(Emanet emanet, int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Emanet> Ara(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Emanet> Listele() {
       
        Connection connection = null;
        DbHelper DbHelper = new DbHelper();
        Statement statement = null;
        //ResultSet ResultSet = new ResultSet();
        ArrayList<Emanet> emanetler = null;
        try {
            connection = DbHelper.getConnection();
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM emanet INNER JOIN uye ON uye.uye_id = emanet.uye_id INNER JOIN kitap ON kitap.kitap_id = emanet.kitap_id");
            emanetler = new ArrayList<Emanet>();
            while (resultSet.next()) {
                emanetler.add(new Emanet(
                        resultSet.getInt("id"),
                        resultSet.getString("kitap_adi"),
                        resultSet.getString("kitap_yazari"),
                        resultSet.getString("kitap_yayinevi"),
                        resultSet.getString("kitap_turu"),
                        resultSet.getString("kitap_barkod"),
                        resultSet.getString("kitap_rafno")
                ));
            }
        } catch (SQLException exception) {
            DbHelper.showErrorMessage(exception);
        }
        return emanet;
        
        
    }*/
    

