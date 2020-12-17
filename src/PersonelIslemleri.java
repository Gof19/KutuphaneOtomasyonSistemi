
import Personel.*;
import KutuphaneOtomasyon.DbHelper;
import java.util.ArrayList;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PersonelIslemleri extends javax.swing.JFrame {

    DefaultTableModel model;

    public PersonelIslemleri() {

        initComponents();
        refreshTable();
    }

    public void refreshTable() {

        model = (DefaultTableModel) PersonelTablo.getModel();
        model.setRowCount(0);
        try {
            ArrayList<Personel> personels = getPersonel();
            for (Personel personel : personels) {
                Object[] row = {personel.getId(), personel.getAd(), personel.getSoyad(), personel.getParola(), personel.getYetki()};
                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PersonelIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Personel> getPersonel() throws SQLException {
        Connection connection = null;
        DbHelper DbHelper = new DbHelper();
        Statement statement = null;
        //ResultSet ResultSet = new ResultSet();

        ArrayList<Personel> personels = null;

        try {
            connection = DbHelper.getConnection();
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from personel");
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
        } finally {
            statement.close();
            connection.close();
        }

        return personels;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        popupMenu2 = new java.awt.PopupMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        PersonelTablo = new javax.swing.JTable();
        personel_adi = new javax.swing.JTextField();
        personel_soyadi = new javax.swing.JTextField();
        personel_parola = new javax.swing.JTextField();
        personel_ekle = new javax.swing.JButton();
        personel_guncelle = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        personel_yetki = new javax.swing.JCheckBox();

        popupMenu1.setLabel("popupMenu1");

        popupMenu2.setLabel("popupMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        PersonelTablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PersonelNo", "PersonelAdı", " PersonelSoyadı", "PersonelŞifre", "PersonelYetki"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        PersonelTablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PersonelTabloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(PersonelTablo);

        personel_soyadi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personel_soyadiActionPerformed(evt);
            }
        });

        personel_ekle.setText("Personel Ekle");
        personel_ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personel_ekleActionPerformed(evt);
            }
        });

        personel_guncelle.setText("Personel Güncelle");
        personel_guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personel_guncelleActionPerformed(evt);
            }
        });

        jButton3.setText("Personel Sil");

        jLabel1.setText("Personel Adı");

        jLabel2.setText("Personel Soyadı");

        jLabel3.setText("Personel Şifre");

        jLabel4.setText("Personel Yetki");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(personel_soyadi)
                    .addComponent(personel_parola)
                    .addComponent(personel_adi)
                    .addComponent(personel_yetki, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(personel_ekle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(personel_guncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(personel_ekle, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(personel_guncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(personel_adi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(personel_soyadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(personel_parola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(personel_yetki))))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void personel_soyadiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personel_soyadiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_personel_soyadiActionPerformed

    private void personel_ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personel_ekleActionPerformed
        String ad = personel_adi.getText();
        String soyad = personel_soyadi.getText();
        String parola = personel_parola.getText();
        boolean yetki = personel_yetki.isSelected();
        PersonelIslemler islemler = new PersonelIslemler();
        Personel personel = new Personel(ad, soyad, parola, yetki);
        islemler.Ekle(personel);
        JOptionPane.showMessageDialog(null, "Ekleme Başarılı");
        refreshTable();
    }//GEN-LAST:event_personel_ekleActionPerformed

    private void PersonelTabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PersonelTabloMouseClicked


    }//GEN-LAST:event_PersonelTabloMouseClicked

    private void personel_guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personel_guncelleActionPerformed

        int row = PersonelTablo.getSelectedRow();
        String value = (PersonelTablo.getModel().getValueAt(row, 0).toString());
        String ad = personel_adi.getText();
        String soyad = personel_soyadi.getText();
        String parola = personel_parola.getText();
        boolean yetki = personel_yetki.isSelected();
        PersonelIslemler islemler = new PersonelIslemler();
        Personel personel = new Personel(ad, soyad, parola, yetki);
        islemler.Güncelle(personel, Integer.parseInt(value));
        DefaultTableModel model = (DefaultTableModel) PersonelTablo.getModel();
        model.setRowCount(0);
        JOptionPane.showMessageDialog(null, "Güncelleme Başarılı");
        refreshTable();
    }//GEN-LAST:event_personel_guncelleActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        refreshTable();
    }//GEN-LAST:event_formWindowActivated

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PersonelIslemleri.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonelIslemleri.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonelIslemleri.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonelIslemleri.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonelIslemleri().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable PersonelTablo;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField personel_adi;
    private javax.swing.JButton personel_ekle;
    private javax.swing.JButton personel_guncelle;
    private javax.swing.JTextField personel_parola;
    private javax.swing.JTextField personel_soyadi;
    private javax.swing.JCheckBox personel_yetki;
    private java.awt.PopupMenu popupMenu1;
    private java.awt.PopupMenu popupMenu2;
    // End of variables declaration//GEN-END:variables

    private static class SQLExeptionstatic {

        public SQLExeptionstatic() {
        }
    }
}
