import java.util.*;
import java.util.function.Consumer;

/**Имплементируем интерфейс Iterable.*/
public class Stock implements Iterable {

    /** Класс Stock с полем наименования товара.
     * @param name .*/
    public Stock(final String name) {

        this.name = name;
    }

    /** Геттер наименования товара.
     * @return */
    public String getName() {
        return name;
    }

    /** Основной/главный класс программы.*/
    private String name;

    @Override
    /** Перегрузка для итератора.*/
    public Iterator<Stock> iterator() {
        return null;
    }

    @Override
    /** Основной/главный класс программы.*/
    public void forEach(final Consumer action) {
    }

    @Override
    /** Основной/главный класс программы.*/
    public Spliterator<Stock> spliterator() {
        return null;
    }
}
