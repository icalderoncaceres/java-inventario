/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.icalderoncaceres.inventario.controllers;

import io.github.icalderoncaceres.inventario.models.ModelBase;

/**
 *
 * @author Iván Calderon / https://icalderoncaceres.github.io
 */
public class ControllerBase {
    public String table="";
    ModelBase mb=new ModelBase();
    public String index(){
        
        return "Lista todos los elementos los llama del modelo especifico";
    }
    
    public String show(int id){
        return "Devuelve un elemento";
    }
    
    public String add(Object obj){
        return "Inserta un elemento";
    }
    
    public String update(Object obj, int id){
        return "Actualiza un elemento";
    }
    
    public String delete(int id){
        return "Elimina un elemento";
    }
        
}
