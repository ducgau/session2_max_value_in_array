package com.codegym;

import java.util.Scanner;

public class maxValueInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers rows for Matrix:");
        int rows = sc.nextInt();
        System.out.println("Enter numbers cols for Matrix:");
        int cols = sc.nextInt();
        double [][] matrix = new double[rows][cols];
        for (int i = 0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.println("Enter Element for row "+ (i+1)+" - col "+(j+1)+" is: ");
                matrix[i][j] = sc.nextDouble();
            }
        }
        System.out.print("Matrix is: ");
        for (int i=0; i<rows;i++){
            System.out.println(" ");
            for (int j=0; j<cols; j++){
                System.out.print(matrix[i][j] + "\t");
            }
        }
        double max = matrix[0][0];
        int indexRows = 1, indexClosed = 1;
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                if (matrix[i][j] > max){
                    max = matrix[i][j];
                    indexRows = i+1;
                    indexClosed = j+1;
                }
            }
        }
        System.out.println(" ");
        System.out.println("Element has value Max in Matrix is: "+ max);
        System.out.println("Element value Max in Matrix at row : "+ indexRows +", col : "+indexClosed);
    }
}
