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

        Item p1 = new Item("Apple");
        Item p2 = new Item("Orange");
        ArrayListStock arrayStock = new ArrayListStock();
        LinkedListStock listStock = new LinkedListStock();

        arrayStock.addItemToArray(p1);
        arrayStock.addItemToArray(p2);
        listStock.addItemToList(p1);
        listStock.addItemToList(p2);

        //System.out.printf("ArrayList has %d elements \n", arrayStock.size());

        for (Item item : arrayStock) {
            System.out.println(item.getName());
        }

        for (Item item : listStock) {
            System.out.println(item.getName());
        }
    }
}
