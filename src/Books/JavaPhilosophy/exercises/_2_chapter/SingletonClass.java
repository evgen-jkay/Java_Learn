package Books.JavaPhilosophy.exercises._2_chapter;

public class SingletonClass {
    // Поле static, которое будет общим для всех экземпляров класса
    static int staticField = 0;

    // Метод для увеличения значения поля staticField
    void incrementStaticField() {
        staticField++;
    }

    // Метод для получения значения поля staticField
    int getStaticField() {
        return staticField;
    }
}
