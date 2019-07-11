/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.analisis2.clases.vista;

import com.analisis2.programa.controlador.Activo;
import com.analisis2.programa.controlador.ClasificadorCuenta;
import com.analisis2.programa.controlador.ProxyTable;
import com.analisis2.programa.controlador.RBalance;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author crist
 */
public class Balance extends javax.swing.JFrame {

    /**
     * Creates new form Balance
     */
    ClasificadorCuenta cuentas; 
    ProxyTable tabla;
    RBalance balance;
    public Balance(ClasificadorCuenta clasificador) {
        initComponents();
        balance = new RBalance(clasificador);
        tabla = new ProxyTable();
        cuentas = clasificador; 
        this.llenarColumnas();

    }
    private void llenarColumnas()
    {
        List listaNombres = new ArrayList();
        listaNombres.add("Nombre");
        listaNombres.add("Activo");
        listaNombres.add("Pasivo");
        tabla.nombresDeColumnas(listaNombres);
        if (cuentas.getCuentasActivo() != null)
        {
            for (int i = 0; i < cuentas.getCuentasActivo().size(); i++) {
            List listac = new ArrayList(); 
            listac.add(cuentas.getCuentasActivo().get(i).getNombre());
            listac.add(cuentas.getCuentasActivo().get(i).getValor()); 
            listac.add("0");
            tabla.agregarFila(listac);
             }
        }
        if (cuentas.getCuentasPasivo() != null) 
        {
            for (int i = 0; i < cuentas.getCuentasPasivo().size(); i++) {
            List listac = new ArrayList(); 
            listac.add(cuentas.getCuentasPasivo().get(i).getNombre());
            listac.add("0");
            listac.add(cuentas.getCuentasPasivo().get(i).getValor()); 
 
            tabla.agregarFila(listac);
        }
        }
        
        List listac = new ArrayList(); 
        listac.add("Total");
        listac.add(cuentas.getValorActivo()); 
        listac.add(cuentas.getValorPasivo());
        List listan = new ArrayList(); 
//        listan.add("Capital");
//        listan.add(balance.calcularValores()); 
//        listan.add("0");
//        tabla.agregarFila(listan);
        tabla.agregarFila(listac);
        
        jTable1.setModel(tabla);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 240, 240));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Balance");

        jButton1.setText("Cuentas");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        Contabilidad c = new Contabilidad();
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
