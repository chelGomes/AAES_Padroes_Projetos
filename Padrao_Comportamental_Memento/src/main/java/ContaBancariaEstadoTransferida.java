public class ContaBancariaEstadoTransferida implements ContaBancariaEstado {
    private ContaBancariaEstadoTransferida() {};
    private static ContaBancariaEstadoTransferida instance = new ContaBancariaEstadoTransferida();
    public static ContaBancariaEstadoTransferida getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Transferida";
    }
}
