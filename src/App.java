import Model.Evento;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        List<Evento> eventos = new ArrayList<>();
        new Menu(eventos).setVisible(true);
    }
}
