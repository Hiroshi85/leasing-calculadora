/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.grupo1.leasing.presentacion;

import com.grupo1.leasing.calculos.Formulas;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hiros
 */
public class FrmCalculadora extends javax.swing.JFrame {
    
    DefaultTableModel modelo = new DefaultTableModel(){
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
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Tasas "+cboPeriodo.getSelectedItem().toString()+"es", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 16)));
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
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtBien = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtN = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
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
        jLabel3.setText("Valor Residual:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("%");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText("%");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setText("%");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtInteres, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(41, 41, 41)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtResidual, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtInteres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addComponent(txtResidual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(21, Short.MAX_VALUE))
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

        btnCalcular.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTable1.setModel(this.modelo);
        jTable1.setRowHeight(30);
        jScrollPane1.setViewportView(jTable1);

        cboMoneda.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cboMoneda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soles", "Dólares", "Euros" }));

        lblCuota.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        lblAhorroFinal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        lblValorPresente.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel10.setText("Valor Cuota:");

        txtCuota.setEditable(false);
        txtCuota.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Modalidad\n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 16))); // NOI18N

        buttonGroup1.add(rbCompra);
        rbCompra.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        rbCompra.setSelected(true);
        rbCompra.setText("Con Opcion de Compra");
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(rbCompra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbCuota)
                .addContainerGap(7, Short.MAX_VALUE))
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
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtBien, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(14, 14, 14)
                                        .addComponent(cboMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCuota, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(9, 9, 9)))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtN, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cboPeriodo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 849, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblValorPresente)
                                    .addComponent(lblCuota))
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblValorCompra)
                                    .addComponent(lblAhorroFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel12)
                            .addComponent(cboPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCuota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(txtN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16)))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCuota)
                    .addComponent(lblValorCompra))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValorPresente)
                    .addComponent(lblAhorroFinal))
                .addGap(18, 89, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        if(validarCalcular()){
            double bien = Double.parseDouble(txtBien.getText());
        double cuota;
        if(txtCuota.getText().isEmpty())
            cuota= 0.0d;
        else{
            cuota = Double.parseDouble(txtCuota.getText());
        }
        int n = Integer.parseInt(txtN.getText());
        double tInteres;
        if(txtInteres.getText().isEmpty())
            tInteres = 0.0d;
        else{
            tInteres = Double.parseDouble(txtInteres.getText())/100;
        }
        double tDescuento = Double.parseDouble(txtDescuento.getText())/100;
        double tResidual;
        if(txtResidual.getText().isEmpty()){
            tResidual = 0.0d;
        }else{
            tResidual = Double.parseDouble(txtResidual.getText())/100;
        }
        
        boolean opcionCompra = rbCompra.isSelected();
        
        Formulas formula = new Formulas(tInteres, bien, cuota, n, tResidual, tDescuento, opcionCompra);
        
        //Financiero -> con opcion de compra
        if(rbCompra.isSelected()){
            this.mostrarFinanciero(formula);
            lblValorCompra.setText("Valor de Compra: "+String.format(Locale.UK, "%,.2f", formula.getValorDeCompra())+" "+cboMoneda.getSelectedItem().toString());
        }else{
            this.mostrarOperativo(formula);
            
        }
        
        lblCuota.setText("Cuota: "+String.format(Locale.UK, "%,.2f",formula.getCuota())+" "+cboMoneda.getSelectedItem().toString());
        lblValorPresente.setText("Valor Presente: "+String.format(Locale.UK, "%,.2f", formula.getValorPresente())+" "+cboMoneda.getSelectedItem().toString());
        lblAhorroFinal.setText("Ahorro por Leasing: "+String.format(Locale.UK, "%,.2f", formula.getAhorroFinal())+" "+cboMoneda.getSelectedItem().toString());
        }else{
            JOptionPane.showMessageDialog(null, "Revise que las entradas no esten vacias", "Alerta", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void rbCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCompraActionPerformed
        if(rbCompra.isSelected()){
            txtCuota.setText("");
            txtCuota.setEditable(false);
            txtInteres.setEditable(true);
            txtResidual.setEditable(true);
        }
    }//GEN-LAST:event_rbCompraActionPerformed

    private void rbCuotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCuotaActionPerformed
       if(rbCuota.isSelected()){
           txtInteres.setText("");
           txtInteres.setEditable(false);
           txtResidual.setText("");
           txtResidual.setEditable(false);
           txtCuota.setEditable(true);
       }
    }//GEN-LAST:event_rbCuotaActionPerformed

    private void cboPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboPeriodoActionPerformed
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Tasas "+cboPeriodo.getSelectedItem().toString()+"es", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 16)));
        
    }//GEN-LAST:event_cboPeriodoActionPerformed
    
    private boolean validarCalcular(){
        boolean opcionCompra = rbCompra.isSelected();
        if(txtBien.getText().isEmpty() || txtDescuento.getText().isEmpty() || txtN.getText().isEmpty()){
            return false;
        }
        if(opcionCompra){
            if(txtInteres.getText().isEmpty() || txtResidual.getText().isEmpty()){
                return false;
            }
        }else{
            if(txtCuota.getText().isEmpty()){
                return false;
            }
        }
        return true;
    }
    
    private void mostrarFinanciero(Formulas f){
        Object datos[][] = new Object[f.getN()+1][5];
        String titulos[] = {"PERIODO","CUOTA","INTERES","AMORTIZACION","SALDO"};
        datos[0][0] = "0";
        datos[0][1] = "";
        datos[0][2] = "";
        datos[0][3] = "";
        datos[0][4] = String.format(Locale.UK, "%,.2f", f.getValorBien());
        for(int i=1;i<=f.getN();i++){
            double fila[] = f.getTablaInteres_Amort_Saldo()[i-1];
            datos[i][0] = i;
            if(i!=f.getN())
                datos[i][1] = String.format(Locale.UK, "%,.2f", f.getCuota());
            else
                datos[i][1] = String.format(Locale.UK, "%,.2f", f.getCuotaFinal());
            datos[i][2] = String.format(Locale.UK, "%,.2f", fila[0]);
            datos[i][3] = String.format(Locale.UK, "%,.2f", fila[1]);
            datos[i][4] = String.format(Locale.UK, "%,.2f", fila[2]);
        }
        modelo.setDataVector(datos, titulos);
    }
    
    private void mostrarOperativo(Formulas f){
        Object datos[][] = new Object[f.getN()][4];
        String titulos[] = {"PERIODO","CUOTA","ESCUDO FISCAL","CUOTA TOTAL ANUAL"};
        for(int i=0;i<f.getN();i++){
            datos[i][0] = i+1;
            datos[i][1] = String.format(Locale.UK, "%,.2f", f.getCuota());
            datos[i][2] = String.format(Locale.UK, "%,.2f", f.getEscudoFiscalXAño());
            double flujoNeto = f.getCuota()-f.getEscudoFiscalXAño();
            datos[i][3] = String.format(Locale.UK, "%,.2f", flujoNeto);
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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboMoneda;
    private javax.swing.JComboBox<String> cboPeriodo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAhorroFinal;
    private javax.swing.JLabel lblCuota;
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
