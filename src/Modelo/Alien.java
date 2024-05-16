/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;


import javax.swing.JLabel;

/**
 *
 * @author jhona
 */
public class Alien extends SuperHumano implements Runnable{
    
    Thread t;
    private int posicion;

    public Alien(String nombre, JLabel personaje, JLabel labefinal) {
        super(nombre, personaje, labefinal);
        t = new Thread(this);
    }
    


    @Override
    public void run() {
        int retardo;
        
        try {
            
            retardo = (int) (Math.random() * 15)+ 1 ;
            labefinal.setVisible(false);
            personaje.setVisible(true);
            
            for(int i=50; i<=500; i++){
                personaje.setLocation(i,personaje.getY());
                Thread.sleep(retardo);
                
            }
            personaje.setVisible(false);
            labefinal.setVisible(true);
            // Actualizamos la posición al llegar a la meta
            posicion = SuperHumano.getContadorGlobal();
            SuperHumano.actualizarContadorGlobal();

            personaje.setVisible(false);
            labefinal.setVisible(true);
            labefinal.setText(nombre + " ha llegado en la posición: " + posicion);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void iniciarHilo() {
        t.start(); // Inicia el hilo en un método separado
    }
    
    
}
