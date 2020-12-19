
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
        Logout = new javax.swing.JButton();
        ShowPersonel = new javax.swing.JLabel();

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

        Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/logout_red.png"))); // NOI18N
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        ShowPersonel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        ShowPersonel.setText("Hoşgeldin");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ShowPersonel, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(KitapIslemleri)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(UyeIslemleri)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Logout)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(ShowPersonel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Logout)
                    .addComponent(UyeIslemleri)
                    .addComponent(KitapIslemleri))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        ShowPersonel.getAccessibleContext().setAccessibleName("ShowPersonel");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        dispose();
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_LogoutActionPerformed

    private void KitapIslemleriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KitapIslemleriActionPerformed

        dispose();
        KitapIslemleriForm kitapislemleri = new KitapIslemleriForm();
        kitapislemleri.setVisible(true);
    }//GEN-LAST:event_KitapIslemleriActionPerformed

    private void UyeIslemleriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UyeIslemleriActionPerformed
        dispose();
        UyeIslemleriForm uyeislemleri = new UyeIslemleriForm();
        uyeislemleri.setVisible(true);
    }//GEN-LAST:event_UyeIslemleriActionPerformed

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
    private javax.swing.JButton KitapIslemleri;
    private javax.swing.JButton Logout;
    private javax.swing.JLabel ShowPersonel;
    private javax.swing.JButton UyeIslemleri;
    // End of variables declaration//GEN-END:variables
}
