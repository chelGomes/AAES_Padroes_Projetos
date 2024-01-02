public class TipoEmprestimoConsignado {

    private static TipoEmprestimoConsignado tipoEmprestimoConsignado = new TipoEmprestimoConsignado();

    private TipoEmprestimoConsignado() {};

    public static TipoEmprestimoConsignado getTipoEmprestimoConsignado() {
        return tipoEmprestimoConsignado;
    }
}
