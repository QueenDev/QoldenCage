/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package QD.goldencage.Beans;

/**
 *
 * @author torjmen
 */
public class Prestataire {
    
    int id;
    String nom;
    String prenom;
    String pass;
    String adresse;
    String email;
    String tel;
    String ville;
    String description;
    String titre;
    String url;
    String fb;
    int validation;
    int desactive;
    
    public Prestataire() {
    }
    
    
    public Prestataire(int id, String nom, String prenom, String pass, String adresse, String email, String tel, String ville, String description, String titre, String url, String fb, int validation, int desactive) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.pass = pass;
        this.adresse = adresse;
        this.email = email;
        this.tel = tel;
        this.ville = ville;
        this.description = description;
        this.titre = titre;
        this.url = url;
        this.fb = fb;
        this.validation = validation;
        this.desactive = desactive;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getDesactive() {
        return desactive;
    }

    public String getDescription() {
        return description;
    }

    public String getEmail() {
        return email;
    }

    public String getFb() {
        return fb;
    }

    public int getId() {
        return id;
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

    public String getTitre() {
        return titre;
    }

    public String getUrl() {
        return url;
    }

    public int getValidation() {
        return validation;
    }

    public String getVille() {
        return ville;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setDesactive(int desactive) {
        this.desactive = desactive;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFb(String fb) {
        this.fb = fb;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setValidation(int validation) {
        this.validation = validation;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
    
    
    
}
