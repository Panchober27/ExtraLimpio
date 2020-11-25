/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import vistas.PjpzProducciones;
import vistas.Index;

/**
 * Metodo main que arranca la aplicacion, desplegando la interfaz: Index.java
 *
 * @author Francisco
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        
        
        System.out.println("Iniciando Programa...");
        System.out.println("Inicia CRUD :S");
        //Interfaz del Logo del Estudio.
        PjpzProducciones log = new PjpzProducciones();
        log.setVisible(true);
        // Tiempo de pausa para que se acabe la interfaz del logo del estudio.
        Thread.sleep(3500);
        log.dispose();
        
        new Index().setVisible(true);
        
    }
}
