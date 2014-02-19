/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package QD.goldencage.DAO;

import QD.goldencage.Beans.Client;
import QD.goldencage.util.MyConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author torjmen
 */
public class ClientDAO {
    
    public static void main(String arg[]){
        
        ClientDAO cdao = new ClientDAO();
        System.out.print(cdao.DisplayAllStocks().get(0).getStaut());
  
   }
    
       public List<Client> DisplayAllStocks (){


        List<Client> listeClient = new ArrayList<Client>();

        String requete = "select * from client";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while(resultat.next()){
                Client c =new Client();
                c.setId(resultat.getInt(1));
                c.setNom(resultat.getString(2));
                c.setPrenom(resultat.getString(3));
                c.setPass(resultat.getString(4));
                c.setAdresse(resultat.getString(5));
                c.setEmail(resultat.getString(6));
                c.setTel(resultat.getString(7));
                c.setVille(resultat.getString(8));
                c.setStaut(resultat.getInt(9));
             
                listeClient.add(c);
            }
            return listeClient;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des stocks "+ex.getMessage());
            return null;
        }
    }
    
}
