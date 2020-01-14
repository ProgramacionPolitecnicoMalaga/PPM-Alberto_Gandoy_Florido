public class Aplicacion {
    public static void main(String[] args) throws ExceptionEmpleado {
        CalcularNomina calcularNomina = new CalcularNomina();
        Nomina nomina = new Nomina();
        Empleados empleados = new Empleados();

        Empleado asalariado = new Asalariado("Alberto", "Gandoy Florido", "77777777", 0, nomina);
        Empleado porHora = new PorHora("Facundo","De-Nardo","8888888", 50, nomina,2);
        Empleado comisionado = new Comisionado("Jorge", "Rios Sanchez", "0000000000", 0, nomina);

        calcularNomina.calculoAsalariado((Asalariado) asalariado);
        calcularNomina.calculoComisionado((Comisionado) comisionado);
        calcularNomina.calculoPorHora((PorHora) porHora);


        empleados.addEmpleado(asalariado);
        empleados.addEmpleado(porHora);
        empleados.addEmpleado(comisionado);

        empleados.printEmpleado();
    }
}
