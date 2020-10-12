/*
 * HubtrackerFrame.java
 *
 * Created on 12 decembrie 2007, 19:42
 *
 *
 * DSHub ADC HubSoft
 * Copyright (C) 2007,2008  Eugen Hristev
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or any later version.
 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

package dshub.plugin;

import javax.swing.JOptionPane;

/**
 *
 * @author  Pietricica
 */
public class HubtrackerFrame extends javax.swing.JFrame
{
    
    /** Creates new form HubtrackerFrame */
    public HubtrackerFrame()
    {
        initComponents();
        connect.setText("     ");
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents()
    {
        regButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        userField = new javax.swing.JTextField();
        passField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        connect = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Hubtracker Integration Module");
        setResizable(false);
        regButton.setText("Register with hubtracker");
        regButton.setEnabled(false);
        regButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                regButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Desired/Active Username:");

        userField.setPreferredSize(new java.awt.Dimension(150, 20));
        userField.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                userFieldKeyTyped(evt);
            }
        });

        passField.setPreferredSize(new java.awt.Dimension(150, 20));
        passField.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                passFieldKeyTyped(evt);
            }
        });

        jLabel2.setText("Desired/Active Password:");

        emailField.setPreferredSize(new java.awt.Dimension(150, 20));
        emailField.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                emailFieldKeyTyped(evt);
            }
        });

        jLabel3.setText("Desired/Active E-mail:");

        connect.setText("                 ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(userField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(regButton)
                .addContainerGap(200, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(connect)
                .addContainerGap(267, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(connect)
                .addGap(22, 22, 22)
                .addComponent(regButton)
                .addContainerGap())
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailFieldKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_emailFieldKeyTyped
    {//GEN-HEADEREND:event_emailFieldKeyTyped
 if(!("".equals(userField.getText())) && !("".equals(emailField.getText())) && !("".equals(passField.getText())))
            regButton.setEnabled(true);
        else
            regButton.setEnabled(false);
    }//GEN-LAST:event_emailFieldKeyTyped

    private void passFieldKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_passFieldKeyTyped
    {//GEN-HEADEREND:event_passFieldKeyTyped
 if(!("".equals(userField.getText())) && !("".equals(emailField.getText())) && !("".equals(passField.getText())))
            regButton.setEnabled(true);
        else
            regButton.setEnabled(false);
    }//GEN-LAST:event_passFieldKeyTyped

    private void userFieldKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_userFieldKeyTyped
    {//GEN-HEADEREND:event_userFieldKeyTyped
// TODO add your handling code here:
        if(!("".equals(userField.getText())) && !("".equals(emailField.getText())) && !("".equals(passField.getText())))
            regButton.setEnabled(true);
        else
            regButton.setEnabled(false);
    }//GEN-LAST:event_userFieldKeyTyped

    private void regButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_regButtonActionPerformed
    {//GEN-HEADEREND:event_regButtonActionPerformed
// TODO add your handling code here:
        PluginMain.result="";
        connect.setText("Connecting...");
        new HubtrackerConnection(null,userField.getText(),passField.getText(),emailField.getText());
        
            
            
       
       
        
        
    }//GEN-LAST:event_regButtonActionPerformed
   
  
  public void showMsg()
  {
      JOptionPane.showMessageDialog(this,PluginMain.result,
                    "Hubtracker says:",JOptionPane.INFORMATION_MESSAGE);
      connect.setText("          ");
  }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel connect;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField passField;
    private javax.swing.JButton regButton;
    private javax.swing.JTextField userField;
    // End of variables declaration//GEN-END:variables
    
}
