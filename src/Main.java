import FigurasGeometricas.Circulo;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");




        FigurasCreadas w =new FigurasCreadas();
        w.setContentPane(w.panelFigExist);
        w.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        w.setSize(600,400);
        w.setVisible(true);
    }
}