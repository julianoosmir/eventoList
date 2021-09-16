package Model;

import java.util.List;

public class OpenBar extends Evento {
   private List<Bebida> bebidas;
   
    public List<Bebida> getBebidas() {
        return this.bebidas;
    }
    public void setBebidas(List<Bebida> bebidas) {
        this.bebidas = bebidas;
    }
    public OpenBar bebidas(List<Bebida> bebidas) {
        setBebidas(bebidas);
        return this;
    }
}
