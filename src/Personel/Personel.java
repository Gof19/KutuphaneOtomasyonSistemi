package Personel;

import KutuphaneOtomasyon.DbHelper;
import java.sql.*;

public class Personel implements IPersonel, IPersonelIslem {

    private int id;
    private String personel_adi;
    private String personel_soyadi;
    private String personel_parola;
    private boolean personel_yetki;

    public Personel(int id, String personel_adi, String personel_soyadi, String personel_parola, boolean personel_yetki) {
        this.id = id;
        this.personel_adi = personel_adi;
        this.personel_soyadi = personel_soyadi;
        this.personel_parola = personel_parola;
        this.personel_yetki = personel_yetki;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean getYetki() {
        return this.personel_yetki;
    }

    @Override
    public void setYetki(boolean yetki) {
        this.personel_yetki = yetki;
    }

    @Override
    public String getAdi() {
        return this.personel_adi;
    }

    @Override
    public void setAdi(String ad) {
        this.personel_adi = ad;
    }

    @Override
    public String getSoyadi() {
        return this.personel_soyadi;
    }

    @Override
    public void setSoyadi(String soyad) {
        this.personel_soyadi = soyad;
    }

    @Override
    public String getParola() {
        return this.personel_parola;
    }

    @Override
    public void setParola(String parola) {
        this.personel_parola = parola;
    }

    @Override
    public void Ekle(Personel personel) {
        Connection connection = null;
        //DbHelper DbHelper = new DbHelper();
        PreparedStatement statement = null;
        try {
            connection = DbHelper.getConnection();
            String sql = "insert into personel (personel_adi,personel_soyadi,personel_password,personel_yetki) values(?,?,?,?)";
            //statement = connection.prepareStatement(sql);
            DbHelper.SqlQueryExe(connection, sql, statement);
            statement.setString(1, personel_adi.getText());
            statement.setString(2, personel_soyadi.getText());
            statement.setString(3, personel_password.getText());
            statement.setBoolean(4, personel_yetki.isSelected());
            int result = statement.executeUpdate();
            refreshTable();

        } catch (SQLException exception) {
            //DbHelper.showErrorMessage(exception);
        } finally {
            try {
                statement.close();
                connection.close();
            } catch (SQLException ex) {

            }
        }
    }

    @Override
    public void Sil(Personel personel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Guncelle(Personel personel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Ara(Personel personel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Listeleme() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
