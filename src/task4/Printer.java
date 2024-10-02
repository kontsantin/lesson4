package task4;
/*Задача 4. Сдвиг очереди.
Реализуйте метод rotateDeque в классе DequeTasks, который принимает
Deque<Integer> и число n. Метод должен повернуть очередь вправо на n
позиций. Если n отрицательное, повернуть влево.
 */
import java.util.Deque;
import java.util.LinkedList;
class DequeTasks {
    public static void rotateDeque(Deque<Integer> deque, int n)
    {
        if (n >= 0) {
            for (int i = 0; i < n; i++) {
                deque.addFirst(deque.pollLast());
            }
        }
        else {
            for (int i = 0; i < -n; i++) {
                deque.addLast(deque.pollFirst());
            }
        }
    }
}
// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        int n;
        if (args.length < 1) {
// При отправке кода на Выполнение, вы можете варьировать эти параметры
            deque.add(1);
            deque.add(2);
            deque.add(3);
            deque.add(4);
            n = 2;
        } else {
            for (int i = 0; i < args.length - 1; i++) {
                deque.add(Integer.parseInt(args[i]));
            }
            n = Integer.parseInt(args[args.length - 1]);
        }
        DequeTasks.rotateDeque(deque, n);
        System.out.print(deque);
    }
}
