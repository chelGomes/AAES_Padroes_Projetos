import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Menu implements Iterable<MenuItem>{
    private List<MenuItem> menuItems = new ArrayList<>();

    public Menu(MenuItem... menuItems) {
        this.menuItems = Arrays.asList(menuItems);
    }

    @Override
    public Iterator<MenuItem> iterator() {
        return menuItems.iterator();
    }
}
