/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.dto;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;

/**
 *
 * @author DavidCamposSerrano
 */
public class Peliculas {

    private String nombrePelicula;
    private String director;
    private Date fechaEstreno;
    private String genero;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

    public Peliculas (String nombrePelicula, String director, Date fechaEstreno, String genero) {
        this.nombrePelicula = nombrePelicula;
        this.director = director;
        this.fechaEstreno = fechaEstreno;
        this.genero = genero;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombre) {
        this.nombrePelicula = nombrePelicula;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Date getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(Date fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public String[] toArrayString(){
        String[] s = new String[4];
        s[0] = nombrePelicula;
        s[1] = director;
        s[2] = sdf.format(fechaEstreno);
        s[3] = genero;
        return s;
                //sss
    }
    
}
