/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;



/**
 *
 * @author Estudiante
 */
public class Pokedex extends Inventario{

    public Pokedex(int capacidad, ArrayList<Interactuables> ListaObjetos) {
        super(capacidad, ListaObjetos);
    }
    
    //elegir pokemon si
    @Override
    public void ImplementarObjeto(int idPokemon){
        
        for(int i=0; i<ListaObjetos.size(); i++)
            if(ListaObjetos.get(i).getIdObjeto()==idPokemon)
                System.out.print("Pokemon elegido");
        
        System.out.print("Pokemon no encontrado");
        
    }

    

    
    
}
