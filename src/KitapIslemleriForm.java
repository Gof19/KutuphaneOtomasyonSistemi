
import Kitap.*;
import KutuphaneOtomasyon.DbHelper;
import Kitap.Kitap;
import Kitap.KitapIslemler;
import java.util.ArrayList;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class KitapIslemleriForm extends javax.swing.JFrame {

    DefaultTableModel model;

    public KitapIslemleriForm() {
        try {
            initComponents();
            refreshTable(this.getKitap());
        } catch (Exception e) {
        }
    }

    public void clearTextBox() {
        kitap_adi.setText("");
        kitap_yazari.setText("");
        kitap_yayinevi.setText("");
        kitap_turu.setText("");
        kitap_barkod.setText("");
        kitap_rafno.setText("");
        kitap_Ara.setText("");
    }

    public void refreshTable(ArrayList<Kitap> array) {
        model = (DefaultTableModel) KitapTablo.getModel();
        model.setRowCount(0);
        try {
            ArrayList<Kitap> kitaplar = array;
            for (Kitap kitap : kitaplar) {
                Object[] row = {kitap.getId(), kitap.getAd(), kitap.getYazar(), kitap.getYayinevi(), kitap.getTur(), kitap.getBarkod(), kitap.getRafNo()};
                model.addRow(row);
            }
        } catch (Exception e) {
        }
    }

    public ArrayList<Kitap> getKitap() throws SQLException {
        KitapIslemler islemler = new KitapIslemler();
        return islemler.Listele();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kitap_ekle = new javax.swing.JButton();
        kitap_duzenle = new javax.swing.JButton();
        kitap_sil = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        KitapTablo = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        kitap_adi = new javax.swing.JTextField();
        kitap_yazari = new javax.swing.JTextField();
        kitap_yayinevi = new javax.swing.JTextField();
        kitap_turu = new javax.swing.JTextField();
        kitap_barkod = new javax.swing.JTextField();
        kitap_Ara = new javax.swing.JTextField();
        kitap_ara = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        kitap_rafno = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Kitap İşlemleri");
        setLocation(new java.awt.Point(450, 50));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        kitap_ekle.setText("Kitap Ekle");
        kitap_ekle.setMaximumSize(new java.awt.Dimension(100, 100));
        kitap_ekle.setMinimumSize(new java.awt.Dimension(100, 100));
        kitap_ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kitap_ekleActionPerformed(evt);
            }
        });

        kitap_duzenle.setText("Kitap Düzenle");
        kitap_duzenle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kitap_duzenleActionPerformed(evt);
            }
        });

        kitap_sil.setText("Kitap Sil");
        kitap_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kitap_silActionPerformed(evt);
            }
        });

        KitapTablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Kitap Adı", "Yazarı", "Yayınevi", "Türü", "Barkod No", "Raf No"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        KitapTablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KitapTabloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(KitapTablo);

        jLabel1.setText("Kitap Adı");

        jLabel2.setText("Kitap Yazarı");

        jLabel3.setText("Kitap Yayınevi");

        jLabel4.setText("Kitap Türü");

        jLabel5.setText("Barkod No");

        kitap_adi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kitap_adiActionPerformed(evt);
            }
        });

        kitap_ara.setText("Kitap Ara");
        kitap_ara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kitap_araActionPerformed(evt);
            }
        });

        jLabel7.setText("Raf No ");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setText("Kitap İşlemleri");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setText("Kitap Arama");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(184, 184, 184)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 50, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSeparator2)
                        .addGap(57, 57, 57))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(kitap_barkod)
                            .addComponent(kitap_adi)
                            .addComponent(kitap_yazari)
                            .addComponent(kitap_yayinevi)
                            .addComponent(kitap_turu)
                            .addComponent(kitap_rafno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kitap_ekle, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(kitap_sil, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(kitap_duzenle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(kitap_Ara)
                            .addComponent(kitap_ara, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
                        .addGap(57, 57, 57))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(kitap_adi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(kitap_yazari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(kitap_yayinevi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(kitap_turu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(kitap_barkod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kitap_rafno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(67, 67, 67)
                                    .addComponent(kitap_duzenle, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(kitap_Ara, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(kitap_ara, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(kitap_sil, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(kitap_ekle, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kitap_ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kitap_ekleActionPerformed

        try {
            String ad = kitap_adi.getText();
            String kitap_yazar = kitap_yazari.getText();
            String kitap_yayin = kitap_yayinevi.getText();
            String tur = kitap_turu.getText();
            String barkod = kitap_barkod.getText();
            String rafno = kitap_rafno.getText();
            if (kitap_adi.getText().isEmpty() || kitap_yazari.getText().isEmpty() || kitap_yayinevi.getText().isEmpty() || kitap_turu.getText().isEmpty() || kitap_barkod.getText().isEmpty() || kitap_rafno.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Lütfen tüm alanları doldurunuz.");
            } else {
                KitapIslemler islemler = new KitapIslemler();
                Kitap kitap = new Kitap(ad, kitap_yazar, kitap_yayin, tur, barkod, rafno);
                islemler.Ekle(kitap);
                JOptionPane.showMessageDialog(null, "Ekleme Başarılı");
                refreshTable(this.getKitap());
                clearTextBox();
            }
        } catch (Exception e) {

        }


    }//GEN-LAST:event_kitap_ekleActionPerformed

    private void kitap_duzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kitap_duzenleActionPerformed
        if (KitapTablo.getSelectionModel().isSelectionEmpty()) {
            JOptionPane.showMessageDialog(null, "Lütfen satır seçiniz..");
        } else {
            try {
                int row = KitapTablo.getSelectedRow();
                String value = (KitapTablo.getModel().getValueAt(row, 0).toString());
                String ad = kitap_adi.getText();
                String kitap_yazar = kitap_yazari.getText();
                String kitap_yayin = kitap_yayinevi.getText();
                String tur = kitap_turu.getText();
                String barkod = kitap_barkod.getText();
                String rafno = kitap_rafno.getText();
                KitapIslemler islemler = new KitapIslemler();
                Kitap kitap = new Kitap(ad, kitap_yazar, kitap_yayin, tur, barkod, rafno);
                islemler.Güncelle(kitap, Integer.parseInt(value));
                DefaultTableModel model = (DefaultTableModel) KitapTablo.getModel();
                model.setRowCount(0);
                JOptionPane.showMessageDialog(null, "Güncelleme Başarılı");
                refreshTable(this.getKitap());
                clearTextBox();
            } catch (SQLException e) {

            }
        }
    }//GEN-LAST:event_kitap_duzenleActionPerformed

    private void kitap_adiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kitap_adiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kitap_adiActionPerformed

    private void kitap_araActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kitap_araActionPerformed
        try {
            String text = kitap_Ara.getText();
            if (kitap_Ara.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Lütfen aranacak kelimeyi giriniz.");
            } else {
                KitapIslemler islemler = new KitapIslemler();
                refreshTable(islemler.Ara(text));
                clearTextBox();
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_kitap_araActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

        try {
            refreshTable(this.getKitap());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_formWindowActivated

    private void kitap_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kitap_silActionPerformed
        if (KitapTablo.getSelectionModel().isSelectionEmpty()) {
            JOptionPane.showMessageDialog(null, "Lütfen satır seçiniz..");
        } else {
            try {
                int row = KitapTablo.getSelectedRow();
                String value = (KitapTablo.getModel().getValueAt(row, 0).toString());
                KitapIslemler islemler = new KitapIslemler();
                islemler.Sil(Integer.parseInt(value));
                DefaultTableModel model = (DefaultTableModel) KitapTablo.getModel();
                model.setRowCount(0);
                JOptionPane.showMessageDialog(null, "Silme Başarılı");
                refreshTable(this.getKitap());
            } catch (Exception e) {
            }
        }

    }//GEN-LAST:event_kitap_silActionPerformed

    private void KitapTabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KitapTabloMouseClicked
        int row = KitapTablo.getSelectedRow();
        String kitapAdi = (KitapTablo.getModel().getValueAt(row, 1).toString());
        String kitapYazari = (KitapTablo.getModel().getValueAt(row, 2).toString());
        String kitapYayinevi = (KitapTablo.getModel().getValueAt(row, 3).toString());
        String kitapTuru = (KitapTablo.getModel().getValueAt(row, 4).toString());
        String kitapBarkod = (KitapTablo.getModel().getValueAt(row, 5).toString());
        String kitapRafNO = (KitapTablo.getModel().getValueAt(row, 6).toString());
        kitap_adi.setText(kitapAdi);
        kitap_yazari.setText(kitapYazari);
        kitap_yayinevi.setText(kitapYayinevi);
        kitap_turu.setText(kitapTuru);
        kitap_barkod.setText(kitapBarkod);
        kitap_rafno.setText(kitapRafNO);
    }//GEN-LAST:event_KitapTabloMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(KitapIslemleriForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KitapIslemleriForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KitapIslemleriForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KitapIslemleriForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KitapIslemleriForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable KitapTablo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField kitap_Ara;
    private javax.swing.JTextField kitap_adi;
    private javax.swing.JButton kitap_ara;
    private javax.swing.JTextField kitap_barkod;
    private javax.swing.JButton kitap_duzenle;
    private javax.swing.JButton kitap_ekle;
    private javax.swing.JTextField kitap_rafno;
    private javax.swing.JButton kitap_sil;
    private javax.swing.JTextField kitap_turu;
    private javax.swing.JTextField kitap_yayinevi;
    private javax.swing.JTextField kitap_yazari;
    // End of variables declaration//GEN-END:variables
}
