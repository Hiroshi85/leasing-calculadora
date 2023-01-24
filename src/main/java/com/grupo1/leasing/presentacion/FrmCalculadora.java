/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.grupo1.leasing.presentacion;

import com.grupo1.leasing.calculos.Formulas;
import com.grupo1.leasing.helpers.Helper;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Locale;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author hiros
 */
public class FrmCalculadora extends javax.swing.JFrame {

    DefaultTableModel modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    /**
     * Creates new form FrmOperativo
     */
    public FrmCalculadora() {
        initComponents();
        lblMonedaCuota.setText(cboMoneda.getSelectedItem().toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtInteres = new javax.swing.JTextField();
        txtDescuento = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtResidual = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cboTasaOrigen = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtBien = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtN = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        cboMoneda = new javax.swing.JComboBox<>();
        lblCuota = new javax.swing.JLabel();
        lblAhorroFinal = new javax.swing.JLabel();
        lblValorPresente = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCuota = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        rbCompra = new javax.swing.JRadioButton();
        rbCuota = new javax.swing.JRadioButton();
        lblValorCompra = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cboPeriodo = new javax.swing.JComboBox<>();
        lblMonedaCuota = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        lblDesembolso = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblFormato = new javax.swing.JLabel();
        btnExport = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Leasing");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Tasas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 16))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("Interés: ");

        txtInteres.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        txtDescuento.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Descuento: ");

        txtResidual.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Opción de Compra:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("%");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText("%");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setText("%");

        cboTasaOrigen.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cboTasaOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Anual", "Semestral", "Cuatrimestral", "Trimestral", "Mensual" }));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel11.setText("Anual");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtInteres, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cboTasaOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtResidual, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addComponent(jLabel11))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtInteres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cboTasaOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3)
                    .addComponent(txtResidual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel11))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Leasing");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setText("Valor del Bien: ");

        txtBien.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setText("Número de Periodos:");

        txtN.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTable1.setModel(this.modelo);
        jTable1.setRowHeight(30);
        jScrollPane1.setViewportView(jTable1);

        cboMoneda.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cboMoneda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soles", "Dólares" }));
        cboMoneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboMonedaActionPerformed(evt);
            }
        });

        lblCuota.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        lblAhorroFinal.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N

        lblValorPresente.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel10.setText("Valor de Cuota:");

        txtCuota.setEditable(false);
        txtCuota.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Modalidad\n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 16))); // NOI18N

        buttonGroup1.add(rbCompra);
        rbCompra.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        rbCompra.setSelected(true);
        rbCompra.setText("Con Opción de Compra");
        rbCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCompraActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbCuota);
        rbCuota.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        rbCuota.setText("Renting");
        rbCuota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCuotaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbCompra)
                    .addComponent(rbCuota))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(rbCompra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbCuota)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        lblValorCompra.setFont(new java.awt.Font("Segoe UI", 2, 17)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel12.setText("Periodo: ");

        cboPeriodo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cboPeriodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Anual", "Semestral", "Cuatrimestral", "Trimestral", "Mensual" }));
        cboPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboPeriodoActionPerformed(evt);
            }
        });

        lblMonedaCuota.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblMonedaCuota.setText("-");

        btnCalcular.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        lblDesembolso.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N

        btnExport.setText("Exportar (.xls)");
        btnExport.setName(""); // NOI18N
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(353, 353, 353)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 849, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtBien, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtCuota)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addComponent(cboMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(lblMonedaCuota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGap(30, 30, 30)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cboPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtN, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(88, 88, 88)
                                        .addComponent(lblFormato))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDesembolso)
                                .addGap(35, 35, 35)
                                .addComponent(lblCuota)
                                .addGap(54, 54, 54)
                                .addComponent(lblValorCompra))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 844, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAhorroFinal)
                                .addGap(31, 31, 31)
                                .addComponent(lblValorPresente)))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel4)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel12)
                            .addComponent(cboPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCuota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(lblMonedaCuota)
                            .addComponent(jLabel9)
                            .addComponent(txtN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblFormato)
                        .addGap(2, 2, 2)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCuota)
                    .addComponent(lblValorCompra)
                    .addComponent(lblDesembolso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblValorPresente)
                            .addComponent(lblAhorroFinal)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        try {
            if (validarCalcular()) {
                double bien = Double.parseDouble(txtBien.getText());
                double cuota;
                String formato = getFormatoMoneda(cboMoneda.getSelectedIndex());
                lblFormato.setText("Valores en " + cboMoneda.getSelectedItem().toString().toLowerCase());
                if (txtCuota.getText().isEmpty()) {
                    cuota = 0.0d;
                } else {
                    cuota = Double.parseDouble(txtCuota.getText());
                }
                int n = Integer.parseInt(txtN.getText());
                double tInteres;
                if (txtInteres.getText().isEmpty()) {
                    tInteres = 0.0d;
                } else {
                    tInteres = Helper.convertirInteres(Double.parseDouble(txtInteres.getText()) / 100, n, cboPeriodo.getSelectedIndex(), cboTasaOrigen.getSelectedIndex());
                }
                double tDescuento = Double.parseDouble(txtDescuento.getText()) / 100;
                double tResidual;
                if (txtResidual.getText().isEmpty()) {
                    tResidual = 0.0d;
                } else {
                    tResidual = Double.parseDouble(txtResidual.getText()) / 100;
                }

                boolean opcionCompra = rbCompra.isSelected();

                Formulas formula = new Formulas(tInteres, bien, cuota, n, tResidual, tDescuento, opcionCompra);

                //Financiero -> con opcion de compra
                if (rbCompra.isSelected()) {
                    this.mostrarFinanciero(formula);
                    lblValorCompra.setVisible(true);
                    lblValorCompra.setText("Valor de Compra: " + formato + String.format(Locale.UK, "%,.2f", formula.getValorDeCompra()));
                } else {
                    this.mostrarOperativo(formula);
                    lblValorCompra.setText("");
                    lblValorCompra.setVisible(false);
                }

                lblDesembolso.setText("Desembolso total: " + formato + String.format(Locale.UK, "%,.2f", formula.getDesembolso()));
                lblCuota.setText("Cuota: " + formato + String.format(Locale.UK, "%,.2f", formula.getCuota()));
                lblValorPresente.setText("Valor Presente: " + formato + String.format(Locale.UK, "%,.2f", formula.getValorPresente()));
                lblAhorroFinal.setText("Ahorro por Leasing: " + formato + String.format(Locale.UK, "%,.2f", formula.getAhorroFinal()));
            } else {
                JOptionPane.showMessageDialog(null, "Revise que las entradas no esten vacias", "Alerta", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Algunos de los campos contiene un valor no válido, verifique e inténtelo nuevamente", "Alerta", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void rbCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCompraActionPerformed
        if (rbCompra.isSelected()) {
            txtCuota.setText("");
            txtCuota.setEditable(false);
            txtInteres.setEditable(true);
            txtResidual.setEditable(true);
            cboTasaOrigen.setEnabled(true);
        }
    }//GEN-LAST:event_rbCompraActionPerformed

    private void rbCuotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCuotaActionPerformed
        if (rbCuota.isSelected()) {
            txtInteres.setText("");
            txtInteres.setEditable(false);
            txtResidual.setText("");
            txtResidual.setEditable(false);
            txtCuota.setEditable(true);
            cboTasaOrigen.setSelectedIndex(0);
            cboTasaOrigen.setEnabled(false);
        }
    }//GEN-LAST:event_rbCuotaActionPerformed

    private void cboPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboPeriodoActionPerformed

    }//GEN-LAST:event_cboPeriodoActionPerformed

    private void cboMonedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMonedaActionPerformed
        lblMonedaCuota.setText(cboMoneda.getSelectedItem().toString());
    }//GEN-LAST:event_cboMonedaActionPerformed
    
    private void resultados(XSSFWorkbook wk, Sheet sheet){
        int rowCount = 3;
        int colCount = 1;
        
        
    } 
            
    private void table(XSSFWorkbook wk, Sheet sheet, String[] titulos, CellStyle headers) {

        for (int i = 2; i < 6; i++) {
            sheet.setColumnWidth(i, 5000);
        }
        //Formato de número
        //DataFormat format = wk.createDataFormat();
        //Estilos de celda
        CellStyle style1 = wk.createCellStyle();
        style1.setDataFormat(wk.createDataFormat().getFormat("#,##0.00"));
        //style1.setAlignment((short)1);
        
        int rowCount = 23;
        int colCount = 1;

        Row row0 = sheet.createRow(rowCount - 1);
        for (String titulo : titulos) {
            Cell cell0 = row0.createCell(colCount++);
            cell0.setCellValue(titulo);
            cell0.setCellStyle(headers);
        }
        colCount = 1;
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            Row row = sheet.createRow(rowCount++);
            for (int j = 0; j < jTable1.getColumnCount(); j++) {
                Cell cell = row.createCell(colCount++);
                String valor = jTable1.getValueAt(i, j).toString();
                if (!valor.equals("")) {
                    valor = valor.replaceAll(",", "");
                    valor = valor.replaceAll("\\(", "-");
                    valor = valor.replaceAll("\\)", "");
                    cell.setCellValue(Double.parseDouble(valor));
                } else {
                    cell.setCellValue(" ");
                }
                if (j != 0) {
                    cell.setCellStyle(style1);
                }
            }
            colCount = 1;
        }
    }

    private void fileChooser(XSSFWorkbook wk) {
        try {
            String current = System.getProperty("user.dir");
            JFileChooser jfc = new JFileChooser();
            jfc.setCurrentDirectory(new File(current));
            int returnVal = jfc.showSaveDialog(null);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = jfc.getSelectedFile();
                String path = file.getAbsolutePath();
                FileOutputStream output = new FileOutputStream(path);
                wk.write(output);
                output.close();
            }
        } catch (Exception e) {
        }
    }

    private void exportFinanciero(XSSFWorkbook wk, Sheet sheet) {
       //Información de resultados generales de leasing financiero
       
    }

    private void exportOperativo(XSSFWorkbook wk, Sheet sheet) {
       //Información de resultados generales de leasing operativo 
    }
    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
        XSSFWorkbook wk = new XSSFWorkbook();
        Sheet sheet = wk.createSheet("leasing-reporte");
        
         //Headers
        CellStyle headers = wk.createCellStyle();
        Font font = wk.createFont();
        font.setBoldweight((short)1);
        font.setFontHeightInPoints((short) 12);
        //headers.setAlignment(HorizontalAlignment.CENTER);
        headers.setFont(font);
               
        String[] titulos;
        if (rbCompra.isSelected()){
            titulos = new String[] {"PERIODO", "CUOTA", "INTERÉS", "AMORTIZACIÓN", "SALDO"};
            exportFinanciero(wk, sheet);
        }else{
            titulos = new String[] {"PERIODO", "CUOTA", "ESCUDO FISCAL", "CUOTA TOTAL ANUAL"};
            exportOperativo(wk, sheet);
        }
               
        table(wk, sheet, titulos, headers);
        fileChooser(wk);
    }//GEN-LAST:event_btnExportActionPerformed

    private String getFormatoMoneda(int ixMoneda) {
        String formato = "";
        switch (ixMoneda) {
            case 0:
                formato = "S/ ";
                break;
            case 1:
                formato = "$ ";
                break;
        }
        return formato;
    }

    private boolean validarCalcular() {
        boolean opcionCompra = rbCompra.isSelected();
        if (txtBien.getText().isEmpty() || txtDescuento.getText().isEmpty() || txtN.getText().isEmpty()) {
            return false;
        }
        if (opcionCompra) {
            if (txtInteres.getText().isEmpty() || txtResidual.getText().isEmpty()) {
                return false;
            }
        } else {
            if (txtCuota.getText().isEmpty()) {
                return false;
            }
        }
        return true;
    }

    private void mostrarFinanciero(Formulas f) {
        Object datos[][] = new Object[f.getN() + 1][5];
        String titulos[] = {"PERIODO", "CUOTA", "INTERÉS", "AMORTIZACIÓN", "SALDO"};
        datos[0][0] = "0";
        datos[0][1] = "";
        datos[0][2] = "";
        datos[0][3] = "";
        datos[0][4] = String.format(Locale.UK, "%,.2f", f.getValorBien());
        for (int i = 1; i <= f.getN(); i++) {
            double fila[] = f.getTablaInteres_Amort_Saldo()[i - 1];
            datos[i][0] = i;
            if (i != f.getN()) {
                datos[i][1] = String.format(Locale.UK, "%,.2f", f.getCuota());
            } else {
                datos[i][1] = String.format(Locale.UK, "%,.2f", f.getCuotaFinal());
            }
            datos[i][2] = String.format(Locale.UK, "%,.2f", fila[0]);
            datos[i][3] = String.format(Locale.UK, "%,.2f", fila[1]);
            datos[i][4] = String.format(Locale.UK, "%,.2f", fila[2]);
        }
        modelo.setDataVector(datos, titulos);
    }

    private void mostrarOperativo(Formulas f) {
        Object datos[][] = new Object[f.getN()][4];
        String titulos[] = {"PERIODO", "CUOTA", "ESCUDO FISCAL", "CUOTA TOTAL ANUAL"};
        for (int i = 0; i < f.getN(); i++) {
            datos[i][0] = i + 1;
            datos[i][1] = String.format(Locale.UK, "%,.2f", f.getCuota());
            datos[i][2] = "(" + String.format(Locale.UK, "%,.2f", f.getEscudoFiscalXAño()) + ")";
            datos[i][3] = String.format(Locale.UK, "%,.2f", f.getFlujoNetoPeriodo());
        }
        modelo.setDataVector(datos, titulos);
    }
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(FrmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FrmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FrmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FrmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FrmCalculadora().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnExport;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboMoneda;
    private javax.swing.JComboBox<String> cboPeriodo;
    private javax.swing.JComboBox<String> cboTasaOrigen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAhorroFinal;
    private javax.swing.JLabel lblCuota;
    private javax.swing.JLabel lblDesembolso;
    private javax.swing.JLabel lblFormato;
    private javax.swing.JLabel lblMonedaCuota;
    private javax.swing.JLabel lblValorCompra;
    private javax.swing.JLabel lblValorPresente;
    private javax.swing.JRadioButton rbCompra;
    private javax.swing.JRadioButton rbCuota;
    private javax.swing.JTextField txtBien;
    private javax.swing.JTextField txtCuota;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtInteres;
    private javax.swing.JTextField txtN;
    private javax.swing.JTextField txtResidual;
    // End of variables declaration//GEN-END:variables
}
