/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hotel.management;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.ResultSetMetaData;
import java.awt.Image;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class ManageRoom extends javax.swing.JFrame {
    
        Connection con=null;
        Statement st=null;
        PreparedStatement pst=null;
        ResultSet rs=null;

    /**
     * Creates new form ManageRoom
     */
    public ManageRoom() {
        initComponents();
        scaleImage();
        // Other initialization code...
            try { 
                Class.forName("com.mysql.cj.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotels","root","");
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(ManageRoom.class.getName()).log(Level.SEVERE, null, ex);
            }
            ShowRecordInTable();
    }
    
    public void ShowRecordInTable(){
        int c=0;
            try {
                pst=con.prepareStatement("select * from room");
                rs=pst.executeQuery();
                ResultSetMetaData rsmd=rs.getMetaData();
                c=rsmd.getColumnCount();
                DefaultTableModel DModel=(DefaultTableModel) jTable1.getModel();
                DModel.setRowCount(0);
                while(rs.next()){
                    Vector column=new Vector();
                    for(int i=1;i<=c;i++){
                        column.add(rs.getString("roomnumber"));
                        column.add(rs.getString("roomtype"));
                        column.add(rs.getString("bed"));
                        column.add(rs.getString("price"));
                        column.add(rs.getString("status"));
                    }
                    DModel.addRow(column);
                }
            } catch (SQLException ex) {
                Logger.getLogger(ManageRoom.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    
    //Image set or adjustment coding in loading1 page.....
    public void scaleImage() {
        try {
            // Load the image from the file
            ImageIcon icon = new ImageIcon(getClass().getResource("/images/ok.jpg"));

            // Scale the image to fit the label
            Image img = icon.getImage();
            Image imgScale = img.getScaledInstance(jLabel6.getWidth(), jLabel6.getHeight(), Image.SCALE_SMOOTH);
        
            // Set the scaled image as the icon of the JLabe6
           ImageIcon scaledIcon = new ImageIcon(imgScale);
            jLabel6.setIcon(scaledIcon);
        } catch (Exception ex) {
            // Handle exceptions, such as file not found or image loading error
          // ex.printStackTrace();
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtroomnumber = new javax.swing.JTextField();
        jComboroomtype = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        jCombobed = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 242, 242));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/manage.png"))); // NOI18N
        jLabel1.setText("Manage Room");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 50));

        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Room Number", "Room Type", "Bed Type", "Price", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 920, 380));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(948, 0, 52, -1));

        jLabel2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(242, 242, 242));
        jLabel2.setText("Room Number");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 532, 159, 31));

        jLabel3.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(242, 242, 242));
        jLabel3.setText("Room Type");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 532, 188, 31));

        txtroomnumber.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        getContentPane().add(txtroomnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 581, 159, 33));

        jComboroomtype.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jComboroomtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "NON AC" }));
        getContentPane().add(jComboroomtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 581, 188, 33));

        jLabel4.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(242, 242, 242));
        jLabel4.setText("Bed");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 632, 159, 28));

        jLabel5.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(242, 242, 242));
        jLabel5.setText("Price");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 632, 188, 28));

        txtprice.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        getContentPane().add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 679, 188, 32));

        jCombobed.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jCombobed.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Double", " " }));
        jCombobed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCombobedActionPerformed(evt);
            }
        });
        getContentPane().add(jCombobed, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 678, 159, 32));

        jButton2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButton2.setText("Add Room Details");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(707, 581, 157, 33));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/okko.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Create a confirmation dialog before exit a desktop or not...
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCombobedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCombobedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCombobedActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:i
        if(txtroomnumber.getText().equals("")){
            JOptionPane.showMessageDialog(this,"All Field is required");
            txtroomnumber.requestFocus();
        }
                else if(txtprice.getText().equals("")){
                        JOptionPane.showMessageDialog(this,"All Field is required");
                        txtprice.requestFocus();
                        }
                else{
            try {
                pst=con.prepareStatement("select * from room where roomnumber=?");
                pst.setString(1,txtroomnumber.getText());
                rs=pst.executeQuery();
                if(rs.next()){
                    JOptionPane.showMessageDialog(this,"Room Number Already Exits");
                }
                else{
                    pst=con.prepareStatement("insert into room(roomnumber,roomtype,bed,price,status) values(?,?,?,?,?)");
                    pst.setString(1,txtroomnumber.getText());
                    pst.setString(2, jComboroomtype.getItemAt(jComboroomtype.getSelectedIndex()));
                    pst.setString(3, jCombobed.getItemAt(jCombobed.getSelectedIndex()));
                    pst.setString(4, txtprice.getText());
                    pst.setString(5, "NOT-BOOKED");
                    pst.executeUpdate(); 
                    JOptionPane.showMessageDialog(this,"Room Added");
                    ShowRecordInTable();
                    txtroomnumber.setText("");
                    txtprice.setText("");
                }
            } catch (SQLException ex) {
                Logger.getLogger(ManageRoom.class.getName()).log(Level.SEVERE, null, ex);
            }
                }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ManageRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageRoom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jCombobed;
    private javax.swing.JComboBox<String> jComboroomtype;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtroomnumber;
    // End of variables declaration//GEN-END:variables
}