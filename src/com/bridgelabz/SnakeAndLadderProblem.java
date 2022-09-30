package com.bridgelabz;

import java.util.Scanner;

public class SnakeAndLadderProblem {
    static final int START_POSITION=0;
    static int snakeLadder(){
        int player=START_POSITION;
        int dice=(int)Math.floor(Math.random()*10)%6+1;
        player=dice;
        return player;
    }
    public static void main(String[] args) {
        int player=snakeLadder();
        System.out.println(player);


    }
}
