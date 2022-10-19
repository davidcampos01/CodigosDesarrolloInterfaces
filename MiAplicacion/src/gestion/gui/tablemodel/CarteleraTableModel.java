/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.gui.tablemodel;

import gestion.dto.Cartelera;
import javax.swing.table.AbstractTableModel;
import java.util.List;

/**
 *
 * @author DavidCamposSerrano
 */
public class CarteleraTableModel extends AbstractTableModel {

    private List<Cartelera> listCartelera;
    private String[]columnas
    
    public CarteleraTableModel(List<Cartelera> listCartelera){
            this.listCartelera = listCartelera;
    }
    
    @Override
    public int getRowCount() {
        return listCartelera.size();
        }

    @Override
    public int getColumnCount() {
       return colum
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
      
    }
    
}
