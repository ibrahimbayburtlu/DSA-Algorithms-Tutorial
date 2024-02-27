package Algorithms.Greedy.easy;

import java.util.Scanner;
/*
Given the length, breadth, height of a cuboid. The task is to divide the given cuboid in minimum number
of cubes such that size of all cubes is same and sum of volumes of cubes is maximum.
Examples:


Input : l = 2, b = 4, h = 6
Output : 2 6
A cuboid of length 2, breadth 4 and
height 6 can be divided into 6 cube
of side equal to 2.
Volume of cubes = 6*(2*2*2) = 6*8 = 48.
Volume of cuboid = 2*4*6 = 48.

Input : 1 2 3
Output : 1 6
 */
public class DivideCuboidCubes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Uzunluk: ");
        int l = input.nextInt();
        System.out.print("Genişlik: ");
        int b = input.nextInt();
        System.out.print("Yükseklik: ");
        int h = input.nextInt();

        divideCuboidCubesSumMaximum(l, b, h);
    }

    private static void divideCuboidCubesSumMaximum(int l, int b, int h) {
        int totalVolume = l * b * h;
        int maxCubeSide = Math.min(Math.min(l, b), h);

        int maxVolume = 0;
        int cubes = 0;

        for (int side = 1; side <= maxCubeSide; side++) {
            int volume = (l / side) * (b / side) * (h / side);
            if (volume > maxVolume) {
                maxVolume = volume;
                cubes = totalVolume / (side * side * side);
            }
        }

        System.out.println("Küplerin Boyutu: " + maxCubeSide);
        System.out.println("Küp Sayısı: " + cubes / (maxCubeSide*maxCubeSide*maxCubeSide));
    }
}