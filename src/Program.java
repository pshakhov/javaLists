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

import java.util.ArrayList;
import java.util.LinkedList;

/** Основной/главный класс программы.*/
public final class Program {

    /**Создаем конструктор.
     */
    private Program() { };

    /** Добавление на склад, в списки, вывод.
    /**@param args .
    *@throws Exception .*/
    public static void main(final String[] args) {

            /**Создаем два списка
             * для наименований товара
             * ArrayList и LinkedList
             * для вывода в консоль.*/
            ArrayList<Stock> arrayList = new ArrayList<>();
            LinkedList<Stock> linkedList = new LinkedList<>();

            /**Помещаем наименования
            * товара на склад.*/
            Stock item1 = new Stock("Dr.Martens");
            Stock item2 = new Stock("Adidas");
            Stock item3 = new Stock("Converse");

            /**Добавляем наименования
             * товара в ArrayList.*/
            arrayList.add(item1);
            arrayList.add(item2);
            arrayList.add(item3);

            /**Добавляем наименования
            * товара в LinkedList.*/
            linkedList.add(item1);
            linkedList.add(item2);
            linkedList.add(item3);

        /**Выводим наименование
         * каждого из товаров из
         * ArrayList в консоль.*/
        for (Stock s : arrayList) {
            System.out.print(s.getName() + "\n");
        }

        /**Выводим наименование
         * каждого из товаров из
         * LinkedList в консоль.*/
        for (Stock s : linkedList) {
            System.out.print("\n" + s.getName());
        }
    }
}
