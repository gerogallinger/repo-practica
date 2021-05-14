package isi.died.parcial01.ejercicio01;

import java.util.Date;

public class Venta {
    public String nombreCliete;
    public Date fecha;
    public int monto;
    public Tipo_Producto tipo;

    public String getNombreCliete() {
        return nombreCliete;
    }

    public void setNombreCliete(String nombreCliete) {
        this.nombreCliete = nombreCliete;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public Tipo_Producto getTipo() {
        return tipo;
    }

    public void setTipo(Tipo_Producto tipo) {
        this.tipo = tipo;
    }
}
