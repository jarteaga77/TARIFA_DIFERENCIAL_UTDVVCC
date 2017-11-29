/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utdvvcc.daos;

import com.utdvvcc.conexion.ConexionBD;
import com.utdvvvcc.entidades.Perfil;

/**
 *
 * @author jarteaga
 */
public class DaoPerfil {
    
        private final ConexionBD conexion=new ConexionBD();

    
     public void guardar(Perfil per) throws Exception
    {
        
        
        if(per.getNomperfil().equals(""))
        {
            throw new Exception("El campo nombre perfil no puede estar vacio");
        }
        
        conexion.executeUpdateQuery("INSERT INTO tb_perfil(nombre_perfil,descripcion)VALUES('"+per.getNomperfil()+"', '"+per.getDescripcion()+"')");
        conexion.desconectar();
    }
    
}
