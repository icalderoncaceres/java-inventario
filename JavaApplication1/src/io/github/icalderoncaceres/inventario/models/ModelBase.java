/*
* Esta clase es la única que interactuara con la base de datos. Las clases que la hereden tendrán disponibles los metodos del CRUD
* y podrá agregar nuevos metodos 
*/
package io.github.icalderoncaceres.inventario.models;

import com.mysql.jdbc.Connection;
import config.Conexion;
import config.Database;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Ivan Calderon / https://icalderoncaceres.github.io
 */
public class ModelBase {
    public String table;
    protected static Connection conn;
    
    public ModelBase(){
        /*
        Creamos una instancia de la clase Conex, la cual es la encargada de conectarse con la base de datos en función de los
        valores de config/database
        */
        String[] params=Database.getParams("dev");
        System.out.println("Tratará de conectarse");
        conn=null;
        try{
            Class.forName(params[0]);
            conn = (Connection) DriverManager.getConnection(params[1] + "/" + params[4], params[2], params[3]);
            if(conn!=null){
                System.out.println("Conexión exitosa");
                
            }else{
                System.out.println("No se pudó conectar");
            }
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("No se pudó conectar");
        }                
    }
    
    public final String index(){
        return "Lista todos los elementos de la tabla " + table;
    }
    
    public final String show(int id){
        return "Lista el elemento de la tabla " + table + " con el ID = " + id;
    }
    
    public final String update(Object obj){
        return "Actualiza un elemento de la tabla " + table;
    }
    
    public final String delete(int id){
        return "Elimina un elemento de la tabla " + table + " el que tiene el ID " + id;
    }
    
    public final String add(Object obj){
        return "Agrega un nuevo elemento a la tabla " + table;
    }    
    
}
