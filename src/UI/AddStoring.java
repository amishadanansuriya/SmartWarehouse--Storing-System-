/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import static Database.DBManager.userName;
import static Database.DBManager.role;

import Classess.Bill;
import Classess.Client;
import Classess.Storing;
import Database.DBManager;
import static Database.DBManager.role;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class AddStoring extends javax.swing.JFrame {

    /**
     * Creates new form AddStoring
     */
    Date date;
    SimpleDateFormat dateFormat;
    double subTotal = 0.0;
    DefaultTableModel itemTable;

    public AddStoring() {
        initComponents();

        date = new Date();
        dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        dateStarting.setDateFormatString(dateFormat.toLocalizedPattern());
        dateStarting.setDate(date);

        dateEnding.setDateFormatString(dateFormat.toLocalizedPattern());
        dateEnding.setDate(date);

        itemTable = (DefaultTableModel) tablItemList.getModel();
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
        lblheading = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btnResetTable = new javax.swing.JButton();
        btnAddItem = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        txtJobNo = new javax.swing.JTextField();
        lblJobNo = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lblItemName = new javax.swing.JLabel();
        txtItemName = new javax.swing.JTextField();
        lblNoOfItems = new javax.swing.JLabel();
        spinNoOfItems = new javax.swing.JSpinner();
        lblAddItem = new javax.swing.JLabel();
        txtSqftArea = new javax.swing.JTextField();
        lblSqftArea = new javax.swing.JLabel();
        txtPerSqftRate = new javax.swing.JTextField();
        lblPerSqftRate = new javax.swing.JLabel();
        btnAddStoring = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablItemList = new javax.swing.JTable();
        txtTotal = new javax.swing.JTextField();
        lblTotal = new javax.swing.JLabel();
        lblStartingDate = new javax.swing.JLabel();
        dateStarting = new com.toedter.calendar.JDateChooser();
        lblEndingDate = new javax.swing.JLabel();
        dateEnding = new com.toedter.calendar.JDateChooser();
        btnBack1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtSearchClientNo = new javax.swing.JTextField();
        lblSearchClientNo = new javax.swing.JLabel();
        btnSearchClientNo = new javax.swing.JButton();
        btnSClear = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtClientNo = new javax.swing.JTextField();
        lblClientNo1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblTeleNo = new javax.swing.JLabel();
        txtTeleNo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1340, 985));
        setMinimumSize(new java.awt.Dimension(1340, 985));
        setPreferredSize(new java.awt.Dimension(1340, 985));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblheading.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblheading.setText("Add Storing");
        jPanel1.add(lblheading, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

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
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, -30, 260, 60));

        btnResetTable.setBackground(new java.awt.Color(255, 204, 204));
        btnResetTable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnResetTable.setText("Reset Table");
        btnResetTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnResetTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetTableActionPerformed(evt);
            }
        });
        jPanel4.add(btnResetTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 480, 100, 30));

        btnAddItem.setBackground(new java.awt.Color(51, 204, 255));
        btnAddItem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAddItem.setText("Add Item");
        btnAddItem.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemActionPerformed(evt);
            }
        });
        jPanel4.add(btnAddItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 250, 100, 30));

        btnReset.setBackground(new java.awt.Color(255, 204, 204));
        btnReset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnReset.setText("Reset");
        btnReset.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel4.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 570, 140, 40));

        txtJobNo.setBackground(new java.awt.Color(204, 204, 204));
        txtJobNo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtJobNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJobNoActionPerformed(evt);
            }
        });
        jPanel4.add(txtJobNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 210, 30));

        lblJobNo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblJobNo.setForeground(new java.awt.Color(102, 102, 102));
        lblJobNo.setText("Job No");
        jPanel4.add(lblJobNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, 30));

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblItemName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblItemName.setForeground(new java.awt.Color(102, 102, 102));
        lblItemName.setText("Item Name");
        jPanel6.add(lblItemName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 30));

        txtItemName.setBackground(new java.awt.Color(204, 204, 204));
        txtItemName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtItemName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItemNameActionPerformed(evt);
            }
        });
        jPanel6.add(txtItemName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 1000, 30));

        lblNoOfItems.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNoOfItems.setForeground(new java.awt.Color(102, 102, 102));
        lblNoOfItems.setText("No of Items");
        jPanel6.add(lblNoOfItems, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, -1, 30));

        spinNoOfItems.setModel(new javax.swing.SpinnerNumberModel(1, null, null, 1));
        jPanel6.add(spinNoOfItems, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 200, 30));

        lblAddItem.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblAddItem.setText("Add Item");
        jPanel6.add(lblAddItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        txtSqftArea.setBackground(new java.awt.Color(204, 204, 204));
        txtSqftArea.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel6.add(txtSqftArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 190, 30));

        lblSqftArea.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSqftArea.setForeground(new java.awt.Color(102, 102, 102));
        lblSqftArea.setText("Sq.ft Area");
        jPanel6.add(lblSqftArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 30));

        txtPerSqftRate.setBackground(new java.awt.Color(204, 204, 204));
        txtPerSqftRate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel6.add(txtPerSqftRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 100, 190, 30));

        lblPerSqftRate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPerSqftRate.setForeground(new java.awt.Color(102, 102, 102));
        lblPerSqftRate.setText("Per Sq.ft Rate");
        jPanel6.add(lblPerSqftRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 100, -1, 30));

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 1180, 150));

        btnAddStoring.setBackground(new java.awt.Color(51, 204, 255));
        btnAddStoring.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAddStoring.setText("Add Storing");
        btnAddStoring.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnAddStoring.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStoringActionPerformed(evt);
            }
        });
        jPanel4.add(btnAddStoring, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 570, 140, 40));

        tablItemList.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tablItemList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Sq.ft Area", "No of Items", "Per Sq.ft Rate", "Days", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablItemList);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 1180, 170));

        txtTotal.setBackground(new java.awt.Color(204, 204, 204));
        txtTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTotal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel4.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 510, 190, 30));

        lblTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(102, 102, 102));
        lblTotal.setText("Sub Total");
        jPanel4.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, -1, 30));

        lblStartingDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblStartingDate.setForeground(new java.awt.Color(102, 102, 102));
        lblStartingDate.setText("Starting Date");
        jPanel4.add(lblStartingDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, -1, 30));

        dateStarting.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.add(dateStarting, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, 200, 30));

        lblEndingDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblEndingDate.setForeground(new java.awt.Color(102, 102, 102));
        lblEndingDate.setText("Ending Date");
        jPanel4.add(lblEndingDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 40, -1, 30));

        dateEnding.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.add(dateEnding, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 40, 200, 30));

        btnBack1.setBackground(new java.awt.Color(255, 204, 204));
        btnBack1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack1.setText("Back");
        btnBack1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });
        jPanel4.add(btnBack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 570, 140, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 1260, 630));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
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

        btnSearchClientNo.setBackground(new java.awt.Color(51, 204, 255));
        btnSearchClientNo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSearchClientNo.setText("Search");
        btnSearchClientNo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnSearchClientNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchClientNoActionPerformed(evt);
            }
        });
        jPanel2.add(btnSearchClientNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 90, 30));

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

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblName.setText("Name");
        jPanel3.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, -1, 30));

        txtEmail.setEditable(false);
        txtEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel3.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 120, 550, 30));

        lblEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblEmail.setText("Email");
        jPanel3.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, -1, 30));

        txtClientNo.setEditable(false);
        txtClientNo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtClientNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClientNoActionPerformed(evt);
            }
        });
        jPanel3.add(txtClientNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 200, 30));

        lblClientNo1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblClientNo1.setText("Client No");
        jPanel3.add(lblClientNo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, 30));

        txtName.setEditable(false);
        txtName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel3.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 680, 30));

        lblAddress.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblAddress.setText("Address");
        jPanel3.add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, 30));

        txtAddress.setEditable(false);
        txtAddress.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        jPanel3.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 1020, 30));

        lblTeleNo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTeleNo.setText("Tele No");
        jPanel3.add(lblTeleNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, 30));

        txtTeleNo.setEditable(false);
        txtTeleNo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtTeleNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTeleNoActionPerformed(evt);
            }
        });
        jPanel3.add(txtTeleNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 340, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1340, 180));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1340, 250));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1340, 940));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnResetTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetTableActionPerformed
        itemTable.setRowCount(0);
        subTotal = 0.0;
        txtTotal.setText("");
    }//GEN-LAST:event_btnResetTableActionPerformed

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed
        String itemName = txtItemName.getText();
        double sqftArea = Double.parseDouble(txtSqftArea.getText());
        int noOfItems = (int) spinNoOfItems.getValue();
        double perSqftRate = Double.parseDouble(txtPerSqftRate.getText());

        int days = (int) ((dateEnding.getDate().getTime() - dateStarting.getDate().getTime()) / (1000 * 60 * 60 * 24));

        //Item price calcluation
        double itemTotal = 0.0;

        itemTotal = (sqftArea * perSqftRate * noOfItems * days);

        //Sub Total Calcluation
        subTotal += itemTotal;
        txtTotal.setText(subTotal + "");

        Object itemRow[] = {itemName, sqftArea, noOfItems, perSqftRate, days, itemTotal};
        itemTable.addRow(itemRow);
        txtItemName.setText("");
        txtSqftArea.setText("");
        spinNoOfItems.setValue(1);
        txtPerSqftRate.setText("");


    }//GEN-LAST:event_btnAddItemActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtSearchClientNo.setText("");
        txtClientNo.setText("");
        txtName.setText("");
        txtAddress.setText("");
        txtTeleNo.setText("");
        txtEmail.setText("");
        txtJobNo.setText("");
        dateStarting.setDate(date);
        dateEnding.setDate(date);
        txtItemName.setText("");
        txtSqftArea.setText("");
        spinNoOfItems.setValue(1);
        txtPerSqftRate.setText("");
        itemTable.setRowCount(0);
        txtTotal.setText("");
        subTotal = 0.0;

    }//GEN-LAST:event_btnResetActionPerformed

    private void txtSearchClientNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchClientNoActionPerformed

    }//GEN-LAST:event_txtSearchClientNoActionPerformed

    private void btnSearchClientNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchClientNoActionPerformed
        String clientNo = txtSearchClientNo.getText();
        Client client = new Client(clientNo);
        DBManager dbManager = new DBManager();
        Client clientSearch = dbManager.searchClient(client);

        if (clientSearch == null) {
            JOptionPane.showMessageDialog(null, "Invalid Client Number", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {

            txtClientNo.setText(clientSearch.getClientNo());
            txtName.setText(clientSearch.getName());
            txtAddress.setText(clientSearch.getAddress());
            txtTeleNo.setText(clientSearch.getTeleNo());
            txtEmail.setText(clientSearch.getMobile());
        }


    }//GEN-LAST:event_btnSearchClientNoActionPerformed

    private void btnSClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSClearActionPerformed
        txtSearchClientNo.setText("");
    }//GEN-LAST:event_btnSClearActionPerformed

    private void txtItemNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItemNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtItemNameActionPerformed

    private void txtClientNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClientNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClientNoActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtTeleNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTeleNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTeleNoActionPerformed

    private void txtJobNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJobNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJobNoActionPerformed

    private void btnAddStoringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStoringActionPerformed
        String jobNo = txtJobNo.getText();
        String clientNo = txtClientNo.getText();
        double sTotal = Double.parseDouble(txtTotal.getText());
        String startingDate = dateFormat.format(dateStarting.getDate());
        String endingDate = dateFormat.format(dateEnding.getDate());

        int status = 1;

        Storing storing = new Storing(jobNo, clientNo, sTotal, startingDate, endingDate, status);
        DBManager dbManager = new DBManager();
        boolean flag = dbManager.AddStoring(storing);

        if (flag) {

            int nosRow = 0;

            for (int count = 0; count < itemTable.getRowCount(); count++) {

                String itemName = itemTable.getValueAt(count, 0).toString();
                double sqftArea = Double.parseDouble(itemTable.getValueAt(count, 1).toString());
                int noOfItem = Integer.parseInt(itemTable.getValueAt(count, 2).toString());
                double perSqftRate = Double.parseDouble(itemTable.getValueAt(count, 3).toString());
                int days = Integer.parseInt(itemTable.getValueAt(count, 4).toString());
                double itemTotal = Double.parseDouble(itemTable.getValueAt(count, 5).toString());

                Storing storingItem = new Storing(jobNo, itemName, sqftArea, noOfItem, perSqftRate, days, itemTotal);
                DBManager itemDBManager = new DBManager();
                itemDBManager.AddStoringItem(storingItem);

                nosRow++;
            }

            if (nosRow == itemTable.getRowCount()) {
                JOptionPane.showMessageDialog(null, "Storing has been added sucessfully!");
                //Reset fields
                txtSearchClientNo.setText("");
                txtClientNo.setText("");
                txtName.setText("");
                txtAddress.setText("");
                txtTeleNo.setText("");
                txtEmail.setText("");
                txtJobNo.setText("");
                dateStarting.setDate(date);
                dateEnding.setDate(date);
                txtItemName.setText("");
                txtSqftArea.setText("");
                spinNoOfItems.setValue(1);
                txtPerSqftRate.setText("");
                itemTable.setRowCount(0);
                txtTotal.setText("");
                subTotal = 0.0;
                
                if (JOptionPane.showConfirmDialog(null, "Preview Invoice?", "Information", JOptionPane.YES_NO_OPTION) == 0){
                  Bill bill = new Bill();
                  bill.setJobNo(storing.getJobNo());
        
                  GenerateBill generateBill = new GenerateBill(bill);
                  this.dispose();
                  generateBill.setVisible(true);
                    
                }
                

            } else {
                JOptionPane.showMessageDialog(null, "Storing has been failed!", "ERROR", JOptionPane.ERROR_MESSAGE);
            }

        }


    }//GEN-LAST:event_btnAddStoringActionPerformed

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
            java.util.logging.Logger.getLogger(AddStoring.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStoring.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStoring.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStoring.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStoring().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnAddStoring;
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnResetTable;
    private javax.swing.JButton btnSClear;
    private javax.swing.JButton btnSearchClientNo;
    private com.toedter.calendar.JDateChooser dateEnding;
    private com.toedter.calendar.JDateChooser dateStarting;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddItem;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblClientNo1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndingDate;
    private javax.swing.JLabel lblItemName;
    private javax.swing.JLabel lblJobNo;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNoOfItems;
    private javax.swing.JLabel lblPerSqftRate;
    private javax.swing.JLabel lblSearchClientNo;
    private javax.swing.JLabel lblSqftArea;
    private javax.swing.JLabel lblStartingDate;
    private javax.swing.JLabel lblTeleNo;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblheading;
    private javax.swing.JSpinner spinNoOfItems;
    private javax.swing.JTable tablItemList;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtClientNo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtItemName;
    private javax.swing.JTextField txtJobNo;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPerSqftRate;
    private javax.swing.JTextField txtSearchClientNo;
    private javax.swing.JTextField txtSqftArea;
    private javax.swing.JTextField txtTeleNo;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
