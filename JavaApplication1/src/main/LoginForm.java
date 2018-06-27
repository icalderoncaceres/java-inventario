/*
 * author: ivan calderon / https://icalderoncaceres.github.io
 */
package main;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import io.github.icalderoncaceres.inventario.controllers.AuthenticateController;
import io.github.icalderoncaceres.inventario.forms.MenuMain;
/**
 *
 * @author Iván Calderon / https://icalderoncaceres.github.io
 */
public class LoginForm extends JFrame{   
    /*
    Crea la pantalla y llama los metodos necesarios para el funcionamiento, finalmente muestra la ventana
    */
    JLabel lblUsuario;
    JTextField txtUsuario;
    JLabel lblPassword;
    JPasswordField txtPassword;
    JButton btnAceptar;
    JButton btnCancelar;
    AuthenticateController auth = new AuthenticateController();
            
    public void start(){
        setLayout(null);
        setBounds(200,200,400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        cargarElementos();
        establecerEventos();
        setVisible(true);
    }
    
    /*
    Crea los elementos que van a estar en la pamtalla y los agrega al jFrame
    */
    private void cargarElementos(){
        //Creamos los elementos
        lblUsuario = new JLabel("Usuario");
        txtUsuario = new JTextField();
        lblPassword = new JLabel("Password");
        txtPassword = new JPasswordField();
        btnAceptar = new JButton();
        btnCancelar = new JButton();
        btnAceptar.setText("Aceptar");
        btnCancelar.setText("Cancelar");
        
        //Posicionamos (x,y,w,h        
        lblUsuario.setBounds(50,50,150,50);
        lblPassword.setBounds(50,110,150,50);
        txtUsuario.setBounds(200,50,150,30);
        txtPassword.setBounds(200,110,150,30);
        btnAceptar.setBounds(50,250,100,30);
        btnCancelar.setBounds(150,250,100,30);
        
        //Los agregamos
        add(lblUsuario);
        add(txtUsuario);
        add(lblPassword);
        add(txtPassword);
        add(btnAceptar);
        add(btnCancelar);
    }
    
    private void establecerEventos(){
        MouseListener listener = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getSource().equals(btnAceptar)){
                    if(txtUsuario.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Debes indicar el nombre de usuario");
                        txtUsuario.requestFocus();
                        return;
                    }
                    if(Arrays.equals(txtPassword.getPassword(), new char[]{})){
                        JOptionPane.showMessageDialog(null, "Debes colocar la contraseña");
                        txtPassword.requestFocus();
                        return;
                    }
                    if(auth.logIn(txtUsuario.getText(), txtPassword.getPassword())){
                        JOptionPane.showMessageDialog(null,"Bienvenido");
                        MenuMain mm= new MenuMain();
                        mm.setVisible(true);
                        setVisible(false);
                    }else{
                        JOptionPane.showMessageDialog(null,"Datos incorrectos");
                    }
                }else{
                    txtUsuario.setText("");
                    txtPassword.setText("");
                    txtUsuario.requestFocus();
               }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }
        };
        btnCancelar.addMouseListener(listener);
        btnAceptar.addMouseListener(listener);
              
    }
}
