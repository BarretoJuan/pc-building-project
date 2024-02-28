    package Proyecto;

import javax.swing.JOptionPane;
import java.awt.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author juan2
 */
public class Test extends javax.swing.JFrame {
 
  int resp1, resp2, resp3, resp4, resp5, resp6;
  int puntTest = resp1+resp2+resp3+resp4+resp5+resp6;

  

 
 
    public Test() {
          this.setLocationRelativeTo(null);
        Variables.setCero();
 
        initComponents();
          this.setLocationRelativeTo(null);
        RSScaleLabel.setScaleLabel(jLabel3, "src/Resources/build.png");
        
       
    
    }

    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        r1 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        r3 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        r4 = new javax.swing.JRadioButton();
        r5 = new javax.swing.JRadioButton();
        r6 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        r7 = new javax.swing.JRadioButton();
        r8 = new javax.swing.JRadioButton();
        r9 = new javax.swing.JRadioButton();
        r12 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        r10 = new javax.swing.JRadioButton();
        r11 = new javax.swing.JRadioButton();
        r13 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        r14 = new javax.swing.JRadioButton();
        r15 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        r16 = new javax.swing.JRadioButton();
        r17 = new javax.swing.JRadioButton();
        r18 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new Color(32, 60, 90));
        setResizable(false);
        setSize(new Dimension(700, 700));

        jPanel1.setBackground(new Color(32, 60, 90));

        jLabel1.setBackground(new Color(30, 63, 90));
        jLabel1.setFont(new Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html>Test para el montaje de su computador de acuerdo a sus necesidades: </html> ");
        jLabel1.setOpaque(true);

        jLabel3.setText("jLabelr32r132");
        jLabel3.setOpaque(true);

        jButton2.setText("Atrás");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jButton2)))
                .addContainerGap(260, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jScrollPane1.setBackground(new java.awt.Color(32, 60, 90));

        jPanel2.setBackground(new java.awt.Color(32, 60, 90));

        jLabel2.setBackground(new Color(255, 255, 255));
        jLabel2.setFont(new Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new Color(255, 255, 255));
        jLabel2.setText("¿Cuál de las siguientes opciones se acerca más al uso que le dará a su computador? ");

        r1.setBackground(new Color(102, 102, 0));
        buttonGroup1.add(r1);
        r1.setForeground(new java.awt.Color(255, 255, 255));
        r1.setText("<html> Uso Básico: <br> Ofimática, multimedia, navegación web</html>");
        r1.setOpaque(false);
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });

        r2.setBackground(new Color(102, 102, 0));
        buttonGroup1.add(r2);
        r2.setForeground(new java.awt.Color(255, 255, 255));
        r2.setText("<html> Uso Medio: <br>Programas especializados, trabajo profesional</html>");
        r2.setOpaque(false);
        r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2ActionPerformed(evt);
            }
        });

        r3.setBackground(new java.awt.Color(204, 153, 0));
        buttonGroup1.add(r3);
        r3.setForeground(new java.awt.Color(255, 255, 255));
        r3.setText("<html> Uso Intensivo: <br>Programas exigentes en recursos, <br> edición de video, gaming</html>");
        r3.setOpaque(false);
        r3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3ActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("¿Cuál de los siguientes presupuestos se ajusta más a sus necesidades? ");

        r4.setBackground(new java.awt.Color(102, 102, 0));
        buttonGroup2.add(r4);
        r4.setForeground(new java.awt.Color(255, 255, 255));
        r4.setText("<html> Bajo: <br> Menos de 1500$</html>");
        r4.setOpaque(false);
        r4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4ActionPerformed(evt);
            }
        });

        r5.setBackground(new java.awt.Color(102, 102, 0));
        buttonGroup2.add(r5);
        r5.setForeground(new java.awt.Color(255, 255, 255));
        r5.setText("<html> Medio: <br>Entre 1500 y 2500$</html>");
        r5.setOpaque(false);
        r5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5ActionPerformed(evt);
            }
        });

        r6.setBackground(new java.awt.Color(204, 153, 0));
        buttonGroup2.add(r6);
        r6.setForeground(new java.awt.Color(255, 255, 255));
        r6.setText("<html> Alto: <br>Más de 3000$ </html>");
        r6.setOpaque(false);
        r6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6ActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("¿Qué tan frecuentemente usa su PC?");

        r7.setBackground(new java.awt.Color(102, 102, 0));
        buttonGroup3.add(r7);
        r7.setForeground(new java.awt.Color(255, 255, 255));
        r7.setText("Ocasionalmente");
        r7.setOpaque(false);
        r7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7ActionPerformed(evt);
            }
        });

        r8.setBackground(new java.awt.Color(102, 102, 0));
        buttonGroup3.add(r8);
        r8.setForeground(new java.awt.Color(255, 255, 255));
        r8.setText("Varias veces a la semana");
        r8.setOpaque(false);
        r8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8ActionPerformed(evt);
            }
        });

        r9.setBackground(new java.awt.Color(204, 153, 0));
        buttonGroup3.add(r9);
        r9.setForeground(new java.awt.Color(255, 255, 255));
        r9.setText("Todos los días");
        r9.setOpaque(false);
        r9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9ActionPerformed(evt);
            }
        });

        r12.setBackground(new java.awt.Color(204, 153, 0));
        buttonGroup4.add(r12);
        r12.setForeground(new java.awt.Color(255, 255, 255));
        r12.setText("Todos los años");
        r12.setOpaque(false);
        r12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r12ActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("¿Qué tan frecuentemente compraría componentes nuevos para su PC?");

        r10.setBackground(new java.awt.Color(102, 102, 0));
        buttonGroup4.add(r10);
        r10.setForeground(new java.awt.Color(255, 255, 255));
        r10.setText("Nunca");
        r10.setOpaque(false);
        r10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r10ActionPerformed(evt);
            }
        });

        r11.setBackground(new java.awt.Color(102, 102, 0));
        buttonGroup4.add(r11);
        r11.setForeground(new java.awt.Color(255, 255, 255));
        r11.setText("Rara vez");
        r11.setOpaque(false);
        r11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r11ActionPerformed(evt);
            }
        });

        r13.setBackground(new java.awt.Color(102, 102, 0));
        buttonGroup5.add(r13);
        r13.setForeground(new java.awt.Color(255, 255, 255));
        r13.setText("Una o dos");
        r13.setOpaque(false);
        r13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r13ActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("¿Cuantas aplicaciones suele tener abiertas al mismo tiempo?");

        r14.setBackground(new java.awt.Color(102, 102, 0));
        buttonGroup5.add(r14);
        r14.setForeground(new java.awt.Color(255, 255, 255));
        r14.setText("Entre tres y cinco");
        r14.setOpaque(false);
        r14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r14ActionPerformed(evt);
            }
        });

        r15.setBackground(new java.awt.Color(204, 153, 0));
        buttonGroup5.add(r15);
        r15.setForeground(new java.awt.Color(255, 255, 255));
        r15.setText("Más de cinco");
        r15.setOpaque(false);
        r15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r15ActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("¿Cada cuanto tiempo cambia de computador?");

        r16.setBackground(new java.awt.Color(102, 102, 0));
        buttonGroup6.add(r16);
        r16.setForeground(new java.awt.Color(255, 255, 255));
        r16.setText("Cada dos años");
        r16.setOpaque(false);
        r16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r16ActionPerformed(evt);
            }
        });

        r17.setBackground(new java.awt.Color(102, 102, 0));
        buttonGroup6.add(r17);
        r17.setForeground(new java.awt.Color(255, 255, 255));
        r17.setText("Cada cinco años");
        r17.setOpaque(false);
        r17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r17ActionPerformed(evt);
            }
        });

        r18.setBackground(new java.awt.Color(204, 153, 0));
        buttonGroup6.add(r18);
        r18.setForeground(new java.awt.Color(255, 255, 255));
        r18.setText("Mis PC duran más de diez años");
        r18.setOpaque(false);
        r18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r18ActionPerformed(evt);
            }
        });

        jButton1.setText("Analizar Resultados");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(r4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139)
                        .addComponent(r5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(151, 151, 151)
                        .addComponent(r6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(r7)
                        .addGap(50, 50, 50)
                        .addComponent(r8)
                        .addGap(55, 55, 55)
                        .addComponent(r9))
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(r10)
                        .addGap(83, 83, 83)
                        .addComponent(r11)
                        .addGap(97, 97, 97)
                        .addComponent(r12))
                    .addComponent(jLabel7)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(r13)
                        .addGap(83, 83, 83)
                        .addComponent(r14)
                        .addGap(69, 69, 69)
                        .addComponent(r15))
                    .addComponent(jLabel8)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(r16)
                        .addGap(75, 75, 75)
                        .addComponent(r17)
                        .addGap(83, 83, 83)
                        .addComponent(r18))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(r1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(r2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(r3, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r10, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r11, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r12, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r13, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r14, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r15, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r16, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r17, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r18, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 853, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    this.dispose(); //boton para regresar a la ventana anterior
gui guii = new gui();
guii.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
resp1=1;      
    }//GEN-LAST:event_r1ActionPerformed

    private void r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2ActionPerformed
 resp1=2;      
    }//GEN-LAST:event_r2ActionPerformed

    private void r3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3ActionPerformed
   resp1=3;     
    }//GEN-LAST:event_r3ActionPerformed

    private void r4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4ActionPerformed
    resp2=1;      
    }//GEN-LAST:event_r4ActionPerformed

    private void r5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5ActionPerformed
     resp2=2;   
    }//GEN-LAST:event_r5ActionPerformed

    private void r6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6ActionPerformed
     resp2=3;    
    }//GEN-LAST:event_r6ActionPerformed

    private void r7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7ActionPerformed
       resp3=1;      
    }//GEN-LAST:event_r7ActionPerformed

    private void r8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8ActionPerformed
 resp3=2;        
    }//GEN-LAST:event_r8ActionPerformed

    private void r9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r9ActionPerformed
 resp3=3;      
    }//GEN-LAST:event_r9ActionPerformed

    private void r12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r12ActionPerformed
 resp4=3;       
    }//GEN-LAST:event_r12ActionPerformed

    private void r10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r10ActionPerformed
 resp4=1;      
    }//GEN-LAST:event_r10ActionPerformed

    private void r11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r11ActionPerformed
 resp4=2;      
    }//GEN-LAST:event_r11ActionPerformed

    private void r13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r13ActionPerformed
