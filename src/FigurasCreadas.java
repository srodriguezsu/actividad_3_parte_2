import FigurasGeometricas.Circulo;
import FigurasGeometricas.Cuadrado;
import FigurasGeometricas.Rectangulo;
import FigurasGeometricas.TrianguloRectangulo;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FigurasCreadas extends JFrame{
    private JLabel txt;
    protected JPanel panelFigExist;
    private JLabel tagFigExist;
    private JLabel tagCirculos;
    private JLabel tagCuadrados;
    private JLabel tagRectangulos;
    private JList<Circulo> listCirculos;

    private JList<Cuadrado> listCuadrados;
    private JList<Rectangulo> listRectangulos;
    private JList<TrianguloRectangulo> listTriangulos;
    private JButton btnNuevaFig;

    public FigurasCreadas(){

        /* Definir modelo para insertar a la lista de los cuadrados */
        DefaultListModel<Cuadrado> modeloCuadrados = new DefaultListModel<>();
        for (Cuadrado elemento: Cuadrado.cuadradosList) {
            modeloCuadrados.addElement(elemento);
        }
        listCuadrados.setModel(modeloCuadrados);

        /* Definir modelo para insertar a la lista de los circulos */

        DefaultListModel<Circulo> modeloCirculo = new DefaultListModel<>();
        for (Circulo elemento: Circulo.circulosList) {
            modeloCirculo.addElement(elemento);
        }
        listCirculos.setModel(modeloCirculo);


        /* Definir modelo para insertar a la lista de los Rectangulos */

        DefaultListModel<Rectangulo> modeloRectangulo = new DefaultListModel<>();
        for (Rectangulo elemento: Rectangulo.rectangulosList) {
            modeloRectangulo.addElement(elemento);
        }
        listRectangulos.setModel(modeloRectangulo);


        /* Definir modelo para insertar a la lista de los triangulos */

        DefaultListModel<TrianguloRectangulo> modeloTriangulos = new DefaultListModel<>();
        for (TrianguloRectangulo elemento: TrianguloRectangulo.triangulosList) {
            modeloTriangulos.addElement(elemento);
        }
        listTriangulos.setModel(modeloTriangulos);

        btnNuevaFig.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FiguraNueva w =new FiguraNueva();
                w.setContentPane(w.panelFigNueva);
                w.setSize(600,400);
                w.setVisible(true);
                setVisible(false);
                dispose();
            }
        });

        /* Al hacer click a cada Circulo, muestra su info */
        listCirculos.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(e.getSource() == listCirculos){
                    Circulo seleccion = listCirculos.getSelectedValue();


                    infoFigura ventanaInfo = new infoFigura();
                    ventanaInfo.info.setText("Circulo");
                    ventanaInfo.inicial.setText("Radio: " + seleccion.getRadio());
                    ventanaInfo.perimetro.setText("Perimetro: " + seleccion.getPerimetro());
                    ventanaInfo.area.setText("Area: " + seleccion.getArea());

                    ventanaInfo.setContentPane(ventanaInfo.contentPane);
                    ventanaInfo.setSize(550,350);
                    ventanaInfo.setVisible(true);

                }
            }
        });


        /* Al hacer click a cada Cuadrado, muestra su info */
        listCuadrados.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(e.getSource() == listCuadrados){
                    Cuadrado seleccion = listCuadrados.getSelectedValue();


                    infoFigura ventanaInfo = new infoFigura();
                    ventanaInfo.info.setText("Cuadrado");
                    ventanaInfo.inicial.setText("Lado: " + seleccion.getLado());
                    ventanaInfo.perimetro.setText("Perimetro: " + seleccion.getPerimetro());
                    ventanaInfo.area.setText("Area: " + seleccion.getArea());

                    ventanaInfo.setContentPane(ventanaInfo.contentPane);
                    ventanaInfo.setSize(550,350);
                    ventanaInfo.setVisible(true);

                }
            }
        });


        /* Al hacer click a cada Rectangulo, muestra su info */
        listRectangulos.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(e.getSource() == listRectangulos){
                    Rectangulo seleccion = listRectangulos.getSelectedValue();


                    infoFigura ventanaInfo = new infoFigura();
                    ventanaInfo.info.setText("Rectangulo");
                    ventanaInfo.inicial.setText("Base: " + seleccion.getBase() + "       Altura: " + seleccion.getAltura());
                    ventanaInfo.perimetro.setText("Perimetro: " + seleccion.getPerimetro());
                    ventanaInfo.area.setText("Area: " + seleccion.getArea());

                    ventanaInfo.setContentPane(ventanaInfo.contentPane);
                    ventanaInfo.setSize(550,350);
                    ventanaInfo.setVisible(true);

                }
            }
        });


        /* Al hacer click a cada Triangulo, muestra su info */
        listTriangulos.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(e.getSource() == listTriangulos){
                    TrianguloRectangulo seleccion = listTriangulos.getSelectedValue();


                    infoFigura ventanaInfo = new infoFigura();
                    ventanaInfo.info.setText("Circulo");
                    ventanaInfo.inicial.setText("Base: " + seleccion.getBase() + "      Altura: " + seleccion.getAltura());
                    ventanaInfo.perimetro.setText("Perimetro: " + seleccion.getPerimetro());
                    ventanaInfo.area.setText("Area: " + seleccion.getArea());
                    ventanaInfo.hipotenusa.setVisible(true);
                    ventanaInfo.hipotenusa.setText("Hipotenusa: " + seleccion.getHipotenusa());
                    ventanaInfo.tipoTriang.setVisible(true);
                    ventanaInfo.tipoTriang.setText("Es un triangulo " + seleccion.getTipo());

                    ventanaInfo.setContentPane(ventanaInfo.contentPane);
                    ventanaInfo.setSize(550,350);
                    ventanaInfo.setVisible(true);

                }
            }
        });
    }
}
