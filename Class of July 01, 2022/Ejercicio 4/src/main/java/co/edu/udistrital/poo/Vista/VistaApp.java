
package co.edu.udistrital.poo.Vista;

/*
*   Clase de vista.
*   @Autor : Santiago Baron Zuleta, Claudia Tatiana Ospina, Santiago Morales Ariza
*   Fecha: 29 de Junio de 2022.
*/

public class VistaApp extends javax.swing.JFrame {


    String sueldo;
    double nota_1;
    double nota_2;
    double promedio;
    
    /**
     * This function takes the text from the text field and puts it into the text area
     */
    public void Nombre(){
        String nombre;
        nombre = txtNombre.getText();
        txtArea.append("-------------------------- \n");
        txtArea.append("Nombre:" + nombre + "\n");
    }
    
    
    /**
     * The function Edad() takes the text from the text field txtEdad and appends it to the text area
     * txtArea
     */
    public void Edad(){
        String edad;
        edad = txtEdad.getText();
        txtArea.append("Edad: " + edad + "\n");
    }
    
    
   /**
    * It prints the gender of the person.
    */
    public void Genero(){
        String genero;
        genero = txtGenero.getText();
        txtArea.append("Genero: " + genero + "\n");
        
    }
    
    /**
     * This function is used to calculate the average of two notes and then determine if the student is
     * approved or not
     */
    public void Estudiante(){
        if (radEstudiante.isSelected()) {
            
            nota_1 = (double) spnNota_1.getValue();
            nota_2 = (double) spnNota_2.getValue();
            
            promedio = (nota_1 + nota_2) / 2;
            
            if (promedio >= 3){
                txtArea.append("Estado: Aprobado\n");
            }
            else{
                txtArea.append("Estado: Reprobado\n");
            }
        }
    }
    
