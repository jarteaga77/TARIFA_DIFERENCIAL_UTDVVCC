/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utdvvvcc.entidades;

import java.util.ArrayList;


/**
 *
 * @author Jonathan
 */
public class ControllerItemList 
{
    LlenarCombo llenar=new LlenarCombo();
    public ArrayList ListarMarca()
    {
        return llenar.ListaMarca();
    }
    
     public ArrayList ListarCategoria()
    {
        return llenar.Categoria();
    }

      public ArrayList ListarLinea()
    {
        return llenar.Linea();
    }
      
         public ArrayList ListarTipo()
    {
        return llenar.TipoVehiculo();
    }
}
