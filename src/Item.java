/**Описание товара.*/
public final class Item {

    /**
     * Переменная наименования товара.
     */
    private String name;

    /**
     * Класс LinkedListStock с полем наименования товара.
     *
     * @param name .
     */
    public Item(final String name) {
        this.name = name;
    }

    /**
     * Геттер наименования товара.
     *
     * @return .
     */
    public String getName() {
        return name;
    }
}