    /**
     * If the radio button "Empleado" is selected, then if the radio button "Ejecutivo" is selected,
     * then the text area will append the text "Cargo: Ejecutivo" and the variable "sueldo" will be
     * equal to the text in the text field "txtSueldoComercial"
     */
    public void Empleado(){
        if(radEmpleado.isSelected()){
            if(radEjecutivo.isSelected()){
                txtArea.append("Cargo: Ejecutivo\n");
                sueldo = txtSueldoComercial.getText();
                
            }
            else if (radComercial.isSelected()){
                txtArea.append("Cargo: Comercial\n");
                sueldo = txtSueldoComercial.getText();
            }
        txtArea.append("Sueldo: " + sueldo);
        }
    }
    
    
    // Hiding the panels.
    public VistaApp() {
        initComponents();
        pnlEstudiante.setVisible(false);
        pnlEmpleado.setVisible(false);
        pnlEjecutivo.setVisible(false);
        pnlComercial.setVisible(false);
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        // Creating a GUI for the program.
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        radEmpleado = new javax.swing.JRadioButton();
        radEstudiante = new javax.swing.JRadioButton();
        pnlEmpleado = new javax.swing.JPanel();
        radEjecutivo = new javax.swing.JRadioButton();
        radComercial = new javax.swing.JRadioButton();
        pnlEjecutivo = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtSueldoEjecutivo = new javax.swing.JTextField();
        pnlComercial = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtSueldoComercial = new javax.swing.JTextField();
        pnlEstudiante = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Jlabel = new javax.swing.JLabel();
        spnNota_1 = new javax.swing.JSpinner();
        spnNota_2 = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        btnGuardar = new javax.swing.JButton();
        txtGenero = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre:");

        jLabel2.setText("Edad:");

        jLabel3.setText("Genero:");

        // Adding an action listener to the text field.
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        // Adding an action listener to the txtEdad text field.
        txtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadActionPerformed(evt);
            }
        });

        // Adding a radio button to a button group.
        buttonGroup1.add(radEmpleado);
        radEmpleado.setText("Empleado");
        radEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radEmpleadoActionPerformed(evt);
            }
        });

        // The above code is adding the radio buttons to the button group.
        buttonGroup1.add(radEstudiante);
        radEstudiante.setText("Estudiante");
        radEstudiante.addActionListener(new java.awt.event.ActionListener() {
            // Adding the radio buttons to the button group.
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radEstudianteActionPerformed(evt);
            }
        });

        // Adding a radio button to a button group.
        buttonGroup2.add(radEjecutivo);
        radEjecutivo.setText("Ejecutivo");
        radEjecutivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radEjecutivoActionPerformed(evt);
            }
        });

        // Adding a radio button to a button group.
        buttonGroup2.add(radComercial);
        radComercial.setText("Comercial");
        radComercial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radComercialActionPerformed(evt);
            }
        });

        jLabel4.setText("Sueldo del empleado:");

        txtSueldoEjecutivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSueldoEjecutivoActionPerformed(evt);
            }
        });

        // Creating a panel for the executive employee.
        javax.swing.GroupLayout pnlEjecutivoLayout = new javax.swing.GroupLayout(pnlEjecutivo);
        pnlEjecutivo.setLayout(pnlEjecutivoLayout);
        pnlEjecutivoLayout.setHorizontalGroup(
            pnlEjecutivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEjecutivoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32)
                .addComponent(txtSueldoEjecutivo, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        pnlEjecutivoLayout.setVerticalGroup(
            pnlEjecutivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEjecutivoLayout.createSequentialGroup()
                .addGroup(pnlEjecutivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSueldoEjecutivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jLabel5.setText("Sueldo del empleado:");

        // Adding an action listener to the text field.
        txtSueldoComercial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSueldoComercialActionPerformed(evt);
            }
        });

        // Creating a panel for the commercial employee.
        javax.swing.GroupLayout pnlComercialLayout = new javax.swing.GroupLayout(pnlComercial);
        pnlComercial.setLayout(pnlComercialLayout);
        pnlComercialLayout.setHorizontalGroup(
            pnlComercialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlComercialLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel5)
                .addGap(30, 30, 30)
                .addComponent(txtSueldoComercial, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlComercialLayout.setVerticalGroup(
            pnlComercialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlComercialLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(pnlComercialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtSueldoComercial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        // Creating a panel for the GUI.
        javax.swing.GroupLayout pnlEmpleadoLayout = new javax.swing.GroupLayout(pnlEmpleado);
        pnlEmpleado.setLayout(pnlEmpleadoLayout);
        pnlEmpleadoLayout.setHorizontalGroup(
            pnlEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEmpleadoLayout.createSequentialGroup()
                .addGroup(pnlEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnlEjecutivo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlEmpleadoLayout.createSequentialGroup()
                        .addComponent(radEjecutivo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radComercial, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlEmpleadoLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(pnlComercial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 46, Short.MAX_VALUE))
        );
        pnlEmpleadoLayout.setVerticalGroup(
            pnlEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEmpleadoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radEjecutivo)
                    .addComponent(radComercial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlEjecutivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlComercial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        jLabel6.setText("Nota 1:");

        Jlabel.setText("Nota 2:");

        spnNota_1.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 5.0d, 1.0d));

        spnNota_2.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 5.0d, 1.0d));

        // Creating a panel with two spinners.
        javax.swing.GroupLayout pnlEstudianteLayout = new javax.swing.GroupLayout(pnlEstudiante);
        pnlEstudiante.setLayout(pnlEstudianteLayout);
        pnlEstudianteLayout.setHorizontalGroup(
            pnlEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEstudianteLayout.createSequentialGroup()
                .addGroup(pnlEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Jlabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spnNota_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnNota_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnlEstudianteLayout.setVerticalGroup(
            pnlEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEstudianteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(spnNota_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jlabel)
                    .addComponent(spnNota_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        // Setting the size of the text area.
        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        // Creating a button that will save the changes made to the text area.
        btnGuardar.setText("Guardar cambios");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        // The following code is creating a layout for the GUI.
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(123, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombre)
                                    .addComponent(txtEdad)
                                    .addComponent(txtGenero, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))))
                        .addGap(69, 69, 69)
                        .addComponent(pnlEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );

        // The following code is creating a GUI for the user to interact with.
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(44, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(radEmpleado)
                                    .addComponent(radEstudiante)))
                            .addComponent(pnlEstudiante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(pnlEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadActionPerformed

    private void radEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radEstudianteActionPerformed
        // TODO add your handling code here:
        
        pnlEstudiante.setVisible(true);
    }//GEN-LAST:event_radEstudianteActionPerformed

    private void radEjecutivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radEjecutivoActionPerformed
        // TODO add your handling code here:
        
        pnlEjecutivo.setVisible(true);
    }//GEN-LAST:event_radEjecutivoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        
        Nombre();
        Edad();
        Genero();
        Empleado();
        Estudiante();
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    // The following code is creating a GUI for the user to input the information for the employee.
    private void radEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {
        
        pnlEmpleado.setVisible(true);
    }

    private void radComercialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radComercialActionPerformed
      
        pnlComercial.setVisible(true);
    }

    private void txtSueldoEjecutivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSueldoEjecutivoActionPerformed
        
    }

    private void txtSueldoComercialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSueldoComercialActionPerformed
        
    }

    /**
     * > This function is used to set the look and feel of the application
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaApp().setVisible(true);
            }
        });
    }


    // Creating the GUI for the program.
    private javax.swing.JLabel Jlabel;
    private javax.swing.JButton btnGuardar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlComercial;
    private javax.swing.JPanel pnlEjecutivo;
    private javax.swing.JPanel pnlEmpleado;
    private javax.swing.JPanel pnlEstudiante;
    private javax.swing.JRadioButton radComercial;
    private javax.swing.JRadioButton radEjecutivo;
    private javax.swing.JRadioButton radEmpleado;
    private javax.swing.JRadioButton radEstudiante;
    private javax.swing.JSpinner spnNota_1;
    private javax.swing.JSpinner spnNota_2;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSueldoComercial;
    private javax.swing.JTextField txtSueldoEjecutivo;

}
