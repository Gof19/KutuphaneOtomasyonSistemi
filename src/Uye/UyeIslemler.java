package Uye;

import KutuphaneOtomasyon.DbHelper;
import java.sql.*;
import java.util.ArrayList;

public class UyeIslemler implements IUyeIslemleri {

    @Override
    public void Ekle(Uye uye) {
        Connection connection = null;
        DbHelper DbHelper = new DbHelper();
        PreparedStatement statement = null;
        try {
            connection = DbHelper.getConnection();
            String sql = "insert into uye (uye_ad,uye_soyad,uye_tel,uye_mail,uye_okitap) values(?,?,?,?,?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1, uye.getAd());
            statement.setString(2, uye.getSoyad());
            statement.setInt(3, uye.getTel());
            statement.setString(4, uye.getMail());
            statement.setInt(5, uye.getOkitap());

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
            String sql = "DELETE FROM uye WHERE uye_id = " + id;
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
        Connection connection = null;
        DbHelper DbHelper = new DbHelper();
        PreparedStatement statement = null;
        //uye Güncelle
        try {
            //String url = "jdbc:mysql://localhost:5555/KutuphaneOtomasyon?useSSL=false&serverTimezone=UTC";
            connection = DbHelper.getConnection();

            String query = "UPDATE uye SET uye_ad=?, uye_soyad=?, uye_tel=?, uye_mail=?, uye_okitap=? where uye_id=" + id;
            PreparedStatement pst = connection.prepareStatement(query);
            pst.setString(1, uye.getAd());
            pst.setString(2, uye.getSoyad());
            pst.setInt(3, uye.getTel());
            pst.setString(4, uye.getMail());
            pst.setInt(5, uye.getOkitap());
            pst.executeUpdate();

        } catch (Exception e) {
        }
    }

    @Override
    public ArrayList<Uye> Ara(String text) {

        Connection connection = null;
        DbHelper DbHelper = new DbHelper();
        Statement statement = null;
        ArrayList<Uye> uyes = null;
        try {
            connection = DbHelper.getConnection();
            String sql = "SELECT * FROM uye WHERE uye_ad LIKE '%" + text + "%' or uye_soyad LIKE '%" + text + "%'or uye_tel LIKE '%" + text + "%'or uye_mail LIKE '%" + text + "%'";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            uyes = new ArrayList<Uye>();
            while (resultSet.next()) {
                uyes.add(new Uye(
                        resultSet.getInt("uye_id"),
                        resultSet.getString("uye_ad"),
                        resultSet.getString("uye_soyad"),
                        resultSet.getInt("uye_tel"),
                        resultSet.getString("uye_mail"),
                        resultSet.getInt("uye_okitap")
                ));
            }
        } catch (SQLException exception) {
            DbHelper.showErrorMessage(exception);
        }
        return uyes;
    }

    @Override
    public ArrayList<Uye> Listele() {
        Connection connection = null;
        DbHelper DbHelper = new DbHelper();
        Statement statement = null;
        //ResultSet ResultSet = new ResultSet();
        ArrayList<Uye> uyes = null;
        try {
            connection = DbHelper.getConnection();
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from uye");
            uyes = new ArrayList<Uye>();
            while (resultSet.next()) {
                uyes.add(new Uye(
                        resultSet.getInt("uye_id"),
                        resultSet.getString("uye_ad"),
                        resultSet.getString("uye_soyad"),
                        resultSet.getInt("uye_tel"),
                        resultSet.getString("uye_mail"),
                        resultSet.getInt("uye_okitap")
                ));
            }
        } catch (SQLException exception) {
            DbHelper.showErrorMessage(exception);
        }
        return uyes;
    }

}
