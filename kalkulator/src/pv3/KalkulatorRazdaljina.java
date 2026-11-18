package pv3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KalkulatorRazdaljina extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JTextField razdaljina;
    private JTextField razmera;
    private JLabel rezultat;

    public KalkulatorRazdaljina() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });
    }

    private void onOK() {
        double razdaljina2 = Double.parseDouble(razdaljina.getText());
        double razmera2 = Double.parseDouble(razmera.getText());
        rezultat.setText(razdaljina2*razmera2/100000 +"km");
    }

    public static void main(String[] args) {
        KalkulatorRazdaljina dialog = new KalkulatorRazdaljina();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
