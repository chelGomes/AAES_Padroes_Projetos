import java.util.Iterator;

public class Restaurante {
    public static int contarItensDisponiveis(Menu menu) {
        int quantidade = 0;
        for (MenuItem menuItem : menu) {
            if (menuItem.isDisponivel()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static int contarTotalItens(Menu menu) {
        int quantidade = 0;
        for (Iterator c = menu.iterator(); c.hasNext();) {
            quantidade++;
            c.next();
        }
        return quantidade;
    }
}
