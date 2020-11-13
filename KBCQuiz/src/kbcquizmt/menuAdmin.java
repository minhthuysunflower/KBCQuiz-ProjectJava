/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kbcquizmt;

import java.awt.Color;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import static kbcquizmt.menuForm.hiname;

/**
 *
 * @author ASUS
 */
public class menuAdmin extends javax.swing.JFrame {
private static Connection conn;
    /**
     * Creates new form menuAdmin
     */
    public menuAdmin() {
        initComponents();
        setIcon();
        showName();
    }
    public void showName(){
        try{
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
             conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;"+"databaseName=KBCQuizDatabase","sa","sunflower");
            String show = "select * from Admin where Adminname=?";
             PreparedStatement pst = conn.prepareStatement(show);
             pst.setString(1,LoginForm.namelogin.getText());
             ResultSet rs = pst.executeQuery();
             if(rs.next()){
                 String displayInfo = "select * from Admin where Adminname=? ";
                 PreparedStatement pst1 = conn.prepareStatement(displayInfo);
                 pst1.setString(1, LoginForm.namelogin.getText());
                 ResultSet result = pst1.executeQuery();
                 if(result.next()){
                     String namep = result.getString(1);                    
                     hiname.setText(namep);                    
                 }     
             }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        hiname = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        account = new javax.swing.JMenu();
        playerlist = new javax.swing.JMenuItem();
        adminlist = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        vaccount = new javax.swing.JMenuItem();
        logouta = new javax.swing.JMenuItem();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(" Menu Admin - KBC Quiz");
        setAlwaysOnTop(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255,255,255,150));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jLabel2.setText("Welcome ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        hiname.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jPanel2.add(hiname, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 246, 40));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jLabel4.setText("To");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("D:\\Imageforproject\\logokbcquiz.png")); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 310, 200));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 550, 360));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Imageforproject\\sky1.jpg")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 560));

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuBar1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jMenuBar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuBar1MouseClicked(evt);
            }
        });

        account.setBackground(new java.awt.Color(153, 255, 153));
        account.setText("Manage Account");
        account.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        account.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accountMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                accountMouseEntered(evt);
            }
        });
        account.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountActionPerformed(evt);
            }
        });

        playerlist.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        playerlist.setText("Player ");
        playerlist.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        playerlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerlistActionPerformed(evt);
            }
        });
        account.add(playerlist);

        adminlist.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        adminlist.setText("Admin ");
        adminlist.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adminlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminlistActionPerformed(evt);
            }
        });
        account.add(adminlist);

        jMenuBar1.add(account);

        jMenu2.setText("Manage Question");
        jMenu2.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N

        jMenuItem5.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jMenuItem5.setText("Edit Question");
        jMenuItem5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Manage Result");
        jMenu3.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N

        jMenuItem3.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jMenuItem3.setText("View Result");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        jMenu1.setText("My Account");
        jMenu1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N

        vaccount.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        vaccount.setText("View Account");
        vaccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vaccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vaccountActionPerformed(evt);
            }
        });
        jMenu1.add(vaccount);

        logouta.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        logouta.setText("Log Out");
        logouta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logouta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutaActionPerformed(evt);
            }
        });
        jMenu1.add(logouta);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void accountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_accountMouseEntered

    private void accountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_accountActionPerformed

    private void accountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountMouseClicked
       
    }//GEN-LAST:event_accountMouseClicked

    private void jMenuBar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuBar1MouseClicked
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jMenuBar1MouseClicked

    private void playerlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerlistActionPerformed
         new manageAccountplayer().setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_playerlistActionPerformed

    private void adminlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminlistActionPerformed
       new manageAdminAccount().setVisible(true);
       this.setVisible(false);
       try{
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
              conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;"+"databaseName=KBCQuizDatabase","sa","sunflower");
              String dataadmin = "select * from Admin";
              PreparedStatement  pst2= conn.prepareStatement(dataadmin);
               ResultSet result1 = pst2.executeQuery();
              
                
                while(result1.next()){
 
                  String adminname = result1.getString("Adminname");
                  int gender = result1.getInt("Gender");
                  String birthday = result1.getString("Birthday");
                  String email = result1.getString("Email");
                  String address = result1.getString("Address");
                  int status = result1.getInt("Status");
                  
                  Object tbData1[] = { adminname, gender, birthday, email,address, status};
                  DefaultTableModel tbModel=(DefaultTableModel) manageAdminAccount.dataadmin.getModel();
                  tbModel.addRow(tbData1);
              }
      }
    
      catch(Exception e){
          System.out.println(e.getMessage());
      }
    }//GEN-LAST:event_adminlistActionPerformed

    private void logoutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutaActionPerformed
        new welcomeForm().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutaActionPerformed

    private void vaccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vaccountActionPerformed
        new infoAdminAccount().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_vaccountActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        new questionForm().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

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
            java.util.logging.Logger.getLogger(menuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu account;
    private javax.swing.JMenuItem adminlist;
    private javax.swing.JLabel hiname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JMenuItem logouta;
    private javax.swing.JMenuItem playerlist;
    private javax.swing.JMenuItem vaccount;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
     setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logokbcquiz2.png")));
    }
}
