/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.icalderoncaceres.inventario.forms;

/**
 *
 * @author Iván Calderon / https://icalderoncaceres.github.io
 */
public class MenuMain extends javax.swing.JFrame {

    /**
     * Creates new form MenuMain
     */
    public MenuMain() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuCategories = new javax.swing.JMenuItem();
        MenuProducts = new javax.swing.JMenuItem();
        MenuClients = new javax.swing.JMenuItem();
        MenuProviders = new javax.swing.JMenuItem();
        MenuPurchases = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        MenuSells = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Entities");

        MenuCategories.setText("Categories");
        MenuCategories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCategoriesActionPerformed(evt);
            }
        });
        jMenu1.add(MenuCategories);

        MenuProducts.setText("Products");
        jMenu1.add(MenuProducts);

        MenuClients.setText("Clients");
        jMenu1.add(MenuClients);

        MenuProviders.setText("Providers");
        jMenu1.add(MenuProviders);

        jMenuBar1.add(jMenu1);

        MenuPurchases.setText("Proccess");

        jMenuItem1.setText("Purchasses");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        MenuPurchases.add(jMenuItem1);

        MenuSells.setText("Sells");
        MenuPurchases.add(MenuSells);

        jMenuBar1.add(MenuPurchases);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1063, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void MenuCategoriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCategoriesActionPerformed
        // TODO add your handling code here:
        CategoriesForm cf = new CategoriesForm();
        cf.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_MenuCategoriesActionPerformed

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
            java.util.logging.Logger.getLogger(MenuMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuCategories;
    private javax.swing.JMenuItem MenuClients;
    private javax.swing.JMenuItem MenuProducts;
    private javax.swing.JMenuItem MenuProviders;
    private javax.swing.JMenu MenuPurchases;
    private javax.swing.JMenuItem MenuSells;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}