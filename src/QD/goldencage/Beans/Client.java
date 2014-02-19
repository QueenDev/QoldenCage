/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package QD.goldencage.Beans;

/**
 *
 * @author torjmen
 */
public class Client {

       int id;
    String nom;
    String prenom;
    String pass;
    String adresse;
    String email;
    String tel;
    String Ville;
     int staut;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
     
    

    public void setStaut(int staut) {
        this.staut = staut;
    }

    public int getStaut() {
        return staut;
    }
   
    public String getVille() {
        return Ville;
    }

    public void setVille(String Ville) {
        this.Ville = Ville;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getEmail() {
        return email;
    }

    public String getNom() {
        return nom;
    }

    public String getPass() {
        return pass;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getTel() {
        return tel;
    }

    @Override
    public String toString() {
        return "Client{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", pass=" + pass + ", adresse=" + adresse + ", email=" + email + ", tel=" + tel + ", Ville=" + Ville + ", staut=" + staut + '}';
    }

  
}
