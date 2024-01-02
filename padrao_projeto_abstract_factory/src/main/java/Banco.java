public class Banco {
    private Cartao cartao;
    private Conta conta;

    public Banco(FabricaAbstrataBanco fabricaBanco){
        this.cartao = fabricaBanco.createCartao();
        this.conta = fabricaBanco.createConta();
    }

    public String emitirCartao(){
        return this.cartao.emitir();
    }

    public String expedirConta(){
        return this.conta.expedir();
    }
}
