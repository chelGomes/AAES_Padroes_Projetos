import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int numeroPedido;
    private List<Pedido> itens;

    public Pedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
        this.itens = new ArrayList<>();
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public List<Pedido> getItens() {
        return itens;
    }

    public String aceitar(Visitor visitor){
        return visitor.exibirPedido(this);
    }
}
