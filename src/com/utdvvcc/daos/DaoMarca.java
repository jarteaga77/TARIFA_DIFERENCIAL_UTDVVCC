/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utdvvcc.daos;

import com.utdvvcc.conexion.ConexionBD;
import com.utdvvvcc.entidades.Marca;



/**
 *
 * @author Jonathan
 */
public class DaoMarca 
{
    private ConexionBD conexion=new ConexionBD();
    
    
    public void guardar(Marca ma) throws Exception
    {
        if(ma.getMarca().equals(""))
        {
            throw new Exception("El campo marca no puede estar vacio");
        }
        
        conexion.executeUpdateQuery("INSERT INTO tb_marca(nombre_marca)VALUES('"+ma.getMarca()+"')");
        conexion.desconectar();
    }
    
}
