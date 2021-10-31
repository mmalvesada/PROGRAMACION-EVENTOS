/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo2;

/**
 *
 * @author MARIA MALVESADA
 */
  import javax.swing.*;

import java.awt.event.*;

public class Ejemplo2 extends JFrame implements ActionListener{

private JButton boton1,boton2,boton3;

public Ejemplo2() {

//Layout absoluto

setLayout(null);

//Tamaño de la ventana

setBounds(0,0,350,200);

//Título

setTitle("Ejemplo 2: Botones");

//No redimensionable

setResizable(false);

//Cerrar proceso al cerrar la ventana

setDefaultCloseOperation(EXIT_ON_CLOSE);

//Botones

boton1=new JButton("1");

boton1.setBounds(10,100,90,30);

add(boton1);

boton1.addActionListener(this);

boton2=new JButton("2");

boton2.setBounds(110,100,90,30);

add(boton2);

boton2.addActionListener(this);

boton3=new JButton("3");

boton3.setBounds(210,100,90,30);

add(boton3);

boton3.addActionListener(this);

//Muestro JFrame (lo último para que lo pinte todo correctamanete)

setVisible(true);

}

public void actionPerformed(ActionEvent e) {

if (e.getSource()==boton1) {

setTitle("boton 1");

}

if (e.getSource()==boton2) {

setTitle("boton 2");

}

if (e.getSource()==boton3) {

setTitle("boton 3");

}

}

public static void main(String[] args) {

new Ejemplo2();

}

}