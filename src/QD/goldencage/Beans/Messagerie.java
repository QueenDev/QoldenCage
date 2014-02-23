/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package QD.goldencage.Beans;

import java.sql.Date;

/**
 *
 * @author Dgeyski
 */
public class Messagerie {
    
    public Messagerie(){
        
    }
    public Messagerie(int id, String titre, String message, Date date) {
        this.id = id;
        this.titre = titre;
        this.message = message;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    private int id;
    private String titre,message;
    private Date date;
}
