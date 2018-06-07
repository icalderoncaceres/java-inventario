/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

/**
 *
 * @author Iván Calderon / https://icalderoncaceres.github.io
 */
public class Conexion {
    private String drive;
    private String url;
    private String user;
    private String password;
    private String database;
    
    public Conexion(String drive, String url, String user, String password, String database){
        this.drive=drive;
        this.url=url;
        this.password=password;
        this.database=database;
    }

    public String getDrive() {
        return drive;
    }

    public void setDrive(String drive) {
        this.drive = drive;
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
    
    public String Conectar(){
        return "Se realizara la conexión con estos parametros: \n DRIVE:" 
                + drive + "\n URL:" + url + "\n USER:" + user + "\n PASSWORD:" + password + "\n DATABASE:" + database;
    }
    
    
}
