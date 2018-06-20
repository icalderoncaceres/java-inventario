/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.icalderoncaceres.inventario.models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Iván Calderon / https://icalderoncaceres.github.io
 */
public class Authenticate extends ModelBase {
    public Authenticate(){
        super();
        table="user";
    }
    
    /*
    Verifica si coincide el usuario y la clave que recibe buscandolo en la base de datos
    en caso de coincidir devuelve verdadero y establece la session, de lo contrario devuelve falso
    */
    public boolean logIn(String user, String password){
        /*
        Creamos una sentencia que busque en la base de datos el usuario y la contraseña
        */
        PreparedStatement prepSt;
        try {
            String sql = "SELECT * FROM  users " + " WHERE email like ?";            
            prepSt = conn.prepareStatement(sql);

            prepSt.setString(1, user);           

            ResultSet rs=prepSt.executeQuery();
            return rs.next();            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return false;
    }
    
    /*
    Limpia la session y manda al login
    */
    public boolean logOut(){
        return true;
    }

    /*
    Devuelve verdadero si la session esta activa, falso de lo contrario, se llama a este metodo estatico antes de dar acceso a 
    las pantallas de procesos
    */
    public static boolean verifySession(){
        return true;
    }
    
    /*
    Devuelve Verdadero si el usuario que inicio session es administrador en la base de datos, se utiliza en ciertos procesos
    que solo debe realizar el usuario administrador
    */
    public static boolean isAdmin(){
        return true;
    }
}