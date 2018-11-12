/**
 * Реализовать очередь на почту,
 * учитывать возраст покупателей,
 * если пенсионер,
 * обслуживать без очереди.
 *
 * @version 1.0 04 Nov 2018
 * @author Pavel Shakhov
 * @param
 */

/** Основной/главный класс программы.*/
public final class Program {

    /**Создаем конструктор.
     */
    private Program() { };

    /** Добавление на склад, в списки, вывод.
    /**@param args .
    *@throws Exception .*/
    public static void main(final String[] args) {

        new Program();

        Item i1 = new Item("Item #1");
        Item i2 = new Item("Item #2");
        ArrayListStock arrayStock = new ArrayListStock();
        LinkedListStock listStock = new LinkedListStock();

        arrayStock.addItemToArray(i1);
        arrayStock.addItemToArray(i2);
        listStock.addItemToList(i1);
        listStock.addItemToList(i2);

        //System.out.printf("ArrayList has %d elements \n", arrayStock.size());

        for (Item item : arrayStock) {
            System.out.println(item.getName());
        }

        for (Item item : listStock) {
            System.out.println(item.getName());
        }
    }
}
