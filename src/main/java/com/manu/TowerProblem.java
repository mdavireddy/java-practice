package com.manu;

public class TowerProblem {

    public static void main(String[] args) {
        tower(3, "A", "B", "C");
    }

    static void tower(int position, String source, String middle, String destination) {

        if (position == 1) {
            System.out.println(String.format("moved %d from %s to %s", position, source, destination));
            return;
        }
        tower(position - 1, source, destination, middle);
        System.out.println(String.format("moved %d from %s to %s", position, source, destination));
        tower(position - 1, middle, source, destination);
    }
}
