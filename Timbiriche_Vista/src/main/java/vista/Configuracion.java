/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.awt.Color;

/**
 *
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public class Configuracion extends javax.swing.JFrame {

    /**
     * Creates new form Configuracion
     */
    public Configuracion() {
        initComponents();
        
        //JFrame Background
        this.getContentPane().setBackground(Color.white);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnMinimizar = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JLabel();
        imgJugador4 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nombreJ1 = new javax.swing.JLabel();
        nombreJ2 = new javax.swing.JLabel();
        nombreJ3 = new javax.swing.JLabel();
        nombreJ4 = new javax.swing.JLabel();
        imgJugador1 = new javax.swing.JLabel();
        imgJugador2 = new javax.swing.JLabel();
        imgJugador3 = new javax.swing.JLabel();
        comBoxColores = new javax.swing.JComboBox<>();
        comBoxColores1 = new javax.swing.JComboBox<>();
        comBoxColores2 = new javax.swing.JComboBox<>();
        comBoxColores3 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Configuracion del Tablero");
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(450, 450));
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setPreferredSize(new java.awt.Dimension(450, 500));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 109, 182));
        jPanel1.setMinimumSize(new java.awt.Dimension(100, 50));
        jPanel1.setPreferredSize(new java.awt.Dimension(450, 50));

        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono/minimizar.png"))); // NOI18N
        btnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseClicked(evt);
            }
        });

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono/cancelar.png"))); // NOI18N
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 340, Short.MAX_VALUE)
                .addComponent(btnMinimizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCerrar)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCerrar)
                    .addComponent(btnMinimizar))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 50));

        imgJugador4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono/avtDefault.png"))); // NOI18N
        background.add(imgJugador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, -1, -1));

        btnCancelar.setBackground(new java.awt.Color(248, 20, 19));
        btnCancelar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono/entrar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(null);
        btnCancelar.setBorderPainted(false);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCancelar.setPreferredSize(new java.awt.Dimension(90, 50));
        background.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 120, 38));

        btnAceptar.setBackground(new java.awt.Color(0, 109, 182));
        btnAceptar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono/aceptar.png"))); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.setBorder(null);
        btnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAceptar.setPreferredSize(new java.awt.Dimension(90, 50));
        background.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 110, 38));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Cambiar Color");
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, -1));

        nombreJ1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        nombreJ1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreJ1.setText("Jugador 1");
        background.add(nombreJ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        nombreJ2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        nombreJ2.setText("Jugador 2");
        background.add(nombreJ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, -1, -1));

        nombreJ3.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        nombreJ3.setText("Jugador 3");
        background.add(nombreJ3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        nombreJ4.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        nombreJ4.setText("Jugador 4");
        background.add(nombreJ4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, -1, -1));

        imgJugador1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgJugador1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono/avtDefault.png"))); // NOI18N
        background.add(imgJugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        imgJugador2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono/avtDefault.png"))); // NOI18N
        background.add(imgJugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, -1, -1));

        imgJugador3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono/avtDefault.png"))); // NOI18N
        background.add(imgJugador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        comBoxColores.setBackground(new java.awt.Color(0, 109, 182));
        comBoxColores.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        comBoxColores.setForeground(new java.awt.Color(255, 255, 255));
        comBoxColores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Colores...    ", "Negro", "Blanco", "Rojo", "Verde", "Azul", "Amarillo", "Cian", "Morado", "Gris claro", "Gris oscuro" }));
        comBoxColores.setBorder(null);
        comBoxColores.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        comBoxColores.setMinimumSize(new java.awt.Dimension(92, 30));
        background.add(comBoxColores, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));

        comBoxColores1.setBackground(new java.awt.Color(0, 109, 182));
        comBoxColores1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        comBoxColores1.setForeground(new java.awt.Color(255, 255, 255));
        comBoxColores1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Colores...    ", "Negro", "Blanco", "Rojo", "Verde", "Azul", "Amarillo", "Cian", "Morado", "Gris claro", "Gris oscuro" }));
        comBoxColores1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        comBoxColores1.setMinimumSize(new java.awt.Dimension(92, 30));
        background.add(comBoxColores1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, -1, -1));

        comBoxColores2.setBackground(new java.awt.Color(0, 109, 182));
        comBoxColores2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        comBoxColores2.setForeground(new java.awt.Color(255, 255, 255));
        comBoxColores2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Colores...    ", "Negro", "Blanco", "Rojo", "Verde", "Azul", "Amarillo", "Cian", "Morado", "Gris claro", "Gris oscuro" }));
        comBoxColores2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        comBoxColores2.setMinimumSize(new java.awt.Dimension(92, 30));
        comBoxColores2.setPreferredSize(new java.awt.Dimension(92, 30));
        background.add(comBoxColores2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, -1, -1));

        comBoxColores3.setBackground(new java.awt.Color(0, 109, 182));
        comBoxColores3.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        comBoxColores3.setForeground(new java.awt.Color(255, 255, 255));
        comBoxColores3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Colores...    ", "Negro", "Blanco", "Rojo", "Verde", "Azul", "Amarillo", "Cian", "Morado", "Gris claro", "Gris oscuro" }));
        comBoxColores3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        comBoxColores3.setMinimumSize(new java.awt.Dimension(92, 30));
        comBoxColores3.setPreferredSize(new java.awt.Dimension(92, 30));
        background.add(comBoxColores3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void btnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseClicked
        // TODO add your handling code here:
        this.setState(ICONIFIED);
    }//GEN-LAST:event_btnMinimizarMouseClicked

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
            java.util.logging.Logger.getLogger(Configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Configuracion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    public javax.swing.JButton btnAceptar;
    public javax.swing.JButton btnCancelar;
    public javax.swing.JLabel btnCerrar;
    public javax.swing.JLabel btnMinimizar;
    public javax.swing.JComboBox<String> comBoxColores;
    public javax.swing.JComboBox<String> comBoxColores1;
    public javax.swing.JComboBox<String> comBoxColores2;
    public javax.swing.JComboBox<String> comBoxColores3;
    public javax.swing.JLabel imgJugador1;
    public javax.swing.JLabel imgJugador2;
    public javax.swing.JLabel imgJugador3;
    public javax.swing.JLabel imgJugador4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel nombreJ1;
    public javax.swing.JLabel nombreJ2;
    public javax.swing.JLabel nombreJ3;
    public javax.swing.JLabel nombreJ4;
    // End of variables declaration//GEN-END:variables
}
