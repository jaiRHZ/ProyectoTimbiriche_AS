package controlador;
import dominio.Jugador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import test.TableroData;
import vista.CodigoPartida;
/**
 *
 * @author Jorge
 */
public class ControladorUnirsePartida implements ActionListener{
    CodigoPartida vistaCodigoPartida;
    TableroData tableroData;
    Jugador jugador;
    
    public ControladorUnirsePartida(Jugador jugador) {
        vistaCodigoPartida = new CodigoPartida();
        tableroData = new TableroData();
        this.jugador = jugador;
    }
    
    public void unirsePartida(){
        
    }
 
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand() == "Entrar"){
            tableroData.setCodigoPartida(this.vistaCodigoPartida.txtBuscar.getText());
        }else{
            
        }
    }
}
