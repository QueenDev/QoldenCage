/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package QD.goldencage.Beans;

/**
 *
 * @author Shift
 */
public class Reclamation {
    private int id;
    private Prestataire prestataire_id;
    private Client client_id;
    private String commentaire;

    public int getId() {
        return id;
    }

    public Prestataire getPrestataire_id() {
        return prestataire_id;
    }

    public Client getClient_id() {
        return client_id;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrestataire_id(Prestataire prestataire_id) {
        this.prestataire_id = prestataire_id;
    }

    public void setClient_id(Client client_id) {
        this.client_id = client_id;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    
    
}
