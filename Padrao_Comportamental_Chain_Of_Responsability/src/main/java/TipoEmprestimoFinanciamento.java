public class TipoEmprestimoFinanciamento {
    private static TipoEmprestimoFinanciamento tipoEmprestimoFinanciamento = new TipoEmprestimoFinanciamento();

    private TipoEmprestimoFinanciamento() {};

    public static TipoEmprestimoFinanciamento getTipoEmprestimoFinanciamento() {
        return tipoEmprestimoFinanciamento;
    }
}
