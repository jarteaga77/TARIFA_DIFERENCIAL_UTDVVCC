/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utdvvcc.daos;

import com.utdvvcc.conexion.ConexionBD;
import com.utdvvvcc.entidades.LineaVehiculo;


/**
 *
 * @author Jonathan
 */
public class DaoLineVehiculo 
{
    private ConexionBD conexion=new ConexionBD();
    
    public void guardar(LineaVehiculo linea) throws Exception
    {
        if(linea.getDescripcion().equals(""))
        {
            throw new Exception("El campo descripción es obligatorio");
        }
        if(linea.getIdmarca()==0)
        {
            throw new Exception("El id de la marca no puede ser cero");
        }
        
        conexion.executeUpdateQuery("INSERT INTO tb_linea_marca(descripcion,id_marca)VALUES('"+linea.getDescripcion()+"',"+linea.getIdmarca()+")");
        conexion.desconectar();
    }
    
}
