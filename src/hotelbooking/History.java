/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelbooking;

import java.io.File;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author user
 */
public class History extends javax.swing.JFrame {

   /**
    * Creates new form History
    */
   public History() {
      initComponents();
      DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
      int filename = cmbRoomNo.getSelectedIndex();
      String filevalue = String.valueOf(filename + 1);
      File file = new File(filevalue + ".txt");
      model.setRowCount(0);
      
      try {
         Scanner x = new Scanner(file);
         while (x.hasNext()) {
            String startday = x.nextLine().trim();
            String endday = x.nextLine().trim();
            String name = x.nextLine();
            String ic_ = x.nextLine().trim();
            String contact = x.nextLine().trim();
            String email = x.nextLine().trim();
            String array[] = {startday, endday, name, ic_, contact, email};
            model.addRow(array);
         }
         
         x.close();
      } catch (Exception ex) {
         Logger.getLogger(History.class.getName()).log(Level.SEVERE, null, ex);
      }
   }
   
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jPanel1 = new javax.swing.JPanel();
      jLabel1 = new javax.swing.JLabel();
      jLabel16 = new javax.swing.JLabel();
      jScrollPane1 = new javax.swing.JScrollPane();
      jTable1 = new javax.swing.JTable();
      jLabel13 = new javax.swing.JLabel();
      jLabel18 = new javax.swing.JLabel();
      jLabel8 = new javax.swing.JLabel();
      jLabel4 = new javax.swing.JLabel();
      jLabel3 = new javax.swing.JLabel();
      jLabel12 = new javax.swing.JLabel();
      jLabel10 = new javax.swing.JLabel();
      jLabel7 = new javax.swing.JLabel();
      jLabel6 = new javax.swing.JLabel();
      jLabel9 = new javax.swing.JLabel();
      jLabel14 = new javax.swing.JLabel();
      jLabel17 = new javax.swing.JLabel();
      btnDelete = new javax.swing.JButton();
      btnEdit = new javax.swing.JButton();
      btnHistory = new javax.swing.JButton();
      btnRefresh = new javax.swing.JButton();
      cmbRoomNo = new javax.swing.JComboBox<>();
      txtSearch = new javax.swing.JTextField();
      btnReceipt = new javax.swing.JButton();
      jLabel15 = new javax.swing.JLabel();
      jLabel5 = new javax.swing.JLabel();
      jLabel2 = new javax.swing.JLabel();
      jLabel11 = new javax.swing.JLabel();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setBackground(new java.awt.Color(51, 153, 255));

      jPanel1.setBackground(new java.awt.Color(204, 255, 204));
      jPanel1.setForeground(new java.awt.Color(0, 0, 0));

      jLabel1.setBackground(new java.awt.Color(0, 0, 0));
      jLabel1.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
      jLabel1.setForeground(new java.awt.Color(0, 0, 0));
      jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      jLabel1.setText("Booking History");
      jLabel1.setToolTipText("");
      jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
      jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

      jLabel16.setForeground(new java.awt.Color(0, 0, 0));
      jLabel16.setText("12 - Next Friday");

