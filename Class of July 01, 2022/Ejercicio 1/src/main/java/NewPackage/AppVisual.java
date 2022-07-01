/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */
package NewPackage;

/*
*   Parte visual.
*   @Autor : Santiago Baron Zuleta, Claudia Tatiana Ospina, Santiago Morales Ariza
*   Fecha: 29 de Junio de 2022.
*/

public class AppVisual extends javax.swing.JFrame {

    /**
     * Creates new form AppVisual
     */
    public AppVisual() {
        initComponents();
        jLabel5.setVisible(false);
        jTextField3.setVisible(false);
        jLabel6.setVisible(false);
        jTextField4.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        menuBar = new javax.swing.JMenuBar();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setText("Seleccione la figura que desea agregar:");
        desktopPane.add(jLabel1);
        jLabel1.setBounds(30, 20, 230, 20);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Cuadrado", "Circulo" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        desktopPane.add(jComboBox1);
        jComboBox1.setBounds(30, 50, 130, 22);

        jLabel2.setText("Ingrese las coordenadas de la figura:");
        desktopPane.add(jLabel2);
        jLabel2.setBounds(30, 100, 210, 16);

        jLabel3.setText("X:");
        desktopPane.add(jLabel3);
        jLabel3.setBounds(30, 140, 10, 16);

        jLabel4.setText("Y:");
        desktopPane.add(jLabel4);
        jLabel4.setBounds(150, 140, 37, 16);

        jTextField1.setText("...");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        desktopPane.add(jTextField1);
        jTextField1.setBounds(50, 140, 71, 22);

        jTextField2.setText("...");
        desktopPane.add(jTextField2);
        jTextField2.setBounds(180, 140, 71, 22);

        jLabel5.setText("Lado del cuadrado:");
        desktopPane.add(jLabel5);
        jLabel5.setBounds(20, 200, 110, 16);

        jTextField3.setText("...");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        desktopPane.add(jTextField3);
        jTextField3.setBounds(140, 190, 120, 30);

        jLabel6.setText("Radio del circulo:");
        desktopPane.add(jLabel6);
        jLabel6.setBounds(20, 200, 110, 16);

        jTextField4.setText("...");
        desktopPane.add(jTextField4);
        jTextField4.setBounds(140, 190, 120, 30);

        jButton1.setText("Guardar figura");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        desktopPane.add(jButton1);
        jButton1.setBounds(10, 240, 350, 40);

        jScrollPane1.setEnabled(false);

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        desktopPane.add(jScrollPane1);
        jScrollPane1.setBounds(20, 300, 330, 200);

        editMenu.setMnemonic('e');
        editMenu.setText("Opciones");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        
        String figura = (String)jComboBox1.getSelectedItem();
        
        if(figura.equals("Cuadrado")){
            
            String coordX = (String)jTextField1.getText();
            String coordY = (String)jTextField2.getText();
            String lado = (String)jTextField3.getText();
            
            int ladoCuadrado = Integer.parseInt(lado);
            ladoCuadrado = ladoCuadrado * ladoCuadrado;
            
            textArea.append("------------------------------ \n");
            textArea.append("Se ha creado un cuadrado: \n");
            textArea.append("Coordenada X: " + coordX + "\n");
            textArea.append("Coordenada X: " +coordY + "\n");
            textArea.append("Area: " +ladoCuadrado + "\n");
            
        }
        
        if(figura.equals("Circulo")){
            
            String coordX = (String)jTextField1.getText();
            String coordY = (String)jTextField2.getText();
            String area = (String)jTextField4.getText();
            
            float areaCirculo = Integer.parseInt(area);
            areaCirculo = (float) ((areaCirculo*areaCirculo) * (3.14159));
            
            textArea.append("------------------------------ \n");
            textArea.append("Se ha creado un circulo: \n");
            textArea.append("Coordenada X: " +coordX + "\n");
            textArea.append("Coordenada Y: " +coordY + "\n");
            textArea.append("Area: " + areaCirculo + "\n");
            
        }
    }//GEN-LAST:event_jButton1MousePressed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        String figura = (String)jComboBox1.getSelectedItem();
        
        if(figura.equals("Cuadrado")){
            jLabel5.setVisible(true);
            jTextField3.setVisible(true);
            jLabel6.setVisible(false);
            jTextField4.setVisible(false);
            
        }
        
        if(figura.equals("Circulo")){
            jLabel6.setVisible(true);
            jTextField4.setVisible(true);
            jLabel5.setVisible(false);
            jTextField3.setVisible(false);
            
        }
        
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AppVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppVisual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables

}
