/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.qlsv;

import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;

/**
 *
 * @author Admin
 */
public class FormChinh extends javax.swing.JFrame {

    /**
     * Creates new form FormChinh
     */
    public FormChinh() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        FormChinh_SignOutButton = new javax.swing.JButton();
        FormChinh_QLSVButton = new javax.swing.JButton();
        FormChinh_QLMHButton = new javax.swing.JButton();
        FormChinh_ExitButton = new javax.swing.JButton();
        FormChinh_MainBoard = new javax.swing.JTabbedPane();
        FormChinh_MenuBar = new javax.swing.JMenuBar();
        FormChinh_MenuHeThong = new javax.swing.JMenu();
        FormChinh_Menu_SignOutButton = new javax.swing.JMenuItem();
        FormChinh_Menu_ExitButton = new javax.swing.JMenuItem();
        FormChinh_MenuQuanLy = new javax.swing.JMenu();
        FormChinh_MenuQLSV = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        FormChinh_MenuView = new javax.swing.JMenu();
        FormChinh_MenuTroGiup = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        FormChinh_SignOutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout-32px.png"))); // NOI18N
        FormChinh_SignOutButton.setText("Đăng xuất");
        FormChinh_SignOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormChinh_SignOutButtonActionPerformed(evt);
            }
        });

        FormChinh_QLSVButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/graduates-32px.png"))); // NOI18N
        FormChinh_QLSVButton.setText("QLSV");
        FormChinh_QLSVButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormChinh_QLSVButtonActionPerformed(evt);
            }
        });

        FormChinh_QLMHButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/books-32px.png"))); // NOI18N
        FormChinh_QLMHButton.setText("QL Môn học");
        FormChinh_QLMHButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormChinh_QLMHButtonActionPerformed(evt);
            }
        });

        FormChinh_ExitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/emergency-exit.png"))); // NOI18N
        FormChinh_ExitButton.setText("Thoát");
        FormChinh_ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormChinh_ExitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FormChinh_QLMHButton, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
            .addComponent(FormChinh_QLSVButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(FormChinh_ExitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(FormChinh_SignOutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(FormChinh_QLSVButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FormChinh_QLMHButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addComponent(FormChinh_SignOutButton)
                .addGap(18, 18, 18)
                .addComponent(FormChinh_ExitButton)
                .addContainerGap())
        );

        FormChinh_MenuHeThong.setText("Hệ thống");

        FormChinh_Menu_SignOutButton.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        FormChinh_Menu_SignOutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout-16px.png"))); // NOI18N
        FormChinh_Menu_SignOutButton.setText("Đăng xuất");
        FormChinh_Menu_SignOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormChinh_Menu_SignOutButtonActionPerformed(evt);
            }
        });
        FormChinh_MenuHeThong.add(FormChinh_Menu_SignOutButton);

        FormChinh_Menu_ExitButton.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        FormChinh_Menu_ExitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/emergency-exit16-px.png"))); // NOI18N
        FormChinh_Menu_ExitButton.setText("Thoát");
        FormChinh_Menu_ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormChinh_Menu_ExitButtonActionPerformed(evt);
            }
        });
        FormChinh_MenuHeThong.add(FormChinh_Menu_ExitButton);

        FormChinh_MenuBar.add(FormChinh_MenuHeThong);

        FormChinh_MenuQuanLy.setText("Quản lý");
        FormChinh_MenuQuanLy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormChinh_MenuQuanLyActionPerformed(evt);
            }
        });

        FormChinh_MenuQLSV.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        FormChinh_MenuQLSV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/graduates-16px.png"))); // NOI18N
        FormChinh_MenuQLSV.setText("Sinh viên");
        FormChinh_MenuQLSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormChinh_MenuQLSVActionPerformed(evt);
            }
        });
        FormChinh_MenuQuanLy.add(FormChinh_MenuQLSV);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/books-16px.png"))); // NOI18N
        jMenuItem4.setText("Môn học");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        FormChinh_MenuQuanLy.add(jMenuItem4);

        FormChinh_MenuBar.add(FormChinh_MenuQuanLy);

        FormChinh_MenuView.setText("View");
        FormChinh_MenuBar.add(FormChinh_MenuView);

        FormChinh_MenuTroGiup.setText("Trợ giúp");
        FormChinh_MenuBar.add(FormChinh_MenuTroGiup);

        setJMenuBar(FormChinh_MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FormChinh_MainBoard, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FormChinh_MainBoard)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FormChinh_Menu_SignOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormChinh_Menu_SignOutButtonActionPerformed
        // TODO add your handling code here:
        FormDangNhap signin = new FormDangNhap();
        signin.main(null);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_FormChinh_Menu_SignOutButtonActionPerformed

    private void FormChinh_MenuQLSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormChinh_MenuQLSVActionPerformed
        // TODO add your handling code here:
        StudentManagementPanel smp = new StudentManagementPanel();
        ImageIcon icon = new ImageIcon(getClass().getResource("/icons/graduates-16px.png"));
        FormChinh_MainBoard.addTab("QLSV", icon, smp);
        FormChinh_MainBoard.setSelectedComponent(smp);
    }//GEN-LAST:event_FormChinh_MenuQLSVActionPerformed

    private void FormChinh_QLSVButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormChinh_QLSVButtonActionPerformed
        // TODO add your handling code here:
        StudentManagementPanel smp = new StudentManagementPanel();
        ImageIcon icon = new ImageIcon(getClass().getResource("/icons/graduates-16px.png"));
        FormChinh_MainBoard.addTab("QLSV", icon, smp);
        FormChinh_MainBoard.setSelectedComponent(smp);
    }//GEN-LAST:event_FormChinh_QLSVButtonActionPerformed

    private void FormChinh_Menu_ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormChinh_Menu_ExitButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_FormChinh_Menu_ExitButtonActionPerformed

    private void FormChinh_QLMHButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormChinh_QLMHButtonActionPerformed
        // TODO add your handling code here:
        SubjectManagementPanel smp = new SubjectManagementPanel();
        ImageIcon icon = new ImageIcon(getClass().getResource("/icons/books-16px.png"));
        FormChinh_MainBoard.addTab("QLMH", icon, smp);
        FormChinh_MainBoard.setSelectedComponent(smp);
    }//GEN-LAST:event_FormChinh_QLMHButtonActionPerformed

    private void FormChinh_MenuQuanLyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormChinh_MenuQuanLyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FormChinh_MenuQuanLyActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        SubjectManagementPanel smp = new SubjectManagementPanel();
        ImageIcon icon = new ImageIcon(getClass().getResource("/icons/books-16px.png"));
        FormChinh_MainBoard.addTab("QLMH", icon, smp);
        FormChinh_MainBoard.setSelectedComponent(smp);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void FormChinh_SignOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormChinh_SignOutButtonActionPerformed
        // TODO add your handling code here:
        FormDangNhap signin = new FormDangNhap();
        signin.main(null);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_FormChinh_SignOutButtonActionPerformed

    private void FormChinh_ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormChinh_ExitButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_FormChinh_ExitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(FormChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormChinh().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FormChinh_ExitButton;
    private javax.swing.JTabbedPane FormChinh_MainBoard;
    private javax.swing.JMenuBar FormChinh_MenuBar;
    private javax.swing.JMenu FormChinh_MenuHeThong;
    private javax.swing.JMenuItem FormChinh_MenuQLSV;
    private javax.swing.JMenu FormChinh_MenuQuanLy;
    private javax.swing.JMenu FormChinh_MenuTroGiup;
    private javax.swing.JMenu FormChinh_MenuView;
    private javax.swing.JMenuItem FormChinh_Menu_ExitButton;
    private javax.swing.JMenuItem FormChinh_Menu_SignOutButton;
    private javax.swing.JButton FormChinh_QLMHButton;
    private javax.swing.JButton FormChinh_QLSVButton;
    private javax.swing.JButton FormChinh_SignOutButton;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
