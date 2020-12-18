package Kitap;

import Kitap.*;

import KutuphaneOtomasyon.DbHelper;
import java.sql.*;
import java.util.ArrayList;

public class KitapIslemler implements IKitapIslemler {

    @Override
    public void Ekle(Kitap kitap) {
        Connection connection = null;
        DbHelper DbHelper = new DbHelper();
        PreparedStatement statement = null;
        try {
            connection = DbHelper.getConnection();
            String sql = "insert into kitap (kitap_adi, kitap_yazari, kitap_yayinevi,kitap_turu,kitap_barkod,kitap_rafno) values(?,?,?,?,?,?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1, kitap.getAd());
            statement.setString(2, kitap.getYazar());
            statement.setString(3, kitap.getYayinevi());
            statement.setString(4, kitap.getTur());
            statement.setString(5, kitap.getBarkod());
            statement.setString(6, kitap.getRafNo());


            int result = statement.executeUpdate();
            //refreshTable();

        } catch (SQLException exception) {
            DbHelper.showErrorMessage(exception);
        } finally {
            try {
                statement.close();
                connection.close();
            } catch (SQLException ex) {

            }
        }
    }

    @Override
    public void Sil(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Güncelle(Kitap kitap, int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Kitap> Ara(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Kitap> Listele() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
