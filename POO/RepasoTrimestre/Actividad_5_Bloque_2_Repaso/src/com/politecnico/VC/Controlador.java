package com.politecnico.VC;

import com.politecnico.Eventos.*;
import com.politecnico.Modelo.*;
import com.politecnico.Listas.Aparcamiento;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {
    private Vista vista;
    private Aparcamiento aparcamiento;
    public Controlador(Vista vista, Aparcamiento aparcamiento) {
        this.vista = vista;
        this.aparcamiento = aparcamiento;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Persona persona = null;
        Vehiculo vehiculo = null;
        if (e.getActionCommand().equals("añadirVehiculo")) {
            String tipo = vista.obetenerRadioButtonVehiculo();
            String fechaFabricacion = vista.getFabricacion();
            String fechaEntrada = vista.getEntrada();
            String bastidor = vista.getBastidor();
            String matriculaNombre = vista.getTxtMatriculaNombre();
            if (tipo.equals("barco")) {
                vehiculo = new Barco(fechaFabricacion,fechaEntrada,bastidor);
                ((Barco)vehiculo).setNombre(matriculaNombre);
            }else if (tipo.equals("coche")) {
                vehiculo = new Coche(fechaFabricacion,fechaEntrada,bastidor);
                ((Coche)vehiculo).setMatricula(matriculaNombre);
            } else {
                vehiculo = new Camion(fechaFabricacion, fechaEntrada, bastidor);
                ((Camion)vehiculo).setMatricula(matriculaNombre);
            }
            vista.addBoxDeposito(vehiculo);
            try {
                aparcamiento.addVehiculoEnDeposito(vehiculo);
                vista.mostrarMensaje("El vehículo se ha añadido correctamente " + vehiculo.getClass().getName());
                Evento confiscar = new Confiscar(vehiculo,fechaEntrada);
                aparcamiento.addEvento(confiscar);
            } catch (ExceptionVehiculo exceptionVehiculo) {
                exceptionVehiculo.printStackTrace();
            } catch (ExceptionEvento exceptionEvento) {
                exceptionEvento.printStackTrace();
            }

        }else if (e.getActionCommand().equals("mostrarDeposito")) {
            vista.mostrarDeposito(aparcamiento.getDepositados());

        } else if (e.getActionCommand().equals("mostrarSubasta")) {
            aparcamiento.addVehiculoSubastas(vehiculo);
            vista.mostrarSubastados(aparcamiento.getSubastados());
        } else if (e.getActionCommand().equals("subastar")) {
            vista.limpiarTexto();
            String fechaSubasta = vista.getTxtFechaSubasta();
            vehiculo = aparcamiento.buscarByBastidor(vista.getBoxDeposito());
            vista.removeBoxDeposito(vehiculo);
            vista.addBoxSubastado(vehiculo);
            aparcamiento.addVehiculoSubastas(vehiculo);
            Evento subastaEvento = new Subasta(vehiculo,fechaSubasta);
            try {
                aparcamiento.addEvento(subastaEvento);
            } catch (ExceptionEvento exceptionEvento) {
                exceptionEvento.printStackTrace();
            }
        }  else if (e.getActionCommand().equals("añadirPersona")) {
            String tipo = vista.obetenerRadioButtonPersona();
            String nombre = vista.getTxtNombre();
            String apellido = vista.getTxtApellidos();
            String idSubasta = vista.getTxtID();
            if (tipo.equals("jurídica")) {
                persona = new PersonaJuridica(nombre,apellido,idSubasta);
            } else if (tipo.equals("física")){
                persona = new PersonaFisica(nombre,apellido,idSubasta);
            }
            vista.addBoxPersonas(persona);
            aparcamiento.getCompradores().addAutorizado(persona);
            vista.mostrarMensaje(persona.getNombre() + persona.getApellido() + " se ha añadido correctamente como persona " + persona.getClass().getName());

        } else if (e.getActionCommand().equals("limpiar")) {
            vista.limpiarTodosLosTxt();
        } else if (e.getActionCommand().equals("vender")) {
            vista.limpiarTexto();
            String precio = vista.getTxtPrecio();
            String fecha = vista.getTxtFechaSubasta();
           // vehiculo = aparcamiento.buscarByBastidor(vista.getBoxSubasta());
            //vista.removeBoxSubastado(vehiculo);
            persona = aparcamiento.getCompradores().buscarPersonaById(vista.getBoxPersonas());
            aparcamiento.getCompradores().addAutorizado(persona);
          // vista.removeBoxPersonas(persona);
            aparcamiento.addVehiculoVendido(vehiculo);
            Evento ventaEvento = new Venta(vehiculo,fecha, precio, persona);
            vista.mostrarMensaje("La venta del vehículo: "+ vista.getBoxSubasta() + " se ha realizado correctamente al comprador: " + persona.getIdSubasta()+ " por el precio total de: " + ((Venta)ventaEvento).getPrecio()+ "€");// + vehiculo.getNumeroBastidor()

            try {
                aparcamiento.addEvento(ventaEvento);

            } catch (ExceptionEvento exceptionEvento) {
                exceptionEvento.printStackTrace();
            }

          /*  vista.limpiarTexto();
            String fecha = vista.getTxtFechaSubasta();
            String precio = vista.getTxtPrecio();
            Coche coche = (Coche) aparcamiento.buscarByBastidor(vista.getBoxSubasta());
            persona = aparcamiento.getCompradores().buscarPersonaById(vista.getBoxPersonas());
            Evento venta = new Venta(coche, fecha, precio, persona);
            try {
                aparcamiento.addVehiculoVendido(coche);
                aparcamiento.addEvento(venta);

                //vista.mostrarMensaje("La venta del vehículo: " + vehiculo.getNumeroBastidor() + " se ha realizado correctamente al comprador: " + persona.getIdSubasta() + " por el precio total de: " + precio + "€");
            } catch (ExceptionVehiculo exceptionVehiculo) {
                exceptionVehiculo.printStackTrace();
            } catch (ExceptionEvento exceptionEvento) {
                exceptionEvento.printStackTrace();
            }*/
        }else if (e.getActionCommand().equals("mostrarVendido")) {
            vehiculo = aparcamiento.buscarByBastidor(vista.getBoxSubasta());
            aparcamiento.addVehiculoVendido(vehiculo);
            vista.mostrarVendidos(aparcamiento.getVehiculosVendidos());
            System.out.println(")))))))))))))))))))))))))))))))))))))))" + aparcamiento.getVehiculosVendidos());

        }
    }
}
