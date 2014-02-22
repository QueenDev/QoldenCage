/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package QD.goldencage.model;


import QD.goldencage.Beans.Prestataire;
import QD.goldencage.DAO.PrestataireDAO;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author torjmen
 */
public class PrestataireTableModel extends AbstractTableModel{
    
    List<Prestataire> lpr;
    String[] entetes ={"ID","Nom","prenom","adresse","email","tel","ville","description","titre","url","fb","validation","Etat"};

    public PrestataireTableModel(){
    
       lpr = new PrestataireDAO().DisplayAllPrestataire ();
    }
    @Override
    public int getRowCount() {
       return lpr.size();
    }

    @Override
    public int getColumnCount() {
       return entetes.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       switch(columnIndex){
            case 0:
                return lpr.get(rowIndex).getId();
            case 1:
                return lpr.get(rowIndex).getNom();
            case 2:
                return  lpr.get(rowIndex).getPrenom();
            case 3:
                return  lpr.get(rowIndex).getAdresse();
            case 4:
                return  lpr.get(rowIndex).getEmail();
            case 5:
                return  lpr.get(rowIndex).getTel();
            case 6:
                 return  lpr.get(rowIndex).getVille();
            case 7:
                return  lpr.get(rowIndex).getDesactive();
            case 8:
                return lpr.get(rowIndex).getTitre();
            case 9:
                return  lpr.get(rowIndex).getUrl();
            case 10:
                return  lpr.get(rowIndex).getFb();
            case 11:
                if(lpr.get(rowIndex).getValidation()==1)
                    return " O ";
                else if(lpr.get(rowIndex).getValidation()==0)
                     return " N ";
            case 12:
                if( lpr.get(rowIndex).getDesactive()==0)
                    return " D ";
                else if( lpr.get(rowIndex).getDesactive()==1)
                    return " A ";
                    
            default :
                throw new IllegalArgumentException();       
        
        }
       
    }
     @Override
        public String getColumnName(int column) {
        return entetes[column];
    }
}
