package task1;
/*Задание 1.
Удаление нечетных строк
Дан LinkedList с несколькими элементами. В методе
removeOddLengthStrings класса task1.LLTasks реализуйте удаление строк, длина
которых нечетная. Используйте LinkedList и стандартные методы.
 */

import java.util.LinkedList;


class LLTasks {
    public void removeOddLengthStrings(LinkedList<String> ll) {
        for (int i = 0; i < ll.size(); i++) {
            if (ll.get(i).length() % 2 != 0) {
                ll.remove(i--);
            }
        }
    }
}
// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        if (args.length == 0) {
// При отправке кода на Выполнение, вы можете варьировать эти параметры
            ll.add("apple");
            ll.add("banana");
            ll.add("pear");
            ll.add("grape");
        } else {
            for (String arg : args) {
                ll.add(arg);
            }
        }
        LLTasks answer = new LLTasks();
        System.out.println(ll);
        answer.removeOddLengthStrings(ll);
        System.out.println(ll);
    }
}
