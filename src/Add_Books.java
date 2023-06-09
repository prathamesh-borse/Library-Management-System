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

public class Add_Books extends javax.swing.JFrame {

    /**
     * Creates new form Add_Books
     */
    public Add_Books() {
        initComponents();
        setDefaultCloseOperation(Add_Books.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        book_ID = new javax.swing.JLabel();
        category = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        author = new javax.swing.JLabel();
        copies = new javax.swing.JLabel();
        getBook_ID = new javax.swing.JTextField();
        getCategory = new javax.swing.JTextField();
        getBookName = new javax.swing.JTextField();
        getAuthor = new javax.swing.JTextField();
        getCopies = new javax.swing.JTextField();
        book_ID1 = new javax.swing.JLabel();
        addBook = new javax.swing.JButton();
        cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        book_ID.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        book_ID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        book_ID.setText("BOOK ID");

        category.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        category.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        category.setText("CATEGORY");

        name.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name.setText("NAME");

        author.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        author.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        author.setText("AUTHOR");

        copies.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        copies.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        copies.setText("COPIES");

        getBook_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getBook_IDActionPerformed(evt);
            }
        });

        getCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getCategoryActionPerformed(evt);
            }
        });

        getBookName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getBookNameActionPerformed(evt);
            }
        });

        getAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getAuthorActionPerformed(evt);
            }
        });

        getCopies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getCopiesActionPerformed(evt);
            }
        });

        book_ID1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        book_ID1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        book_ID1.setText("ADD BOOK");

        addBook.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        addBook.setText("ADD");
        addBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookActionPerformed(evt);
            }
        });

        cancel.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        cancel.setText("CANCEL");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
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
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(author, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(copies, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(getBook_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(getCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(getBookName, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(getAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(getCopies, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(book_ID1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(addBook, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(getBook_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getBookName, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(author, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(copies, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getCopies, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBook, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void getBook_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getBook_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getBook_IDActionPerformed

    private void getCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getCategoryActionPerformed

    private void getBookNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getBookNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getBookNameActionPerformed

    private void getAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getAuthorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getAuthorActionPerformed

    private void getCopiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getCopiesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getCopiesActionPerformed

    private void addBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookActionPerformed
        // TODO add your handling code here:
        String url = "jdbc:mysql://localhost:3306/library";
        String mysqluser = "root";
        String mysqlpwd = "prathamesh";
        String query = "insert into books values(?,?,?,?,?);";
        String book_id = getBook_ID.getText();
        String getCategoryData = getCategory.getText();
        String getName = getBookName.getText();
        String getAuthorName = getAuthor.getText();
        int getCopiesData = Integer.parseInt(getCopies.getText());
        String checkQuery = "update books set copies=copies+"+getCopiesData+" where name='"+getName+"' and category='"+getCategoryData+"' and author='"+getAuthorName+"';"; 
        try{
            Connection conn = DriverManager.getConnection(url, mysqluser, mysqlpwd);
            Statement stmt = conn.createStatement();
            int rows = stmt.executeUpdate(checkQuery);
            if(rows > 0){
                JOptionPane.showMessageDialog(this, "One record added successfully.");
            }else {
                PreparedStatement stm = conn.prepareCall(query);
                stm.setString(1, book_id);
                stm.setString(2, getCategoryData);
                stm.setString(3, getName);
                stm.setString(4, getAuthorName);
                stm.setInt(5, getCopiesData);
                stm.execute();
                JOptionPane.showMessageDialog(this, "One record added successfully.");
            }
            getBook_ID.setText(null);
            getCategory.setText(null);
            getBookName.setText(null);
            getAuthor.setText(null);
            getCopies.setText(null);
            
        }catch(Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_addBookActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cancelActionPerformed

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
            java.util.logging.Logger.getLogger(Add_Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Books().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBook;
    private javax.swing.JLabel author;
    private javax.swing.JLabel book_ID;
    private javax.swing.JLabel book_ID1;
    private javax.swing.JButton cancel;
    private javax.swing.JLabel category;
    private javax.swing.JLabel copies;
    private javax.swing.JTextField getAuthor;
    private javax.swing.JTextField getBookName;
    private javax.swing.JTextField getBook_ID;
    private javax.swing.JTextField getCategory;
    private javax.swing.JTextField getCopies;
    private javax.swing.JLabel name;
    // End of variables declaration//GEN-END:variables
}
