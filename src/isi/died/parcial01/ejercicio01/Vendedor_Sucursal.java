package isi.died.parcial01.ejercicio01;

import java.util.List;

public class Vendedor_Sucursal extends Empleado {

    public int cantClientesAtendidos;
    public Vendedor_Sucursal(){

    }

    public Vendedor_Sucursal(int c, String mail, List<Venta> ventas, int obj, int cantClientesAtendidos) {
        this.cantClientesAtendidos = cantClientesAtendidos;
    }

    public int getCantClientesAtendidos() {
        return cantClientesAtendidos;
    }

    public void setCantClientesAtendidos(int cantClientesAtendidos) {
        this.cantClientesAtendidos = cantClientesAtendidos;
    }

    public float getComision(){
        int montoVenta=0;
        int sumatoriaVentas=0;

        for(int i= 0; i<ventasEmpleado.size();i++) {
            sumatoriaVentas+= ventasEmpleado.get(i).monto;
            if (ventasEmpleado.get(i).tipo.equals(Tipo_Producto.VETERINARIOS)) {

                //condicion para preguntar si el mes es septiembre
                /* if(ventasEmpleado.get(i).getFecha().getTime()== LocalDate.of())

                  montoVenta = 2 *  ventasEmpleado.get(i).monto;
                  else
                    montoVenta = ventasEmpleado.get(i).monto;
                 * */

                comision += montoVenta * 0.25;
            } else{
                montoVenta = ventasEmpleado.get(i).monto;
                comision += montoVenta * 0.2;
            }
        }
        comision += (float) ((cantClientesAtendidos/20 ) *5000);

        if(sumatoriaVentas>= objetivoVenta){
            comision += (comision * 0.1);
        }

        return comision;
    }




}
