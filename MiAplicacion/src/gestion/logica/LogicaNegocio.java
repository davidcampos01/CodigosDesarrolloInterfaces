/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.logica;

import gestion.dto.Peliculas;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author David Campos
 */
public class LogicaNegocio {
    private static List<Peliculas>listaPeliculas = new ArrayList<>();
    
    public static void aniadirPelicula(Peliculas pelicula){
        listaPeliculas.add(pelicula);
    }

    public static List<Peliculas> getListaPeliculas() {
        return listaPeliculas;
    }
    
    
}