resp5=1;      
    }//GEN-LAST:event_r13ActionPerformed

    private void r14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r14ActionPerformed
 resp5=2;       
    }//GEN-LAST:event_r14ActionPerformed

    private void r15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r15ActionPerformed
 resp5=3;     
    }//GEN-LAST:event_r15ActionPerformed

    private void r16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r16ActionPerformed
 resp6=1;        
    }//GEN-LAST:event_r16ActionPerformed

    private void r17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r17ActionPerformed
 resp6=2;      
    }//GEN-LAST:event_r17ActionPerformed

    private void r18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r18ActionPerformed
 resp6=3;  //respuestas del test     
    }//GEN-LAST:event_r18ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
boolean g1=true,g2=true,g3=true,g4=true,g5=true,g6=true;
        
        if (r1.isSelected()==false && r2.isSelected()==false&& r3.isSelected()==false) {
g1=false;
}    
if (r4.isSelected()==false && r5.isSelected()==false&& r6.isSelected()==false) {
g2=false;
}   
if (r7.isSelected()==false && r8.isSelected()==false&& r9.isSelected()==false) {
g3=false;
}   
if (r10.isSelected()==false && r11.isSelected()==false&& r12.isSelected()==false) {
g4=false;
}   
if (r13.isSelected()==false && r14.isSelected()==false&& r15.isSelected()==false) {
g5=false;
}   
if (r16.isSelected()==false && r17.isSelected()==false&& r18.isSelected()==false) {
g6=false;
}

