/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author USER A
 */
public class Pantalla_EmpleadoCaja extends javax.swing.JFrame {

    /**
     * Creates new form Pantalla
     */
    public Pantalla_EmpleadoCaja() {
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

        jEImagePanel1 = new LIB.JEImagePanel();
        emle_title = new javax.swing.JLabel();
        btn_regresar = new javax.swing.JButton();
        btn_ver_pedidos = new javax.swing.JButton();
        btn_irmoderador = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_pedidos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jEImagePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/61HhTXFUEFL._AC_SL1437_.jpg"))); // NOI18N

        emle_title.setBackground(new java.awt.Color(0, 0, 0));
        emle_title.setForeground(new java.awt.Color(0, 0, 0));
        emle_title.setText("EMPLEADO");

        btn_regresar.setBackground(new java.awt.Color(102, 102, 102));
        btn_regresar.setForeground(new java.awt.Color(0, 0, 0));
        btn_regresar.setText("REGRESAR");

        btn_ver_pedidos.setBackground(new java.awt.Color(153, 153, 153));
        btn_ver_pedidos.setForeground(new java.awt.Color(0, 0, 0));
        btn_ver_pedidos.setText("VER PEDIDOS");

        btn_irmoderador.setBackground(new java.awt.Color(153, 153, 153));
        btn_irmoderador.setForeground(new java.awt.Color(0, 0, 0));
        btn_irmoderador.setText("IR A MODERADOR");

        tabla_pedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No", "Id Pedido", "Id Cliente", "Descripcion", "Monto Final"
            }
        ));
        jScrollPane1.setViewportView(tabla_pedidos);

        javax.swing.GroupLayout jEImagePanel1Layout = new javax.swing.GroupLayout(jEImagePanel1);
        jEImagePanel1.setLayout(jEImagePanel1Layout);
        jEImagePanel1Layout.setHorizontalGroup(
            jEImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jEImagePanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jEImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jEImagePanel1Layout.createSequentialGroup()
                        .addComponent(emle_title)
                        .addGap(210, 210, 210))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jEImagePanel1Layout.createSequentialGroup()
                        .addComponent(btn_regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(195, 195, 195))))
            .addGroup(jEImagePanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jEImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jEImagePanel1Layout.createSequentialGroup()
                        .addComponent(btn_ver_pedidos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_irmoderador)
                        .addGap(46, 46, 46))
                    .addGroup(jEImagePanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(62, Short.MAX_VALUE))))
        );
        jEImagePanel1Layout.setVerticalGroup(
            jEImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEImagePanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(emle_title, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jEImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jEImagePanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btn_ver_pedidos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addComponent(btn_regresar)
                        .addGap(14, 14, 14))
                    .addGroup(jEImagePanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btn_irmoderador)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEImagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEImagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JButton getBtn_irmoderador() {
        return btn_irmoderador;
    }

    public void setBtn_irmoderador(JButton btn_irmoderador) {
        this.btn_irmoderador = btn_irmoderador;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTable getTabla_pedidos() {
        return tabla_pedidos;
    }

    public void setTabla_pedidos(JTable tabla_pedidos) {
        this.tabla_pedidos = tabla_pedidos;
    }



    public JButton getBtn_ver_pedidos() {
        return btn_ver_pedidos;
    }

    public void setBtn_ver_pedidos(JButton btn_ver_pedidos) {
        this.btn_ver_pedidos = btn_ver_pedidos;
    }

    public JLabel getEmle_title() {
        return emle_title;
    }

    public void setEmle_title(JLabel emle_title) {
        this.emle_title = emle_title;
    }


    public JButton getBtn_regresar() {
        return btn_regresar;
    }

    public void setBtn_regresar(JButton btn_regresar) {
        this.btn_regresar = btn_regresar;
    }


 
    
    
    
    
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
            java.util.logging.Logger.getLogger(Pantalla_EmpleadoCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla_EmpleadoCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla_EmpleadoCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla_EmpleadoCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla_EmpleadoCaja().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_irmoderador;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JButton btn_ver_pedidos;
    private javax.swing.JLabel emle_title;
    private LIB.JEImagePanel jEImagePanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_pedidos;
    // End of variables declaration//GEN-END:variables
}
