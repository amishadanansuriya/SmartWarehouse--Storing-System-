/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import static Database.DBManager.userName;
import static Database.DBManager.role;

import Classess.Client;
import Database.DBManager;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class ManageClient extends javax.swing.JFrame {

    /**
     * Creates new form ManageClient
     */
    public ManageClient() {
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
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        txtClientNo = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblClientNo = new javax.swing.JLabel();
        lblTeleNo = new javax.swing.JLabel();
        txtTeleNo = new javax.swing.JTextField();
        lblMobile = new javax.swing.JLabel();
        txtMobile = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblRemark = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRemark = new javax.swing.JTextArea();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnBack1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtSearchClientNo = new javax.swing.JTextField();
        lblSearchClientNo = new javax.swing.JLabel();
        btnSearch1 = new javax.swing.JButton();
        btnSClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1336, 768));
        setMinimumSize(new java.awt.Dimension(1336, 768));
        setPreferredSize(new java.awt.Dimension(1336, 768));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1336, 768));
        jPanel1.setMinimumSize(new java.awt.Dimension(1336, 768));
        jPanel1.setPreferredSize(new java.awt.Dimension(1336, 768));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Manage Client");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, -30, 310, 60));

        txtClientNo.setEditable(false);
        txtClientNo.setBackground(new java.awt.Color(204, 204, 204));
        txtClientNo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtClientNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClientNoActionPerformed(evt);
            }
        });
        jPanel4.add(txtClientNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 150, 30));

        lblName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(102, 102, 102));
        lblName.setText("Name");
        jPanel4.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, 30));

        txtName.setBackground(new java.awt.Color(204, 204, 204));
        txtName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel4.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 1030, 30));

        lblAddress.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblAddress.setForeground(new java.awt.Color(102, 102, 102));
        lblAddress.setText("Address");
        jPanel4.add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, 30));

        txtAddress.setBackground(new java.awt.Color(204, 204, 204));
        txtAddress.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel4.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 1030, 30));

        lblClientNo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblClientNo.setForeground(new java.awt.Color(102, 102, 102));
        lblClientNo.setText("Client No");
        jPanel4.add(lblClientNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, 30));

        lblTeleNo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTeleNo.setForeground(new java.awt.Color(102, 102, 102));
        lblTeleNo.setText("Tele No");
        jPanel4.add(lblTeleNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, 20));

        txtTeleNo.setBackground(new java.awt.Color(204, 204, 204));
        txtTeleNo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel4.add(txtTeleNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 320, 30));

        lblMobile.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMobile.setForeground(new java.awt.Color(102, 102, 102));
        lblMobile.setText("Mobile");
        jPanel4.add(lblMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, -1, 20));

        txtMobile.setBackground(new java.awt.Color(204, 204, 204));
        txtMobile.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel4.add(txtMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, 310, 30));

        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("*Permanant address or Company address");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, 20));

        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("*If corporate client, Register using company name");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, -1));

        lblRemark.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblRemark.setForeground(new java.awt.Color(102, 102, 102));
        lblRemark.setText("Remarks");
        jPanel4.add(lblRemark, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, -1, 30));

        txtEmail.setBackground(new java.awt.Color(204, 204, 204));
        txtEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel4.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 420, 30));

        lblEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(102, 102, 102));
        lblEmail.setText("Email");
        jPanel4.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, 30));

        txtRemark.setBackground(new java.awt.Color(204, 204, 204));
        txtRemark.setColumns(20);
        txtRemark.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtRemark.setLineWrap(true);
        txtRemark.setRows(5);
        txtRemark.setWrapStyleWord(true);
        txtRemark.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jScrollPane1.setViewportView(txtRemark);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 1040, 70));

        btnUpdate.setBackground(new java.awt.Color(51, 204, 255));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel4.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 450, 140, 40));

        btnDelete.setBackground(new java.awt.Color(255, 204, 204));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel4.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 450, 140, 40));

        btnReset.setBackground(new java.awt.Color(255, 204, 204));
        btnReset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnReset.setText("Reset");
        btnReset.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel4.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 450, 140, 40));

        btnBack1.setBackground(new java.awt.Color(255, 204, 204));
        btnBack1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack1.setText("Back");
        btnBack1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });
        jPanel4.add(btnBack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 450, 140, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 1260, 510));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSearchClientNo.setBackground(new java.awt.Color(204, 204, 204));
        txtSearchClientNo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtSearchClientNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchClientNoActionPerformed(evt);
            }
        });
        jPanel2.add(txtSearchClientNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 210, 30));

        lblSearchClientNo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblSearchClientNo.setText("Client No");
        jPanel2.add(lblSearchClientNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 120, 30));

        btnSearch1.setBackground(new java.awt.Color(51, 204, 255));
        btnSearch1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSearch1.setText("Search");
        btnSearch1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnSearch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 90, 30));

        btnSClear.setBackground(new java.awt.Color(255, 204, 204));
        btnSClear.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnSClear.setText("Clear");
        btnSClear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSClearActionPerformed(evt);
            }
        });
        jPanel2.add(btnSClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 80, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1340, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 900));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtClientNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClientNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClientNoActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String clientNo = txtClientNo.getText();
        String name = txtName.getText();
        String address = txtAddress.getText();
        String teleNo = txtTeleNo.getText();
        String mobile = txtMobile.getText();
        String email = txtEmail.getText();
        String remark = txtRemark.getText();
        
        Client client = new Client(clientNo, name, address, teleNo, mobile, email, remark);
        DBManager dbmanager = new DBManager();
        boolean flag = dbmanager.updateClient(client);
        
        if (flag) {
            JOptionPane.showMessageDialog(null, "Client has been sucessfully updated!");
            txtClientNo.setText("");
            txtName.setText("");
            txtAddress.setText("");
            txtTeleNo.setText("");
            txtMobile.setText("");
            txtEmail.setText("");
            txtRemark.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Client updation has been failed!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        String clientNo = txtSearchClientNo.getText();
        Client client = new Client(clientNo);
        DBManager dbManager = new DBManager();
        boolean flag = dbManager.deleteClient(client);
        
        if (flag) {
            JOptionPane.showMessageDialog(null, "Client has been sucessfully removed!");
            txtClientNo.setText("");
            txtName.setText("");
            txtAddress.setText("");
            txtTeleNo.setText("");
            txtMobile.setText("");
            txtEmail.setText("");
            txtRemark.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Client removing has been failed!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtClientNo.setText("");
        txtName.setText("");
        txtAddress.setText("");
        txtTeleNo.setText("");
        txtMobile.setText("");
        txtEmail.setText("");
        txtRemark.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void txtSearchClientNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchClientNoActionPerformed
        
    }//GEN-LAST:event_txtSearchClientNoActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        if (role.equals("Manager")) {
                ManagerMenu managerMenu = new ManagerMenu();
                managerMenu.setVisible(true);
                this.dispose();
            } else if (role.equals("Operator")) {
                OpMenu opMenu = new OpMenu();
                opMenu.setVisible(true);
                this.dispose();
            }
    }//GEN-LAST:event_btnBack1ActionPerformed

    private void btnSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch1ActionPerformed
        String clientNo = txtSearchClientNo.getText();
        Client client = new Client(clientNo);
        DBManager dbManager = new DBManager();
        Client clientSearch = dbManager.searchClient(client);
        
        if (clientSearch == null) {
             JOptionPane.showMessageDialog(null, "Invalid Client Number", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else{
            
        txtClientNo.setText(clientSearch.getClientNo());
        txtName.setText(clientSearch.getName());
        txtAddress.setText(clientSearch.getAddress());
        txtTeleNo.setText(clientSearch.getTeleNo());
        txtMobile.setText(clientSearch.getMobile());
        txtEmail.setText(clientSearch.getEmail());
        txtRemark.setText(clientSearch.getRemark());
        }
    }//GEN-LAST:event_btnSearch1ActionPerformed

    private void btnSClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSClearActionPerformed
        txtSearchClientNo.setText("");
    }//GEN-LAST:event_btnSClearActionPerformed

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
            java.util.logging.Logger.getLogger(ManageClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSClear;
    private javax.swing.JButton btnSearch1;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblClientNo;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblMobile;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblRemark;
    private javax.swing.JLabel lblSearchClientNo;
    private javax.swing.JLabel lblTeleNo;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtClientNo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextArea txtRemark;
    private javax.swing.JTextField txtSearchClientNo;
    private javax.swing.JTextField txtTeleNo;
    // End of variables declaration//GEN-END:variables
}
