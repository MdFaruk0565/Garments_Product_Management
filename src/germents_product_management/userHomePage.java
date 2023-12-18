
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


public class userHomePage extends javax.swing.JFrame {

    Database_Conncection dbc=new Database_Conncection();
    private String p_code,p_col,p_siz,p_unt;
    public userHomePage() {
        initComponents();
        ResultSet rs;
        ImageIcon myImg1 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Images/homepage.jpg")));
        Image imf = myImg1.getImage();
        Image img0 = imf.getScaledInstance(bgImg.getWidth(), bgImg.getHeight(), Image.SCALE_AREA_AVERAGING);
        ImageIcon imgicon;
        imgicon = new ImageIcon(img0);
        bgImg.setIcon(imgicon);
         
      try {
    String query = "SELECT * FROM product";
    rs=dbc.stm.executeQuery(query);
    while(rs.next())
    {
        String account=rs.getString("Product_Code");
        combobox.addItem(account);
    }
    
} catch (Exception E) {
   
}
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        doneBtn = new javax.swing.JButton();
        checkBtn = new javax.swing.JButton();
        combobox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bgImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(250, 50));
        setMinimumSize(new java.awt.Dimension(1050, 600));
        setPreferredSize(new java.awt.Dimension(600, 450));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        doneBtn.setBackground(new java.awt.Color(0, 255, 0));
        doneBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        doneBtn.setText("Complete");
        doneBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneBtnActionPerformed(evt);
            }
        });
        getContentPane().add(doneBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, 200, 40));

        checkBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        checkBtn.setText("Check Requirements");
        checkBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBtnActionPerformed(evt);
            }
        });
        getContentPane().add(checkBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 190, 50));

        combobox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Pending Product" }));
        getContentPane().add(combobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 230, 50));

        table.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Code", "Color", "Required Size", "Required Unit"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 247, 1040, 110));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 160, 120, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hafizul Garments Ltd");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 740, 50));
        getContentPane().add(bgImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBtnActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel tblModel = (DefaultTableModel)table.getModel();
        
        String getPCode = combobox.getSelectedItem().toString();
        this.p_code=getPCode;
        
        Connection con;
        ResultSet rs=null,rs1=null;
        Statement stm,stm1;
        PreparedStatement psmt;
         try {
        String query = "SELECT * FROM product WHERE Product_Code = '"+getPCode+"'";
        rs=dbc.stm.executeQuery(query);
        while(rs.next())
        {   
            this.p_col=rs.getString("P_color");
            this.p_siz=rs.getString("P_size");
            this.p_unt=rs.getString("P_unit");
                
            String data[]={getPCode,p_col,p_siz,p_unt};
        tblModel.addRow(data);
        break;
    }
         }catch(Exception e){}
    }//GEN-LAST:event_checkBtnActionPerformed

    private void doneBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneBtnActionPerformed
        // TODO add your handling code here:
        
        String query = "INSERT INTO completed_product (Product_Code, P_color,P_size, P_unit) VALUES (?, ?, ?, ?)";

        try (PreparedStatement pstmt = dbc.con.prepareStatement(query)) {

            pstmt.setString(1, p_code);
            pstmt.setString(2, p_col);
            pstmt.setString(3, p_siz);
            pstmt.setString(4, p_unt);
            int success = pstmt.executeUpdate();

            if (success != 0) {
                JOptionPane.showMessageDialog(this, "Update Susscessfully");
                try{
            String query1 = "DELETE FROM product WHERE Product_Code = " + p_code;
            int i=dbc.stm.executeUpdate(query1);
            if(i!=0){
                System.out.println("Delete Successfull");
                this.dispose();
                new userHomePage().setVisible(true);

            }else{System.out.println("Delete Failed");}
            
        }catch(Exception e){
            System.out.println("Database Error11!");
        }
            }
        } catch (Exception e) {
            System.out.println("Something Went Wrong");
        } 

    }//GEN-LAST:event_doneBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new loginPage().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(userHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userHomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgImg;
    private javax.swing.JButton checkBtn;
    private javax.swing.JComboBox<String> combobox;
    private javax.swing.JButton doneBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
