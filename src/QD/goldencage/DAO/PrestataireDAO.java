/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package QD.goldencage.DAO;

import QD.goldencage.Beans.Client;
import QD.goldencage.Beans.Prestataire;
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
public class PrestataireDAO {
    
    public static void main(String arg[]){
        
//        PrestataireDAO prdao = new PrestataireDAO();
//        prdao.setEetatPrestataire(3, 0);
//        Prestataire p = new Prestataire(0, "fdsdf", "fgdfg","fdsfds","fdsfsd","fds", "dfs", "fsd", "fdsf","wx","dsq", "sdqs", 1, 1);
//        prdao.insertPrestataire(p);
//        prdao.deletePrestataire(3);
  
   }
      
    public List<Prestataire> DisplayAllPrestataire (){


        List<Prestataire> listePr = new ArrayList<Prestataire>();

        String requete = "select * from prestataire";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while(resultat.next()){
                Prestataire pr =new Prestataire();
                pr.setId(resultat.getInt(1));
                pr.setNom(resultat.getString(2));
                pr.setPrenom(resultat.getString(3));
                pr.setPass(resultat.getString(4));
                pr.setAdresse(resultat.getString(5));
                pr.setEmail(resultat.getString(6));
                pr.setTel(resultat.getString(7));
                pr.setVille(resultat.getString(8));
                pr.setDescription(resultat.getString(9));
                pr.setUrl(resultat.getString(12));
                pr.setFb(resultat.getString(13));
                pr.setValidation(resultat.getInt(17));
                pr.setDesactive(resultat.getInt(18));
                
             
                 listePr.add(pr);
            }
            return listePr;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des stocks "+ex.getMessage());
            return null;
        }
    }
    
    public void deletePrestataire(int num){

          String requete = "delete from prestataire where ID=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, num);
            ps.executeUpdate();
            System.out.println("Suppression effectuÃ©e avec succÃ¨s");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }
    
     public void setEetatPrestataire(int id,int etat){
     
         String requete = "UPDATE  prestataire SET  desactive =  ? WHERE  ID =?;";
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
     
      public void insertPrestataire(Prestataire pr){
           
         String requete = "INSERT INTO  `mydb`.`prestataire` (`Nom` ,`prenom` ,`pass` ,`adresse` ,`email` ,`tel` ,`ville` ,`description`,`logo`,`titre`,`url` ,`fb`,`image`,`bgimage1`,`desactive`)VALUES (?,?,?,?,?,?,?,?,'nolog',?,?,?,'noimg','noBigImg',0);";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, pr.getNom());
            ps.setString(2, pr.getPrenom());
            ps.setString(3,pr.getPass());
            ps.setString(4,pr.getAdresse());
            ps.setString(5,pr.getEmail());
            ps.setString(6,pr.getTel());
            ps.setString(7,pr.getVille());
            ps.setString(8, pr.getDescription());
            ps.setString(9,pr.getTitre());
            ps.setString(10, pr.getUrl());
            ps.setString(11, pr.getFb());
  
            ps.executeUpdate();
            System.out.println("Ajout effectuÃ©e avec succÃ¨s");
        } catch (SQLException ex) {
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
     
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
