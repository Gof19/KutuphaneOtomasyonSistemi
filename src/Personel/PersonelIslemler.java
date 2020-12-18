package Personel;

import KutuphaneOtomasyon.DbHelper;
import java.sql.*;
import java.util.ArrayList;

public class PersonelIslemler implements IPersonelIslemler {

    @Override
    public void Ekle(Personel personel) {
        Connection connection = null;
        DbHelper DbHelper = new DbHelper();
        PreparedStatement statement = null;
        try {
            connection = DbHelper.getConnection();
            String sql = "insert into personel (personel_adi,personel_soyadi,personel_password,personel_yetki) values(?,?,?,?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1, personel.getAd());
            statement.setString(2, personel.getSoyad());
            statement.setString(3, personel.getParola());
            statement.setBoolean(4, personel.getYetki());

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
            String sql = "DELETE FROM personel WHERE id = " + id;
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
    public void Güncelle(Personel personel, int id) {

        Connection connection = null;
        DbHelper DbHelper = new DbHelper();
        PreparedStatement statement = null;
        //Personel Güncelle
        try {
            String url = "jdbc:mysql://localhost:5555/KutuphaneOtomasyon?useSSL=false&serverTimezone=UTC";
            connection = DbHelper.getConnection();

            String query = "UPDATE personel SET personel_adi=?, personel_soyadi=?, personel_password=?, personel_yetki=? where id=" + id;
            PreparedStatement pst = connection.prepareStatement(query);
            pst.setString(1, personel.getAd());
            pst.setString(2, personel.getSoyad());
            pst.setString(3, personel.getParola());
            pst.setBoolean(4, personel.getYetki());
            pst.executeUpdate();

        } catch (Exception e) {
        }

    }

    @Override
    public ArrayList<Personel> Ara(String text) {
        Connection connection = null;
        DbHelper DbHelper = new DbHelper();
        Statement statement = null;
        ArrayList<Personel> personels = null;
        try {
            connection = DbHelper.getConnection();
            String sql = "SELECT * FROM personel WHERE personel_adi LIKE '%" + text + "%' or personel_soyadi LIKE '%" + text + "%'";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            personels = new ArrayList<Personel>();
            while (resultSet.next()) {
                personels.add(new Personel(
                        resultSet.getInt("id"),
                        resultSet.getString("personel_adi"),
                        resultSet.getString("personel_soyadi"),
                        resultSet.getString("personel_password"),
                        resultSet.getBoolean("personel_yetki")
                ));
            }
        } catch (SQLException exception) {
            DbHelper.showErrorMessage(exception);
        }
        return personels;

    }

    @Override
    public void Listele() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
