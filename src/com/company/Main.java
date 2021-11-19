package com.company;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] scores = {0, 15, 30, 40};
    int scorePlayer1 = 0;
    int scorePlayer2 = 0;
    int point = 0;
    boolean gameOn = true;

    boolean draw = false;

    do {
      System.out.println("Quien anoto? Jugador 1 (Presione 1), Jugador 2 (Presione 2): ");
      point = sc.nextInt();

      draw = (scorePlayer1 == 3) && (scorePlayer2 == 3);

      if(point == 1){
        if(scorePlayer1 >= 3 && scorePlayer1 - scorePlayer2 >= 1){
          gameOn = false;
        }
        scorePlayer1++;
      }
      if(point == 2){
        if(scorePlayer2 >= 3 && scorePlayer2 - scorePlayer1 >= 1){
          gameOn = false;
        }
        scorePlayer2++;
      }
    } while (gameOn);
  }
}
