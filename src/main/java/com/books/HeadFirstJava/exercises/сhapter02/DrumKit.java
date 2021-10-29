package com.books.HeadFirstJava.exercises.сhapter02;

class DrumKit {

    boolean topHat = true;
    boolean share = true;

    void playTopHat() {
        System.out.println("динь динь ди-динь");
    }

    void playShare() {
        System.out.println("бах бах ба-бах");
    }
}

class DrumKitTestDrive {
    public static void main(String[] args) {

        DrumKit d = new DrumKit();
        d.playShare();
        d.share = false;
        d.playTopHat();

        if (d.share == true) {
            d.playShare();
        }
    }
}
