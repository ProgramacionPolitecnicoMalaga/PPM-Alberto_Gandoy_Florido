public class CalcularNomina {

    public void calculoAsalariado(Asalariado asalariado) {
        double sueldoTotal = asalariado.getSUEDO_FIJO();
        Nomina nomina = new Nomina(sueldoTotal);
        asalariado.setNomina(nomina);
    }
    public void calculoComisionado(Comisionado comisionado) {
        int sumaVenta = 0;
        for (int i = 0; i < comisionado.getVentas().size(); i++) {
            sumaVenta += comisionado.getVentas().get(i) * comisionado.getSUELDO_EXTRA();
        }
        double sueldoTotal = (sumaVenta * comisionado.getSUELDO_EXTRA()) + comisionado.getSUELDO_BASE();
        Nomina nomina = new Nomina(sueldoTotal);
        comisionado.setNomina(nomina);
    }

    public void calculoPorHora(PorHora porHora) {
        double sueldoTotal = porHora.getHora() * porHora.getSueldo();
        Nomina nomina = new Nomina(sueldoTotal);
        porHora.setNomina(nomina);
    }
}
