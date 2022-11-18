/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import datos.Viaje;

/**
 *
 * @author Maria Jose Amezquita
 */
public class Arrow {
    private Node a, b;
    private Viaje viaje;

    public Arrow(Node a, Node b, Viaje viaje) {
        this.a = a;
        this.b = b;
        this.viaje = viaje;
    }

    public Node getA() {
        return a;
    }

    public void setA(Node a) {
        this.a = a;
    }

    public Node getB() {
        return b;
    }

    public void setB(Node b) {
        this.b = b;
    }

    public Viaje getViaje() {
        return viaje;
    }

    public void setViaje(Viaje viaje) {
        this.viaje = viaje;
    }
    
    
}