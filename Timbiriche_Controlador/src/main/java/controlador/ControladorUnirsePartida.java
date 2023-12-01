package controlador;

import dominio.Jugador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import aplicacion.TableroData;
import aplicacion.Validaciones;
import javax.swing.JOptionPane;
import vista.CodigoPartida;
import vista.PantallaInicio;
import vista.PartidaNueva;

/**
 *
 * @author Jorge
 */
public class ControladorUnirsePartida implements ActionListener {

    CodigoPartida vistaCodigoPartida;
    PantallaInicio pantallaInicio;
    TableroData tableroData;
    Validaciones validaciones;
    Jugador jugador;
    

    public ControladorUnirsePartida(Jugador jugador) {
        this.vistaCodigoPartida = new CodigoPartida();
        this.tableroData = new TableroData();
        this.pantallaInicio = new PantallaInicio();
        this.validaciones = new Validaciones();
        this.jugador = jugador;
    }

    public void generarEventos() {
        this.vistaCodigoPartida.btnEntrar.addActionListener(this);
        this.vistaCodigoPartida.btnSalir.addActionListener(this);
    }
    
    public void iniciarPantalla() {
        this.vistaCodigoPartida.setVisible(true);
    }

    public void unirsePartida() {
        if(validaciones.validarFormatoCodigoPartida(tableroData.getCodigoPartida())){
            // Se revisa si hay espacio disponible en la partida.
            if(revisarEspacioLibre()){
                
            }
        }else{
            JOptionPane.showMessageDialog(null, "El formato del codigo es erroneo, deben ser 4 digitos alfanumericos en mayusculas. Graciah Joven :).");
        }
    }
    
    /* Con este metodo se revisa en el lobby de partida si hay espacio libre
    para ingresar al jugador. */
    public boolean revisarEspacioLibre(){
        if(this.tableroData.getJugadores().size() < 4){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() == "Entrar") {
            tableroData.setCodigoPartida(this.vistaCodigoPartida.txtBuscar.getText());
        } else {
            pantallaInicio.setVisible(true);
            this.vistaCodigoPartida.dispose();
        }
    }
}
