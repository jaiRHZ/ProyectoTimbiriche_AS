/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import aplicacion.TableroData;

/**
 *
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public class Tablero extends javax.swing.JFrame {

    private TableroData tableroData;

    /**
     * Creates new form Tablero
     */
    public Tablero() {
        initComponents();
    }

    public Tablero(TableroData tableroData) {
        initComponents();
        this.tableroData = tableroData;
        cargarJugadores();
    }

    public void cargarTablero(JPanel panelTablero) {
        panelPrincipal.setSize(panelTablero.getWidth(),
                panelTablero.getHeight());
        panelTablero.setLocation(0, 0);
        panelTablero.setBackground(Color.GRAY);
        panelPrincipal.removeAll();
        panelPrincipal.add(panelTablero, BorderLayout.CENTER);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    }

    private void cargarJugadores() {
        this.imgJugador1.setIcon(tableroData.getJugadorPrincipal().getIcono());
        this.nombreJ1.setText(tableroData.getJugadorPrincipal().getNombre());
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
        panelPrincipal = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnMinimizar = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JLabel();
        btnConfiguracion = new javax.swing.JButton();
        nombreJ1 = new javax.swing.JLabel();
        nombreJ3 = new javax.swing.JLabel();
        nombreJ4 = new javax.swing.JLabel();
        nombreJ2 = new javax.swing.JLabel();
        imgJugador1 = new javax.swing.JLabel();
        imgJugador3 = new javax.swing.JLabel();
        imgJugador2 = new javax.swing.JLabel();
        imgJugador4 = new javax.swing.JLabel();
        puntaje1 = new javax.swing.JLabel();
        puntaje2 = new javax.swing.JLabel();
        puntaje3 = new javax.swing.JLabel();
        puntaje4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tablero");
        setMaximumSize(new java.awt.Dimension(1200, 1000));
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setPreferredSize(new java.awt.Dimension(1000, 800));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPrincipal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(600, 600));

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 594, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 594, Short.MAX_VALUE)
        );

        background.add(panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, -1));
        panelPrincipal.getAccessibleContext().setAccessibleDescription("");

        jPanel1.setBackground(new java.awt.Color(0, 109, 182));
        jPanel1.setPreferredSize(new java.awt.Dimension(1500, 50));

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
                .addContainerGap(894, Short.MAX_VALUE)
                .addComponent(btnMinimizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCerrar)
                .addGap(502, 502, 502))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCerrar)
                    .addComponent(btnMinimizar))
                .addGap(8, 8, 8))
        );

        background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnConfiguracion.setBackground(new java.awt.Color(0, 109, 182));
        btnConfiguracion.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnConfiguracion.setForeground(new java.awt.Color(255, 255, 255));
        btnConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono/configuracion.png"))); // NOI18N
        btnConfiguracion.setText("Configuración");
        btnConfiguracion.setActionCommand("configuracion");
        btnConfiguracion.setBorder(null);
        btnConfiguracion.setBorderPainted(false);
        btnConfiguracion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnConfiguracion.setFocusPainted(false);
        btnConfiguracion.setPreferredSize(new java.awt.Dimension(150, 50));
        btnConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfiguracionActionPerformed(evt);
            }
        });
        background.add(btnConfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 720, 180, -1));

        nombreJ1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        nombreJ1.setText("Jugador1");
        nombreJ1.setMaximumSize(new java.awt.Dimension(100, 24));
        nombreJ1.setName(""); // NOI18N
        background.add(nombreJ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        nombreJ3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        nombreJ3.setText("Jugador3");
        background.add(nombreJ3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 650, -1, -1));

        nombreJ4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        nombreJ4.setText("Jugador4");
        background.add(nombreJ4, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 630, -1, -1));

        nombreJ2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        nombreJ2.setText("Jugador2");
        background.add(nombreJ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 200, -1, -1));

        imgJugador1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono/avtDefault.png"))); // NOI18N
        background.add(imgJugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        imgJugador3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono/avtDefault.png"))); // NOI18N
        background.add(imgJugador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 540, -1, -1));

        imgJugador2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono/avtDefault.png"))); // NOI18N
        background.add(imgJugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 100, -1, -1));

        imgJugador4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono/avtDefault.png"))); // NOI18N
        background.add(imgJugador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 530, -1, -1));

        puntaje1.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        puntaje1.setText("Puntaje1");
        background.add(puntaje1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        puntaje2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        puntaje2.setText("Puntaje2");
        background.add(puntaje2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 220, -1, -1));

        puntaje3.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        puntaje3.setText("Puntaje3");
        background.add(puntaje3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 670, -1, -1));

        puntaje4.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        puntaje4.setText("Puntaje4");
        background.add(puntaje4, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 650, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracionActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnConfiguracionActionPerformed

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
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tablero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel background;
    public javax.swing.JLabel btnCerrar;
    public javax.swing.JButton btnConfiguracion;
    public javax.swing.JLabel btnMinimizar;
    public javax.swing.JLabel imgJugador1;
    public javax.swing.JLabel imgJugador2;
    public javax.swing.JLabel imgJugador3;
    public javax.swing.JLabel imgJugador4;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel nombreJ1;
    public javax.swing.JLabel nombreJ2;
    public javax.swing.JLabel nombreJ3;
    public javax.swing.JLabel nombreJ4;
    public javax.swing.JPanel panelPrincipal;
    public javax.swing.JLabel puntaje1;
    public javax.swing.JLabel puntaje2;
    public javax.swing.JLabel puntaje3;
    public javax.swing.JLabel puntaje4;
    // End of variables declaration//GEN-END:variables
}
