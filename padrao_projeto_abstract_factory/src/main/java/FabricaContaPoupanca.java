public class FabricaContaPoupanca implements FabricaAbstrataBanco{
    @Override
    public Cartao createCartao(){
        return new CartaoContaPoupanca();
    }

    public Conta createConta(){
        return new ContaPoupanca();
    }
}
