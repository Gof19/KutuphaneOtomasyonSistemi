
package Emanet;
import KutuphaneOtomasyon.DbHelper;
import java.sql.*;
import javax.swing.JComboBox;

public class Emanet {
    
   /* public static void fillMusteri(JComboBox mybox) throws SQLException
      {
          try {
            connection = DbHelper.getConnection();
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from kitap");
            kitaplar = new ArrayList<Kitap>();
            while (resultSet.next()) {
                kitaplar.add(new Kitap(
                        resultSet.getInt("kitap_id"),
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
        return kitaplar;
          
          
          
          
          
          Db baglanti = ConnData.getConn();  
          String SQL = "SELECT * FROM musteriler";
          ResultSet rs = ConnData.sorgu(SQL);
          while(rs.next())
          {
              mybox.addItem(new Musteriler(rs.getInt(1),rs.getString(2),rs.getString(3)));
          }
         rs.close();
                 
    
      }*/

}
 
