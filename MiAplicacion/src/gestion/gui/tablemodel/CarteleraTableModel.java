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
    private String[]columnas = {"Nombre Pelicula", "Director", "Genero", "Duración", "Sala", "Edad"};
    
    public CarteleraTableModel(List<Cartelera> listCartelera){
            this.listCartelera = listCartelera;
    }
    
    @Override
    public int getRowCount() {
        return listCartelera.size();
        }

    @Override
    public int getColumnCount() {
       return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
      switch(columnIndex){
          case 0:
              return listCartelera.get(rowIndex).getNombrePelicula();
          case 1:
              return listCartelera.get(rowIndex).getDirector();
          case 2:
              return listCartelera.get(rowIndex).getGenero();
          case 3:
              return listCartelera.get(rowIndex).getDuracion();
          case 4:
              return listCartelera.get(rowIndex).getSala();
          case 5:
              return listCartelera.get(rowIndex).getEdad(); 
      }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }
    
    
}
