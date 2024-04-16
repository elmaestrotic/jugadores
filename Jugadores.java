package com.narvasoft.gui;
import java.util.concurrent.atomic.AtomicInteger;
public class Jugadores {
   private static final AtomicInteger idGen = new AtomicInteger(0);
   private int id;
   private String nombre;
   private String juegoFavortio;
   private char level;
   private int maxScore;
   
   
   

    public static int getNextID() {
        return idGen.incrementAndGet();
    }

    public Jugadores(String nombre, String juegoFavortio, char level, int maxScore) {
        this.nombre =nombre;
        this.juegoFavortio = juegoFavortio;
        this.level = level;
        this.maxScore = maxScore;
        this.id=getNextID();
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getJuegoFavortio() {
        return juegoFavortio;
    }

    public void setJuegoFavortio(String juegoFavortio) {
        this.juegoFavortio = juegoFavortio;
    }

    public char getLevel() {
        return level;
    }

    public void setLevel(char level) {
        this.level = level;
    }

    public int getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(int maxScore) {
        this.maxScore = maxScore;
    }
    
    
   
    
    
    
}
