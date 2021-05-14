package isi.died.parcial01.ejercicio01;

public class Viajante extends Empleado{

    public int cantiClientesVisitados;

    public int getCantiClientesVisitados() {
        return cantiClientesVisitados;
    }

    public void setCantiClientesVisitados(int cantiClientesVisitados) {
        this.cantiClientesVisitados = cantiClientesVisitados;
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

                comision += montoVenta * 0.2;
            } else{
                montoVenta = ventasEmpleado.get(i).monto;
                comision += montoVenta * 0.1;
            }
        }
        comision += (1000* cantiClientesVisitados);
        if(sumatoriaVentas>= objetivoVenta){
            comision += (comision * 0.2);
        }

        return comision;
    }

}
