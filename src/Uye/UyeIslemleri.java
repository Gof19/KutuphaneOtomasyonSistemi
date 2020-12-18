package Uye;

import KutuphaneOtomasyon.DbHelper;
import java.sql.*;
import java.util.ArrayList;

public class UyeIslemleri implements IUyeIslemleri {

    @Override
    public void Ekle(Uye uye) {

        Connection connection = null;
        DbHelper DbHelper = new DbHelper();
        PreparedStatement statement = null;
        try {
            connection = DbHelper.getConnection();
            String sql = "insert into uye (uye_adi,uye_soyadi,uye_tel,uye_mail,uye_okitap) values(?,?,?,?,?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1, uye.getAd());
            statement.setString(2, uye.getSoyad());
            statement.setInt(3, uye.getTel());
            statement.setString(4, uye.getMail());
            statement.setInt(5,uye.getOkitap());

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
        Connection connection = null;
        DbHelper DbHelper = new DbHelper();
        PreparedStatement statement = null;
        try {
            connection = DbHelper.getConnection();
            String sql = "DELETE FROM uye WHERE id = " + id;
            statement = connection.prepareStatement(sql);
            int result = statement.executeUpdate();
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
    public void Güncelle(Uye uye, int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Uye> Ara(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Uye> Listele() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
