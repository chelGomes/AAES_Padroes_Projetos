public class ContaBancariaEstadoEncerrada implements ContaBancariaEstado{
    private ContaBancariaEstadoEncerrada () {};
    private static ContaBancariaEstadoEncerrada  instance = new ContaBancariaEstadoEncerrada();
    public static ContaBancariaEstadoEncerrada getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Encerrada";
    }
}
