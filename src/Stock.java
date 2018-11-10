import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/** Класс склада, хранит товары.
 * Имплементирует интерфейс Iterable.*/
public final class Stock implements Iterable<Item> {

    /** Создаем список с товарами.*/
    private List<Item> itemsToArray = new ArrayList<>();

    /** Создаем связный список с товарами.*/
    private List<Item> itemsToList = new LinkedList<>();

    /** Метод добавления товара в список.
     * @param item .*/
    public void addItemToList(final Item item) {
        itemsToList.add(item);
    }

    /** Метод добавления товара в список.
     * @param item .*/
    public void addItemToArray(final Item item) {
        itemsToArray.add(item);
    }

    @Override
    /** Перегрузка для итератора.*/
    public Iterator<Item> iterator() {
        return null;
    }
}
