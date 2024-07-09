/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic.tac.toe.game;

import java.awt.Color;
import static java.sql.JDBCType.NULL;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author AK Traders
 */
public class Tic_Tac_Toe extends javax.swing.JFrame {

    private String Startgame="X";
    public Tic_Tac_Toe() {
        initComponents();
    }
private void chooseplayer()
{
    if(Startgame.equalsIgnoreCase("X"))
    {
        Startgame="Y";
    }
    else
    {
        Startgame="X";
    }
}
private void Wingame()
{
    String b1=txtb1.getText();
    String b2=txtb2.getText();
    String b3=txtb3.getText();
    
    String b4=txtb4.getText();
    String b5=txtb5.getText();
    String b6=txtb6.getText();
    
    String b7=txtb7.getText();
    String b8=txtb8.getText();
    String b9=txtb9.getText();
    
    //For player X ;
    if(b1==("X") && b2==("X") && b3==("X"))
    {
        JOptionPane.showMessageDialog(this,"PLAYER X WINS","Tic Tac Toe Game",JOptionPane.INFORMATION_MESSAGE);
        txtb1.setBackground(Color.ORANGE);
        txtb2.setBackground(Color.ORANGE);
        txtb3.setBackground(Color.ORANGE);
    }
    else if(b4==("X") && b5==("X") && b6==("X"))
    {
        JOptionPane.showMessageDialog(this,"PLAYER X WINS","Tic Tac Toe Game",JOptionPane.INFORMATION_MESSAGE);
        txtb4.setBackground(Color.ORANGE);
        txtb5.setBackground(Color.ORANGE);
        txtb6.setBackground(Color.ORANGE);
    }
    else if(b7==("X") && b8==("X") && b9==("X"))
    {
        JOptionPane.showMessageDialog(this,"PLAYER X WINS","Tic Tac Toe Game",JOptionPane.INFORMATION_MESSAGE);
        txtb7.setBackground(Color.ORANGE);
        txtb8.setBackground(Color.ORANGE);
        txtb9.setBackground(Color.ORANGE);
    }
    if(b1==("X") && b4==("X") && b7==("X"))
    {
        JOptionPane.showMessageDialog(this,"PLAYER X WINS","Tic Tac Toe Game",JOptionPane.INFORMATION_MESSAGE);
        txtb1.setBackground(Color.ORANGE);
        txtb4.setBackground(Color.ORANGE);
        txtb7.setBackground(Color.ORANGE);
    }
    else if(b2==("X") && b5==("X") && b8==("X"))
    {
        JOptionPane.showMessageDialog(this,"PLAYER X WINS","Tic Tac Toe Game",JOptionPane.INFORMATION_MESSAGE);
        txtb2.setBackground(Color.ORANGE);
        txtb5.setBackground(Color.ORANGE);
        txtb8.setBackground(Color.ORANGE);
    }
    else if(b3==("X") && b6==("X") && b9==("X"))
    {
        JOptionPane.showMessageDialog(this,"PLAYER X WINS","Tic Tac Toe Game",JOptionPane.INFORMATION_MESSAGE);
        txtb3.setBackground(Color.ORANGE);
        txtb6.setBackground(Color.ORANGE);
        txtb9.setBackground(Color.ORANGE);
    }
    if(b1==("X") && b5==("X") && b9==("X"))
    {
        JOptionPane.showMessageDialog(this,"PLAYER X WINS","Tic Tac Toe Game",JOptionPane.INFORMATION_MESSAGE);
        txtb1.setBackground(Color.ORANGE);
        txtb5.setBackground(Color.ORANGE);
        txtb9.setBackground(Color.ORANGE);
    }
    else if(b3==("X") && b5==("X") && b7==("X"))
    {
        JOptionPane.showMessageDialog(this,"PLAYER X WINS","Tic Tac Toe Game",JOptionPane.INFORMATION_MESSAGE);
        txtb2.setBackground(Color.ORANGE);
        txtb5.setBackground(Color.ORANGE);
        txtb8.setBackground(Color.ORANGE);
    }
    //For Palyer y
     //For player X ;
    if(b1==("Y") && b2==("Y") && b3==("Y"))
    {
        JOptionPane.showMessageDialog(this,"PLAYER Y WINS","Tic Tac Toe Game",JOptionPane.INFORMATION_MESSAGE);
        txtb1.setBackground(Color.ORANGE);
        txtb2.setBackground(Color.ORANGE);
        txtb3.setBackground(Color.ORANGE);
    }
    else if(b4==("Y") && b5==("Y") && b6==("Y"))
    {
        JOptionPane.showMessageDialog(this,"PLAYER Y WINS","Tic Tac Toe Game",JOptionPane.INFORMATION_MESSAGE);
        txtb4.setBackground(Color.ORANGE);
        txtb5.setBackground(Color.ORANGE);
        txtb6.setBackground(Color.ORANGE);
    }
    else if(b7==("YY") && b8==("Y") && b9==("Y"))
    {
        JOptionPane.showMessageDialog(this,"PLAYER Y WINS","Tic Tac Toe Game",JOptionPane.INFORMATION_MESSAGE);
        txtb7.setBackground(Color.ORANGE);
        txtb8.setBackground(Color.ORANGE);
        txtb9.setBackground(Color.ORANGE);
    }
    if(b1==("Y") && b4==("Y") && b7==("Y"))
    {
        JOptionPane.showMessageDialog(this,"PLAYER Y WINS","Tic Tac Toe Game",JOptionPane.INFORMATION_MESSAGE);
        txtb1.setBackground(Color.ORANGE);
        txtb4.setBackground(Color.ORANGE);
        txtb7.setBackground(Color.ORANGE);
    }
    else if(b2==("Y") && b5==("Y") && b8==("Y"))
    {
        JOptionPane.showMessageDialog(this,"PLAYER Y WINS","Tic Tac Toe Game",JOptionPane.INFORMATION_MESSAGE);
        txtb2.setBackground(Color.ORANGE);
        txtb5.setBackground(Color.ORANGE);
        txtb8.setBackground(Color.ORANGE);
    }
    else if(b3==("Y") && b6==("Y") && b9==("Y"))
    {
        JOptionPane.showMessageDialog(this,"PLAYER Y WINS","Tic Tac Toe Game",JOptionPane.INFORMATION_MESSAGE);
        txtb3.setBackground(Color.ORANGE);
        txtb6.setBackground(Color.ORANGE);
        txtb9.setBackground(Color.ORANGE);
    }
    if(b1==("Y") && b5==("Y") && b9==("Y"))
    {
        JOptionPane.showMessageDialog(this,"PLAYER Y WINS","Tic Tac Toe Game",JOptionPane.INFORMATION_MESSAGE);
        txtb1.setBackground(Color.ORANGE);
        txtb5.setBackground(Color.ORANGE);
        txtb9.setBackground(Color.ORANGE);
    }
    else if(b3==("Y") && b5==("Y") && b7==("Y"))
    {
        JOptionPane.showMessageDialog(this,"PLAYER Y WINS","Tic Tac Toe Game",JOptionPane.INFORMATION_MESSAGE);
        txtb3.setBackground(Color.ORANGE);
        txtb5.setBackground(Color.ORANGE);
        txtb7.setBackground(Color.ORANGE);
    }
   
    
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        RESTART = new javax.swing.JButton();
        EXIT = new javax.swing.JButton();
        txtb2 = new javax.swing.JButton();
        txtb1 = new javax.swing.JButton();
        txtb4 = new javax.swing.JButton();
        txtb5 = new javax.swing.JButton();
        txtb6 = new javax.swing.JButton();
        txtb3 = new javax.swing.JButton();
        txtb8 = new javax.swing.JButton();
        txtb9 = new javax.swing.JButton();
        txtb7 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe Game");
        setPreferredSize(new java.awt.Dimension(400, 400));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Tic Tac Toe Game");
        jLabel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        RESTART.setBackground(new java.awt.Color(102, 255, 102));
        RESTART.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        RESTART.setText("RESTART");
        RESTART.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESTARTActionPerformed(evt);
            }
        });

        EXIT.setBackground(new java.awt.Color(255, 102, 102));
        EXIT.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        EXIT.setText("EXIT");
        EXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITActionPerformed(evt);
            }
        });

        txtb2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtb2ActionPerformed(evt);
            }
        });

        txtb1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtb1ActionPerformed(evt);
            }
        });

        txtb4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtb4ActionPerformed(evt);
            }
        });

        txtb5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtb5ActionPerformed(evt);
            }
        });

        txtb6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtb6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtb6ActionPerformed(evt);
            }
        });

        txtb3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtb3ActionPerformed(evt);
            }
        });

        txtb8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtb8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtb8ActionPerformed(evt);
            }
        });

        txtb9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtb9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtb9ActionPerformed(evt);
            }
        });

        txtb7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtb7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtb7ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("PLAYER X");

        jLabel4.setBackground(new java.awt.Color(51, 255, 204));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("PLAYER Y");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtb4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtb5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtb1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtb2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(66, 66, 66)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtb3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtb6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(txtb7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtb8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtb9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(RESTART)
                                .addGap(39, 39, 39)
                                .addComponent(EXIT, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 54, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtb3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtb2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtb1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtb6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtb5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtb4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtb9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtb8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtb7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RESTART)
                    .addComponent(EXIT))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtb1ActionPerformed
       txtb1.setText(Startgame);
       if(Startgame.equalsIgnoreCase("X"))
       {
           txtb1.setForeground(Color.red);
       }
       else
       {
            txtb1.setForeground(Color.magenta);
       }
       chooseplayer();
       Wingame();
    }//GEN-LAST:event_txtb1ActionPerformed

    private void EXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITActionPerformed
      JFrame frame=new JFrame("Exit");
      if(JOptionPane .showConfirmDialog(frame,"Confirm if you want to Exit","Tic Tac Toe Game", JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION)
      {
          System.exit(0);
      }
    }//GEN-LAST:event_EXITActionPerformed

    private void txtb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtb2ActionPerformed
     txtb2.setText(Startgame);
       if(Startgame.equalsIgnoreCase("X"))
       {
           txtb2.setForeground(Color.red);
       }
       else
       {
            txtb2.setForeground(Color.magenta);
       }
       chooseplayer();
       Wingame();
    }//GEN-LAST:event_txtb2ActionPerformed

    private void txtb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtb3ActionPerformed
      txtb3.setText(Startgame);
       if(Startgame.equalsIgnoreCase("X"))
       {
           txtb3.setForeground(Color.red);
       }
       else
       {
            txtb3.setForeground(Color.magenta);
       }
        chooseplayer();
         Wingame();
    }//GEN-LAST:event_txtb3ActionPerformed

    private void txtb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtb4ActionPerformed
      txtb4.setText(Startgame);
       if(Startgame.equalsIgnoreCase("X"))
       {
           txtb4.setForeground(Color.red);
       }
       else
       {
            txtb4.setForeground(Color.magenta);
       }
        chooseplayer();
         Wingame();
    }//GEN-LAST:event_txtb4ActionPerformed

    private void txtb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtb5ActionPerformed
         txtb5.setText(Startgame);
       if(Startgame.equalsIgnoreCase("X"))
       {
           txtb5.setForeground(Color.red);
       }
       else
       {
            txtb5.setForeground(Color.magenta);
       }
        chooseplayer();
         Wingame();
    }//GEN-LAST:event_txtb5ActionPerformed

    private void txtb6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtb6ActionPerformed
         txtb6.setText(Startgame);
       if(Startgame.equalsIgnoreCase("X"))
       {
           txtb6.setForeground(Color.red);
       }
       else
       {
            txtb6.setForeground(Color.magenta);
       }
        chooseplayer();
         Wingame();
    }//GEN-LAST:event_txtb6ActionPerformed

    private void txtb7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtb7ActionPerformed
       txtb7.setText(Startgame);
       if(Startgame.equalsIgnoreCase("X"))
       {
           txtb7.setForeground(Color.red);
       }
       else
       {
            txtb7.setForeground(Color.magenta);
       }
        chooseplayer();
         Wingame();
    }//GEN-LAST:event_txtb7ActionPerformed

    private void txtb8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtb8ActionPerformed
       txtb8.setText(Startgame);
       if(Startgame.equalsIgnoreCase("X"))
       {
           txtb8.setForeground(Color.red);
       }
       else
       {
            txtb8.setForeground(Color.magenta);
       }
        chooseplayer();
         Wingame();
    }//GEN-LAST:event_txtb8ActionPerformed

    private void txtb9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtb9ActionPerformed
        txtb9.setText(Startgame);
       if(Startgame.equalsIgnoreCase("X"))
       {
           txtb9.setForeground(Color.red);
       }
       else
       {
            txtb9.setForeground(Color.magenta);
       }
        chooseplayer();
         Wingame();
    }//GEN-LAST:event_txtb9ActionPerformed

    private void RESTARTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESTARTActionPerformed
       txtb1.setText(null);
       txtb2.setText(null);
       txtb3.setText(null);
      
       txtb4.setText(null);
       txtb5.setText(null);
       txtb6.setText(null);
       
       txtb7.setText(null);
       txtb8.setText(null);
       txtb9.setText(null);
       
       txtb1.setBackground(Color.LIGHT_GRAY);
        txtb2.setBackground(Color.LIGHT_GRAY);
        txtb3.setBackground(Color.LIGHT_GRAY);
        
        txtb4.setBackground(Color.LIGHT_GRAY);
        txtb5.setBackground(Color.LIGHT_GRAY);
        txtb6.setBackground(Color.LIGHT_GRAY);
        
        txtb7.setBackground(Color.LIGHT_GRAY);
        txtb8.setBackground(Color.LIGHT_GRAY);
        txtb9.setBackground(Color.LIGHT_GRAY);
       
       
    }//GEN-LAST:event_RESTARTActionPerformed

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
            java.util.logging.Logger.getLogger(Tic_Tac_Toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tic_Tac_Toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tic_Tac_Toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tic_Tac_Toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tic_Tac_Toe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EXIT;
    private javax.swing.JButton RESTART;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton txtb1;
    private javax.swing.JButton txtb2;
    private javax.swing.JButton txtb3;
    private javax.swing.JButton txtb4;
    private javax.swing.JButton txtb5;
    private javax.swing.JButton txtb6;
    private javax.swing.JButton txtb7;
    private javax.swing.JButton txtb8;
    private javax.swing.JButton txtb9;
    // End of variables declaration//GEN-END:variables
}
