/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package QD.goldencage.model;

import QD.goldencage.Beans.Client;
import QD.goldencage.DAO.ClientDAO;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author torjmen
 */
public class ClientTableModel extends AbstractTableModel{
    
    List<Client> lclient;
    String[] entetes ={"ID","Nom","prenom","adresse","email","tel","ville","Statut"};

    public ClientTableModel() {
        lclient = new ClientDAO().DisplayAllClient();   
        }

    
    
    @Override
    public int getRowCount() {
        return lclient.size();
       
    }

    @Override
    public int getColumnCount() {
       return entetes.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
         switch(columnIndex){
            case 0:
                return lclient.get(rowIndex).getId();
            case 1:
                return lclient.get(rowIndex).getNom();
            case 2:
                return lclient.get(rowIndex).getPrenom();
            case 3:
                return lclient.get(rowIndex).getAdresse();
            case 4:
                return lclient.get(rowIndex).getEmail();
            case 5:
                return lclient.get(rowIndex).getTel();
            case 6:
                return lclient.get(rowIndex).getVille();
            case 7:
                if( lclient.get(rowIndex).getStaut()==1)
                    return " A ";
                 if( lclient.get(rowIndex).getStaut()==0)
                    return " D ";
            default :
                throw new IllegalArgumentException();       
        
        }
  
        
    }
      @Override
        public String getColumnName(int column) {
        return entetes[column];
    }
    
   
}
