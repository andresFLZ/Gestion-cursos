package com.gestor_cursos.GestionCursos.igu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class InicioIGU extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnInstructores, btnMonitores, btnGrupos;

	public InicioIGU() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		iniciarComponentes();
		
		setTitle("GESTIÓN DE CURSOS");
		setLocationRelativeTo(null);
		setResizable(false);
	}

	private void iniciarComponentes() {
		setBounds(100, 100, 540, 348);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(45, 157, 73));
		panel.setBounds(173, 0, 351, 309);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Gestor de cursos proyecto Atenea");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Roboto", Font.BOLD | Font.ITALIC, 20));
		lblTitulo.setBounds(0, 11, 351, 28);
		panel.add(lblTitulo);
		
		btnGrupos = new JButton("Ver grupos");
		btnGrupos.addActionListener(this);
		btnGrupos.setFont(new Font("Roboto", Font.BOLD, 16));
		btnGrupos.setBounds(90, 67, 167, 42);
		panel.add(btnGrupos);
		
		btnInstructores = new JButton("Ver instructores");
		btnInstructores.addActionListener(this);
		btnInstructores.setFont(new Font("Roboto", Font.BOLD, 16));
		btnInstructores.setBounds(90, 145, 167, 43);
		panel.add(btnInstructores);
		
		btnMonitores = new JButton("Ver monitores");
		btnMonitores.addActionListener(this);
		btnMonitores.setFont(new Font("Roboto", Font.BOLD, 16));
		btnMonitores.setBounds(90, 224, 167, 42);
		panel.add(btnMonitores);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(InicioIGU.class.getResource("/com/gestor_cursos/GestionCursos/imagenes/inicio.jpg")));
		lblNewLabel.setBounds(0, 0, 173, 309);
		contentPane.add(lblNewLabel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (btnInstructores == e.getSource()) {
			InstructoresIGU ventanaInstructores = new InstructoresIGU();
			ventanaInstructores.setVisible(true);
			dispose();
		}
		if (btnGrupos == e.getSource()) {
			GruposIGU ventanaGrupos = new GruposIGU();
			ventanaGrupos.setVisible(true);
			dispose();
		}
		if (btnMonitores == e.getSource()) {
			MonitoresIGU ventanaMonitores = new MonitoresIGU();
			ventanaMonitores.setVisible(true);
			dispose();
		}
	}
}
