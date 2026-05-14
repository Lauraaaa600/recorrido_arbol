/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.recorridoarbol;


public class RecorridoArbol {

    public static void main(String[] args) {
        NodoArbol tree= new NodoArbol<Integer>();//crear un constructor ya que marca error
        tree.setDato(45);
        
        tree.setHijo( new NodoArbol[] {new NodoArbol (23, null),new NodoArbol (11, null)});
        tree.preorden();
        tree.getHijo()[0].setHijo(0, new NodoArbol<Integer>()); tree.getHijo()[0].getHijo()[0].setDato(50);
        //asignarle al hijo del hijo de la raiz
        tree.getHijo()[1].setHijo(40);
        tree.preorden();
    }//se crea un metodo set, para asiganrle un dato al nodo que ya lo defini pero no tiene ni hijos, ni datos
     // Hacerle un new al arreglo,y un nwe para cada hijo por que es un nodo
    
}
