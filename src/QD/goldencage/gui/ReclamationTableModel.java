/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package QD.goldencage.gui;

import QD.goldencage.DAO.ReclamationDAO;
import QD.goldencage.Beans.Reclamation;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Shift
 */
public class ReclamationTableModel extends AbstractTableModel {

    List<Reclamation> nomReclamation;
    String[] entetes ={"ID Reclamation","Titre Prestataire","Reclamation"};
    private int arch;
    public ReclamationTableModel(){
        nomReclamation = new ReclamationDAO().DisplayAllReclamationsPresataire();
    }

    public ReclamationTableModel(int arch) {
        this.arch = arch;
        nomReclamation = new ReclamationDAO().DisplayAllReclamationsPresataireArch();
    }
    
    
    public int getRowCount() {
        return nomReclamation.size();
    }

    public int getColumnCount() {
        return entetes.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return nomReclamation.get(rowIndex).getId();
            case 1:
                return nomReclamation.get(rowIndex).getPrestataire_id().getTitre();
            case 2:
                return nomReclamation.get(rowIndex).getCommentaire();
            default :
                throw new IllegalArgumentException();       
        
        }
    }

    @Override
    public String getColumnName(int column) {
        return entetes[column];
    }
    
    
}
