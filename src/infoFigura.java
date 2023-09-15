import javax.swing.*;
import java.awt.event.*;

public class infoFigura extends JDialog {
    protected JPanel contentPane;
    private JButton buttonOK;
    public JLabel info;
    public JLabel area;
    public JLabel perimetro;
    public JLabel inicial;
    public JLabel tipoTriang;
    public JLabel hipotenusa;


    public infoFigura() {
        hipotenusa.setVisible(false);
        tipoTriang.setVisible(false);
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });


    }

}
