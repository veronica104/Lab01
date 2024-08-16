
package ejer2;

public class CalculGrafica extends javax.swing.JFrame {

   
    public CalculGrafica() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boton_7 = new javax.swing.JButton();
        boton_cos = new javax.swing.JButton();
        boton_8 = new javax.swing.JButton();
        boton_tan = new javax.swing.JButton();
        boton_9 = new javax.swing.JButton();
        boton_potencia = new javax.swing.JButton();
        boton_0 = new javax.swing.JButton();
        boton_raiz = new javax.swing.JButton();
        boton_p = new javax.swing.JButton();
        boton_igual = new javax.swing.JButton();
        boton_suma = new javax.swing.JButton();
        boton_resta = new javax.swing.JButton();
        boton_multi = new javax.swing.JButton();
        txt = new javax.swing.JTextField();
        boton_1 = new javax.swing.JButton();
        boton_2 = new javax.swing.JButton();
        boton_3 = new javax.swing.JButton();
        boton_4 = new javax.swing.JButton();
        boton_5 = new javax.swing.JButton();
        boton_divic = new javax.swing.JButton();
        boton_6 = new javax.swing.JButton();
        boton_sen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        boton_7.setText("7");
        boton_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_7MouseClicked(evt);
            }
        });

        boton_cos.setText("cos");
        boton_cos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_cosMouseClicked(evt);
            }
        });

        boton_8.setText("8");
        boton_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_8MouseClicked(evt);
            }
        });

        boton_tan.setText("tan");
        boton_tan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_tanMouseClicked(evt);
            }
        });

        boton_9.setText("9");
        boton_9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_9MouseClicked(evt);
            }
        });

        boton_potencia.setText("potencia");
        boton_potencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_potenciaMouseClicked(evt);
            }
        });

        boton_0.setText("0");
        boton_0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_0MouseClicked(evt);
            }
        });

        boton_raiz.setText("raiz");
        boton_raiz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_raizMouseClicked(evt);
            }
        });

        boton_p.setText(".");
        boton_p.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_pMouseClicked(evt);
            }
        });
        boton_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_pActionPerformed(evt);
            }
        });

        boton_igual.setText("=");
        boton_igual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_igualMouseClicked(evt);
            }
        });

        boton_suma.setText("+");
        boton_suma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_sumaMouseClicked(evt);
            }
        });

        boton_resta.setText("-");
        boton_resta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_restaMouseClicked(evt);
            }
        });

        boton_multi.setText("*");
        boton_multi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_multiMouseClicked(evt);
            }
        });

        txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtActionPerformed(evt);
            }
        });

        boton_1.setText("1");
        boton_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_1MouseClicked(evt);
            }
        });
        boton_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_1ActionPerformed(evt);
            }
        });

        boton_2.setText("2");
        boton_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_2MouseClicked(evt);
            }
        });

        boton_3.setText("3");
        boton_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_3MouseClicked(evt);
            }
        });
        boton_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_3ActionPerformed(evt);
            }
        });

        boton_4.setText("4");
        boton_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_4MouseClicked(evt);
            }
        });

        boton_5.setText("5");
        boton_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_5MouseClicked(evt);
            }
        });
        boton_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_5ActionPerformed(evt);
            }
        });

        boton_divic.setText("/");
        boton_divic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_divicMouseClicked(evt);
            }
        });

        boton_6.setText("6");
        boton_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_6MouseClicked(evt);
            }
        });
        boton_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_6ActionPerformed(evt);
            }
        });

        boton_sen.setText("sen");
        boton_sen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_senMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(boton_0, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                            .addComponent(boton_7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boton_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boton_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(boton_2, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                            .addComponent(boton_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boton_8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boton_p, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(boton_6, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                            .addComponent(boton_igual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boton_9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boton_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(boton_multi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boton_resta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boton_suma, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton_divic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(boton_cos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(boton_sen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton_tan, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(boton_potencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boton_raiz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boton_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boton_suma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boton_sen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boton_potencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boton_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_4)
                    .addComponent(boton_5)
                    .addComponent(boton_6)
                    .addComponent(boton_resta)
                    .addComponent(boton_cos)
                    .addComponent(boton_raiz))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_7)
                    .addComponent(boton_8)
                    .addComponent(boton_9)
                    .addComponent(boton_multi)
                    .addComponent(boton_tan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_0)
                    .addComponent(boton_p)
                    .addComponent(boton_igual)
                    .addComponent(boton_divic))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_7MouseClicked
        
    }//GEN-LAST:event_boton_7MouseClicked

    private void boton_cosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_cosMouseClicked
       
    }//GEN-LAST:event_boton_cosMouseClicked

    private void boton_8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_8MouseClicked
        
    }//GEN-LAST:event_boton_8MouseClicked

    private void boton_tanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_tanMouseClicked
    
    }//GEN-LAST:event_boton_tanMouseClicked

    private void boton_9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_9MouseClicked
        
    }//GEN-LAST:event_boton_9MouseClicked

    private void boton_potenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_potenciaMouseClicked
       
    }//GEN-LAST:event_boton_potenciaMouseClicked

    private void boton_0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_0MouseClicked
      
    }//GEN-LAST:event_boton_0MouseClicked

    private void boton_raizMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_raizMouseClicked
     
    }//GEN-LAST:event_boton_raizMouseClicked

    private void boton_pMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_pMouseClicked
       
    }//GEN-LAST:event_boton_pMouseClicked

    private void boton_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_pActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_pActionPerformed

    private void boton_igualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_igualMouseClicked
       
    }//GEN-LAST:event_boton_igualMouseClicked

    private void boton_sumaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_sumaMouseClicked
       
    }//GEN-LAST:event_boton_sumaMouseClicked

    private void boton_restaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_restaMouseClicked
       
    }//GEN-LAST:event_boton_restaMouseClicked

    private void boton_multiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_multiMouseClicked
        
    }//GEN-LAST:event_boton_multiMouseClicked

    private void txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtActionPerformed

    private void boton_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_1MouseClicked
        
    }//GEN-LAST:event_boton_1MouseClicked

    private void boton_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_1ActionPerformed

    private void boton_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_2MouseClicked
       
    }//GEN-LAST:event_boton_2MouseClicked

    private void boton_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_3MouseClicked
        
    }//GEN-LAST:event_boton_3MouseClicked

    private void boton_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_3ActionPerformed

    private void boton_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_4MouseClicked
       
    }//GEN-LAST:event_boton_4MouseClicked

    private void boton_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_5MouseClicked
        
    }//GEN-LAST:event_boton_5MouseClicked

    private void boton_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_5ActionPerformed

    private void boton_divicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_divicMouseClicked
        
    }//GEN-LAST:event_boton_divicMouseClicked

    private void boton_6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_6MouseClicked
       
    }//GEN-LAST:event_boton_6MouseClicked

    private void boton_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_6ActionPerformed

    private void boton_senMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_senMouseClicked
       
    }//GEN-LAST:event_boton_senMouseClicked

    
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
            java.util.logging.Logger.getLogger(CalculGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculGrafica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_0;
    private javax.swing.JButton boton_1;
    private javax.swing.JButton boton_2;
    private javax.swing.JButton boton_3;
    private javax.swing.JButton boton_4;
    private javax.swing.JButton boton_5;
    private javax.swing.JButton boton_6;
    private javax.swing.JButton boton_7;
    private javax.swing.JButton boton_8;
    private javax.swing.JButton boton_9;
    private javax.swing.JButton boton_cos;
    private javax.swing.JButton boton_divic;
    private javax.swing.JButton boton_igual;
    private javax.swing.JButton boton_multi;
    private javax.swing.JButton boton_p;
    private javax.swing.JButton boton_potencia;
    private javax.swing.JButton boton_raiz;
    private javax.swing.JButton boton_resta;
    private javax.swing.JButton boton_sen;
    private javax.swing.JButton boton_suma;
    private javax.swing.JButton boton_tan;
    private javax.swing.JTextField txt;
    // End of variables declaration//GEN-END:variables
}
