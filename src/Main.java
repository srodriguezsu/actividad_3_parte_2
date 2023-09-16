import FigurasGeometricas.Circulo;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");




        FigurasCreadas w =new FigurasCreadas();
        w.setContentPane(w.panelFigExist);

        w.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        w.setSize(1200,600);
        w.setVisible(true);
    }
}