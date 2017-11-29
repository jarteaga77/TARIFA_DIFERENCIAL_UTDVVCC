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
public class Perfil {
    
    private int idperfil;
    private String nomperfil;
    private String descripcion;

    public int getIdperfil() {
        return idperfil;
    }

    public void setIdperfil(int idperfil) {
        this.idperfil = idperfil;
    }

    public String getNomperfil() {
        return nomperfil;
    }

    public void setNomperfil(String nomperfil) {
        this.nomperfil = nomperfil;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return nomperfil;
    }
    
    
    
}
