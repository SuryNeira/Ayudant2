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
public class Pokemon extends Interactuables implements Habilidad{
    private Tipo_Pokemon tipoPokemon;
    private ArrayList<Habilidad> ataques;
    private int vida;
    private int nivel;

    public Pokemon(int idPokemon, String nombrePokemon, Tipo_Pokemon tipoPokemon, ArrayList<Habilidad> ataques, int vida, int nivel) {
        super(idPokemon,nombrePokemon);
        this.tipoPokemon = tipoPokemon;
        this.ataques = ataques;
        this.vida = vida;
        this.nivel = nivel;
    }

    public Pokemon() {
    }
    

    public Tipo_Pokemon getTipoPokemon() {
        return tipoPokemon;
    }

    public ArrayList<Habilidad> getAtaques() {
        return ataques;
    }

    public int getVida() {
        return vida;
    }

    public int getNivel() {
        return nivel;
    }


    public void setTipoPokemon(Tipo_Pokemon tipoPokemon) {
        this.tipoPokemon = tipoPokemon;
    }

    public void setAtaques(ArrayList<Habilidad> ataques) {
        this.ataques = ataques;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public void matar() {
        System.out.println("matando.....");
    }

    @Override
    public void atacar() {
        System.out.println("atacando......");
    }

    @Override
    public void morir() {
        System.out.println("muriendo.....");
    }

    @Override
    public void saltar() {
        System.out.println("saltando.....");
    }
    
    
    
}
