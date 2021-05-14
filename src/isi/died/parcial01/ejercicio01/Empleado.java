package isi.died.parcial01.ejercicio01;

import java.util.List;

public class Empleado {

    public int cuit;
    public String correoElectronico;
    public List<Venta> ventasEmpleado;
    public int objetivoVenta;
    public float comision;

    public Empleado(){

    }
    public Empleado(int c, String mail, List<Venta> ventas, int obj){
        this.cuit= c;
        this.correoElectronico= mail;
        this.objetivoVenta= obj;
        for (int i =0; i< ventas.size();i++) {
            this.ventasEmpleado.add(ventas.get(i));

        }
        this.comision=0;

    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public List<Venta> getVentasEmpleado() {
        return ventasEmpleado;
    }

    public void setVentasEmpleado(List<Venta> ventasEmpleado) {
        this.ventasEmpleado = ventasEmpleado;
    }

    public int getObjetivoVenta() {
        return objetivoVenta;
    }

    public void setObjetivoVenta(int objetivoVenta) {
        this.objetivoVenta = objetivoVenta;
    }

    public float getComision() {
        return 0;
    }

    public void setComision(int comision) {
        this.comision = comision;
    }





}
