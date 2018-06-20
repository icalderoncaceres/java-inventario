/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.icalderoncaceres.inventario.forms;

import java.awt.FlowLayout;
import javax.swing.JFrame;

/**
 *
 * @author dellext
 */
public class MainMenu extends JFrame {
    public MainMenu(){
        FlowLayout flowLayout = new FlowLayout();
        setLayout(flowLayout);
        setBounds(200,200,400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);

        setVisible(true);
    }
}
