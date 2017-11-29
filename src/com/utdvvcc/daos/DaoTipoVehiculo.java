/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utdvvcc.daos;

import com.utdvvcc.conexion.ConexionBD;
import com.utdvvvcc.entidades.TipoVehiculo;


/**
 *
 * @author Jonathan
 */
public class DaoTipoVehiculo 
{
    
    private ConexionBD conexion=new ConexionBD();
    
    public void guardar(TipoVehiculo tipo) throws Exception
    {
        if(tipo.getDes().equals(""))
        {
            throw new Exception("La descripción Tipo de Vehiculo es un campo obligatorio");
        }
        
        conexion.executeUpdateQuery("INSERT INTO tb_tipo_vehiculo(descripcion)VALUES('"+tipo.getDes()+"')");
        conexion.desconectar();
   
    }
    
    public void update(TipoVehiculo tipo) throws Exception
    {
         if(tipo.getDes().equals(""))
        {
            throw new Exception("La descripción Tipo de Vehiculo es un campo obligatorio");
        }
         
         conexion.executeUpdateQuery("UPDATE tb_tipo_vehiculo SET descripcion='"+tipo.getDes()+"' WHERE id_tipo_vehiculo="+tipo.getId()+"");
         conexion.desconectar();
    }
    
}
