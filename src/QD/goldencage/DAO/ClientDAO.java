/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package QD.goldencage.DAO;

import QD.goldencage.Beans.Client;
import QD.goldencage.util.MyConnection;
import java.sql.PreparedStatement;
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
        cdao.setEetatClient(15, 0);
       //cdao.deleteClient(14);
  
   }
    
     public void setEetatClient(int id,int etat){
     
         String requete = "UPDATE  `mydb`.`client` SET  `Statut` =  ? WHERE  `client`.`ID` =?;";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, etat);
            ps.setInt(2, id);
            ps.executeUpdate();
            System.out.println("Mise Ã  jour effectuÃ©e avec succÃ¨s");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la mise Ã  jour "+ex.getMessage());
        }
     }
    
     public void insertStock(Client cl){
           
         String requete = "insert into Client (`Nom`, `prenom`, `pass`, `adresse`, `email`, `tel`, `ville`, `Statut`) VALUES (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, cl.getNom());
            ps.setString(2, cl.getPrenom());
            ps.setString(3,cl.getPass());
            ps.setString(4,cl.getAdresse());
            ps.setString(5, cl.getEmail());
            ps.setString(6,cl.getTel());
            ps.setString(7,cl.getVille());
            ps.setInt(8, cl.getStaut());
            ps.executeUpdate();
            System.out.println("Ajout effectuÃ©e avec succÃ¨s");
        } catch (SQLException ex) {
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
    
     public void deleteClient(int num){

          String requete = "delete from client where ID=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, num);
            ps.executeUpdate();
            System.out.println("Suppression effectuÃ©e avec succÃ¨s");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
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
            System.out.println("erreur lors du chargement des stocks "+ex.getMessage());
            return null;
        }
    }
    
}
