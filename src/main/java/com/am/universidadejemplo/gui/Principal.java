
package com.am.universidadejemplo.gui;

public class Principal extends javax.swing.JFrame {


    public Principal() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuItemAlumnos = new javax.swing.JMenuItem();
        menuItemMaterias = new javax.swing.JMenuItem();
        menuItemInscripciones = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sebastian\\Documents\\NetBeansProjects\\universidadEjemplo\\src\\main\\resources\\imgs\\ulp.ico")); // NOI18N

        jMenu1.setText("Administracion");

        menuItemAlumnos.setText("Alumnos");
        menuItemAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAlumnosActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemAlumnos);

        menuItemMaterias.setText("Materias");
        menuItemMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemMateriasActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemMaterias);

        menuItemInscripciones.setText("Inscripciones");
        menuItemInscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemInscripcionesActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemInscripciones);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel1)
                .addContainerGap(108, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAlumnosActionPerformed
        AgregarAlumnos ventana=new AgregarAlumnos();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }//GEN-LAST:event_menuItemAlumnosActionPerformed

    private void menuItemMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemMateriasActionPerformed
        AgregarMateria ventana=new AgregarMateria();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }//GEN-LAST:event_menuItemMateriasActionPerformed

    private void menuItemInscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemInscripcionesActionPerformed
        Inscribir ventana=new Inscribir();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }//GEN-LAST:event_menuItemInscripcionesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuItemAlumnos;
    private javax.swing.JMenuItem menuItemInscripciones;
    private javax.swing.JMenuItem menuItemMaterias;
    // End of variables declaration//GEN-END:variables
}
