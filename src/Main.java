import java.util.Scanner;

public class Main {
    public static void testMyArrayList() {
        Scanner sc = new Scanner(System.in);
        MyArrayList list = new MyArrayList();
        System.out.println("Хелоу, давай начнем с MyArrayList с типом элементов integer!");
        System.out.println("--> Размер твоего массива сейчас: " + list.size());
        System.out.println("Давай добавим элементы в массив, и помни, если хочешь иметь доступ к сортировке, используй тип данных int или double");
        System.out.println("Введи -1 чтобы закончить добавление");
        int item;
        while (true) {
            item = sc.nextInt();
            if (item == -1) break;
            else list.add(item);
        }

        System.out.print("--> Твой массив: ");
        list.display();
        System.out.println("--> Размер твоего массива сейчас: " + list.size());

        System.out.print("\nДавайте добавим элемент на индекс. Введите элемент и индекс через пробел: ");
        item = sc.nextInt();
        int index = sc.nextInt();
        list.add(item, index);
        System.out.print("--> Твой массив: ");
        list.display();
        System.out.println("--> Размер твоего массива сейчас: " + list.size());

        System.out.print("\nДавайте удалим элемент с вашим индексом. Введите его: ");
        index = sc.nextInt();
        System.out.println("Удаленный элемент - " + list.remove(index));
        System.out.print("--> Твой массив: ");
        list.display();
        System.out.println("--> Размер твоего массива сейчас: " + list.size());

        System.out.print("\nА теперь удалим элемент не зная его индекса. Введите число для удаления: ");
        item = sc.nextInt();
        System.out.println("Ваше число удалилось? - " + list.remove((Object) item));
        System.out.print("--> Твой массив: ");
        list.display();
        System.out.println("--> Размер твоего массива сейчас: " + list.size());

        System.out.print("\nА теперь давайте узнаем, находится ли введенный вами элемент в массиве?: ");
        item = sc.nextInt();
        System.out.println("Находится ли ваш элемент в массиве? - " + list.contains(item));
        System.out.print("--> Твой массив: ");
        list.display();
        System.out.println("--> Размер твоего массива сейчас: " + list.size());

        System.out.print("\nА теперь давайте узнаем первый индекс вхождения введенного вами элемент в массиве: ");
        item = sc.nextInt();
        System.out.println("Первый индекс вхождения - " + list.indexOf(item));
        System.out.print("--> Твой массив: ");
        list.display();
        System.out.println("--> Размер твоего массива сейчас: " + list.size());

        System.out.print("\nА теперь давайте узнаем последний индекс вхождения введенного вами элемент в массиве: ");
        item = sc.nextInt();
        System.out.println("Последний индекс вхождения - " + list.lastIndexOf(item));
        System.out.print("--> Твой массив: ");
        list.display();
        System.out.println("--> Размер твоего массива сейчас: " + list.size());

        System.out.println("\nТеперь давай попробуем отсортировать твой массив.");
        System.out.print("--> Твой массив до сортировки: ");
        list.display();
        list.sort();
        System.out.print("--> Твой массив после сортировки: ");
        list.display();
    }
    public static void testMyLinkedList() {
        Scanner sc = new Scanner(System.in);
        MyLinkedList list = new MyLinkedList();
        System.out.println("Хелоу, давай начнем с MyLinkedList с типом элементов integer!");
        System.out.println("--> Размер твоего массива сейчас: " + list.size());
        System.out.println("Давай добавим элементы в массив, и помни, если хочешь иметь доступ к сортировке, используй тип данных int или double");
        System.out.println("Введи -1 чтобы закончить добавление");
        int item;
        String m;
        while (true) {
            item = sc.nextInt();
            if (item == -1) break;
            else list.add(item);
        }
        System.out.print("--> Твой массив: ");
        list.display();
        System.out.println("--> Размер твоего массива сейчас: " + list.size());

        System.out.print("\nДавайте добавим список элементов на индекс. Введите список элементов и индекс: ");
        System.out.print("\nВведите индекс: ");
        int index = sc.nextInt();
        System.out.print("\nCписок элементов: ");
        m = sc.next();
        list.addall(m, index);
        System.out.print("--> Твой массив: ");
        list.display();
        System.out.println("--> Размер твоего массива сейчас: " + list.size());

        System.out.print("\nДавайте добавим элемент на индекс. Введите элемент и индекс через пробел: ");
        item = sc.nextInt();
        index = sc.nextInt();
        list.add(item, index);
        System.out.print("--> Твой массив: ");
        list.display();
        System.out.println("--> Размер твоего массива сейчас: " + list.size());

        System.out.print("\nДавайте удалим элемент с вашим индексом. Введите его: ");
        index = sc.nextInt();
        System.out.println("Удаленный элемент - " + list.remove(index));
        System.out.print("--> Твой массив: ");
        list.display();
        System.out.println("--> Размер твоего массива сейчас: " + list.size());

        System.out.print("\nА теперь удалим элемент не зная его индекса. Введите число для удаления: ");
        item = sc.nextInt();
        System.out.println("Ваше число удалилось? - " + list.remove((Object) item));
        System.out.print("--> Твой массив: ");
        list.display();
        System.out.println("--> Размер твоего массива сейчас: " + list.size());

        System.out.print("\nА теперь давайте узнаем, находится ли введенный вами элемент в массиве?: ");
        item = sc.nextInt();
        System.out.println("Находится ли ваш элемент в массиве? - " + list.contains(item));
        System.out.print("--> Твой массив: ");
        list.display();
        System.out.println("--> Размер твоего массива сейчас: " + list.size());

        System.out.print("\nА теперь давайте узнаем первый индекс вхождения введенного вами элемент в массиве: ");
        item = sc.nextInt();
        System.out.println("Первый индекс вхождения - " + list.indexOf(item));
        System.out.print("--> Твой массив: ");
        list.display();
        System.out.println("--> Размер твоего массива сейчас: " + list.size());

        System.out.print("\nА теперь давайте узнаем последний индекс вхождения введенного вами элемент в массиве: ");
        item = sc.nextInt();
        System.out.println("Последний индекс вхождения - " + list.lastIndexOf(item));
        System.out.print("--> Твой массив: ");
        list.display();
        System.out.println("--> Размер твоего массива сейчас: " + list.size());

        System.out.println("\nТеперь давай попробуем отсортировать твой массив.");
        System.out.print("--> Твой массив до сортировки: ");
        list.display();
        list.sort();
        System.out.print("--> Твой массив после сортировки: ");
        list.display();
    }
    public static void testQueue() {
        Scanner sc = new Scanner(System.in);
        MyArrayListQueue queue = new MyArrayListQueue();
        System.out.println("Хелоу, твоя очередь с типом элементов integer пуста!\nДавай добавим элементы в очередь\n" +
                "Введи -1 чтобы закончить добавление");
        int n = sc.nextInt();
        while (n != -1) {
            queue.enqueue(n);
            n = sc.nextInt();
        }
        queue.display();
        System.out.println("Теперь, давай узнаем какой элемент первый в очереди\n" +
                "Первый - " + queue.peek());
        System.out.print("\nИтак, давай удалим элемент и узнаем какой элемент первый в очереди заново\n" +
                "Сколько элементов ты хочешь удалить? (1-" + queue.size() + "): ");
        int r = sc.nextInt();
        for (int i = 0; i < r; i++) {
            System.out.println("Удаленный элемент - " + queue.dequeue());
        }
        System.out.println("Первый - " + queue.peek());
        System.out.println();
        queue.display();
        System.out.println("Итак, давай проверим пуста ли твоя очередь - " + queue.isEmpty());
    }
    public static void testStack() {
        Scanner sc = new Scanner(System.in);
        MyArrayListStack stack = new MyArrayListStack();
        System.out.println("Хелоу, твой стек с типом элементов integer пуст!\nДавай добавим элементы в стек\n" +
                "Введи -1 чтобы закончить добавление");
        int n = sc.nextInt();
        while (n != -1) {
            stack.push(n);
            n = sc.nextInt();
        }
        stack.display();
        System.out.println("Теперь, давай узнаем какой элемент первый в стеке\n" +
                "Первый - " + stack.peek());
        System.out.print("\nИтак, давай удалим элемент и узнаем какой элемент первый в стеке заново\n" +
                "Сколько элементов ты хочешь удалить? (1-" + stack.size() + "): ");
        int r = sc.nextInt();
        for (int i = 0; i < r; i++) {
            System.out.println("Удаленный элемент - " + stack.pop());
        }
        System.out.println("Первый - " + stack.peek());
        System.out.println();
        stack.display();
        System.out.println("Итак, давай проверим пуст ли твой стек - " + stack.isEmpty());
    }
    public static void main(String[] args) {
        //testMyArrayList();
        //testMyLinkedList();
        //testStack();
        testQueue();
    }
}