/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilos;

import javax.swing.JLabel;

/**
 *
 * @author jhona
 */
public class Hilospa implements Runnable{
    
    Thread t;
    
    String nombre;
    
    JLabel personaje;
    
    JLabel labefinal;
    
    public static int lugar;
    
    public Hilospa(String nombre, JLabel personaje, JLabel labefinal ){
        this.nombre = nombre;
        this.personaje = personaje;
        this.labefinal = labefinal;
         t = new Thread(this); 
    }

    @Override
    public void run() {
        int retardo;
        
        try {
            lugar = 1;
            retardo = (int) (Math.random() * 15)+ 1 ;
            labefinal.setVisible(false);
            personaje.setVisible(true);
            
            for(int i=50; i<=500; i++){
                personaje.setLocation(i,personaje.getY());
                Thread.sleep(retardo);
                
            }
            personaje.setVisible(false);
            labefinal.setVisible(true);
            labefinal.setText(nombre +"Hallegado en la pos: "+ lugar);
            lugar++;
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
        public void iniciarHilo() {
        t.start(); // Inicia el hilo en un método separado
    }
    
   
}