      jTable1.setBackground(new java.awt.Color(204, 255, 204));
      jTable1.setForeground(new java.awt.Color(0, 0, 0));
      jTable1.setModel(new javax.swing.table.DefaultTableModel(
         new Object [][] {

         },
         new String [] {
            "Start Day", "End Day", "Name", "IC / Passport No", "Contact", "Email"
         }
      ) {
         boolean[] canEdit = new boolean [] {
            false, false, false, false, false, false
         };

         public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
         }
      });
      jTable1.setGridColor(new java.awt.Color(204, 255, 204));
      jTable1.setSelectionBackground(new java.awt.Color(153, 204, 255));
      jTable1.setSelectionForeground(new java.awt.Color(0, 0, 0));
      jTable1.addFocusListener(new java.awt.event.FocusAdapter() {
         public void focusGained(java.awt.event.FocusEvent evt) {
            jTable1FocusGained(evt);
         }
      });
      jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            jTable1MouseClicked(evt);
         }
      });
      jScrollPane1.setViewportView(jTable1);

      jLabel13.setForeground(new java.awt.Color(0, 0, 0));
      jLabel13.setText("9 - Next Tuesday");

      jLabel18.setForeground(new java.awt.Color(0, 0, 0));
      jLabel18.setText("14 - Next Sunday");

      jLabel8.setForeground(new java.awt.Color(0, 0, 0));
      jLabel8.setText("4 - Thursday");

      jLabel4.setForeground(new java.awt.Color(0, 0, 0));
      jLabel4.setText("Day Values");

      jLabel3.setForeground(new java.awt.Color(0, 0, 0));
      jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
      jLabel3.setText("RoomNo :");
      jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

      jLabel12.setForeground(new java.awt.Color(0, 0, 0));
      jLabel12.setText("8 - Next Monday");

      jLabel10.setForeground(new java.awt.Color(0, 0, 0));
      jLabel10.setText("6 - Saturday");

      jLabel7.setForeground(new java.awt.Color(0, 0, 0));
      jLabel7.setText("3 - Wednesday");

      jLabel6.setForeground(new java.awt.Color(0, 0, 0));
      jLabel6.setText("2 - Tuesday");

      jLabel9.setForeground(new java.awt.Color(0, 0, 0));
      jLabel9.setText("5 - Friday");

      jLabel14.setForeground(new java.awt.Color(0, 0, 0));
      jLabel14.setText("10 - Next Wednesday");

      jLabel17.setForeground(new java.awt.Color(0, 0, 0));
      jLabel17.setText("13 - Next Saturday");

      btnDelete.setBackground(new java.awt.Color(204, 255, 153));
      btnDelete.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
      btnDelete.setForeground(new java.awt.Color(0, 0, 0));
      btnDelete.setText("Delete");
      btnDelete.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnDeleteActionPerformed(evt);
         }
      });

      btnEdit.setBackground(new java.awt.Color(204, 255, 153));
      btnEdit.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
      btnEdit.setForeground(new java.awt.Color(0, 0, 0));
      btnEdit.setText("Edit");
      btnEdit.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnEditActionPerformed(evt);
         }
      });

      btnHistory.setBackground(new java.awt.Color(204, 255, 153));
      btnHistory.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
      btnHistory.setForeground(new java.awt.Color(0, 0, 0));
      btnHistory.setText("Add Booking ⮞");
      btnHistory.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnHistoryActionPerformed(evt);
         }
      });

      btnRefresh.setBackground(new java.awt.Color(204, 255, 153));
      btnRefresh.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
      btnRefresh.setForeground(new java.awt.Color(0, 0, 0));
      btnRefresh.setText("Refresh");
      btnRefresh.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnRefreshActionPerformed(evt);
         }
      });

      cmbRoomNo.setMaximumRowCount(20);
      cmbRoomNo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));
      cmbRoomNo.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            cmbRoomNoActionPerformed(evt);
         }
      });
      cmbRoomNo.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
         public void propertyChange(java.beans.PropertyChangeEvent evt) {
            cmbRoomNoPropertyChange(evt);
         }
      });

      txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
         public void keyReleased(java.awt.event.KeyEvent evt) {
            txtSearchKeyReleased(evt);
         }
      });

      btnReceipt.setBackground(new java.awt.Color(204, 255, 153));
      btnReceipt.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
      btnReceipt.setForeground(new java.awt.Color(0, 0, 0));
      btnReceipt.setText("Receipt");
      btnReceipt.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnReceiptActionPerformed(evt);
         }
      });

      jLabel15.setForeground(new java.awt.Color(0, 0, 0));
      jLabel15.setText("11 - Next Thursday");

      jLabel5.setForeground(new java.awt.Color(0, 0, 0));
      jLabel5.setText("1 - Monday");

      jLabel2.setForeground(new java.awt.Color(0, 0, 0));
      jLabel2.setText("Search :");

      jLabel11.setForeground(new java.awt.Color(0, 0, 0));
      jLabel11.setText("7 - Sunday");

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGap(38, 38, 38)
                  .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGap(132, 132, 132)
                  .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                  .addContainerGap()
                  .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(18, 18, 18)
                  .addComponent(cmbRoomNo, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(18, 18, 18)
                  .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGap(44, 44, 44)
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                     .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                     .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGap(38, 38, 38))
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(93, 93, 93))))
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(43, 43, 43)
            .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(101, 101, 101)
            .addComponent(btnReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(116, 116, 116)
            .addComponent(btnHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(20, 20, 20)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(29, 29, 29)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(18, 18, 18)
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(jLabel3)
                     .addComponent(cmbRoomNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(btnRefresh))
                  .addGap(18, 18, 18)
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(jLabel2)))
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGap(3, 3, 3)
                  .addComponent(jLabel4)
                  .addGap(18, 18, 18)
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                     .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18))
                     .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)))))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(btnReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(btnHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(14, 14, 14))
      );

      jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnDelete, btnEdit, btnHistory, btnReceipt});

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );

      pack();
      setLocationRelativeTo(null);
   }// </editor-fold>//GEN-END:initComponents

   private void btnHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoryActionPerformed
      Room a = new Room();
      a.setVisible(true);
      this.setVisible(false);
   }//GEN-LAST:event_btnHistoryActionPerformed

   private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
      DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
      if (jTable1.getSelectionModel().isSelectionEmpty() == true) {
         JOptionPane.showMessageDialog(this, "Please select a row");
      } else if (jTable1.getSelectedRowCount() > 1) {
         JOptionPane.showMessageDialog(this, "Please select only one row");
      } else {
         int row = jTable1.convertRowIndexToModel(jTable1.getSelectedRow());
         String start = model.getValueAt(row, 0).toString();
         String end = model.getValueAt(row, 1).toString();
         String name = model.getValueAt(row, 2).toString();
         String ic = model.getValueAt(row, 3).toString();
         String contact = model.getValueAt(row, 4).toString();
         String email = model.getValueAt(row, 5).toString();
         int roomno = cmbRoomNo.getSelectedIndex() + 1;
         new Edit(start, end, name, ic, contact, email, roomno, this).setVisible(true);
      }
   }//GEN-LAST:event_btnEditActionPerformed

   private void cmbRoomNoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cmbRoomNoPropertyChange

   }//GEN-LAST:event_cmbRoomNoPropertyChange

   private void cmbRoomNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRoomNoActionPerformed
      
      int roomno = cmbRoomNo.getSelectedIndex();
      String room = String.valueOf(roomno + 1);
      File file = new File(room + ".txt");
      DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
      model.setRowCount(0);
      try {
         Scanner x = new Scanner(file);
         while (x.hasNext()) {
            String startday = x.nextLine().trim();
            String endday = x.nextLine().trim();
            String name = x.nextLine();
            String ic = x.nextLine().trim();
            String contact = x.nextLine().trim();
            String email = x.nextLine().trim();
            String array[] = {startday, endday, name, ic, contact, email};
            model.addRow(array);
         }
         x.close();
      } catch (Exception ex) {
         Logger.getLogger(History.class.getName()).log(Level.SEVERE, null, ex);
      }
   }//GEN-LAST:event_cmbRoomNoActionPerformed

   private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

   }//GEN-LAST:event_jTable1MouseClicked

   private void jTable1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable1FocusGained
      // TODO add your handling code here:
   }//GEN-LAST:event_jTable1FocusGained

   private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
      int roomno = cmbRoomNo.getSelectedIndex();
      String room = String.valueOf(roomno + 1);
      File file = new File(room + ".txt");
      DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
      model.setRowCount(0);
      try {
         Scanner x = new Scanner(file);
         while (x.hasNext()) {
            String startday = x.nextLine().trim();
            String endday = x.nextLine().trim();
            String name = x.nextLine();
            String ic = x.nextLine().trim();
            String contact = x.nextLine().trim();
            String email = x.nextLine().trim();
            String array[] = {startday, endday, name, ic, contact, email};
            model.addRow(array);
         }
         x.close();
      } catch (Exception ex) {
         Logger.getLogger(History.class.getName()).log(Level.SEVERE, null, ex);
      }
   }//GEN-LAST:event_btnRefreshActionPerformed

   private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
      
      DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
      if (jTable1.getSelectionModel().isSelectionEmpty() == true) {
         JOptionPane.showMessageDialog(this, "Please select a row");
      } else if (jTable1.getSelectedRowCount() > 1) {
         JOptionPane.showMessageDialog(this, "Please select only one row");
      } else {
         
         int confirmdlt = JOptionPane.showConfirmDialog(this, "Delete selected room booking?", "Delete room booking?", JOptionPane.YES_NO_OPTION);
         if (confirmdlt == JOptionPane.YES_OPTION) {
            int row = jTable1.convertRowIndexToModel(jTable1.getSelectedRow());
            int start = Integer.valueOf(model.getValueAt(row, 0).toString());
            int end = Integer.valueOf(model.getValueAt(row, 1).toString());
            int duration = end - start;
            String roomno = cmbRoomNo.getSelectedItem().toString();
            String filepath = roomno.trim() + ".txt";
            String ic = model.getValueAt(row, 3).toString();
            RoomNo room = new RoomNo(cmbRoomNo.getSelectedIndex() + 1, start, duration, end);
            room.deleteRecord(filepath, ic);

            // Refreshing the table
            int filename = cmbRoomNo.getSelectedIndex();
            String filevalue = String.valueOf(filename + 1);
            File file = new File(filevalue + ".txt");
            model.setRowCount(0);
            try {
               Scanner x = new Scanner(file);
               while (x.hasNext()) {
                  String startday = x.nextLine().trim();
                  String endday = x.nextLine().trim();
                  String name = x.nextLine();
                  String ic_ = x.nextLine().trim();
                  String contact = x.nextLine().trim();
                  String email = x.nextLine().trim();
                  String array[] = {startday, endday, name, ic_, contact, email};
                  model.addRow(array);
               }
               x.close();
            } catch (Exception ex) {
               Logger.getLogger(History.class.getName()).log(Level.SEVERE, null, ex);
            }
         }
         
      }
   }//GEN-LAST:event_btnDeleteActionPerformed

   private void btnReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReceiptActionPerformed
      DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
      if (jTable1.getSelectionModel().isSelectionEmpty() == true) {
         JOptionPane.showMessageDialog(this, "Please select a row");
      } else if (jTable1.getSelectedRowCount() > 1) {
         JOptionPane.showMessageDialog(this, "Please select only one row");
      } else {
         int row = jTable1.convertRowIndexToModel(jTable1.getSelectedRow());
         String start = model.getValueAt(row, 0).toString();
         String end = model.getValueAt(row, 1).toString();
         String name = model.getValueAt(row, 2).toString();
         String ic = model.getValueAt(row, 3).toString();
         String contact = model.getValueAt(row, 4).toString();
         String email = model.getValueAt(row, 5).toString();
         int roomno = cmbRoomNo.getSelectedIndex() + 1;
         
         new Receipt(start, end, name, ic, contact, email, roomno).setVisible(true);
      }
   }//GEN-LAST:event_btnReceiptActionPerformed

   private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
      DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
      String input = txtSearch.getText().trim().toLowerCase();
      TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
      jTable1.setRowSorter(tr);
      tr.setRowFilter(RowFilter.regexFilter(input));
   }//GEN-LAST:event_txtSearchKeyReleased
   
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
         java.util.logging.Logger.getLogger(History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new History().setVisible(true);
         }
      });
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton btnDelete;
   private javax.swing.JButton btnEdit;
   private javax.swing.JButton btnHistory;
   private javax.swing.JButton btnReceipt;
   private javax.swing.JButton btnRefresh;
   private javax.swing.JComboBox<String> cmbRoomNo;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel10;
   private javax.swing.JLabel jLabel11;
   private javax.swing.JLabel jLabel12;
   private javax.swing.JLabel jLabel13;
   private javax.swing.JLabel jLabel14;
   private javax.swing.JLabel jLabel15;
   private javax.swing.JLabel jLabel16;
   private javax.swing.JLabel jLabel17;
   private javax.swing.JLabel jLabel18;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JLabel jLabel5;
   private javax.swing.JLabel jLabel6;
   private javax.swing.JLabel jLabel7;
   private javax.swing.JLabel jLabel8;
   private javax.swing.JLabel jLabel9;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JTable jTable1;
   private javax.swing.JTextField txtSearch;
   // End of variables declaration//GEN-END:variables
}
