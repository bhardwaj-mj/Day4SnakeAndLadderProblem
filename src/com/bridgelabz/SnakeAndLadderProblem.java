package com.bridgelabz;

public class SnakeAndLadderProblem {
    static final int START_POSITION=0;
    static final int NO_PLAY=0;
    static final int LADDER=1;
    static final int SNAKE=2;
    static int move=0;
    static int snakeLadder(){
        int player=START_POSITION;
        while(move<++move){
            int dice = (int) Math.floor(Math.random() * 10) % 6 + 1;
            int checkOption = (int) Math.floor(Math.random() * 10) % 3;
            switch (checkOption) {
                case NO_PLAY:
                    player = player;
                    break;
                case LADDER:
                    player = player+dice;
                    break;
                case SNAKE:
                    player = player - dice;
                    break;
            }
            if(player<START_POSITION){
                player=START_POSITION;
            }
            if(player==100)
                    break;
            move++;
        }
        return player;
    }
    public static void main(String[] args) {
        int player=snakeLadder();
        System.out.println(player);
    }
}
