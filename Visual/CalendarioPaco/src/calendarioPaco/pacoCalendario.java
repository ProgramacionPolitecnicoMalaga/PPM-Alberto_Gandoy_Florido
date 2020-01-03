package calendarioPaco;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class pacoCalendario extends JFrame {
    private JPanel jpanelcalendar;
    private JPanel calendario1;
    private JPanel calendario2;
    private JTextField txtaño;
    private JTextField txtmes;
    private JTextField txtdias;
    private JTextField txthoras;
    private JTextField txtminutos;
    private JTextField txtsegundo;
    private JButton compararButton;
    private JButton limpiarButton;
    JDateChooser jDateChooser1 = new JDateChooser();
    JDateChooser jDateChooser2 = new JDateChooser();


    public pacoCalendario(){
        setContentPane(jpanelcalendar);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(400,250);

        calendario1.add(jDateChooser1);
        calendario2.add(jDateChooser2);

        jDateChooser1.setDateFormatString("dd/MM/yyyy");
        calendario1.add(jDateChooser1);
        jDateChooser2.setDateFormatString("dd/MM/yyyy");
        calendario2.add(jDateChooser2);

        compararButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            calcularJcalendar();
            }
        });
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            txtaño.setText(" ");
            txtmes.setText(" ");
            txtdias.setText(" ");
            txthoras.setText(" ");
            txtminutos.setText(" ");
            txtsegundo.setText(" ");

            }
        });
    }

    public void calcularJcalendar() {
        Date date1 = jDateChooser1.getDate();
        Date date2 = jDateChooser2.getDate();

        long min;
        if (date1.compareTo(date2) == -1) {
            min = date2.getTime()/60000 - date1.getTime()/60000;
        } else {
            min = date1.getTime()/60000 - date2.getTime()/60000;
        }

        txtminutos.setText(Long.toString(min));

        long sg = min*60;
        txtsegundo.setText(Long.toString(sg));

        long h = min/60;
        txthoras.setText(Long.toString(h));

        long dia = h/24;
        txtdias.setText(Long.toString(dia));

        long mes =  dia/30;
        txtmes.setText(Long.toString(mes));

        long year = dia/365;
        txtaño.setText(Long.toString(year));
    }

    public static void main(String[] args) {
        new pacoCalendario().setVisible(true);

    }
}
