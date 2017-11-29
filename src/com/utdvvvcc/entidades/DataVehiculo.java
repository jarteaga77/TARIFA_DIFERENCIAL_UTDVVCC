/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utdvvvcc.entidades;

/**
 *
 * @author jarteaga
 */
public class DataVehiculo 
{
    private int id;
    private int id_te;
    private int id_cat;
    private int id_linea;
    private String color;
    private String nom_titular;
    private String cedula;
    private int id_usuario;
    private int anio;
    private int idtipo;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_te() {
        return id_te;
    }

    public void setId_te(int id_te) {
        this.id_te = id_te;
    }

    public int getId_cat() {
        return id_cat;
    }

    public void setId_cat(int id_cat) {
        this.id_cat = id_cat;
    }

    public int getId_linea() {
        return id_linea;
    }

    public void setId_linea(int id_linea) {
        this.id_linea = id_linea;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNom_titular() {
        return nom_titular;
    }

    public void setNom_titular(String nom_titular) {
        this.nom_titular = nom_titular;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getIdtipo() {
        return idtipo;
    }

    public void setIdtipo(int idtipo) {
        this.idtipo = idtipo;
    }
    
    
    
 
    
}
