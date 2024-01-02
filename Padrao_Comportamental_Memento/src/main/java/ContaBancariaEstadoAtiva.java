public class ContaBancariaEstadoAtiva implements ContaBancariaEstado {
    private ContaBancariaEstadoAtiva() {};
    private static ContaBancariaEstadoAtiva instance = new ContaBancariaEstadoAtiva();
    public static ContaBancariaEstadoAtiva getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Ativa";
    }

}
