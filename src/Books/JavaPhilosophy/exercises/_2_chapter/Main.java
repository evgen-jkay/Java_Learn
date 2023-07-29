package Books.JavaPhilosophy.exercises._2_chapter;

public class Main {
    public static void main(String[] args) {
        // Создаем несколько объектов класса SingletonClass
        SingletonClass obj1 = new SingletonClass();
        SingletonClass obj2 = new SingletonClass();
        SingletonClass obj3 = new SingletonClass();

        // Увеличиваем значение staticField для каждого объекта
        obj1.incrementStaticField();
        obj2.incrementStaticField();
        obj3.incrementStaticField();

        // Получаем значения staticField для каждого объекта
        System.out.println("Значение staticField для obj1: " + obj1.getStaticField());
        System.out.println("Значение staticField для obj2: " + obj2.getStaticField());
        System.out.println("Значение staticField для obj3: " + obj3.getStaticField());
    }
}