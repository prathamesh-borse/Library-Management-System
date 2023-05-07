/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author prathameshborse
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
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

        jLabel1 = new javax.swing.JLabel();
        booksAvailable = new javax.swing.JButton();
        addBooks = new javax.swing.JButton();
        removeBooks = new javax.swing.JButton();
        staffDetails = new javax.swing.JButton();
        addStaff = new javax.swing.JButton();
        removeStaff = new javax.swing.JButton();
        editAdmin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" DASHBOARD FOR USERS");

        booksAvailable.setBackground(new java.awt.Color(0, 204, 204));
        booksAvailable.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        booksAvailable.setForeground(new java.awt.Color(255, 255, 255));
        booksAvailable.setText("BOOKS AVAILABLE");
        booksAvailable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booksAvailableActionPerformed(evt);
            }
        });

        addBooks.setBackground(new java.awt.Color(0, 204, 204));
        addBooks.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        addBooks.setForeground(new java.awt.Color(255, 255, 255));
        addBooks.setText("ADD BOOKS");
        addBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBooksActionPerformed(evt);
            }
        });

        removeBooks.setBackground(new java.awt.Color(0, 204, 204));
        removeBooks.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        removeBooks.setForeground(new java.awt.Color(255, 255, 255));
        removeBooks.setText("REMOVE BOOKS");
        removeBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBooksActionPerformed(evt);
            }
        });

        staffDetails.setBackground(new java.awt.Color(0, 204, 204));
        staffDetails.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        staffDetails.setForeground(new java.awt.Color(255, 255, 255));
        staffDetails.setText("STAFF DETAILS");
        staffDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffDetailsActionPerformed(evt);
            }
        });

        addStaff.setBackground(new java.awt.Color(0, 204, 204));
        addStaff.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        addStaff.setForeground(new java.awt.Color(255, 255, 255));
        addStaff.setText("ADD STAFF");
        addStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStaffActionPerformed(evt);
            }
        });

        removeStaff.setBackground(new java.awt.Color(0, 204, 204));
        removeStaff.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        removeStaff.setForeground(new java.awt.Color(255, 255, 255));
        removeStaff.setText("REMOVE STAFF");
        removeStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeStaffActionPerformed(evt);
            }
        });

        editAdmin.setBackground(new java.awt.Color(0, 204, 204));
        editAdmin.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        editAdmin.setForeground(new java.awt.Color(255, 255, 255));
        editAdmin.setText("EDIT ADMIN");
        editAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(95, 95, 95)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(removeBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(removeStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(addBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(addStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(booksAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(staffDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(115, 115, 115))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(editAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(staffDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(booksAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removeBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(editAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void booksAvailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booksAvailableActionPerformed
        // TODO add your handling code here:
        Books_Available books_available = new Books_Available();
        books_available.setVisible(true);
    }//GEN-LAST:event_booksAvailableActionPerformed

    private void editAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editAdminActionPerformed
        // TODO add your handling code here:
        Edit_Admin edit_admin = new Edit_Admin();
        edit_admin.setVisible(true);
    }//GEN-LAST:event_editAdminActionPerformed

    private void addBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBooksActionPerformed
        // TODO add your handling code here:
        Add_Books add_books = new Add_Books();
        add_books.setVisible(true);
    }//GEN-LAST:event_addBooksActionPerformed

    private void removeBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBooksActionPerformed
        // TODO add your handling code here:
        Remove_Books remove_books = new Remove_Books();
        remove_books.setVisible(true);
    }//GEN-LAST:event_removeBooksActionPerformed

    private void staffDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffDetailsActionPerformed
        // TODO add your handling code here:
        Staff_Details staff_details = new Staff_Details();
        staff_details.setVisible(true);
    }//GEN-LAST:event_staffDetailsActionPerformed

    private void addStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStaffActionPerformed
        // TODO add your handling code here:
        Add_Staff add_staff = new Add_Staff();
        add_staff.setVisible(true);
    }//GEN-LAST:event_addStaffActionPerformed

    private void removeStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeStaffActionPerformed
        // TODO add your handling code here:
        Remove_Staff remove_staff = new Remove_Staff();
        remove_staff.setVisible(true);
    }//GEN-LAST:event_removeStaffActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBooks;
    private javax.swing.JButton addStaff;
    private javax.swing.JButton booksAvailable;
    private javax.swing.JButton editAdmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton removeBooks;
    private javax.swing.JButton removeStaff;
    private javax.swing.JButton staffDetails;
    // End of variables declaration//GEN-END:variables
}
