package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Jugador;
import vista.Registro;

/**
 *
 * @author Julio Mejía Sotomayor | 229021
 */
public class ControladorRegistro implements ActionListener {
    
    private Registro registro;
    
    public ControladorRegistro(){
        iniciarPantalla();
        this.registro.btnRegistrar.addActionListener(this);
    }
    
    public void iniciarPantalla(){
        this.registro = new Registro();
        this.registro.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == registro.btnRegistrar) {
            
           String nickname = registro.txtNickname.getText();
            
            if (nickname.isBlank()) {
                JOptionPane.showMessageDialog(null, "El nombre del Jugador está vacío");
            } else {
                new ControladorPantallaInicio(new Jugador(nickname));
                registro.dispose();
            }
        }
        
    }
    
    
    
}
