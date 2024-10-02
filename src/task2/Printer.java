package task2;
/*Задача 2. Реализация стека.
Реализуйте MyStack с использованием LinkedList с методами:
● push(String element) - добавляет элемент на вершину стека
● pop() - возвращает элемент с вершины и удаляет его
● peek() - возвращает элемент с вершины, не удаляя
● getElements() - возвращает все элементы стека
 */

import java.util.LinkedList;
import java.util.List;

class MyStack {

    private List<String> list = new LinkedList<>();

    public void push(String element) {
        list.add(element);
    }
    public String pop() {
        return list.removeLast();
    }
    public String peek() {
        return list.getLast();
    }
    public LinkedList<String> getElements() {
        return new LinkedList<String>(list);
    }
}
// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        if (args.length == 0) {
// При отправке кода на Выполнение, вы можете варьировать эти параметры
            stack.push("apple");
            stack.push("banana");
            stack.push("pear");
            stack.push("grape");
        } else {
            for (String arg : args) {
                stack.push(arg);
            }
        }
        System.out.println(stack.getElements());
        System.out.println(stack.pop());
        System.out.println(stack.getElements());
        System.out.println(stack.peek());
    }
}

