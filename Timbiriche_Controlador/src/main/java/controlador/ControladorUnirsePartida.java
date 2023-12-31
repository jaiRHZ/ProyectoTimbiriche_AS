package controlador;

import dominio.Jugador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import aplicacion.TableroData;
import vista.CodigoPartida;
import vista.PantallaInicio;

/**
 *
 * @author Jorge
 */
public class ControladorUnirsePartida implements ActionListener {

    CodigoPartida vistaCodigoPartida;
    PantallaInicio pantallaInicio;
    TableroData tableroData;

    ControladorPartidaNueva controlPartidaNueva;

    public ControladorUnirsePartida(TableroData tableroData) {
        this.vistaCodigoPartida = new CodigoPartida();
        this.tableroData = tableroData;
        this.pantallaInicio = new PantallaInicio();

        this.controlPartidaNueva = new ControladorPartidaNueva(tableroData);

    }

    public void generarEventos() {
        this.vistaCodigoPartida.btnEntrar.addActionListener(this);
        this.vistaCodigoPartida.btnSalir.addActionListener(this);
    }

    public void iniciarPantalla() {
        this.vistaCodigoPartida.setVisible(true);
    }

    public void unirsePartida(Jugador jugador) {
//        //Se revisa que el formato del codigo ingresado sea el correcto.
//        if (validaciones.validarFormatoCodigoPartida(tableroData.getCodigoPartida())) {
//            // Se revisa si hay espacio disponible en la partida.
//            if (this.controlPartidaNueva.nuevoJugador(jugador)) {
//                this.controlPartidaNueva.iniciarPantalla();
//
//            } else {
//                JOptionPane.showMessageDialog(null, "La partida esta llena.");
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "El formato del codigo es erroneo, deben ser 4 digitos alfanumericos en mayusculas. Graciah Joven :).");
//        }
    }

    /* Con este metodo se revisa en el lobby de partida si hay espacio libre
    para ingresar al jugador. */
//    public boolean revisarEspacioLibre(){
//        if(this.tableroData.getJugadores().size() < 4){
//            return true;
//        }else{
//            return false;
//        }
//    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() == "Entrar") {
        } else {
            pantallaInicio.setVisible(true);
            this.vistaCodigoPartida.dispose();
        }
    }
}
