/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package intermedario;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author Daniel Alameda
 */
public class EventosTimbiriche {

    @SerializedName("tipo")
    private String tipo;
    @SerializedName("objecto")
    private Object object;

    public EventosTimbiriche() {
    }

    public EventosTimbiriche(String tipo, Object object) {
        this.tipo = tipo;
        this.object = object;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "EventosTimbiriche{" + "tipo=" + tipo + ", object=" + object + '}';
    }

}
