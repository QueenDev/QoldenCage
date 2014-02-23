/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package QD.goldencage.DAO;

import QD.goldencage.Beans.Messagerie;
import QD.goldencage.util.MyConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dgeyski
 */
public class MessagerieDAO {
       public List<Messagerie> DisplayAllMessagesRecu() {


        List<Messagerie> listemessagerie = new ArrayList<Messagerie>();

        String requetecl = "select id,titre,message,date from message where presen=false";
        try {
            Statement statement = MyConnection.getInstance()
                    .createStatement();
            ResultSet resultat = statement.executeQuery(requetecl);


            while (resultat.next()) {
                Messagerie messagerie = new Messagerie();
                messagerie.setId(resultat.getInt(1));
                messagerie.setTitre(resultat.getString(2));
                messagerie.setMessage(resultat.getString(3));
                messagerie.setDate(resultat.getDate(4));
                listemessagerie.add(messagerie);
            }
            return listemessagerie;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des depots " + ex.getMessage());
            return null;
        }
      }
        
        public List<Messagerie> DisplayAllMessagesEnvoye() {


        List<Messagerie> listemessagerie = new ArrayList<Messagerie>();

        String requetecl = "select id,titre,message,date from message where presen=true";
        try {
            Statement statement = MyConnection.getInstance()
                    .createStatement();
            ResultSet resultat = statement.executeQuery(requetecl);


            while (resultat.next()) {
                Messagerie messagerie = new Messagerie();
                messagerie.setId(resultat.getInt(1));
                messagerie.setTitre(resultat.getString(2));
                messagerie.setMessage(resultat.getString(3));
                messagerie.setDate(resultat.getDate(4));
                listemessagerie.add(messagerie);
            }
            return listemessagerie;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des depots " + ex.getMessage());
            return null;
        }
    }
}
