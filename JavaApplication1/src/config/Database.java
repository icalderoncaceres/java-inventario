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
    /*
    Por cada conexión creamos un array de string con los datos de conexión de la forma
    {'driver','url/database','user','password'}
    */    
    private static final String[] dev={"com.mysql.jdbc.Driver","jdbc:mysql://35.197.37.204","root","HNLflpMniLbeI5Ag","widget"};
    private static final String[] stg={"com.mysql.jdbc.Driver","jdbc:mysql://35.197.37.204","root","HNLflpMniLbeI5Ag","widget"};
    private static final String[] prod={"com.mysql.jdbc.Driver","jdbc:mysql://35.197.37.204","root","HNLflpMniLbeI5Ag","widget"};
    
    /**
     *
     * @param environment String que indica el entorno de la conexión
     * @return un array con los parametros de configuración
     */
    public static String[] getParams(String environment){
        switch (environment) {
            case "dev":
                return dev;
            case "stg":
                return stg;
            default:
                return prod;
        }
    }
    
}