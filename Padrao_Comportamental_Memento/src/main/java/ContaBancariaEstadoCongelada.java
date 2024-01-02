public class ContaBancariaEstadoCongelada implements ContaBancariaEstado{
    private ContaBancariaEstadoCongelada() {};
    private static ContaBancariaEstadoCongelada instance = new ContaBancariaEstadoCongelada();
    public static ContaBancariaEstadoCongelada getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Congelada";
    }
}
