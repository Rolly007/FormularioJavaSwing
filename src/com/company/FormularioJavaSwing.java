package com.company;

import javax.swing.*;
import java.awt.*;

public class FormularioJavaSwing extends JFrame {
    private JLabel label1, label2, label3, label4, label5;
    private JTextField texto1, texto2, texto3;
    private JComboBox combo1;
    private JCheckBox check1, check2, check3;
    private JButton boton;

    public FormularioJavaSwing() {
        super("Formulario de Registro");

        setSize(400, 650);
        setLayout(null);
        label1 = new JLabel("Nombre :");
        label2 = new JLabel("Apellidos :");
        label3 = new JLabel("C.I. :");
        label4 = new JLabel("Emitido en :");
        label5 = new JLabel("Intereses :");

        texto1 = new JTextField(10);
        texto2 = new JTextField(10);
        texto3 = new JTextField(10);

        String[] lugar = {"La Paz", "Cohabamba", "Santa Cruz", "Oruro", "Potosi", "Chuqisaca", "Tarija", "Beni", "Pando"};
        combo1 = new JComboBox(lugar);

        check1 = new JCheckBox("Tecnologia");
        check2 = new JCheckBox("Musica");
        check3 = new JCheckBox("Deporte");

        boton = new JButton("Guardar");
        label1.setBounds(100, 75, 100, 30);
        add(label1);
        texto1.setBounds(200, 75, 150, 30);
        add(texto1);
        label2.setBounds(100, 125, 100, 30);
        add(label2);
        texto2.setBounds(200, 125, 150, 30);
        add(texto2);
        label3.setBounds(100, 175, 100, 30);
        add(label3);
        texto3.setBounds(200, 175, 150, 30);
        add(texto3);
        label4.setBounds(100, 225, 100, 30);
        add(label4);
        combo1.setBounds(200, 225, 150, 30);
        add(combo1);
        label5.setBounds(100, 275, 100, 30);
        add(label5);
        check1.setBounds(150, 305, 100, 50);
        check2.setBounds(150, 340, 100, 50);
        check3.setBounds(150, 375, 100, 50);
        add(check1);
        add(check2);
        add(check3);
        boton.setBounds(180, 430, 100, 50);
        add(boton);
    }
}
