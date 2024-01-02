import java.util.ArrayList;
import java.util.List;

public class ContaBancaria {
    private ContaBancariaEstado estado;
    private List<ContaBancariaEstado> memento = new ArrayList<>();

    public ContaBancariaEstado getEstado() {
        return this.estado;
    }

    public void setEstado(ContaBancariaEstado estado) {
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Indice invalido");
        }
        this.estado = this.memento.get(indice);
    }

    public List<ContaBancariaEstado> getEstados() {
        return this.memento;
    }
}
