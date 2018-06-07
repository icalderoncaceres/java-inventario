/*
 * En esta clase guardamos la configuración de las diferentes conexiones por entorno
 * dev=desarrollo, stg=testing, prod=Producción
 */
package config;

/**
 *
 * @author Iván Calderon / https://icalderoncaceres.github.io
 */
public class Database {
    private static Conexion dev;
    private static Conexion stg;
    private static Conexion prod;
    public static final String active="dev";
    
    /*
    Creamos las conexiones
    */    
    
    public Database(){
        dev=new Conexion("postgress","localhost","userlocal","passwordlocal","dblocal");
        stg=new Conexion("mysql","54.253.325.32","userstg","passwordstg","dbstg");
        prod=new Conexion("mongo","52.25.35.325","userprod","passwordprod","dbprod");
    }
    
    public Conexion getConexion(){
        if(active.equals("dev")){
           return dev;          
        }else if(active.equals("stg")){
            return stg;
        }else if(active.equals("prod")){
            return prod;
        }else{
            return dev;
        }
    }
}