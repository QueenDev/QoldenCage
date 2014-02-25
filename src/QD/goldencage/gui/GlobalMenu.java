/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package QD.goldencage.gui;

import de.javasoft.plaf.synthetica.SyntheticaAluOxideLookAndFeel;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author torjmen
 */
public class GlobalMenu extends javax.swing.JFrame {
        StatePanelvg sp = new StatePanelvg();
        GestionComptes gs = new GestionComptes();
    /**
     * Creates new form GlobalMenu
     */
    public GlobalMenu() throws UnsupportedLookAndFeelException, ParseException {
       UIManager.setLookAndFeel(new SyntheticaAluOxideLookAndFeel());
      
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

        PMenu = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        gescomptes = new javax.swing.JButton();
        BStatistique = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        pChange = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.X_AXIS));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/RC.png"))); // NOI18N
        jButton5.setToolTipText("Espace de Gestion Des Reclamations");
        jButton5.setPreferredSize(new java.awt.Dimension(160, 81));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/GR.png"))); // NOI18N
        jButton3.setToolTipText("Espace de Gestion Des Reclamations");
        jButton3.setPreferredSize(new java.awt.Dimension(160, 81));

        gescomptes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/GC.png"))); // NOI18N
        gescomptes.setToolTipText("Espace de Gestion des Comptes");
        gescomptes.setMaximumSize(new java.awt.Dimension(160, 81));
        gescomptes.setMinimumSize(new java.awt.Dimension(160, 81));
        gescomptes.setPreferredSize(new java.awt.Dimension(160, 81));
        gescomptes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gescomptesActionPerformed(evt);
            }
        });

        BStatistique.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ST.png"))); // NOI18N
        BStatistique.setToolTipText("Espace de Gestion Des Statistique");
        BStatistique.setPreferredSize(new java.awt.Dimension(160, 81));
        BStatistique.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BStatistiqueActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/GM.png"))); // NOI18N
        jButton2.setToolTipText("Espace des Gestion des Mails");
        jButton2.setMaximumSize(new java.awt.Dimension(160, 81));
        jButton2.setMinimumSize(new java.awt.Dimension(160, 81));
        jButton2.setPreferredSize(new java.awt.Dimension(160, 81));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/QD.png"))); // NOI18N
        jLabel3.setToolTipText("");

        javax.swing.GroupLayout PMenuLayout = new javax.swing.GroupLayout(PMenu);
        PMenu.setLayout(PMenuLayout);
        PMenuLayout.setHorizontalGroup(
            PMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gescomptes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel3)
                .addGroup(PMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(BStatistique, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        PMenuLayout.setVerticalGroup(
            PMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PMenuLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(gescomptes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BStatistique, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );

        getContentPane().add(PMenu);

        javax.swing.GroupLayout pChangeLayout = new javax.swing.GroupLayout(pChange);
        pChange.setLayout(pChangeLayout);
        pChangeLayout.setHorizontalGroup(
            pChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 662, Short.MAX_VALUE)
        );
        pChangeLayout.setVerticalGroup(
            pChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 538, Short.MAX_VALUE)
        );

        getContentPane().add(pChange);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BStatistiqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BStatistiqueActionPerformed
        this.remove(pChange);//remove the current panel being displayed
        this.add(sp.StatPanel);//add the panel that you want to display next
        this.validate();//this is needed to make the change work
        this.repaint();//this will force the frame to display the new panel*/
        pChange = sp.StatPanel;//keep track of the current panel for later removal
    }//GEN-LAST:event_BStatistiqueActionPerformed

    private void gescomptesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gescomptesActionPerformed
        this.remove(pChange);//remove the current panel being displayed
        this.add(gs.jPanel4);//add the panel that you want to display next
        this.validate();//this is needed to make the change work
        this.repaint();//this will force the frame to display the new panel*/
        pChange = gs.jPanel4;//keep track of the current panel for later removal
   }//GEN-LAST:event_gescomptesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GlobalMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GlobalMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GlobalMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GlobalMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    new GlobalMenu().setVisible(true);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(GlobalMenu.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ParseException ex) {
                    Logger.getLogger(GlobalMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BStatistique;
    private javax.swing.JPanel PMenu;
    private javax.swing.JButton gescomptes;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel pChange;
    // End of variables declaration//GEN-END:variables
}
