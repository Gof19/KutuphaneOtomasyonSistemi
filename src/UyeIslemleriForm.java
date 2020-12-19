
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        jScrollPane1.setViewportView(UyeTablo);
        if (UyeTablo.getColumnModel().getColumnCount() > 0) {
            UyeTablo.getColumnModel().getColumn(1).setResizable(false);
            UyeTablo.getColumnModel().getColumn(5).setResizable(false);
        }

        uye_ad.setText("uye_ad");

        uye_soyad.setText("uye_soyad");

        uye_tel.setText("uye_tel");

        uye_mail.setText("uye_mail");

        uye_okitap.setText("uye_okitap");

        uye_guncelle.setText("uye_guncelle");
        uye_guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uye_guncelleActionPerformed(evt);
            }
        });

        uye_sil.setText("uye_sil");
        uye_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uye_silActionPerformed(evt);
            }
        });

        uye_ara.setText("uye_ara");
        uye_ara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uye_araActionPerformed(evt);
            }
        });

        uye_aratext.setText("uye_aratext");

        uye_ekle.setText("uye_ekle");
        uye_ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uye_ekleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(uye_soyad, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uye_ad, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uye_tel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uye_mail, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uye_okitap, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(uye_sil)
                                    .addComponent(uye_guncelle))
                                .addGap(199, 199, 199)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(uye_aratext, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(uye_ara)))
                            .addComponent(uye_ekle))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(uye_ad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uye_ekle))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(uye_soyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uye_guncelle))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(uye_tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uye_sil))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(uye_mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(uye_okitap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(73, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(uye_aratext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(uye_ara)
                        .addGap(116, 116, 116))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void uye_guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uye_guncelleActionPerformed
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
    }//GEN-LAST:event_uye_guncelleActionPerformed

    private void uye_ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uye_ekleActionPerformed
        try {
            String ad = uye_ad.getText();
            String soyad = uye_soyad.getText();
            int tel = Integer.parseInt(uye_tel.getText().toString());
            String mail = uye_mail.getText();
            int okitap = Integer.parseInt(uye_okitap.getText().toString());
            UyeIslemler islemler = new UyeIslemler();
            Uye uye = new Uye(ad, soyad, tel, mail, okitap);
            islemler.Ekle(uye);
            JOptionPane.showMessageDialog(null, "Ekleme Başarılı");
            refreshTable(this.getUye());
            clearTextBox();
        } catch (Exception e) {

        }
    }//GEN-LAST:event_uye_ekleActionPerformed

    private void uye_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uye_silActionPerformed
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
    }//GEN-LAST:event_uye_silActionPerformed

    private void uye_araActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uye_araActionPerformed
        try {
            String text = uye_aratext.getText();
            UyeIslemler islemler = new UyeIslemler();
            //JOptionPane.showMessageDialog(null, "Silme Başarılı");
            refreshTable(islemler.Ara(text));
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_uye_araActionPerformed

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
    private javax.swing.JScrollPane jScrollPane1;
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
