package com.books.HeadFirstJava.extend;

public class Surgeon extends Doctor {

    @Override
    void treatPatient() {
        // Проводим операцию
        super.treatPatient();
    }

    void makeIncision() {
        // Делаем надрез
    }
}
