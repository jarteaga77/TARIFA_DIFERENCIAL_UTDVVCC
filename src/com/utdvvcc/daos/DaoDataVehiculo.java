/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utdvvcc.daos;

import com.utdvvcc.conexion.ConexionBD;
import com.utdvvvcc.entidades.DataVehiculo;

/**
 *
 * @author jarteaga
 */
public class DaoDataVehiculo 
{
        private final ConexionBD conexion=new ConexionBD();

       
    public void guardar(DataVehiculo d) throws Exception
    {
        if(d.getCedula().equals(""))
        {
            throw new Exception("El campo cédula no puede estar vacio");
        }
        
          if(d.getNom_titular().equals(""))
        {
            throw new Exception("El campo Nombre no puede estar vacio");
        }
        
        conexion.executeUpdateQuery("INSERT INTO tb_data_vehiculo(id_tarjetas_especiales,id_categoria,id_linea_marca,color,nombre_titular,cedula_titular,id_usuario,anio,id_tipo_vehiculo)VALUES("+d.getId_te()+", "+d.getId_cat()+", "+d.getId_linea()+", '"+d.getColor()+"', '"+d.getNom_titular()+"', '"+d.getCedula()+"', "+d.getId_usuario()+", "+d.getAnio()+", "+d.getIdtipo()+")");
        conexion.desconectar();
    }
    
    
}
