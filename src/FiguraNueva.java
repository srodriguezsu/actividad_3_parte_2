import FigurasGeometricas.Circulo;
import FigurasGeometricas.Cuadrado;
import FigurasGeometricas.Rectangulo;
import FigurasGeometricas.TrianguloRectangulo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Objects;

public class FiguraNueva extends JFrame implements ItemListener{
    private JComboBox<String> opcionesFiguras;

    private JLabel figuraLabel;
    protected JPanel panelFigNueva;
    private JButton btnCrear;
    private JPanel panCirculo;
    private JSpinner inRadio;
    private JPanel panCuadrado;
    private JSpinner inLado;
    private JPanel panRectTria;

    private JSpinner inBase;
    private JSpinner inAltura;
    String tipo = "Circulo";

    public FiguraNueva(){



        opcionesFiguras.addItem("Circulo");
        opcionesFiguras.addItem("Cuadrado");
        opcionesFiguras.addItem("Rectangulo");
        opcionesFiguras.addItem("Triangulo Rectangulo");
        opcionesFiguras.addItemListener(this);

        panCirculo.setVisible(true);
        panCuadrado.setVisible(false);
        panRectTria.setVisible(false);


        btnCrear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(tipo);
                if (Objects.equals(tipo, "Circulo")) {
                    Circulo circuloNuevo = new Circulo((Integer) inRadio.getValue());
                    System.out.println(circuloNuevo.getArea());
                } else if (Objects.equals(tipo, "Cuadrado")) {
                    System.out.println(inLado.getValue());
                    Cuadrado cuadradoNuevo = new Cuadrado((Integer) inLado.getValue());
                    System.out.println(cuadradoNuevo.getPerimetro());
                } else  if(Objects.equals(tipo, "Rectangulo")){
                    Rectangulo rectanguloNuevo = new Rectangulo((Integer) inBase.getValue(), (Integer) inAltura.getValue() );
                    System.out.println(rectanguloNuevo.getPerimetro());
                } else if (Objects.equals(tipo, "Triangulo Rectangulo")){
                    TrianguloRectangulo trianguloNuevo = new TrianguloRectangulo((Integer) inBase.getValue(), (Integer) inAltura.getValue());
                    System.out.println(trianguloNuevo.getHipotenusa());
                }

                FigurasCreadas w =new FigurasCreadas();
                w.setContentPane(w.panelFigExist);
                w.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                w.setSize(600,400);
                w.setVisible(true);


                setVisible(false);
                dispose();
            }
        });
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource() == opcionesFiguras){
            String seleccion = (String) opcionesFiguras.getSelectedItem();
            tipo = seleccion;
            setTitle(tipo);
            if (Objects.equals(seleccion, "Circulo")) {
                panCirculo.setVisible(true);
                panCuadrado.setVisible(false);
                panRectTria.setVisible(false);

                } else if (Objects.equals(seleccion, "Cuadrado")) {
                panCirculo.setVisible(false);
                panCuadrado.setVisible(true);
                panRectTria.setVisible(false);
            } else  {
                panCirculo.setVisible(false);
                panCuadrado.setVisible(false);
                panRectTria.setVisible(true);

            }
            }
        }

    }
