public class TipoEmprestimoBoleto {
    private static TipoEmprestimoBoleto tipoEmprestimoBoleto = new TipoEmprestimoBoleto();

    private TipoEmprestimoBoleto() {};

    public static TipoEmprestimoBoleto getTipoEmprestimoBoleto() {
        return tipoEmprestimoBoleto;
    }
}
