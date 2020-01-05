package com.Politecnico;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class productoPaco {


    BufferedReader br;
    String linea;
    static File listaProductos = new File("productos.csv");
    private JScrollPane jScrollPane;
    private JButton botonProducto;
    private JTextField txtIntroProd;
    private JTextArea txtResultadoProd;
    private JPanel panelMain;


    public productoPaco() {
        botonProducto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                txtResultadoProd.setText("");

                try {
                    br = new BufferedReader(new FileReader(listaProductos.getAbsolutePath()));
                    linea = br.readLine();
                    while (linea != null){
                        if (linea.toLowerCase().contains(txtIntroProd.getText().toLowerCase())){
                            txtResultadoProd.append(linea);
                            txtResultadoProd.append(System.getProperty("line.separator"));
                        }
                        linea = br.readLine();
                    }
                } catch (Exception e1) {
                    e1.printStackTrace();

                }finally {
                    if (br !=null){
                        try {
                            br.close();
                        } catch (IOException ex) {
                            ex.printStackTrace();
                    }
                }

                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Productos");
        frame.setContentPane(new productoPaco().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}

