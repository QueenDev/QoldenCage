/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package QD.goldencage.gui;


import QD.goldencage.Beans.Client;
import QD.goldencage.Beans.Prestataire;
import QD.goldencage.DAO.ClientDAO;
import QD.goldencage.DAO.PrestataireDAO;
import QD.goldencage.model.ClientTableModel;
import QD.goldencage.model.PrestataireTableModel;
import de.javasoft.plaf.synthetica.SyntheticaAluOxideLookAndFeel;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


/**
 *
 * @author torjmen
 */
public class GestionComptes extends javax.swing.JPanel  {
    private String etat; 
    private int selectedClientTable;
    private int selectedPresTable;
    private PrestataireTableModel ptm = new PrestataireTableModel();
    private ClientTableModel  ctm = new ClientTableModel();
    private String Pretat;
    /**
     * Creates new form GestionComptes
     */
    public GestionComptes()  {
          initComponents();
   }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        PresPan = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TClient = new javax.swing.JTable();
        actdes = new javax.swing.JButton();
        SupCB = new javax.swing.JButton();
        PanelAdd = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fpasswd = new javax.swing.JPasswordField();
        fnom = new javax.swing.JTextField();
        fprenom = new javax.swing.JTextField();
        fadresse = new javax.swing.JTextField();
        femail = new javax.swing.JTextField();
        ftel = new javax.swing.JTextField();
        fville = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        ajouterBTN = new javax.swing.JButton();
        resetBTN = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TPres = new javax.swing.JTable();
        suppPres = new javax.swing.JButton();
        desActPres = new javax.swing.JButton();
        PanelAdd1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        ppass = new javax.swing.JPasswordField();
        pnom = new javax.swing.JTextField();
        pprenom = new javax.swing.JTextField();
        padres = new javax.swing.JTextField();
        pmail = new javax.swing.JTextField();
        ptel = new javax.swing.JTextField();
        pville = new javax.swing.JTextField();
        resetBTN1 = new javax.swing.JButton();
        ajouterBTNP = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        pdesc = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        pTitre = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        purl = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        pfb = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();

        setMaximumSize(new java.awt.Dimension(767, 767));
        setPreferredSize(new java.awt.Dimension(500, 500));

        PresPan.setToolTipText("");
        PresPan.setName("");

