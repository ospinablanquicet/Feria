package feria;

import java.util.Date;

public class feria {
    private String artistas;
    private int cantidadDeBotellos;
    private int personas;
    private Date diaDeFeria;
    private boolean hayGuaracha;
    private String generosDeMusica;

    
    public void botellosCaidos (){
        cantidadDeBotellos -=20;
    }
    public void personasNoAsisten (){
        personas -=54;
    }
    public String getGenerosDeMusica(){
        return generosDeMusica;
    }
    public void setGenerosDeMusica(String generosDeMusica){
        this.generosDeMusica = generosDeMusica;
    }

    public String getArtistas() {
        return artistas;
    }

    public void setArtistas(String artistas) {
        this.artistas = artistas;
    }

    public int getCantidadDeBotellos() {
        return cantidadDeBotellos;
    }

    public void setCantidadDeBotellos(int cantidadDeBotellos) {
        this.cantidadDeBotellos = cantidadDeBotellos;
    }

    public int getPersonas() {
        return personas;
    }

    public void setPersonas(int personas) {
        this.personas = personas;
    }

    public Date getDiaDeFeria() {
        return diaDeFeria;
    }

    public void setDiaDeFeria(Date diaDeFeria) {
        this.diaDeFeria = diaDeFeria;
    }

    public boolean isHayGuaracha() {
        return hayGuaracha;
    }

    public void setHayGuaracha(boolean hayGuaracha) {
        this.hayGuaracha = hayGuaracha;
    }
    
}
