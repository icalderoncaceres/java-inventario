/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Iván Calderon / https://icalderoncaceres.github.io
 */
public final class Conexion {
    private String driver;
    private String url;
    private String user;
    private final String password;
    private final String database;
    private static Connection conn;
    
    public Conexion(String driver, String url, String user, String password, String database){
        this.driver=driver;
        this.url=url;
        this.password=password;
        this.database=database;
        this.Conectar();
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }
    
    private void Conectar(){
        conn=null;
        try{
            Class.forName(driver);
            conn = (Connection) DriverManager.getConnection(url + "/" + database, user, password);
            if(conn!=null){
                System.out.println("Conexión exitosa");
                
            }
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("No se pudó conectar");
        }       
    }   

    public PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}