/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.logica;

import gestion.dto.Peliculas;
import gestion.dto.Cartelera;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author David Campos
 */
public class LogicaNegocio {

    private static List<Peliculas> listaPeliculasValoradas = new ArrayList<>();

    public static void aniadirPelicula(Peliculas pelicula) {
        listaPeliculasValoradas.add(pelicula);
    }

    public static List<Peliculas> getListaPeliculas() {
        return listaPeliculasValoradas;
    }
    
    
    public List<Cartelera> listaPeliculas = new ArrayList<>();

    public LogicaNegocio() {
        listaPeliculas = new ArrayList<>();

    }

    public List<Cartelera> getListaUsuarios() {
        return listaPeliculas;
    }
    
    public List<Cartelera> listaCartelera = new ArrayList<>();
    
    public void LogicaNegocioCartelera(){
        listaCartelera = new ArrayList<>();
        listaCartelera.add(new Cartelera("Scary Movie", "Keenen Ivory Wayans", "Humor", "88 minutos", 1, "+18"));
        listaCartelera.add(new Cartelera("Scary Movie", "Keenen Ivory Wayans", "Humor", "88 minutos", 1, "+18"));
        listaCartelera.add(new Cartelera("Scary Movie", "Keenen Ivory Wayans", "Humor", "88 minutos", 1, "+18"));
        listaCartelera.add(new Cartelera("Scary Movie", "Keenen Ivory Wayans", "Humor", "88 minutos", 1, "+18"));
    }
    
    public List<Cartelera> getListaCartelera(){
        return listaCartelera;
    }
}
