package com.gestor_cursos.GestionCursos.igu;

import com.gestor_cursos.GestionCursos.logica.Controlador;
import com.gestor_cursos.GestionCursos.logica.Grupos;
import com.gestor_cursos.GestionCursos.logica.Monitor;
import com.gestor_cursos.GestionCursos.logica.Profesor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class GruposIGU extends JFrame implements ActionListener, MouseListener {

	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel model;
	private JButton btnVolver, btnGrupo, btnEditar, btnEliminar;
        Controlador controlador = null;
        
	public GruposIGU() {
                controlador = new Controlador();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		iniciarComponentes();
                llenarTabla();
		
		setTitle("GRUPOS");
		setLocationRelativeTo(null);
		setResizable(false);
	}

	private void iniciarComponentes() {
		setBounds(100, 100, 827, 272);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("GRUPOS");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Roboto", Font.BOLD | Font.ITALIC, 20));
		lblTitulo.setBounds(10, 11, 735, 27);
		contentPane.add(lblTitulo);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 49, 693, 136);
		contentPane.add(scrollPane);
		
		table = new JTable();
		model = new DefaultTableModel();
		table.setModel(model);
		
		model.addColumn("Id");
                model.addColumn("Nombre");
		model.addColumn("Horario");
		model.addColumn("Instructor");
		model.addColumn("Monitor");
		
		table.addMouseListener(this);
		
		scrollPane.setViewportView(table);
		
		btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Roboto", Font.PLAIN, 14));
		btnVolver.addActionListener(this);
		btnVolver.setBounds(184, 196, 89, 23);
		contentPane.add(btnVolver);
		
		btnGrupo = new JButton("Añadir grupo");
		btnGrupo.setFont(new Font("Roboto", Font.PLAIN, 14));
		btnGrupo.addActionListener(this);
		btnGrupo.setBounds(401, 196, 184, 23);
		contentPane.add(btnGrupo);
		
		btnEditar = new JButton("Editar");
		btnEditar.setBounds(712, 49, 89, 48);
		contentPane.add(btnEditar);
		
		btnEliminar = new JButton("Eliminar");
                btnEliminar.addActionListener(this);
		btnEliminar.setBounds(712, 137, 89, 48);
		contentPane.add(btnEliminar);
	}
	
        private void llenarTabla() {
            List<Grupos> grupos = controlador.retornarGrupos();
            
            for (Grupos grupo : grupos){
                Object[] fila = new Object[5];
		fila[0] = grupo.getId();
                fila[1] = grupo.getNombre();
		fila[2] = grupo.getHorario();
                if(grupo.getProfesor()==null){
                    fila[3] = "Sin asignar";
                }
                else{
                    Profesor profe = grupo.getProfesor();
                    fila[3] = profe.getNombre();
                }
                if(grupo.getMonitor()==null) {
                    fila[4] = "Sin asignar";
                }
                else{
                    Monitor monitor = grupo.getMonitor();
                    fila[4] = monitor.getNombre();
                }
                
                model.addRow(fila);
            }
        }
        
	@Override
	public void actionPerformed(ActionEvent e) {
		if (btnVolver == e.getSource()) {
			InicioIGU ventanaInicio = new InicioIGU();
			ventanaInicio.setVisible(true);
			dispose();
		}
                else if (btnGrupo == e.getSource()) {
			AgregarGrupoIGU ventanaAgregar = new AgregarGrupoIGU();
			ventanaAgregar.setVisible(true);
			dispose();
		}
                else if (btnEliminar == e.getSource()) {
                    if(table.getRowCount()>0 && table.getSelectedRow()!=-1){
                        int idGrupo = Integer.parseInt(String.valueOf(table.getValueAt(table.getSelectedRow(), 0)));
                        controlador.borrarGrupo(idGrupo);
                        model.removeRow(table.getSelectedRow());
                    }
                }
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
