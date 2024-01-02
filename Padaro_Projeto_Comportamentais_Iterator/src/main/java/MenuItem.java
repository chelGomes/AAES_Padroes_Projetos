public class MenuItem {
    private String nomeProduto;

    private boolean disponivel;

    public MenuItem(String nomeProduto,  boolean disponivel) {
        this.nomeProduto = nomeProduto;
        this.disponivel = disponivel;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }


    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
