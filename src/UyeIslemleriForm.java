
import Uye.*;
import KutuphaneOtomasyon.DbHelper;
import java.util.ArrayList;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UyeIslemleriForm extends javax.swing.JFrame {

    DefaultTableModel model;

    public UyeIslemleriForm() {
        try {
            initComponents();
            refreshTable(this.getUye());
        } catch (Exception e) {
        }
    }

    public void clearTextBox() {
        uye_ad.setText("");
        uye_soyad.setText("");
        uye_tel.setText("");
        uye_mail.setText("");
        uye_okitap.setText("");
        uye_aratext.setText("");
    }

    public void refreshTable(ArrayList<Uye> array) {
        model = (DefaultTableModel) UyeTablo.getModel();
        model.setRowCount(0);
        try {
            ArrayList<Uye> uyeler = array;
            for (Uye uye : uyeler) {
                Object[] row = {uye.getId(), uye.getAd(), uye.getSoyad(), uye.getTel(), uye.getMail(), uye.getOkitap()};
                model.addRow(row);
            }
        } catch (Exception e) {
        }
    }

    public ArrayList<Uye> getUye() throws SQLException {
        UyeIslemler islemler = new UyeIslemler();
        return islemler.Listele();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        UyeTablo = new javax.swing.JTable();
        uye_ad = new javax.swing.JTextField();
        uye_soyad = new javax.swing.JTextField();
        uye_tel = new javax.swing.JTextField();
        uye_mail = new javax.swing.JTextField();
        uye_okitap = new javax.swing.JTextField();
        uye_guncelle = new javax.swing.JButton();
        uye_sil = new javax.swing.JButton();
        uye_ara = new javax.swing.JButton();
        uye_aratext = new javax.swing.JTextField();
        uye_ekle = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(350, 100));

        UyeTablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Uye ID", "Uye Ad", "Uye Soyad", "Uye Tel", "Uye Mail", "Okuduğu Kitap S."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        UyeTablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UyeTabloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(UyeTablo);
        if (UyeTablo.getColumnModel().getColumnCount() > 0) {
            UyeTablo.getColumnModel().getColumn(1).setResizable(false);
            UyeTablo.getColumnModel().getColumn(5).setResizable(false);
        }

        uye_guncelle.setText("Üye Güncelle");
        uye_guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uye_guncelleActionPerformed(evt);
            }
        });

        uye_sil.setText("Üye Sil");
        uye_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uye_silActionPerformed(evt);
            }
        });

        uye_ara.setText("Üye Ara");
        uye_ara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uye_araActionPerformed(evt);
            }
        });

        uye_ekle.setText("Üye Ekle");
        uye_ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uye_ekleActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Üye Arama");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Üye İşlemleri");

        jLabel3.setText("Üye Adı");

        jLabel4.setText("Üye Soyadı");

        jLabel5.setText("Üye Tel");

        jLabel6.setText("Üye Mail");

        jLabel7.setText("Üye Okuduğu Kitap S.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(147, 147, 147))
                            .addComponent(jSeparator1))
                        .addContainerGap(52, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(uye_tel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(uye_guncelle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(uye_ad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(uye_soyad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(uye_ekle, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(uye_mail, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(uye_okitap, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(uye_sil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(uye_aratext)
                            .addComponent(uye_ara, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(90, 90, 90))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(uye_ad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(uye_soyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(uye_tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uye_mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uye_okitap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(uye_ekle, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(uye_guncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(uye_sil, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(uye_aratext, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(uye_ara, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void uye_guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uye_guncelleActionPerformed
        if (UyeTablo.getSelectionModel().isSelectionEmpty()) {
            JOptionPane.showMessageDialog(null, "Lütfen satır seçiniz..");
        } else {
            try {
                int row = UyeTablo.getSelectedRow();
                String value = (UyeTablo.getModel().getValueAt(row, 0).toString());
                String ad = uye_ad.getText();
                String soyad = uye_soyad.getText();
                int tel = Integer.parseInt(uye_tel.getText().toString());
                String mail = uye_mail.getText();
                int okitap = Integer.parseInt(uye_okitap.getText().toString());
                UyeIslemler islemler = new UyeIslemler();
                Uye uye = new Uye(ad, soyad, tel, mail, okitap);
                islemler.Güncelle(uye, Integer.parseInt(value));
                DefaultTableModel model = (DefaultTableModel) UyeTablo.getModel();
                model.setRowCount(0);
                JOptionPane.showMessageDialog(null, "Güncelleme Başarılı");
                refreshTable(this.getUye());
                clearTextBox();
            } catch (SQLException e) {

            }
        }
    }//GEN-LAST:event_uye_guncelleActionPerformed

    private void uye_ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uye_ekleActionPerformed
        try {
            String ad = uye_ad.getText();
            String soyad = uye_soyad.getText();
            int tel = Integer.parseInt(uye_tel.getText().toString());
            String mail = uye_mail.getText();
            int okitap = Integer.parseInt(uye_okitap.getText().toString());
            if (uye_ad.getText().isEmpty() || uye_soyad.getText().isEmpty() || uye_tel.getText().isEmpty() || uye_mail.getText().isEmpty() || uye_okitap.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Lütfen tüm alanları doldurunuz.");
            } else {
                UyeIslemler islemler = new UyeIslemler();
                Uye uye = new Uye(ad, soyad, tel, mail, okitap);
                islemler.Ekle(uye);
                JOptionPane.showMessageDialog(null, "Ekleme Başarılı");
                refreshTable(this.getUye());
                clearTextBox();
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_uye_ekleActionPerformed

    private void uye_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uye_silActionPerformed
        if (UyeTablo.getSelectionModel().isSelectionEmpty()) {
            JOptionPane.showMessageDialog(null, "Lütfen satır seçiniz..");
        } else {
            try {
                int row = UyeTablo.getSelectedRow();
                String value = (UyeTablo.getModel().getValueAt(row, 0).toString());
                UyeIslemler islemler = new UyeIslemler();
                islemler.Sil(Integer.parseInt(value));
                DefaultTableModel model = (DefaultTableModel) UyeTablo.getModel();
                model.setRowCount(0);
                JOptionPane.showMessageDialog(null, "Silme Başarılı");
                refreshTable(this.getUye());
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_uye_silActionPerformed

    private void uye_araActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uye_araActionPerformed
        try {
            String text = uye_aratext.getText();
            if (uye_aratext.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Lütfen aranacak kelimeyi giriniz.");
            } else {
                UyeIslemler islemler = new UyeIslemler();
                refreshTable(islemler.Ara(text));
                clearTextBox();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_uye_araActionPerformed

    private void UyeTabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UyeTabloMouseClicked
        int row = UyeTablo.getSelectedRow();
        String ad = (UyeTablo.getModel().getValueAt(row, 1).toString());
        String soyad = (UyeTablo.getModel().getValueAt(row, 2).toString());
        String tel = (UyeTablo.getModel().getValueAt(row, 3).toString());
        String mail = (UyeTablo.getModel().getValueAt(row, 2).toString());
        String oKitap = (UyeTablo.getModel().getValueAt(row, 3).toString());
        uye_ad.setText(ad);
        uye_soyad.setText(soyad);
        uye_tel.setText(tel);
        uye_mail.setText(mail);
        uye_okitap.setText(oKitap);
    }//GEN-LAST:event_UyeTabloMouseClicked

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
            java.util.logging.Logger.getLogger(UyeIslemleriForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UyeIslemleriForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UyeIslemleriForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UyeIslemleriForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UyeIslemleriForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable UyeTablo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField uye_ad;
    private javax.swing.JButton uye_ara;
    private javax.swing.JTextField uye_aratext;
    private javax.swing.JButton uye_ekle;
    private javax.swing.JButton uye_guncelle;
    private javax.swing.JTextField uye_mail;
    private javax.swing.JTextField uye_okitap;
    private javax.swing.JButton uye_sil;
    private javax.swing.JTextField uye_soyad;
    private javax.swing.JTextField uye_tel;
    // End of variables declaration//GEN-END:variables
}
