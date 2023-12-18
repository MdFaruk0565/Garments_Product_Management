
package germents_product_management;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class adminPanel extends javax.swing.JFrame {

   Database_Conncection dbc= new Database_Conncection();
    public adminPanel() {
        initComponents();
        ImageIcon myImg1 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Images/login01.jpg")));
        Image imf = myImg1.getImage();
        Image img0 = imf.getScaledInstance(bgImg.getWidth(), bgImg.getHeight(), Image.SCALE_AREA_AVERAGING);
        ImageIcon imgicon;
        imgicon = new ImageIcon(img0);
        bgImg.setIcon(imgicon);
        
        ResultSet rs,rs1;
         try {
   
    String query = "SELECT * FROM product";
    rs=dbc.stm.executeQuery(query);
    while(rs.next())
    {
        String prod=rs.getString("Product_Code");
        combobox.addItem(prod);
    }
    
} catch (Exception E) {
   
}  try {
   
    String query = "SELECT * FROM completed_product";
    rs1=dbc.stm.executeQuery(query);
    while(rs1.next())
    {
        String prod=rs1.getString("Product_Code");
        combobox1.addItem(prod);
    }
    
} catch (Exception E) {
   
}
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pSize = new javax.swing.JTextField();
        pCode = new javax.swing.JTextField();
        pColor = new javax.swing.JTextField();
        pUnit = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        combobox = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        combobox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        submit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        bgImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(150, 20));
        setMinimumSize(new java.awt.Dimension(880, 550));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pSize.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(pSize, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 190, 30));

        pCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(pCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 190, 30));

        pColor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(pColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 190, 30));

        pUnit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(pUnit, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 190, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Required Unit");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 130, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Product Code");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 130, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Set Size");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 130, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Set Color");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 130, 30));

        combobox.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seletct Previous Product" }));
        getContentPane().add(combobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 200, 40));

        jButton1.setText("Check Status");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 190, 140, 40));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Send Requirements");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 210, 50));

        combobox1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        combobox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Completed Product" }));
        getContentPane().add(combobox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 200, 40));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Code", "Color", "Size", "Unit"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setEnabled(false);
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 530, 170));

        submit.setText("See Details");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 280, 140, 40));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("HAFIZUL GARMENTS INDUSTRY LTD");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 80));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Admin Panel");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 64, 630, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 90));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Dashboard");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 200, 40));

        jButton3.setBackground(new java.awt.Color(204, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(833, 90, 110, 50));
        getContentPane().add(bgImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String P_Code=pCode.getText();
        String P_Color=pColor.getText();
        String P_Size=pSize.getText();
        String P_Unit=pUnit.getText();
        
         String query = "INSERT INTO product (Product_Code, P_color,P_size, P_unit) VALUES (?, ?, ?, ?)";

        try (PreparedStatement pstmt = dbc.con.prepareStatement(query)) {

            pstmt.setString(1, P_Code);
            pstmt.setString(2, P_Color);
            pstmt.setString(3, P_Size);
            pstmt.setString(4, P_Unit);
            int success = pstmt.executeUpdate();

            if (success != 0) {
                JOptionPane.showMessageDialog(this, "Send Requirement Susscessfully");
                this.dispose();
                new adminPanel().setVisible(true);
                pCode.setText("");
                pColor.setText("");
                pSize.setText("");
                pUnit.setText("");
                
            }
        } catch (Exception e) {
            System.out.println("Something Went Wrong");
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ResultSet rs;
        String getdata=combobox.getSelectedItem().toString();
              try {
   
    String query = "SELECT * FROM product";
    rs=dbc.stm.executeQuery(query);
    if(rs.next())
    {
        JOptionPane.showMessageDialog(this, "Pending");
    }
    
} catch (Exception E) {
   
}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel tblModel = (DefaultTableModel)table.getModel();
        
        String getPCode = combobox1.getSelectedItem().toString();
        
        
        Connection con;
        ResultSet rs=null;
        PreparedStatement psmt;
         try {
        String query = "SELECT * FROM completed_product WHERE Product_Code = '"+getPCode+"'";
        rs=dbc.stm.executeQuery(query);
        while(rs.next())
        {   
            String p_col=rs.getString("P_color");
            String p_siz=rs.getString("P_size");
            String p_unt=rs.getString("P_unit");
                
            String data[]={getPCode,p_col,p_siz,p_unt};
        tblModel.addRow(data);
        break;
    }
         }catch(Exception e){}
    }//GEN-LAST:event_submitActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new AdminLoginPage().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(adminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgImg;
    private javax.swing.JComboBox<String> combobox;
    private javax.swing.JComboBox<String> combobox1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pCode;
    private javax.swing.JTextField pColor;
    private javax.swing.JTextField pSize;
    private javax.swing.JTextField pUnit;
    private javax.swing.JButton submit;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
