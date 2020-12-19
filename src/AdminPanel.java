
public class AdminPanel extends javax.swing.JFrame {

    String LoginUser;

    public AdminPanel() {
        initComponents();
    }

    public AdminPanel(String loginUser) {
        initComponents();
        this.LoginUser = loginUser;
        String getValue = ShowAdmin.getText();
        ShowAdmin.setText("Hoşgeldin " + loginUser);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        KitapIslemleri = new javax.swing.JButton();
        PersonelIslemleri = new javax.swing.JButton();
        UyeIslemleri = new javax.swing.JButton();
        Logout = new javax.swing.JButton();
        ShowAdmin = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Panel");
        setLocation(new java.awt.Point(450, 100));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        KitapIslemleri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/book.png"))); // NOI18N
        KitapIslemleri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KitapIslemleriActionPerformed(evt);
            }
        });

        PersonelIslemleri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/personel.png"))); // NOI18N
        PersonelIslemleri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PersonelIslemleriActionPerformed(evt);
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

        ShowAdmin.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        ShowAdmin.setText("Hoşgeldin");

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Çıkış");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ShowAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(KitapIslemleri, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(UyeIslemleri, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PersonelIslemleri)
                            .addComponent(Logout))))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ShowAdmin)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(KitapIslemleri)
                    .addComponent(PersonelIslemleri))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UyeIslemleri)
                    .addComponent(Logout))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        ShowAdmin.getAccessibleContext().setAccessibleName("ShowAdmin");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed

        KitapEmanetForm emanet = new KitapEmanetForm();
        emanet.setVisible(true);


    }//GEN-LAST:event_LogoutActionPerformed

    private void PersonelIslemleriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PersonelIslemleriActionPerformed

        PersonelIslemleriForm personelIslemleri = new PersonelIslemleriForm();
        personelIslemleri.setVisible(true);
    }//GEN-LAST:event_PersonelIslemleriActionPerformed

    private void KitapIslemleriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KitapIslemleriActionPerformed

        KitapIslemleriForm kitapislemleri = new KitapIslemleriForm();
        kitapislemleri.setVisible(true);

    }//GEN-LAST:event_KitapIslemleriActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    private void UyeIslemleriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UyeIslemleriActionPerformed

        UyeIslemleriForm uyeislemleri = new UyeIslemleriForm();
        uyeislemleri.setVisible(true);
    }//GEN-LAST:event_UyeIslemleriActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPanel().setVisible(true);
                ShowAdmin.setText("naber");

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton KitapIslemleri;
    private javax.swing.JButton Logout;
    private javax.swing.JButton PersonelIslemleri;
    private static javax.swing.JLabel ShowAdmin;
    private javax.swing.JButton UyeIslemleri;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
