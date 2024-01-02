
public class Produto implements Compra {

    private String nomeProduto;
    private double preco;

    Produto(String nomeProduto, double preco){
        this.nomeProduto = nomeProduto;
        this.preco = preco;
    }

    public String getNomeProduto(){
        return nomeProduto;
    }

    public double getPreco(){
        return preco;
    }

    @Override
    public String aceitar(Visitor visitor){
        return visitor.exibirProduto(this);
    }

}
