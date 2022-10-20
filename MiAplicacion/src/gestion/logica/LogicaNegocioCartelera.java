/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.logica;

import gestion.dto.Cartelera;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DavidCamposSerrano
 */
public class LogicaNegocioCartelera {
        public List<Cartelera> listaCartelera = new ArrayList<>();
    
    public LogicaNegocioCartelera(){
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
