
package com.mycompany.recorridoarbol;


public class NodoArbol<T> {
    private T dato;// T definicion de un nodo generico
    private NodoArbol[] hijo; 
//para construcctotor boton derecho insertar code, y dar en constructor, getter y setter
    public NodoArbol(T dato, NodoArbol[] hijo) {
        this.dato = dato;
        this.hijo = hijo;
        
    }

    NodoArbol() {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       
    }
    
    

    public T getDato() {
        return dato;
    }

    public NodoArbol[] getHijo() {
        return hijo;
        
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public void setHijo(NodoArbol[] hijo) {
        this.hijo = hijo;
      
    }
    public void setHijo(int pos, T dato){
      //this.hijo=new NodoArbol[1];
    
      
    }
    
    public void preorden(){
        System.out.println(this.dato);
        if(hijo == null) return;
        for(NodoArbol n: hijo){
            System.out.println("  ");
          n.preorden();
        }  
    }
    
}//se usa arreglo de hijos
// viene los metodos