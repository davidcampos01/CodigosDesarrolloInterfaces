/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package gestion.gui;

import gestion.dto.Peliculas;
import gestion.logica.LogicaNegocioValoraciones;
import java.util.Date;

/**
 *
 * @author David Campos
 */
public class DarValoracion extends javax.swing.JDialog {
    
    private PantallaPrincipal pantallaPrincipal;
    
    /**
     * Creates new form DialogoAlta
     */
    public DarValoracion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        //pantallaPrincipal = (PantallaPrincipal)parent;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelDatos = new javax.swing.JPanel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelApellidos = new javax.swing.JLabel();
        jLabelFechaAlta = new javax.swing.JLabel();
        jLabelProvincia = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldApellidos = new javax.swing.JTextField();
        jComboBoxProvincia = new javax.swing.JComboBox<>();
        jButtonAlta = new javax.swing.JButton();
        jSpinnerFechaEstreno = new javax.swing.JSpinner();
        jLabelValoracion = new javax.swing.JLabel();
        jComboBoxValoracion = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelNombre.setText("Nombre de la Pelicula:");

        jLabelApellidos.setText("Usuario:");

        jLabelFechaAlta.setText("Fecha:");

        jLabelProvincia.setText("Genero:");

        jComboBoxProvincia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acción", "Aventuras", "Ciencia Ficción", "Comedia", "Documental", "Drama", "Fantasía", "Musical", "Romantica", "Suspense", "Terror", " ", " " }));
        jComboBoxProvincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxProvinciaActionPerformed(evt);
            }
        });

        jButtonAlta.setText("Alta");
        jButtonAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAltaActionPerformed(evt);
            }
        });

        jSpinnerFechaEstreno.setModel(new javax.swing.SpinnerDateModel());
        jSpinnerFechaEstreno.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1665648176845L), null, null, java.util.Calendar.DAY_OF_WEEK_IN_MONTH));

        jLabelValoracion.setText("Valoración:");

        jComboBoxValoracion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "*", "**", "***", "****", "*****" }));

        javax.swing.GroupLayout jPanelDatosLayout = new javax.swing.GroupLayout(jPanelDatos);
        jPanelDatos.setLayout(jPanelDatosLayout);
        jPanelDatosLayout.setHorizontalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDatosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNombre)
                            .addComponent(jLabelApellidos))
                        .addGap(26, 26, 26)
                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                            .addComponent(jTextFieldNombre)))
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelFechaAlta)
                            .addComponent(jLabelProvincia)
                            .addComponent(jLabelValoracion))
                        .addGap(86, 86, 86)
                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSpinnerFechaEstreno)
                            .addComponent(jComboBoxProvincia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxValoracion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanelDatosLayout.setVerticalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelApellidos)
                    .addComponent(jTextFieldApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFechaAlta)
                    .addComponent(jSpinnerFechaEstreno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelProvincia)
                    .addComponent(jComboBoxProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelValoracion)
                    .addComponent(jComboBoxValoracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jButtonAlta)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAltaActionPerformed
        String nombrePeliculas = jTextFieldNombre.getText();
        String director = jTextFieldApellidos.getText();
        Date fechaEstreno = (Date)jSpinnerFechaEstreno.getValue();
        String genero = (String)jComboBoxProvincia.getSelectedItem();
        String valoracion = (String) jComboBoxValoracion.getSelectedItem();
        Peliculas pelicula = new Peliculas(nombrePeliculas,director,fechaEstreno,genero,valoracion);
        LogicaNegocioValoraciones.aniadirPelicula(pelicula);
        dispose();
    }//GEN-LAST:event_jButtonAltaActionPerformed

    private void jComboBoxProvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxProvinciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxProvinciaActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlta;
    private javax.swing.JComboBox<String> jComboBoxProvincia;
    private javax.swing.JComboBox<String> jComboBoxValoracion;
    private javax.swing.JLabel jLabelApellidos;
    private javax.swing.JLabel jLabelFechaAlta;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelProvincia;
    private javax.swing.JLabel jLabelValoracion;
    private javax.swing.JPanel jPanelDatos;
    private javax.swing.JSpinner jSpinnerFechaEstreno;
    private javax.swing.JTextField jTextFieldApellidos;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
