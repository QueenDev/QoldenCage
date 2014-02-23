/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package QD.goldencage.gui;

import QD.goldencage.Beans.Messagerie;
import QD.goldencage.DAO.MessagerieDAO;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Dgeyski
 */
public class MessagerieTableModel extends AbstractTableModel {
    List<Messagerie> messagerie;
    String[] entetes ={"ID Message","Titre","Message","Date"};
    public MessagerieTableModel(){
        messagerie = new MessagerieDAO().DisplayAllMessagesClient();
    }
    
    public int getRowCount() {
        return messagerie.size();
    }

    public int getColumnCount() {
        return entetes.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return messagerie.get(rowIndex).getId();
            case 1:
                return messagerie.get(rowIndex).getTitre();
            case 2:
                return messagerie.get(rowIndex).getMessage();
            case 3:
                return messagerie.get(rowIndex).getDate();
            default :
                throw new IllegalArgumentException();       
        
        }
    }

    @Override
    public String getColumnName(int column) {
        return entetes[column];
    }
    
    
}
