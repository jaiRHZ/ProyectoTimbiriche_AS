/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import observador.IObservador;
import aplicacion.TableroData;
import gestor.GestorPartidaNueva;

/**
 *
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public class PartidaNueva extends javax.swing.JFrame implements IObservador {

    private TableroData tableroData;
    private GestorPartidaNueva gestorPartidaNueva;

    /**
     * Creates new form PartidaNueva
     */
    public PartidaNueva() {
        initComponents();
        this.gestorPartidaNueva = new GestorPartidaNueva();
    }

    public void setCargarInfo(TableroData tableroData) {
        this.tableroData = tableroData;
        labelJugador.setText(tableroData.getJugadorPrincipal().getNombre());
    }

    @Override
    public void actualizar() {
        this.gestorPartidaNueva.cargarJugadores(this, tableroData);
        this.repaint();
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
        jLabel2 = new javax.swing.JLabel();
        labelJugador = new javax.swing.JLabel();
        nombreJ3 = new javax.swing.JLabel();
        nombreJ4 = new javax.swing.JLabel();
        imgJugador1 = new javax.swing.JLabel();
        imgJugador2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        imgJugador3 = new javax.swing.JLabel();
        btnDiez = new javax.swing.JButton();
        imgJugador4 = new javax.swing.JLabel();
        btnVeinte = new javax.swing.JButton();
        nombreJ1 = new javax.swing.JLabel();
        btnTreinta = new javax.swing.JButton();
        nombreJ2 = new javax.swing.JLabel();
        btnComenzar = new javax.swing.JButton();
        labelCodigo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Partida Nueva");
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setPreferredSize(new java.awt.Dimension(600, 500));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Codigo:");
        background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 126, -1, -1));

        labelJugador.setFont(new java.awt.Font("Roboto", 0, 28)); // NOI18N
        labelJugador.setText("Jugador");
        background.add(labelJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, -1));

        nombreJ3.setBackground(new java.awt.Color(0, 0, 0));
        nombreJ3.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        background.add(nombreJ3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, -1, -1));

        nombreJ4.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        background.add(nombreJ4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, -1, -1));

        imgJugador1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono/avtDefault.png"))); // NOI18N
        imgJugador1.setText("img1");
        imgJugador1.setPreferredSize(new java.awt.Dimension(100, 100));
        background.add(imgJugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 171, -1, -1));

        imgJugador2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono/avtDefault.png"))); // NOI18N
        imgJugador2.setText("img2");
        imgJugador2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        imgJugador2.setPreferredSize(new java.awt.Dimension(100, 100));
        background.add(imgJugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 171, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 28)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Dimensión");
        background.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 126, -1, -1));

        imgJugador3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono/avtDefault.png"))); // NOI18N
        imgJugador3.setText("img3");
        imgJugador3.setPreferredSize(new java.awt.Dimension(100, 100));
        background.add(imgJugador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 310, -1, -1));

        btnDiez.setBackground(new java.awt.Color(0, 109, 182));
        btnDiez.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnDiez.setForeground(new java.awt.Color(255, 255, 255));
        btnDiez.setText("10x10");
        btnDiez.setActionCommand("10");
        btnDiez.setBorder(null);
        btnDiez.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDiez.setPreferredSize(new java.awt.Dimension(70, 40));
        background.add(btnDiez, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 171, -1, -1));

        imgJugador4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono/avtDefault.png"))); // NOI18N
        imgJugador4.setText("img4");
        imgJugador4.setPreferredSize(new java.awt.Dimension(100, 100));
        background.add(imgJugador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 310, -1, -1));

        btnVeinte.setBackground(new java.awt.Color(0, 109, 182));
        btnVeinte.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnVeinte.setForeground(new java.awt.Color(255, 255, 255));
        btnVeinte.setText("20x20");
        btnVeinte.setActionCommand("20");
        btnVeinte.setBorder(null);
        btnVeinte.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVeinte.setPreferredSize(new java.awt.Dimension(70, 40));
        background.add(btnVeinte, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 171, -1, -1));

        nombreJ1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        nombreJ1.setText("jugador 1");
        background.add(nombreJ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 283, -1, -1));

        btnTreinta.setBackground(new java.awt.Color(0, 109, 182));
        btnTreinta.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnTreinta.setForeground(new java.awt.Color(255, 255, 255));
        btnTreinta.setText("30x30");
        btnTreinta.setActionCommand("30");
        btnTreinta.setBorder(null);
        btnTreinta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnTreinta.setPreferredSize(new java.awt.Dimension(70, 40));
        background.add(btnTreinta, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 171, -1, -1));

        nombreJ2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        background.add(nombreJ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 283, -1, -1));

        btnComenzar.setBackground(new java.awt.Color(0, 109, 182));
        btnComenzar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnComenzar.setForeground(new java.awt.Color(255, 255, 255));
        btnComenzar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono/entrar.png"))); // NOI18N
        btnComenzar.setText("Comenzar");
        btnComenzar.setBorder(null);
        btnComenzar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnComenzar.setPreferredSize(new java.awt.Dimension(130, 40));
        background.add(btnComenzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, -1, -1));

        labelCodigo.setFont(new java.awt.Font("Roboto", 0, 28)); // NOI18N
        labelCodigo.setForeground(new java.awt.Color(153, 153, 153));
        labelCodigo.setText("XXXX");
        background.add(labelCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 126, -1, -1));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 28)); // NOI18N
        jLabel1.setText("Partida de");
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 109, 182));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 50));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono/cancelar.png"))); // NOI18N
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
        });

        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono/minimizar.png"))); // NOI18N
        btnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(490, Short.MAX_VALUE)
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

        background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    public javax.swing.JLabel btnCerrar;
    public javax.swing.JButton btnComenzar;
    public javax.swing.JButton btnDiez;
    public javax.swing.JLabel btnMinimizar;
    public javax.swing.JButton btnTreinta;
    public javax.swing.JButton btnVeinte;
    public javax.swing.JLabel imgJugador1;
    public javax.swing.JLabel imgJugador2;
    public javax.swing.JLabel imgJugador3;
    public javax.swing.JLabel imgJugador4;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel labelCodigo;
    public javax.swing.JLabel labelJugador;
    public javax.swing.JLabel nombreJ1;
    public javax.swing.JLabel nombreJ2;
    public javax.swing.JLabel nombreJ3;
    public javax.swing.JLabel nombreJ4;
    // End of variables declaration//GEN-END:variables
}
