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
public class Pantalla_EmpleadoModerador extends javax.swing.JFrame {

    /**
     * Creates new form Pantalla_EmpleadoModerador
     */
    public Pantalla_EmpleadoModerador() {
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
        btn_regresar = new javax.swing.JButton();
        txt_title = new javax.swing.JLabel();
        btn_ingresarem = new javax.swing.JButton();
        btn_ingresarclientes = new javax.swing.JButton();
        btn_mostrar_empleados = new javax.swing.JButton();
        btn_mostrar_clientes = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_cliente = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_empleados = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_regresar.setBackground(new java.awt.Color(255, 51, 51));
        btn_regresar.setForeground(new java.awt.Color(0, 0, 0));
        btn_regresar.setText("REGRESAR");
        jPanel1.add(btn_regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 470, 119, -1));

        txt_title.setForeground(new java.awt.Color(0, 0, 0));
        txt_title.setText("EMPLEADO  MODERADOR");
        jPanel1.add(txt_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        btn_ingresarem.setBackground(new java.awt.Color(102, 102, 102));
        btn_ingresarem.setForeground(new java.awt.Color(0, 0, 0));
        btn_ingresarem.setText("INGRESAR  EMPLEADOS");
        jPanel1.add(btn_ingresarem, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 54, -1, -1));

        btn_ingresarclientes.setBackground(new java.awt.Color(102, 102, 102));
        btn_ingresarclientes.setForeground(new java.awt.Color(0, 0, 0));
        btn_ingresarclientes.setText("INGRESAR CLIENTES");
        jPanel1.add(btn_ingresarclientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 157, -1));

        btn_mostrar_empleados.setBackground(new java.awt.Color(102, 102, 102));
        btn_mostrar_empleados.setForeground(new java.awt.Color(0, 0, 0));
        btn_mostrar_empleados.setText("MOSTRAR  EMPLEADOS");
        jPanel1.add(btn_mostrar_empleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 54, -1, -1));

        btn_mostrar_clientes.setText("MOSTRAR  CLIENTES");
        jPanel1.add(btn_mostrar_clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 157, -1));

        tabla_cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No", "ID_Cliente", "ID", "Nombre ", "Apellido"
            }
        ));
        jScrollPane1.setViewportView(tabla_cliente);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 740, 140));

        tabla_empleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No", "Identi", "ID", "Nombre", "Apellido"
            }
        ));
        jScrollPane2.setViewportView(tabla_empleados);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 94, 740, 140));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JButton getBtn_ingresarclientes() {
        return btn_ingresarclientes;
    }

    public void setBtn_ingresarclientes(JButton btn_ingresarclientes) {
        this.btn_ingresarclientes = btn_ingresarclientes;
    }

    public JButton getBtn_ingresarem() {
        return btn_ingresarem;
    }

    public void setBtn_ingresarem(JButton btn_ingresarem) {
        this.btn_ingresarem = btn_ingresarem;
    }

    public JButton getBtn_regresar() {
        return btn_regresar;
    }

    public void setBtn_regresar(JButton btn_regresar) {
        this.btn_regresar = btn_regresar;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }


    public JLabel getTxt_title() {
        return txt_title;
    }

    public void setTxt_title(JLabel txt_title) {
        this.txt_title = txt_title;
    }

    public JButton getBtn_mostrar_clientes() {
        return btn_mostrar_clientes;
    }

    public void setBtn_mostrar_clientes(JButton btn_mostrar_clientes) {
        this.btn_mostrar_clientes = btn_mostrar_clientes;
    }

    public JButton getBtn_mostrar_empleados() {
        return btn_mostrar_empleados;
    }

    public void setBtn_mostrar_empleados(JButton btn_mostrar_empleados) {
        this.btn_mostrar_empleados = btn_mostrar_empleados;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public JTable getTabla_cliente() {
        return tabla_cliente;
    }

    public void setTabla_cliente(JTable tabla_cliente) {
        this.tabla_cliente = tabla_cliente;
    }

    public JTable getTabla_empleados() {
        return tabla_empleados;
    }

    public void setTabla_empleados(JTable tabla_empleados) {
        this.tabla_empleados = tabla_empleados;
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
            java.util.logging.Logger.getLogger(Pantalla_EmpleadoModerador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla_EmpleadoModerador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla_EmpleadoModerador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla_EmpleadoModerador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla_EmpleadoModerador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ingresarclientes;
    private javax.swing.JButton btn_ingresarem;
    private javax.swing.JButton btn_mostrar_clientes;
    private javax.swing.JButton btn_mostrar_empleados;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla_cliente;
    private javax.swing.JTable tabla_empleados;
    private javax.swing.JLabel txt_title;
    // End of variables declaration//GEN-END:variables
}