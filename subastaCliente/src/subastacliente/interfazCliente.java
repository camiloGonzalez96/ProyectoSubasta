/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subastacliente;

/**
 *
 * @author juanc
 */
public class interfazCliente extends javax.swing.JFrame {

    /**
     * Creates new form interfazCliente
     */
    public interfazCliente() {
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

        jPanelPrincipal = new javax.swing.JPanel();
        jPanelPujas = new javax.swing.JPanel();
        jButtonPujar = new javax.swing.JButton();
        jButtonRetirarse = new javax.swing.JButton();
        jPanelReloj = new javax.swing.JPanel();
        jTextFieldReloj = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanelInfoProducto = new javax.swing.JPanel();
        jPanelProductos = new javax.swing.JPanel();
        jTextFieldEntrada = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaCategorias = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelPrincipal.setBackground(new java.awt.Color(235, 245, 251));
        jPanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelPujas.setBackground(new java.awt.Color(91, 198, 240));

        jButtonPujar.setBackground(new java.awt.Color(39, 174, 96));
        jButtonPujar.setText("Pujar");

        jButtonRetirarse.setBackground(new java.awt.Color(239, 53, 53));
        jButtonRetirarse.setText("Retirarse");

        javax.swing.GroupLayout jPanelPujasLayout = new javax.swing.GroupLayout(jPanelPujas);
        jPanelPujas.setLayout(jPanelPujasLayout);
        jPanelPujasLayout.setHorizontalGroup(
            jPanelPujasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPujasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPujasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonPujar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonRetirarse, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelPujasLayout.setVerticalGroup(
            jPanelPujasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPujasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonPujar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonRetirarse)
                .addContainerGap(487, Short.MAX_VALUE))
        );

        jPanelPrincipal.add(jPanelPujas, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 130, 260, 570));

        jPanelReloj.setBackground(new java.awt.Color(33, 97, 140));

        jTextFieldReloj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRelojActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("La subasta cierra en:");

        javax.swing.GroupLayout jPanelRelojLayout = new javax.swing.GroupLayout(jPanelReloj);
        jPanelReloj.setLayout(jPanelRelojLayout);
        jPanelRelojLayout.setHorizontalGroup(
            jPanelRelojLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRelojLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jTextFieldReloj, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanelRelojLayout.setVerticalGroup(
            jPanelRelojLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRelojLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldReloj, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanelPrincipal.add(jPanelReloj, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, 260, 130));

        jPanelInfoProducto.setBackground(new java.awt.Color(214, 234, 248));

        jPanelProductos.setBackground(new java.awt.Color(46, 134, 193));

        javax.swing.GroupLayout jPanelProductosLayout = new javax.swing.GroupLayout(jPanelProductos);
        jPanelProductos.setLayout(jPanelProductosLayout);
        jPanelProductosLayout.setHorizontalGroup(
            jPanelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );
        jPanelProductosLayout.setVerticalGroup(
            jPanelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelInfoProductoLayout = new javax.swing.GroupLayout(jPanelInfoProducto);
        jPanelInfoProducto.setLayout(jPanelInfoProductoLayout);
        jPanelInfoProductoLayout.setHorizontalGroup(
            jPanelInfoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelInfoProductoLayout.setVerticalGroup(
            jPanelInfoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelPrincipal.add(jPanelInfoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 390));

        jTextFieldEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEntradaActionPerformed(evt);
            }
        });
        jPanelPrincipal.add(jTextFieldEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 740, 60));

        jTextAreaCategorias.setColumns(20);
        jTextAreaCategorias.setRows(5);
        jScrollPane1.setViewportView(jTextAreaCategorias);

        jPanelPrincipal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 740, 250));

        getContentPane().add(jPanelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldRelojActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRelojActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRelojActionPerformed

    private void jTextFieldEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEntradaActionPerformed

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
            java.util.logging.Logger.getLogger(interfazCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfazCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfazCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfazCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfazCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPujar;
    private javax.swing.JButton jButtonRetirarse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelInfoProducto;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JPanel jPanelProductos;
    private javax.swing.JPanel jPanelPujas;
    private javax.swing.JPanel jPanelReloj;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaCategorias;
    private javax.swing.JTextField jTextFieldEntrada;
    private javax.swing.JTextField jTextFieldReloj;
    // End of variables declaration//GEN-END:variables
}
