package com.company;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String [] scores = {"0", "15", "30", "40", "Advantage"};
    int scorePlayer1 = 0;
    int scorePlayer2 = 0;
    int point = 0;
    boolean gameOn = true;

    boolean draw = false;

    do {
      System.out.println("Quien anoto? Jugador 1 (Presione 1), Jugador 2 (Presione 2): ");
      point = sc.nextInt();

      if(point == 1){
        if(scorePlayer1 >= 3 && scorePlayer1 - scorePlayer2 >= 1){
          gameOn = false;
        }
        if(scorePlayer2==4){
          scorePlayer1--;
          scorePlayer2--;
        }
        scorePlayer1++;
      }
      if(point == 2){
        if(scorePlayer2 >= 3 && scorePlayer2 - scorePlayer1 >= 1){
          gameOn = false;
        }
        if(scorePlayer1==4){
          scorePlayer1--;
          scorePlayer2--;
        }
        scorePlayer2++;
      }
      if(gameOn){
        System.out.println("Jugador 1: " + scores[scorePlayer1]);
        System.out.println("Jugador 2: " + scores[scorePlayer2]);
      }
    } while (gameOn);
  }
}
