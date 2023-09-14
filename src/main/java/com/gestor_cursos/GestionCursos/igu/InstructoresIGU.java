package com.gestor_cursos.GestionCursos.igu;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.gestor_cursos.GestionCursos.logica.Controlador;
import com.gestor_cursos.GestionCursos.logica.Profesor;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class InstructoresIGU extends JFrame implements ActionListener, MouseListener {

	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel model;
	private JButton btnVolver, btnInstructor,btnEditar, btnEliminar;
        private Controlador controlador;
        
	public InstructoresIGU() {
		controlador = new Controlador();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		iniciarComponentes();
		llenarTabla();
		
		setTitle("INSTRUCTORES");
		setLocationRelativeTo(null);
		setResizable(false);
	}

	private void iniciarComponentes() {
		setBounds(100, 100, 814, 272);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("INSTRUCTORES");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Roboto", Font.BOLD | Font.ITALIC, 20));
		lblTitulo.setBounds(10, 11, 735, 27);
		contentPane.add(lblTitulo);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 49, 684, 136);
		contentPane.add(scrollPane);
		
		table = new JTable();
		model = new DefaultTableModel();
		table.setModel(model);
		
                model.addColumn("Codigo");
		model.addColumn("Nombre");
		model.addColumn("Telefono");
		model.addColumn("Fecha de nacimiento");
		model.addColumn("Dirección");
		model.addColumn("Email");
		
		table.addMouseListener(this);
		
		scrollPane.setViewportView(table);
		
		btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Roboto", Font.PLAIN, 14));
		btnVolver.addActionListener(this);
		btnVolver.setBounds(184, 196, 89, 23);
		contentPane.add(btnVolver);
		
		btnInstructor = new JButton("Añadir instructor");
		btnInstructor.setFont(new Font("Roboto", Font.PLAIN, 14));
		btnInstructor.addActionListener(this);
		btnInstructor.setBounds(401, 196, 184, 23);
		contentPane.add(btnInstructor);
		
		btnEditar = new JButton("Editar");
		btnEditar.setBounds(704, 49, 89, 48);
		contentPane.add(btnEditar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(704, 137, 89, 48);
		contentPane.add(btnEliminar);
	}

	private void llenarTabla() {
		List<Profesor> profesores = controlador.retornarProfesores();
		
		for (Profesor profe : profesores) {
<<<<<<< HEAD
			Object[] fila = new Object[6];
		    fila[0] = profe.getCodigo();
                    fila[1] = profe.getNombre();
		    fila[2] = profe.getTelefono();
		    fila[3] = profe.getFecha_nacimiento();
		    fila[4] = profe.getDireccion();
		    fila[5] = profe.getEmail();
=======
			Object[] fila = new Object[5];
		    fila[0] = profe.getNombre();
		    fila[1] = profe.getTelefono();
		    fila[2] = profe.getFecha_nacimiento();
		    fila[3] = profe.getDireccion();
		    fila[4] = profe.getEmail();
>>>>>>> 9f2f383e4c40eaf40ca7475a0d5ce81283ba953c
		    model.addRow(fila);
		}
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (btnVolver == e.getSource()) {
			InicioIGU ventanaInicio = new InicioIGU();
			ventanaInicio.setVisible(true);
		}
                else if(btnInstructor == e.getSource()) {
                        AgregarFuncionarioIGU agregarFuncionario = new AgregarFuncionarioIGU(0);
                        agregarFuncionario.setVisible(true);
                }
                dispose();
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
