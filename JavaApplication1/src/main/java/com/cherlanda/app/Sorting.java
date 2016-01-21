/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cherlanda.app;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;
import javax.swing.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jdesktop.layout.GroupLayout;
import org.jdesktop.layout.LayoutStyle;


/**
 *
 * @author user
 */
public class Sorting extends javax.swing.JFrame {
    private String[] dataColumnNames = {
        "Cashpoint ID",
        "Lokasi",
        "Sislok",
        "Forecast Withd",
        "Forecast Acc"
    };
    private String[] sortedDataColumnNames = {
        "Pagi",
        "Siang",
        "Sore"
    };
    private String filename = null;
    
    /**
     * Creates new form Sorting
     */
    DefaultTableModel dataModel;
    DefaultTableModel sortedDataModel;
    
    public Sorting() {
        initComponents();
        dataModel = new DefaultTableModel(dataColumnNames, 0);
        sortedDataModel = new DefaultTableModel(sortedDataColumnNames, 0);
        jTable1.setModel(dataModel);
        jTable2.setModel(sortedDataModel);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    // Generated using JFormDesigner Evaluation license - Willy Willy
    private void initComponents() {
      jPanel1 = new JPanel();
      jLabel1 = new JLabel();
      jTextField1 = new JTextField();
      jButton6 = new JButton();
      jButton7 = new JButton();
      jPanel2 = new JPanel();
      jScrollPane1 = new JScrollPane();
      jTable1 = new JTable();
      jLabel2 = new JLabel();
      jButton3 = new JButton();
      jPanel5 = new JPanel();
      jLabel3 = new JLabel();
      jScrollPane2 = new JScrollPane();
      jTable2 = new JTable();
      jButton4 = new JButton();
      jButton5 = new JButton();

      //======== this ========
      setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      Container contentPane = getContentPane();

      //======== jPanel1 ========
      {

        // JFormDesigner evaluation mark
        jPanel1.setBorder(new javax.swing.border.CompoundBorder(
          new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
            "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
            javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
            java.awt.Color.red), jPanel1.getBorder())); jPanel1.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


        //---- jLabel1 ----
        jLabel1.setText("Upload:");

        //---- jButton6 ----
        jButton6.setText("SEARCH");
        jButton6.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            jButton6ActionPerformed(e);
          }
        });

        //---- jButton7 ----
        jButton7.setText("UPLOAD");
        jButton7.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            jButton7ActionPerformed(e);
          }
        });

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
          jPanel1Layout.createParallelGroup()
            .add(jPanel1Layout.createSequentialGroup()
              .addContainerGap()
              .add(jPanel1Layout.createParallelGroup()
                .add(jLabel1)
                .add(jPanel1Layout.createSequentialGroup()
                  .add(jTextField1, GroupLayout.PREFERRED_SIZE, 244, GroupLayout.PREFERRED_SIZE)
                  .add(18, 18, 18)
                  .add(jButton6)
                  .add(18, 18, 18)
                  .add(jButton7)))
              .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
          jPanel1Layout.createParallelGroup()
            .add(jPanel1Layout.createSequentialGroup()
              .add(jLabel1)
              .addPreferredGap(LayoutStyle.RELATED)
              .add(jPanel1Layout.createParallelGroup(GroupLayout.BASELINE)
                .add(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .add(jButton6)
                .add(jButton7))
              .add(0, 11, Short.MAX_VALUE))
        );
      }

      //======== jPanel2 ========
      {

        //======== jScrollPane1 ========
        {
          jScrollPane1.setViewportView(jTable1);
        }

        //---- jLabel2 ----
        jLabel2.setText("Data");

        //---- jButton3 ----
        jButton3.setText("BACK TO MAIN MENU");
        jButton3.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            jButton3ActionPerformed(e);
          }
        });

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
          jPanel2Layout.createParallelGroup()
            .add(jPanel2Layout.createSequentialGroup()
              .add(jPanel2Layout.createParallelGroup()
                .add(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .add(jLabel2))
              .add(0, 0, Short.MAX_VALUE))
            .add(jPanel2Layout.createSequentialGroup()
              .addContainerGap()
              .add(jButton3)
              .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
          jPanel2Layout.createParallelGroup()
            .add(jPanel2Layout.createSequentialGroup()
              .addContainerGap()
              .add(jLabel2)
              .add(12, 12, 12)
              .add(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
              .addPreferredGap(LayoutStyle.RELATED, 102, Short.MAX_VALUE)
              .add(jButton3)
              .addContainerGap())
        );
      }

      //======== jPanel5 ========
      {

        GroupLayout jPanel5Layout = new GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
          jPanel5Layout.createParallelGroup()
            .add(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
          jPanel5Layout.createParallelGroup()
            .add(0, 0, Short.MAX_VALUE)
        );
      }

      //---- jLabel3 ----
      jLabel3.setText("Sorted Data");

      //======== jScrollPane2 ========
      {
        jScrollPane2.setViewportView(jTable2);
      }

      //---- jButton4 ----
      jButton4.setText("SORT ORDER");
      jButton4.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          jButton4ActionPerformed(e);
        }
      });

      //---- jButton5 ----
      jButton5.setText("SAVE AS .CSV");
      jButton5.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          jButton5ActionPerformed(e);
        }
      });

      GroupLayout contentPaneLayout = new GroupLayout(contentPane);
      contentPane.setLayout(contentPaneLayout);
      contentPaneLayout.setHorizontalGroup(
        contentPaneLayout.createParallelGroup()
          .add(contentPaneLayout.createSequentialGroup()
            .addContainerGap()
            .add(contentPaneLayout.createParallelGroup()
              .add(contentPaneLayout.createSequentialGroup()
                .add(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(contentPaneLayout.createParallelGroup(GroupLayout.LEADING, false)
                  .add(contentPaneLayout.createSequentialGroup()
                    .add(contentPaneLayout.createParallelGroup()
                      .add(jLabel3)
                      .add(jScrollPane2, GroupLayout.PREFERRED_SIZE, 374, GroupLayout.PREFERRED_SIZE))
                    .add(18, 18, 18))
                  .add(contentPaneLayout.createSequentialGroup()
                    .add(21, 21, 21)
                    .add(jButton4)
                    .addPreferredGap(LayoutStyle.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jButton5)
                    .add(58, 58, 58))))
              .add(contentPaneLayout.createSequentialGroup()
                .add(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
              .add(jPanel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap())
      );
      contentPaneLayout.setVerticalGroup(
        contentPaneLayout.createParallelGroup()
          .add(contentPaneLayout.createSequentialGroup()
            .addContainerGap()
            .add(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
            .add(contentPaneLayout.createParallelGroup(GroupLayout.LEADING, false)
              .add(contentPaneLayout.createSequentialGroup()
                .add(18, 18, 18)
                .add(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.UNRELATED))
              .add(contentPaneLayout.createSequentialGroup()
                .add(27, 27, 27)
                .add(jLabel3)
                .addPreferredGap(LayoutStyle.UNRELATED)
                .add(jScrollPane2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(contentPaneLayout.createParallelGroup(GroupLayout.BASELINE)
                  .add(jButton4)
                  .add(jButton5))
                .add(37, 37, 37)))
            .add(jPanel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
      );
      pack();
      setLocationRelativeTo(getOwner());
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
        MainMenu mm2=new MainMenu();  
        mm2.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        JFileChooser chooser = new JFileChooser() {

            @Override
            public void approveSelection() {
                File file = getSelectedFile();
                if (file.exists() && getDialogType() == SAVE_DIALOG) {
                    int result = JOptionPane.showConfirmDialog(this, "Are you sure want to overwrite " + file.getName() + "?", "Confirmation", JOptionPane.YES_NO_OPTION);
                    switch (result) {
                        case JOptionPane.YES_OPTION:
                            super.approveSelection();
                            return;
                        case JOptionPane.CLOSED_OPTION:
                        case JOptionPane.NO_OPTION:
                            return;
                    }
                }
                super.approveSelection();
            }
            
        };
        chooser.setFileFilter(new FileNameExtensionFilter("Csv files", "csv"));
        if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            toCSV(chooser.getSelectedFile());
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        //Ambil File edari Dir
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(new FileNameExtensionFilter("Excel files", "xls", "xlsx"));
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            File f = chooser.getSelectedFile();
            //Masukin file path ke jtextfield1
            filename = f.getAbsolutePath();
            jTextField1.setText(filename);
            //baca excel ke jtable1
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    public XSSFWorkbook readExcelFile(String filename) throws IOException {
        FileInputStream fis = new FileInputStream(filename);
        try {
            return new XSSFWorkbook(fis);
        } finally {
            fis.close();
        }
    }
    
    public void toCSV(File file){
        try {
            FileWriter writer = new FileWriter(file, false);

            writer.append(String.join(",", sortedDataColumnNames)).append("\n");
            for (Vector<String> row : (Vector<Vector<String>>)sortedDataModel.getDataVector()){
                writer.append(String.join(",", row).replace("null", ""));
                writer.append("\n");
            }

            writer.flush();
            writer.close();
            
            JOptionPane.showMessageDialog(this, "File saved!");

        } catch(IOException e) {
            e.printStackTrace();
        }
    }
    
    private int decideTree(Vector<String> data) {
        String lokasi = data.get(1).toLowerCase();
        double sisaLokasi = Double.parseDouble(data.get(2));
        double tarikan = Double.parseDouble(data.get(3));
        double accuracy = Double.parseDouble(data.get(4));
        
        if (lokasi.equals("dalam kota")) {
            if (sisaLokasi > 30) {
                if (tarikan <= 30) {
                    if (accuracy < 0) {
                        return 1;
                    }
                    return 2;
                } else if (tarikan <= 60) {
                    if (accuracy > 10) {
                        return 2;
                    } else if (accuracy >= 0) {
                        return 1;
                    }
                }
            }
        }
        return 0;
    }

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {
            Workbook wb = this.readExcelFile(filename);
            if (wb.getNumberOfSheets() > 0) {
                Sheet sheet = wb.getSheetAt(0);
                dataModel.setRowCount(0);
                for (Row row : sheet) {
                    if (row.getRowNum() == 0) continue;
                    String[] newRow = new String[5];
                    newRow[0] = row.getCell(0).toString();
                    newRow[1] = row.getCell(1).toString();
                    newRow[2] = row.getCell(2).toString();
                    newRow[3] = row.getCell(3).toString();
                    newRow[4] = row.getCell(4).toString();
                    dataModel.addRow(newRow);
                }
            }
            wb.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        for (int i = 0; i < dataModel.getRowCount(); i++) {
            sortedDataModel.setRowCount(i + 1);
            sortedDataModel.setValueAt(dataModel.getValueAt(i, 0), i, decideTree((Vector) dataModel.getDataVector().get(i)));
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Willy Willy
    private JPanel jPanel1;
    private JLabel jLabel1;
    private JTextField jTextField1;
    private JButton jButton6;
    private JButton jButton7;
    private JPanel jPanel2;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
    private JLabel jLabel2;
    private JButton jButton3;
    private JPanel jPanel5;
    private JLabel jLabel3;
    private JScrollPane jScrollPane2;
    private JTable jTable2;
    private JButton jButton4;
    private JButton jButton5;
    // End of variables declaration//GEN-END:variables
}