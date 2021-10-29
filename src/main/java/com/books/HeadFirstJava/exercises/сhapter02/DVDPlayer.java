package com.books.HeadFirstJava.exercises.сhapter02;

class DVDPlayer {

    boolean cenRecord = false;

    void recordDVD() {
        System.out.println("идет запись DVD");
    }

    void prayDVD() {
        System.out.println("DVD протгрывается");
    }

}

class DVDPlayerTestDrive {
    public static void main(String[] args) {
        DVDPlayer d = new DVDPlayer();
        d.cenRecord = true;
        d.prayDVD();

        if (d.cenRecord = true) {
            d.recordDVD();
        }
    }
}