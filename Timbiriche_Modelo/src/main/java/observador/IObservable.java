/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observador;

/**
 *
 * @author HP
 */
public interface IObservable {

    public void actualizarTodos();

    public void agregarObservador(IObservador observador);

    public void eliminarObservador(IObservador observador);

}
