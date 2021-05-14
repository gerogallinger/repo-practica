package isi.died.parcial01.ejercicio01;

import java.time.LocalDate;
import java.util.List;


public class Vendedor_Online extends Empleado {
    public List<String> contactos;
    public int cantClientesAtendidos;


    public Vendedor_Online() {

    }

    public Vendedor_Online(List<String> contactos, int cant_cl_atendidos) {
        this.contactos = contactos;
        this.cantClientesAtendidos= cant_cl_atendidos;
    }

    public List<String> getContactos() {
        return contactos;
    }

    public void setContactos(List<String> contactos) {
        this.contactos = contactos;
    }

    public float getComision() {
        int montoVenta = 0;
        int sumatoriaVentas = 0;

        for (int i = 0; i < ventasEmpleado.size(); i++) {
            sumatoriaVentas += ventasEmpleado.get(i).monto;

            //condicion para preguntar si el mes es septiembre
            /* if(ventasEmpleado.get(i).getFecha().getTime()== LocalDate.of())
             *     montoVenta = 2 *  ventasEmpleado.get(i).monto;
             * else
                   montoVenta = ventasEmpleado.get(i).monto;
             * */
            comision += montoVenta * 0.05;

        }
        comision += (float) ((cantClientesAtendidos/100) * 1000);

        if (sumatoriaVentas >= objetivoVenta) {
            comision += (comision * 0.2);
        }

        return comision;
    }
}