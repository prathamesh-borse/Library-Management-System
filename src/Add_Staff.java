/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author prathameshborse
 */
import java.sql.*;
import javax.swing.*;

public class Add_Staff extends javax.swing.JFrame {

    /**
     * Creates new form Add_Staff
     */
    public Add_Staff() {
        initComponents();
        setDefaultCloseOperation(Add_Staff.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        getName = new javax.swing.JTextField();
        getContact = new javax.swing.JTextField();
        book_ID1 = new javax.swing.JLabel();
        book_ID = new javax.swing.JLabel();
        addStaff = new javax.swing.JButton();
        category = new javax.swing.JLabel();
        Cancel = new javax.swing.JButton();
        name = new javax.swing.JLabel();
        getStaff_ID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        getName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getNameActionPerformed(evt);
            }
        });

        getContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getContactActionPerformed(evt);
            }
        });

        book_ID1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        book_ID1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        book_ID1.setText("ADD STAFF");

        book_ID.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        book_ID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        book_ID.setText("STAFF ID");

        addStaff.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        addStaff.setText("ADD");
        addStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStaffActionPerformed(evt);
            }
        });

        category.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        category.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        category.setText("NAME");

        Cancel.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        Cancel.setText("CANCEL");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        name.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name.setText("CONTACT");

        getStaff_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getStaff_IDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(book_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(getStaff_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(getName, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(getContact, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(book_ID1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(addStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(book_ID1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(book_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getStaff_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getName, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getContact, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(134, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void getNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getNameActionPerformed

    private void getContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getContactActionPerformed

    private void addStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStaffActionPerformed
        // TODO add your handling code here:
        String url = "jdbc:mysql://localhost:3306/library";
        String mysqluser = "root";
        String mysqlpwd = "prathamesh";
        String query = "insert into staffs values(?,?,?);";
        String staff_id = getStaff_ID.getText();
        String staff_name = getName.getText();
        String contact = getContact.getText();
        try{
            Connection conn = DriverManager.getConnection(url, mysqluser, mysqlpwd);
                PreparedStatement stm = conn.prepareCall(query);
                stm.setString(1, staff_id);
                stm.setString(2, staff_name);
                stm.setString(3, contact);
                stm.execute();
                JOptionPane.showMessageDialog(this, "One record added successfully.");
                
            getStaff_ID.setText(null);
            getName.setText(null);
            getContact.setText(null);

        }catch(Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_addStaffActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_CancelActionPerformed

    private void getStaff_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getStaff_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getStaff_IDActionPerformed

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
            java.util.logging.Logger.getLogger(Add_Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Staff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JButton addStaff;
    private javax.swing.JLabel book_ID;
    private javax.swing.JLabel book_ID1;
    private javax.swing.JLabel category;
    private javax.swing.JTextField getContact;
    private javax.swing.JTextField getName;
    private javax.swing.JTextField getStaff_ID;
    private javax.swing.JLabel name;
    // End of variables declaration//GEN-END:variables
}