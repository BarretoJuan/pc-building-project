/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Proyecto;
import java.io.*;

import javax.swing.JOptionPane;

/**
 *
 * @author juan2
 */
public class VentanaFinal extends javax.swing.JFrame {
int nFactura=1;
    /**
     * Creates new form VentanaFinal
     */
    public VentanaFinal() {
        this.setLocationRelativeTo(null);
        initComponents();
        
        boolean exito = false;
        //se crea un archivo factura y se escribe su contenido
        do{
         try {
   File factura = new File("src/Facturas/Factura "+nFactura+".txt");

      if (factura.createNewFile()) {
        System.out.println("Factura Creada: " + factura.getName());
            try {
      FileWriter escritor = new FileWriter("src/Facturas/Factura "+nFactura+".txt");
      
      if(Variables.montaje==true ){
      escritor.write("*****************************************************************************************************************************************************************************************"
                     +"\nNUMERO DE FACTURA: "+nFactura
                     +"\nFECHA: "+Fecha.getFecha()
                     +"\n*****************************************************************************************************************************************************************************************"
                     +"\nNombre del cliente: "+Variables.nombreCliente+" "+Variables.apellidoCliente
                     +"\nIdentificación del cliente: "+Variables.tipoCedula+Variables.cedulaCliente
                     +"\nCorreo electrónico del cliente: "+Variables.correoCliente
                     +"\nDirecciónCliente: "+Variables.direccionCliente
                     +"\n\n*****************************************************************************************************************************************************************************************"
                     +"\nDATOS DE LA COMPRA"
                     + "\n*****************************************************************************************************************************************************************************************"
                     + "\nCPU: "+Variables.nombreCpu+" - PRECIO: "+Variables.precioCpu+"$"
                     + "\nGPU: "+Variables.nombreGpu+" - PRECIO: "+Variables.precioGpu+"$"
                     + "\nPSU: "+Variables.nombrePsu+" - PRECIO: "+Variables.precioPsu+"$"
                     + "\nRAM: "+Variables.nombreRam+" - PRECIO: "+Variables.precioRam+"$"
                     + "\nCASE: "+Variables.nombreCase+" - PRECIO: "+Variables.precioCase+"$"
                     + "\nMOTHERBOARD: "+Variables.nombreMother+" - PRECIO: "+Variables.precioMother+"$"
                     + "\nDISCO: "+Variables.nombreDisco+" - PRECIO: "+Variables.precioDisco+"$"
                     + "\nServicio de Montaje: Sí - PRECIO: 100$" 
                     + "\n Precio Total: "+Variables.precioConMontaje 
                     + "\n\n *****************************************************************************************************************************************************************************************"
                     + "\nTodos nuestros precios incluyen los impuestos establecidos por la ley"
                     +"\n*****************************************************************************************************************************************************************************************");
      }
      else {
       escritor.write("*****************************************************************************************************************************************************************************************"
                     +"\nNUMERO DE FACTURA: "+nFactura
                     +"\nFECHA: "+Fecha.getFecha()
                     +"\n*****************************************************************************************************************************************************************************************"
                     +"\nNombre del cliente: "+Variables.nombreCliente+" "+Variables.apellidoCliente
                     +"\nIdentificación del cliente: "+Variables.tipoCedula+Variables.cedulaCliente
                     +"\nCorreo electrónico del cliente: "+Variables.correoCliente
                     +"\nDirecciónCliente: "+Variables.direccionCliente
                     +"\n\n*****************************************************************************************************************************************************************************************"
                     +"\nDATOS DE LA COMPRA"
                     + "\n*****************************************************************************************************************************************************************************************"
                     + "\nCPU: "+Variables.nombreCpu+" - PRECIO: "+Variables.precioCpu+"$"
                     + "\nGPU: "+Variables.nombreGpu+" - PRECIO: "+Variables.precioGpu+"$"
                     + "\nPSU: "+Variables.nombrePsu+" - PRECIO: "+Variables.precioPsu+"$"
                     + "\nRAM: "+Variables.nombreRam+" - PRECIO: "+Variables.precioRam+"$"
                     + "\nCASE: "+Variables.nombreCase+" - PRECIO: "+Variables.precioCase+"$"
                     + "\nMOTHERBOARD: "+Variables.nombreMother+" - PRECIO: "+Variables.precioMother+"$"
                     + "\nDISCO: "+Variables.nombreDisco+" - PRECIO: "+Variables.precioDisco+"$"
                     + "\nServicio de Montaje: No - PRECIO: 0$" 
                     + "\nPrecio Total: "+Variables.precioTotal
                     + "\n\n*****************************************************************************************************************************************************************************************"
                     + "\nTodos nuestros precios incluyen los impuestos establecidos por la ley"
                     +"\n*****************************************************************************************************************************************************************************************");
      }
      escritor.close();
      System.out.println("Escritura satisfactoria");
    } catch (IOException e) {
      System.out.println("Error de escritura");
      e.printStackTrace();
    }
        exito=true;
        
      } else {
        System.out.println("Esta factura ya existe");
        nFactura++;
        exito=false;
      } 
    }
         catch (IOException e) {
      System.out.println("Error al crear el archivo");
      exito=false;
    } 
        } while(exito == false);
        
        RSScaleLabel.setScaleLabel(jLabel1, "src/Resources/check.png");
    }


    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(32, 60, 90));

        jLabel1.setText("jLabel1");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("<html>¡Su compra fue registrada exitosamente!"+"\nSu factura fue guardada en el directorio: src/Facturas/PRUEBA/Factura.txt de la carpeta del proyecto");

        jButton1.setText("Abrir factura");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Registrar otra compra");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Cerrar Programa...");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(168, 168, 168)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(93, 93, 93)
                                        .addComponent(jButton2))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(100, 100, 100)
                                        .addComponent(jButton3)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 27, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(44, 44, 44)
                .addComponent(jButton3)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
        JOptionPane.showMessageDialog(null, "Archivo guardado en el directorio src/Facturas/PRUEBA/Factura "+nFactura+".txt");
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.dispose(); //boton para volver al inicio y registrar otra venta
gui guii = new gui();
guii.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
this.dispose();   //cierre y fin del programa
JOptionPane.showMessageDialog(null,"Muchas gracias por comprar con nosotros, que tenga un buen día");
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaFinal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