        TClient.setModel(ctm);
        TClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TClientMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TClient);

        actdes.setText("A/D");
        actdes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actdesActionPerformed(evt);
            }
        });

        SupCB.setText("Supprimer");
        SupCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupCBActionPerformed(evt);
            }
        });

        jLabel1.setText("Nom :");

        jLabel2.setText("Prenom :");

        jLabel3.setText("Password :");

        jLabel4.setText("Adresse :");

        jLabel5.setText("Email :");

        jLabel6.setText("Tel :");

        jLabel7.setText("Ville :");

        javax.swing.GroupLayout PanelAddLayout = new javax.swing.GroupLayout(PanelAdd);
        PanelAdd.setLayout(PanelAddLayout);
        PanelAddLayout.setHorizontalGroup(
            PanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelAddLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(fpasswd))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelAddLayout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(25, 25, 25)
                            .addComponent(fadresse, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PanelAddLayout.createSequentialGroup()
                            .addGroup(PanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addGroup(PanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(PanelAddLayout.createSequentialGroup()
                                    .addGap(26, 26, 26)
                                    .addComponent(fnom, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(PanelAddLayout.createSequentialGroup()
                                    .addGap(28, 28, 28)
                                    .addComponent(fprenom))))
                        .addGroup(PanelAddLayout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(40, 40, 40)
                            .addComponent(femail, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PanelAddLayout.createSequentialGroup()
                            .addGroup(PanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7))
                            .addGap(46, 46, 46)
                            .addGroup(PanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(fville, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ftel, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        PanelAddLayout.setVerticalGroup(
            PanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fprenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fpasswd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fadresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(femail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ftel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fville, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        ajouterBTN.setText("Ajouter");
        ajouterBTN.setToolTipText("");
        ajouterBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterBTNActionPerformed(evt);
            }
        });

        resetBTN.setText("Reset");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(SupCB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(actdes, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(ajouterBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(resetBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ajouterBTN)
                    .addComponent(resetBTN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(actdes)
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(SupCB)
                        .addContainerGap())))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
        );

        PresPan.addTab("Client", jPanel3);

        jPanel2.setMaximumSize(new java.awt.Dimension(767, 767));

        TPres.setModel(ptm);
        TPres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TPresMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TPres);

        suppPres.setText("Supprimer");
        suppPres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppPresActionPerformed(evt);
            }
        });

        desActPres.setText("A/D");
        desActPres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desActPresActionPerformed(evt);
            }
        });

        jLabel8.setText("Nom :");

        jLabel9.setText("Prenom :");

        jLabel10.setText("Password :");

        jLabel11.setText("Adresse :");

        jLabel12.setText("Email :");

        jLabel13.setText("Tel :");

        jLabel14.setText("Ville :");

        resetBTN1.setText("Reset");

        ajouterBTNP.setText("Ajouter");
        ajouterBTNP.setToolTipText("");
        ajouterBTNP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterBTNPActionPerformed(evt);
            }
        });

        pdesc.setColumns(20);
        pdesc.setRows(5);
        jScrollPane3.setViewportView(pdesc);

        jLabel15.setText("Desc :");

        pTitre.setToolTipText("");

        jLabel16.setText("Titre :");

        purl.setToolTipText("");

        jLabel17.setText("URL :");

        jLabel18.setText("FB :");

        pfb.setToolTipText("");

        javax.swing.GroupLayout PanelAdd1Layout = new javax.swing.GroupLayout(PanelAdd1);
        PanelAdd1.setLayout(PanelAdd1Layout);
        PanelAdd1Layout.setHorizontalGroup(
            PanelAdd1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAdd1Layout.createSequentialGroup()
                .addComponent(jSeparator2)
                .addContainerGap())
            .addGroup(PanelAdd1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelAdd1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAdd1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(ppass, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelAdd1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(PanelAdd1Layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(padres, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PanelAdd1Layout.createSequentialGroup()
                            .addGroup(PanelAdd1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addComponent(jLabel8))
                            .addGroup(PanelAdd1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(PanelAdd1Layout.createSequentialGroup()
                                    .addGap(26, 26, 26)
                                    .addComponent(pnom, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(PanelAdd1Layout.createSequentialGroup()
                                    .addGap(28, 28, 28)
                                    .addComponent(pprenom))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAdd1Layout.createSequentialGroup()
                            .addGroup(PanelAdd1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13)
                                .addComponent(jLabel14)
                                .addComponent(jLabel15)
                                .addComponent(jLabel16)
                                .addComponent(jLabel12)
                                .addComponent(jLabel17)
                                .addComponent(jLabel18))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(PanelAdd1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(purl)
                                .addComponent(pmail)
                                .addComponent(ptel)
                                .addComponent(pville)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(pTitre)
                                .addComponent(pfb, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)))))
                .addGap(0, 33, Short.MAX_VALUE))
            .addGroup(PanelAdd1Layout.createSequentialGroup()
                .addComponent(ajouterBTNP, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(resetBTN1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PanelAdd1Layout.setVerticalGroup(
            PanelAdd1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAdd1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelAdd1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(pnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelAdd1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(pprenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelAdd1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(ppass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelAdd1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(padres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelAdd1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelAdd1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ptel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelAdd1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pville, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelAdd1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelAdd1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(pTitre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelAdd1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(purl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelAdd1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(pfb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelAdd1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ajouterBTNP)
                    .addComponent(resetBTN1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelAdd1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(suppPres)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(desActPres, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(PanelAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(desActPres)
                            .addComponent(suppPres)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 142, Short.MAX_VALUE))
        );

        PresPan.addTab("Prestataires", jPanel2);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PresPan, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PresPan, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PresPan.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void desActPresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desActPresActionPerformed
         if (selectedPresTable != 0) {
            if (Pretat.contains("D")) {
                new PrestataireDAO().setEetatPrestataire(selectedPresTable, 1);
            } else if (Pretat.contains("A")) {
                new PrestataireDAO().setEetatPrestataire(selectedPresTable, 0);
            }

            ptm = new PrestataireTableModel();
            TPres.setModel(ptm);
            ptm.fireTableDataChanged();
        }
    }//GEN-LAST:event_desActPresActionPerformed

    private void ajouterBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterBTNActionPerformed

        Client cl = new Client();
        cl.setNom(fnom.getText());
        cl.setPrenom(fprenom.getText());
        cl.setPass(fpasswd.getText());
        cl.setAdresse(fadresse.getText());
        cl.setEmail(femail.getText());
        cl.setTel(ftel.getText());
        cl.setVille(fville.getText());
        cl.setStaut(0);

        new ClientDAO().insertClient(cl);
        
        ctm = new ClientTableModel();
        TClient.setModel(ctm);
        ctm.fireTableDataChanged();
    }//GEN-LAST:event_ajouterBTNActionPerformed

    private void SupCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupCBActionPerformed
        if (selectedClientTable != 0) {
            new ClientDAO().deleteClient(selectedClientTable);
            ctm = new ClientTableModel();
            TClient.setModel(ctm);
            ctm.fireTableDataChanged();
        }

    }//GEN-LAST:event_SupCBActionPerformed

    private void actdesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actdesActionPerformed
        if (selectedClientTable != 0) {
            if (etat.contains("D")) {
                new ClientDAO().setEetatClient(selectedClientTable,1);
            } else if (etat.contains("A")) {
                new ClientDAO().setEetatClient(selectedClientTable, 0);
            }

            ctm = new ClientTableModel();
            TClient.setModel(ctm);
            ctm.fireTableDataChanged();
        }
    }//GEN-LAST:event_actdesActionPerformed

    private void TClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TClientMouseClicked
        int selectedRowIndex = TClient.getSelectedRow();
        Object selectedObject = (Object) TClient.getModel().getValueAt(selectedRowIndex, 0);
        etat = (String) TClient.getModel().getValueAt(selectedRowIndex,7);
        System.out.println(etat);
        selectedClientTable = (int) selectedObject;
    }//GEN-LAST:event_TClientMouseClicked

    private void suppPresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppPresActionPerformed
         if (selectedPresTable != 0) {
            new PrestataireDAO().deletePrestataire(selectedPresTable);
            ptm = new PrestataireTableModel();
            TPres.setModel(ptm);
            ptm.fireTableDataChanged();
        }
    }//GEN-LAST:event_suppPresActionPerformed

    private void TPresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TPresMouseClicked
        int selectedRowIndex = TPres.getSelectedRow();
        Object selectedObject = (Object) TPres.getModel().getValueAt(selectedRowIndex, 0);
        Pretat = (String)TPres.getModel().getValueAt(selectedRowIndex, 12);
        System.out.println(Pretat);
        selectedPresTable = (int) selectedObject;
    }//GEN-LAST:event_TPresMouseClicked

    private void ajouterBTNPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterBTNPActionPerformed
        
        
        Prestataire pr = new Prestataire();
        
        pr.setNom(pnom.getText());
        pr.setPrenom(pprenom.getText());
        pr.setPass(ppass.getText());
        pr.setAdresse(padres.getText());
        pr.setEmail(pmail.getText());
        pr.setTel(ptel.getText());
        pr.setVille(pville.getText());
        pr.setDescription(pdesc.getText());
        pr.setTitre(pTitre.getText());
        pr.setUrl(purl.getText());
        pr.setFb(pfb.getText());
        pr.setDesactive(0);
        pr.setValidation(0);
        
        new PrestataireDAO().insertPrestataire(pr);
        
        ptm = new PrestataireTableModel();
        TPres.setModel(ptm);
        ptm.fireTableDataChanged();
       
    }//GEN-LAST:event_ajouterBTNPActionPerformed
           

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel PanelAdd;
    public javax.swing.JPanel PanelAdd1;
    public javax.swing.JTabbedPane PresPan;
    private javax.swing.JButton SupCB;
    public javax.swing.JTable TClient;
    private javax.swing.JTable TPres;
    private javax.swing.JButton actdes;
    private javax.swing.JButton ajouterBTN;
    private javax.swing.JButton ajouterBTNP;
    private javax.swing.JButton desActPres;
    private javax.swing.JTextField fadresse;
    private javax.swing.JTextField femail;
    private javax.swing.JTextField fnom;
    private javax.swing.JPasswordField fpasswd;
    private javax.swing.JTextField fprenom;
    private javax.swing.JTextField ftel;
    private javax.swing.JTextField fville;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField pTitre;
    private javax.swing.JTextField padres;
    private javax.swing.JTextArea pdesc;
    private javax.swing.JTextField pfb;
    private javax.swing.JTextField pmail;
    private javax.swing.JTextField pnom;
    private javax.swing.JPasswordField ppass;
    private javax.swing.JTextField pprenom;
    private javax.swing.JTextField ptel;
    private javax.swing.JTextField purl;
    private javax.swing.JTextField pville;
    private javax.swing.JButton resetBTN;
    private javax.swing.JButton resetBTN1;
    private javax.swing.JButton suppPres;
    // End of variables declaration//GEN-END:variables

    
}
