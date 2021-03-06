import java.util.*;

/** Класс склада, хранит товары.
 * Имплементирует интерфейс Iterable.*/
public final class ArrayListStock implements Iterable<Item> {

    /**
     * Создаем связный список с товарами.
     */
    private List<Item> items = new ArrayList<>();

    /**
     * Метод добавления товара в список.
     *
     * @param item .
     */
    public void addItemToArray(final Item item) {
        items.add(item);
    }

    /**
     * Перегрузка для итератора.
     */
    @Override
    public Iterator<Item> iterator() {
        return items.iterator();
    }
}
