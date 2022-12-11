
package pro1p1_akeemieong;

import java.util.ArrayList;


public class LabotifyInfo {
    private String nombre;
    private String albun;
    private String artist;
    private int ano;
    private int time;
    public LabotifyInfo() {
    }

    public LabotifyInfo(String nombre, String albun, String artist, int ano, int time) {
        this.nombre = nombre;
        this.albun = albun;
        this.artist = artist;
        this.ano = ano;
        this.time = time;
    }
    
    
  

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlbun() {
        return albun;
    }

    public void setAlbun(String albun) {
        this.albun = albun;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Nombre de la cancion: " + nombre 
                +"\nAlbum proveniente: " + albun 
                +"\nNombre del artista: " + artist 
                +"\nAño que se publico: " + ano 
                +"\nTiempo de duracion: " + time+"\n" ;
    }
    
}
