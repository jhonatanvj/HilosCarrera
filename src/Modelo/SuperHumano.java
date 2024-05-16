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
public class SuperHumano {
    

    String nombre;
    JLabel personaje;
    JLabel labefinal;
    private static int contadorGlobal = 1;

    public SuperHumano(String nombre, JLabel personaje, JLabel labefinal) {
        this.nombre = nombre;
        this.personaje = personaje;
        this.labefinal = labefinal;
    }
    
    
    // Método estático para actualizar el valor del contador global
    public static int getContadorGlobal() {
        return contadorGlobal;
    }
    
    // Método estático para actualizar el valor del contador global
    public static void actualizarContadorGlobal() {
        contadorGlobal++;
    }
    
    // Método para obtener el valor del contador de la instancia actual
    public int getContadorInstancia() {
        return contadorGlobal;
    }
    
}
