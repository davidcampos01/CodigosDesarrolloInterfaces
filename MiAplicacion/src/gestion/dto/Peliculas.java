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

    public static void add(Peliculas pelicula) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String nombrePelicula;
    private String usuario;
    private Date fechaPelicula;
    private String genero;
    private String valoracion;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

    public Peliculas (String nombrePelicula, String usuario, Date fechaPelicula, String genero, String valoracion) {
        this.nombrePelicula = nombrePelicula;
        this.usuario = usuario;
        this.fechaPelicula = fechaPelicula;
        this.valoracion = valoracion;
        this.genero = genero;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombre) {
        this.nombrePelicula = nombrePelicula;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Date getFechaPelicula() {
        return fechaPelicula;
    }

    public void setFechaPelicula(Date fechaPelicula) {
        this.fechaPelicula = fechaPelicula;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getValoracion() {
        return valoracion;
    }

    public void setValoracion(String valoracion) {
        this.valoracion = valoracion;
    }
    
    
    public String[] toArrayString(){
        String[] s = new String[5];
        s[0] = nombrePelicula;
        s[1] = usuario;
        s[2] = sdf.format(fechaPelicula);
        s[3] = genero;
        s[4] = valoracion;
        return s;
                
    }
    
}
