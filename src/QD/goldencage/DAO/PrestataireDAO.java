/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package QD.goldencage.DAO;

import QD.goldencage.Beans.Prestataire;
import QD.goldencage.util.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author torjmen
 */
public class PrestataireDAO {
    
    public Prestataire findPrestataireById(int id){
    Prestataire prestataire = new Prestataire();
     String requete = "select * from prestataire where ID=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                prestataire.setId(resultat.getInt(1));
                prestataire.setTitre(resultat.getString(11));
            }
            return prestataire;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du depot "+ex.getMessage());
            return null;
        }
    }
    
}
