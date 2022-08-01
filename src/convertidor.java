import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class convertidor {
    private JTextField origenTF;
    private JTextField destinoTF;
    private JButton convetirBTN;
    private JComboBox origenCB;
    private JComboBox destinoCB;
    private JLabel origenTxt;
    private JLabel destinoTxt;
    private JLabel auxiliarTxt;
    private JPanel mainPanel;

    public convertidor() {
        origenCB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                auxiliarTxt.setText(" " + origenCB.getSelectedItem());
            }
        });
        convetirBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double [] tarifas={20.45,4287.10,3.93,131.32,6.87};
                double tarifaSeleccionada=tarifas[destinoCB.getSelectedIndex()];
                double resultado = Double.parseDouble(origenTF.getText())*tarifaSeleccionada;
                destinoTF.setText(""+resultado);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("convertidor");
        frame.setContentPane(new convertidor().mainPanel);
        frame.setTitle("convertidor");
        frame.setSize(600,300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
