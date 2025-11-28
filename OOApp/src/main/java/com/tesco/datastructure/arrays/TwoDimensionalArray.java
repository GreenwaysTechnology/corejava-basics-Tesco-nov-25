package com.tesco.datastructure.arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] marks = {
                {86, 89, 90}, //student 1 =i
                {56, 89, 90}, // student 2=i
                {99, 97, 98},  // student 3=i
                {89, 90, 90}
        };
        //inner loop takes care of marks //columns
        //outer loop takes care of students // row
        //for each student, marks will be printed
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student " + (i + 1) + ":");
            for (int j = 0; j < marks[i].length; j++) {
                System.out.println(" " + marks[i][j] + " ");
            }
        }
        int rowNumber = 1;
        for (int[] row : marks) {
            System.out.println("Student : " + rowNumber + " :");
            for (int value : row) {
                System.out.println(value + " ");
            }
            System.out.println();
            rowNumber++;
        }
    }
}