if (g1==false||g2==false||g3==false||g4==false||g5==false||g6==false) {
JOptionPane.showMessageDialog(null,"Por favor, responda todas las preguntas"); //logica para verificar que todas las respuestas sean respondidas
}
else{
int puntTest = resp1+resp2+resp3+resp4+resp5+resp6;
if(puntTest>=6&&puntTest<10){

    Variables.gamaPC = "Baja"; //posibles resultados del test
    
      Variables.nombreCpu = "INTEL i3-13100";
    Variables.precioCpu = 100;
    Variables.puntuacionCpu = 5;      
            
    Variables.nombreGpu = "INTEL ARC A770";
    Variables.precioGpu = 350;
    Variables.puntuacionGpu = 6;
            
 Variables.nombreRam = "DDR5 4800MHz 16GB (2x8GB)";
    Variables.precioRam = 53;
    Variables.puntuacionRam = 8;
                        
   Variables.nombreMother = "GIGABYTE B760M";
    Variables.precioMother = 120;
    Variables.puntuacionMother = 7;
    
    Variables.nombreCase = "Fractal Design 7";
    Variables.precioCase = 250;
    Variables.puntuacionCase = 10;  
                        
     Variables.nombreDisco = "HDD 150MB/s 2TB";
    Variables.precioDisco = 50;
    Variables.puntuacionDisco = 8;
                        
  Variables.nombrePsu = "CORSAIR RM750E";
    Variables.precioPsu = 100;
    Variables.puntuacionPsu = 8;   
    
}
else if(puntTest>=10&&puntTest<15){

    Variables.gamaPC = "Media";
    
        Variables.nombreCpu = "Ryzen 5 7600";
    Variables.precioCpu = 150;
    Variables.puntuacionCpu = 7;  
    
       Variables.nombreDisco = "Sata III SSD 560MB/s 2TB";
    Variables.precioDisco = 100;
    Variables.puntuacionDisco = 9;  
    
        Variables.nombreMother = "GIGABYTE B650";
    Variables.precioMother = 120;
    Variables.puntuacionMother = 7;
    
        Variables.nombreCase = "Cooler Master 700";
    Variables.precioCase = 250;
    Variables.puntuacionCase = 10;   
    
        Variables.nombreRam = "DDR5 4800MHz 32GB (2x16GB)";
    Variables.precioRam = 105;
    Variables.puntuacionRam = 9; 
    
        Variables.nombrePsu = "CORSAIR RM860X";
    Variables.precioPsu = 200;
    Variables.puntuacionPsu = 9;
    
       Variables.nombreGpu = "AMD RX 7900 XT";
    Variables.precioGpu = 900;
    Variables.puntuacionGpu = 8;
    
    
}
else if(puntTest>=15&&puntTest<19) {

    Variables.gamaPC = "Alta";
    
      Variables.nombreCpu = "Ryzen 9 7900";
    Variables.precioCpu = 600;
    Variables.puntuacionCpu = 10;
    
        Variables.nombreGpu = "NVIDIA RTX 4090";
    Variables.precioGpu = 1600;
    Variables.puntuacionGpu = 10;
    
        Variables.nombreMother = "GIGABYTE B650E";
    Variables.precioMother = 300;
    Variables.puntuacionMother = 10;
    
        Variables.nombrePsu = "CORSAIR HX1000";
    Variables.precioPsu = 300;
    Variables.puntuacionPsu = 10;
    
        Variables.nombreRam = "DDR5 4800MHz 64GB (2x32GB)";
    Variables.precioRam = 210;
    Variables.puntuacionRam = 10; 
    
      Variables.nombreCase = "NZXT H7 Flow";
    Variables.precioCase = 250;
    Variables.puntuacionCase = 10;
    
        Variables.nombreDisco = "NVME M.2 SSD 3500MB/s 2TB";
    Variables.precioDisco = 130;
    Variables.puntuacionDisco = 10;
    
}
else{}

this.dispose();
ResultTest result = new ResultTest();
result.setVisible(true); //se ejecuta la ventana de resultados
}
    }//GEN-LAST:event_jButton1ActionPerformed

   
    
    
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
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r10;
    private javax.swing.JRadioButton r11;
    private javax.swing.JRadioButton r12;
    private javax.swing.JRadioButton r13;
    private javax.swing.JRadioButton r14;
    private javax.swing.JRadioButton r15;
    private javax.swing.JRadioButton r16;
    private javax.swing.JRadioButton r17;
    private javax.swing.JRadioButton r18;
    private javax.swing.JRadioButton r2;
    private javax.swing.JRadioButton r3;
    private javax.swing.JRadioButton r4;
    private javax.swing.JRadioButton r5;
    private javax.swing.JRadioButton r6;
    private javax.swing.JRadioButton r7;
    private javax.swing.JRadioButton r8;
    private javax.swing.JRadioButton r9;
    // End of variables declaration//GEN-END:variables
}
