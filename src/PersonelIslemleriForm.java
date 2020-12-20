
import Personel.*;
import KutuphaneOtomasyon.DbHelper;
import java.util.ArrayList;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PersonelIslemleriForm extends javax.swing.JFrame {

    DefaultTableModel model;

    public PersonelIslemleriForm() {
        try {
            initComponents();
            refreshTable(this.getPersonel());
        } catch (Exception e) {
        }

    }

    public void clearTextBox() {
        personel_adi.setText("");
        personel_soyadi.setText("");
        personel_parola.setText("");
        personel_yetki.setSelected(false);
        personel_araText.setText("");
    }

    public void refreshTable(ArrayList<Personel> array) {
        model = (DefaultTableModel) PersonelTablo.getModel();
        model.setRowCount(0);
        try {
            ArrayList<Personel> personels = array;
            for (Personel personel : personels) {
                Object[] row = {personel.getId(), personel.getAd(), personel.getSoyad(), personel.getParola(), personel.getYetki()};
                model.addRow(row);
            }
        } catch (Exception e) {
        }
    }

    public ArrayList<Personel> getPersonel() throws SQLException {
        PersonelIslemler islemler = new PersonelIslemler();
        return islemler.Listele();
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
        personel_sil = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        personel_yetki = new javax.swing.JCheckBox();
        personel_araText = new javax.swing.JTextField();
        personel_ara = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        popupMenu1.setLabel("popupMenu1");

        popupMenu2.setLabel("popupMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Personel İşlemleri");
        setLocation(new java.awt.Point(400, 200));
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

        personel_sil.setText("Personel Sil");
        personel_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personel_silActionPerformed(evt);
            }
        });

        jLabel1.setText("Personel Adı");

        jLabel2.setText("Personel Soyadı");

        jLabel3.setText("Personel Şifre");

        jLabel4.setText("Personel Yetki");

        personel_yetki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personel_yetkiActionPerformed(evt);
            }
        });

        personel_araText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personel_araTextActionPerformed(evt);
            }
        });

        personel_ara.setText("Personel Ara");
        personel_ara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personel_araActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setText("Personel Arama");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setText("Personel İşlemleri");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel4))
                                    .addGap(26, 26, 26)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(personel_adi, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                            .addComponent(personel_soyadi)
                                            .addComponent(personel_parola))
                                        .addComponent(personel_yetki, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(personel_ekle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(personel_sil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(personel_guncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(49, 49, 49)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(personel_araText)
                                        .addComponent(personel_ara, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(50, 50, 50))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(personel_adi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(personel_soyadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(personel_parola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(personel_yetki)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(personel_araText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(personel_ara, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(personel_ekle, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(personel_guncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(personel_sil, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void personel_soyadiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personel_soyadiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_personel_soyadiActionPerformed

    private void personel_ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personel_ekleActionPerformed
        try {
            String ad = personel_adi.getText();
            String soyad = personel_soyadi.getText();
            String parola = personel_parola.getText();
            boolean yetki = personel_yetki.isSelected();
            if (personel_adi.getText().isEmpty() || personel_parola.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Lütfen tüm alanları doldurunuz.");
            } else {
                PersonelIslemler islemler = new PersonelIslemler();
                Personel personel = new Personel(ad, soyad, parola, yetki);
                islemler.Ekle(personel);
                JOptionPane.showMessageDialog(null, "Ekleme Başarılı");
                refreshTable(this.getPersonel());
                clearTextBox();
            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_personel_ekleActionPerformed

    private void PersonelTabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PersonelTabloMouseClicked
        int row = PersonelTablo.getSelectedRow();
        String ad = (PersonelTablo.getModel().getValueAt(row, 1).toString());
        String soyad = (PersonelTablo.getModel().getValueAt(row, 2).toString());
        String parola = (PersonelTablo.getModel().getValueAt(row, 3).toString());
        boolean yetki = Boolean.parseBoolean(PersonelTablo.getModel().getValueAt(row, 4).toString());
        personel_adi.setText(ad);
        personel_soyadi.setText(soyad);
        personel_parola.setText(parola);
        personel_yetki.setSelected(yetki);
    }//GEN-LAST:event_PersonelTabloMouseClicked

    private void personel_guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personel_guncelleActionPerformed
        if (PersonelTablo.getSelectionModel().isSelectionEmpty()) {
            JOptionPane.showMessageDialog(null, "Lütfen satır seçiniz..");
        } else {
            try {
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
                refreshTable(this.getPersonel());
                clearTextBox();
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_personel_guncelleActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        try {
            refreshTable(this.getPersonel());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_formWindowActivated

    private void personel_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personel_silActionPerformed
        if (PersonelTablo.getSelectionModel().isSelectionEmpty()) {
            JOptionPane.showMessageDialog(null, "Lütfen satır seçiniz..");
        } else {
            try {
                int row = PersonelTablo.getSelectedRow();
                String value = (PersonelTablo.getModel().getValueAt(row, 0).toString());
                PersonelIslemler islemler = new PersonelIslemler();
                islemler.Sil(Integer.parseInt(value));
                DefaultTableModel model = (DefaultTableModel) PersonelTablo.getModel();
                model.setRowCount(0);
                JOptionPane.showMessageDialog(null, "Silme Başarılı");
                refreshTable(this.getPersonel());
                clearTextBox();
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_personel_silActionPerformed

    private void personel_araActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personel_araActionPerformed
        try {
            String text = personel_araText.getText();
            if (personel_araText.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Lütfen aranacak kelimeyi giriniz.");
            } else {
                PersonelIslemler islemler = new PersonelIslemler();
                refreshTable(islemler.Ara(text));
                clearTextBox();
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_personel_araActionPerformed

    private void personel_yetkiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personel_yetkiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_personel_yetkiActionPerformed

    private void personel_araTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personel_araTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_personel_araTextActionPerformed

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
            java.util.logging.Logger.getLogger(PersonelIslemleriForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonelIslemleriForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonelIslemleriForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonelIslemleriForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonelIslemleriForm().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable PersonelTablo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField personel_adi;
    private javax.swing.JButton personel_ara;
    private javax.swing.JTextField personel_araText;
    private javax.swing.JButton personel_ekle;
    private javax.swing.JButton personel_guncelle;
    private javax.swing.JTextField personel_parola;
    private javax.swing.JButton personel_sil;
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
