import java.util.*;

/** Класс склада, хранит товары.
 * Имплементирует интерфейс Iterable.*/
public final class LinkedListStock implements Iterable<Item> {

    /** Создаем связный список с товарами.*/
    private List<Item> items = new LinkedList<>();

    /** Метод добавления товара в список.
     * @param item .*/
    public void addItemToList(final Item item) {
        items.add(item);
    }

    @Override
    public Iterator<Item> iterator() {
        return items.iterator();
    }
}

