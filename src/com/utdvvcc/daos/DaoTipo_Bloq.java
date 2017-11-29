/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utdvvcc.daos;

import com.utdvvcc.conexion.ConexionBD;
import com.utdvvvcc.entidades.Categoria;
import com.utdvvvcc.entidades.TipoBloqueo;



/**
 *
 * @author Jonathan
 */
public class DaoTipo_Bloq 
{
    private ConexionBD conexion=new ConexionBD();
    
    
    public void guardar(TipoBloqueo bloq) throws Exception
    {
        if(bloq.getTipo().equals(""))
        {
            throw new Exception("El campo tipo de bloqueo no puede estar vacio");
        }
        
        conexion.executeUpdateQuery("INSERT INTO tb_tipo_bloqueo(descripcion)VALUES('"+bloq.getTipo()+"')");
        conexion.desconectar();
    }
    
}
