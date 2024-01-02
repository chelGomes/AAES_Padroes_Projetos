public class TipoEmprestimoPessoal {
    private static TipoEmprestimoPessoal tipoEmprestimoPessoal = new TipoEmprestimoPessoal();

    private TipoEmprestimoPessoal() {};

    public static TipoEmprestimoPessoal getTipoEmprestimoPessoal() {
        return tipoEmprestimoPessoal;
    }

}
