package com.gestor_cursos.GestionCursos.igu;

import com.gestor_cursos.GestionCursos.logica.Controlador;
import com.gestor_cursos.GestionCursos.logica.Grupos;
import com.gestor_cursos.GestionCursos.logica.Monitor;
import com.gestor_cursos.GestionCursos.logica.Profesor;
import java.util.List;

public class AgregarGrupoIGU extends javax.swing.JFrame {

    Controlador controlador = null;
    
    public AgregarGrupoIGU() {
        controlador = new Controlador();
        
        initComponents();
        this.setLocationRelativeTo(null);
        
        llenarComboBox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldHorario = new javax.swing.JTextField();
        jLabelNombre = new javax.swing.JLabel();
        jLabelHorario = new javax.swing.JLabel();
        jLabelInstructor = new javax.swing.JLabel();
        jLabelMonitor = new javax.swing.JLabel();
        jButtonVolver = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jComboBoxInstructor = new javax.swing.JComboBox<>();
        jComboBoxMonitor = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("AGREGAR GRUPO");
        jLabelTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabelNombre.setText("Nombre:");

        jLabelHorario.setText("Horario:");

        jLabelInstructor.setText("Instructor:");

        jLabelMonitor.setText("Monitor:");

        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jComboBoxInstructor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No asignar" }));

        jComboBoxMonitor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No asignar" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonVolver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelMonitor)
                            .addComponent(jLabelHorario)
                            .addComponent(jLabelNombre)
                            .addComponent(jLabelInstructor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldHorario)
                            .addComponent(jTextFieldNombre)
                            .addComponent(jComboBoxInstructor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxMonitor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelInstructor)
                    .addComponent(jComboBoxInstructor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMonitor)
                    .addComponent(jComboBoxMonitor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVolver)
                    .addComponent(jButtonGuardar))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        GruposIGU ventanaGrupos = new GruposIGU();
        ventanaGrupos.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        Profesor profe = null;
        Monitor monitor = null;
        
        if(jComboBoxInstructor.getSelectedItem().toString() != "No asignar"){
            String[] partesInstructor = jComboBoxInstructor.getSelectedItem().toString().split("-");
            profe = controlador.retornarProfesor(Integer.parseInt(partesInstructor[1].trim()));
        }
        
        if(jComboBoxMonitor.getSelectedItem().toString() != "No asignar"){
            String[] partesMonitor = jComboBoxMonitor.getSelectedItem().toString().split("-");
            monitor = controlador.retornarMonitor(Integer.parseInt(partesMonitor[1].trim()));
        }
        
        controlador.guardarGrupo(jTextFieldNombre.getText(), jTextFieldHorario.getText(), profe, monitor);
        
        GruposIGU ventanaGrupos = new GruposIGU();
        ventanaGrupos.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JComboBox<String> jComboBoxInstructor;
    private javax.swing.JComboBox<String> jComboBoxMonitor;
    private javax.swing.JLabel jLabelHorario;
    private javax.swing.JLabel jLabelInstructor;
    private javax.swing.JLabel jLabelMonitor;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldHorario;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables

    private void llenarComboBox() {
        List<Profesor> profesores = controlador.retornarProfesores();
        List<Monitor> monitores = controlador.retornarMonitores();
        List<Grupos> grupos = controlador.retornarGrupos();
        
        externoP: for (Profesor profe : profesores){
            for (Grupos grupo : grupos){
                if(grupo.getProfesor()!=null){
                    Profesor profeGrupo = grupo.getProfesor();
                    if(profe.getCodigo()==profeGrupo.getCodigo()){
                        continue externoP;
                    }
                }
            }
            jComboBoxInstructor.addItem(profe.getNombre() + " - " + profe.getCodigo());
        }
        
        externoM: for (Monitor monitor : monitores){
            for (Grupos grupo : grupos){
                if(grupo.getMonitor()!=null){
                    Monitor monitorGrupo = grupo.getMonitor();
                    if(monitor.getCodigo()==monitorGrupo.getCodigo()){
                        continue externoM;
                    }
                }
            }
            jComboBoxMonitor.addItem(monitor.getNombre() + " - " + monitor.getCodigo());
        }
    }
}
