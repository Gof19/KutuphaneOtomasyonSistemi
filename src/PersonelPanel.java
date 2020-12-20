
public class PersonelPanel extends javax.swing.JFrame {

    String LoginUser;

    public PersonelPanel() {
        initComponents();
    }

    public PersonelPanel(String loginUser) {
        initComponents();
        this.LoginUser = loginUser;
        String getValue = ShowPersonel.getText();
        ShowPersonel.setText("Hoşgeldin " + loginUser);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        KitapIslemleri = new javax.swing.JButton();
        UyeIslemleri = new javax.swing.JButton();
        EmanetIslem = new javax.swing.JButton();
        ShowPersonel = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Personel Panel");
        setLocation(new java.awt.Point(300, 150));

        KitapIslemleri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/book.png"))); // NOI18N
        KitapIslemleri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KitapIslemleriActionPerformed(evt);
            }
        });

        UyeIslemleri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/uye.png"))); // NOI18N
        UyeIslemleri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UyeIslemleriActionPerformed(evt);
            }
        });

        EmanetIslem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/logout_red.png"))); // NOI18N
        EmanetIslem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmanetIslemActionPerformed(evt);
            }
        });

        ShowPersonel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        ShowPersonel.setText("Hoşgeldin");

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Çıkış");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(KitapIslemleri)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(UyeIslemleri)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EmanetIslem))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ShowPersonel, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ShowPersonel)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EmanetIslem)
                    .addComponent(UyeIslemleri)
                    .addComponent(KitapIslemleri))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        ShowPersonel.getAccessibleContext().setAccessibleName("ShowPersonel");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EmanetIslemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmanetIslemActionPerformed
        KitapEmanetForm emanet = new KitapEmanetForm();
        emanet.setVisible(true);
    }//GEN-LAST:event_EmanetIslemActionPerformed

    private void KitapIslemleriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KitapIslemleriActionPerformed
        KitapIslemleriForm kitapislemleri = new KitapIslemleriForm();
        kitapislemleri.setVisible(true);
    }//GEN-LAST:event_KitapIslemleriActionPerformed

    private void UyeIslemleriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UyeIslemleriActionPerformed
        UyeIslemleriForm uyeislemleri = new UyeIslemleriForm();
        uyeislemleri.setVisible(true);
    }//GEN-LAST:event_UyeIslemleriActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(PersonelPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonelPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonelPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonelPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonelPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EmanetIslem;
    private javax.swing.JButton KitapIslemleri;
    private javax.swing.JLabel ShowPersonel;
    private javax.swing.JButton UyeIslemleri;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables
}
