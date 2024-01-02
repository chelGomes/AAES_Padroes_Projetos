public class FabricaContaCorrente implements FabricaAbstrataBanco{

    @Override
    public Cartao createCartao(){
        return new CartaoContaCorrente();
    }

    public Conta createConta(){
        return new ContaCorrente();
    }
}
