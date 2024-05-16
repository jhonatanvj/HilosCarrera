/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Modelo.Alien;
import Modelo.HombreLobo;
import Modelo.Vampiro;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author jhona
 */
public class Ventana extends JFrame{
    
    public Ventana(){
        super("Carrera");
        JLabel vampiro,hombrelobo,alien,vampiro_pos,hombrelobo_pos,alien_pos;
        JButton botonIniciarCarrera;
        
        setSize(500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        
        
        Image imagen_vampiro = new ImageIcon("Imagenes/vampiro.jpg").getImage();
        ImageIcon Icon_vampiro = new ImageIcon(imagen_vampiro.getScaledInstance(50, 50,Image.SCALE_DEFAULT));
        vampiro = new JLabel();
        vampiro.setIcon(Icon_vampiro);
        vampiro.setBounds(50,50,50,50);
        
        Image imagen_hombrelobo = new ImageIcon("Imagenes/hombrelobo.jpg").getImage();
        ImageIcon Icon_hombrelobo = new ImageIcon(imagen_hombrelobo.getScaledInstance(50, 50,Image.SCALE_DEFAULT));
        hombrelobo = new JLabel();
        hombrelobo.setIcon(Icon_hombrelobo);
        hombrelobo.setBounds(50,100,50,50);
        
        Image imagen_alien = new ImageIcon("Imagenes/alien.jpg").getImage();
        ImageIcon Icon_alien = new ImageIcon(imagen_alien.getScaledInstance(50, 50,Image.SCALE_DEFAULT));
        alien = new JLabel();
        alien.setIcon(Icon_alien);
        alien.setBounds(50,150,50,50);
        
        vampiro_pos = new JLabel();
        vampiro_pos.setBounds(50,50,350,50);
        
        hombrelobo_pos = new JLabel();
        hombrelobo_pos.setBounds(50,100,350,50);
        
        alien_pos = new JLabel();
        alien_pos.setBounds(50,150,350,50);
        
        botonIniciarCarrera = new JButton("Inicio Carrera");
        botonIniciarCarrera.setBounds(150,200,150,50);
        
        botonIniciarCarrera.addActionListener(new ActionListener(){
           

            @Override
            public void actionPerformed(ActionEvent e) {
                Alien thalien = new Alien("Alien",alien,alien_pos);
                Vampiro thvampiro = new Vampiro("Vampiro",vampiro,vampiro_pos);
                HombreLobo thhombrelobo = new HombreLobo("HombreLobo",hombrelobo,hombrelobo_pos);
             
                thvampiro.iniciarHilo();
                thhombrelobo.iniciarHilo();
                thalien.iniciarHilo();
            }
        });
        
        panel.add(vampiro);
        panel.add(vampiro_pos);
        panel.add(hombrelobo);
        panel.add(hombrelobo_pos);
        panel.add(alien);
        panel.add(alien_pos);
        panel.add(botonIniciarCarrera);
        
        add(panel);
        setVisible(true);
        
        
        
                
        
        
        
    }    
    
    
    
}
