package com.bridgelabz;

import java.util.Scanner;

public class SnakeAndLadderProblem {
    static final int START_POSITION=0;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the numbers of players ");
        int player1= sc.nextInt();
        player1=START_POSITION;
    }
}
