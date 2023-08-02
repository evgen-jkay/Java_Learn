package Books.JavaPhilosophy.initialization;

public class Overloading {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("Перезагружений метод");
        }
        new Tree();
    }
}

class Tree {
    int height;

    Tree() {
        System.out.println("Сажаємо паросток");
        height = 0;
    }

    Tree (int initialHeight) {
        height = initialHeight;
        System.out.println("Створення нового дерева висотою " + height + " м.");
    }

    void info() {
        System.out.println("Дерево висотою " + height + " м.");
    }

    void info(String s) {
        System.out.println(s + ": Дерево висотою " + height + " м.");
    }
}
