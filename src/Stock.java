import java.util.*;
import java.util.function.Consumer;

public class Stock implements Iterable {

    public Stock(String name){

        this.name = name;
    }

    public String getName() {
        return name;
    }

    private String name;

    @Override
    public Iterator<Stock> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {

    }

    @Override
    public Spliterator<Stock> spliterator() {
        return null;
    }
}
