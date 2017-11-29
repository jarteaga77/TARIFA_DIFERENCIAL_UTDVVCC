/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utdvvcc.daos;

import com.utdvvcc.conexion.ConexionBD;
import com.utdvvvcc.entidades.Categoria;



/**
 *
 * @author Jonathan
 */
public class DaoCategoria 
{
    private ConexionBD conexion=new ConexionBD();
    
    
    public void guardar(Categoria ca) throws Exception
    {
        if(ca.getCategoria().equals(""))
        {
            throw new Exception("El campo categoria no puede estar vacio");
        }
        
        conexion.executeUpdateQuery("INSERT INTO tb_categoria(categoria)VALUES('"+ca.getCategoria()+"')");
        conexion.desconectar();
    }
    
}
