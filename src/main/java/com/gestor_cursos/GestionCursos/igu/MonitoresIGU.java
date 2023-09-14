package com.gestor_cursos.GestionCursos.igu;

import com.gestor_cursos.GestionCursos.logica.Controlador;
import com.gestor_cursos.GestionCursos.logica.Monitor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class MonitoresIGU extends JFrame implements ActionListener, MouseListener {

	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel model;
	private JButton btnVolver, btnMonitor, btnEditar, btnEliminar;
        private Controlador controlador;

	public MonitoresIGU() {
                controlador = new Controlador();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		iniciarComponentes();
                llenarTabla();
		
		setTitle("MONITORES");
		setLocationRelativeTo(null);
		setResizable(false);
	}

	private void iniciarComponentes() {
		setBounds(100, 100, 836, 272);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("MONITORES");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Roboto", Font.BOLD | Font.ITALIC, 20));
		lblTitulo.setBounds(10, 11, 735, 27);
		contentPane.add(lblTitulo);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 49, 699, 136);
		contentPane.add(scrollPane);
		
		table = new JTable();
		model = new DefaultTableModel();
		table.setModel(model);
		
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
		
		btnMonitor = new JButton("Añadir monitor");
		btnMonitor.setFont(new Font("Roboto", Font.PLAIN, 14));
		btnMonitor.addActionListener(this);
		btnMonitor.setBounds(401, 196, 184, 23);
		contentPane.add(btnMonitor);
		
		btnEditar = new JButton("Editar");
		btnEditar.setBounds(721, 49, 89, 48);
		contentPane.add(btnEditar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(721, 137, 89, 48);
		contentPane.add(btnEliminar);
	}

        private void llenarTabla() {
		List<Monitor> monitores = controlador.retornarMonitores();
		
		for (Monitor monitor : monitores) {
                    Object[] fila = new Object[5];
		    fila[0] = monitor.getNombre();
		    fila[1] = monitor.getTelefono();
		    fila[2] = monitor.getFecha_nacimiento();
		    fila[3] = monitor.getDireccion();
		    fila[4] = monitor.getEmail();
		    model.addRow(fila);
		}
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (btnVolver == e.getSource()) {
			InicioIGU ventanaInicio = new InicioIGU();
			ventanaInicio.setVisible(true);
		}
                else if(btnMonitor == e.getSource()) {
                        AgregarFuncionarioIGU agregarFuncionario = new AgregarFuncionarioIGU(1);
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
