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
    public static void main(String[] args) {
        //testMyArrayList();
        testMyLinkedList();

    }
}