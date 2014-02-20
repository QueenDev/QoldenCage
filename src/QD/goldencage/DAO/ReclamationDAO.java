/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package QD.goldencage.DAO;

import QD.goldencage.Beans.Prestataire;
import QD.goldencage.Beans.Reclamation;
import QD.goldencage.util.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Shift
 */
public class ReclamationDAO {

    public List<Reclamation> DisplayAllReclamationsClient() {


        List<Reclamation> listereclamations = new ArrayList<Reclamation>();

        String requetecl = "select * from signaler where pres=0 AND arch=0";
        try {
            Statement statement = MyConnection.getInstance()
                    .createStatement();
            ResultSet resultat = statement.executeQuery(requetecl);

            ClientDAO client = new ClientDAO();
            while (resultat.next()) {
                Reclamation reclamation = new Reclamation();
                reclamation.setId(resultat.getInt(1));
                reclamation.setClient_id(client.findClientById(resultat.getInt(3)));
                reclamation.setCommentaire(resultat.getString(4));

                listereclamations.add(reclamation);
            }
            return listereclamations;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des depots " + ex.getMessage());
            return null;
        }
    }

    public List<Reclamation> DisplayAllReclamationsPresataire() {


        List<Reclamation> listereclamations = new ArrayList<Reclamation>();

        String requeteps = "select * from signaler where pres=1 AND arch=0";
        try {
            Statement statement = MyConnection.getInstance()
                    .createStatement();
            ResultSet resultat = statement.executeQuery(requeteps);
            PrestataireDAO prest = new PrestataireDAO();

            while (resultat.next()) {
                Reclamation reclamation = new Reclamation();
                reclamation.setId(resultat.getInt(1));
                reclamation.setPrestataire_id(prest.findPrestataireById(resultat.getInt(2)));
                reclamation.setCommentaire(resultat.getString(4));

                listereclamations.add(reclamation);
            }
            return listereclamations;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des depots " + ex.getMessage());
            return null;
        }
    }
}
