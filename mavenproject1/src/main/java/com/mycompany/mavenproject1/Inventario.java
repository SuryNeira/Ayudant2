/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;

/**
 *
 * @author Sala-2-11-PC17
 */
public abstract class Inventario {
    int capacidad;
    ArrayList <Interactuables> ListaObjetos;

    public Inventario(int capacidad, ArrayList<Interactuables> ListaObjetos) {
        this.capacidad = capacidad;
        this.ListaObjetos = ListaObjetos;
    }
    
    public Inventario(){
        
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public ArrayList<Interactuables> getListaObjetos() {
        return ListaObjetos;
    }

    public void setListaObjetos(ArrayList<Interactuables> ListaObjetos) {
        this.ListaObjetos = ListaObjetos;
    }
    
    public void CrearInteractuable(int IdObjeto, String NombreObjeto){
        
        ListaObjetos.add(new Interactuables(IdObjeto, NombreObjeto));
               
        
    }
    
    public Interactuables LeerInteractuable(int IdObjeto){
        
        for(int i=0; i<ListaObjetos.size(); i++)
            if(ListaObjetos.get(i).getIdObjeto() == IdObjeto)
                return ListaObjetos.get(i);
        
        return null;
        
    }
    
    public boolean BorrarInteractuable(int idObjeto){
        for(int i=0; i<ListaObjetos.size(); i++)
            if(ListaObjetos.get(i).getIdObjeto() == idObjeto){
                ListaObjetos.remove(i);
                return true;
            }
        return false;
    }
    
    public void ModificarInteractuable(Interactuables objeto, int id){
        
      for(int i=0; i<ListaObjetos.size(); i++){
          if(ListaObjetos.get(i).getIdObjeto() != id && ListaObjetos.get(i).equals(objeto))
              ListaObjetos.set(i, objeto);
      }
    }
      
    public abstract void ImplementarObjeto ( int id);
    
        
   
    
}
