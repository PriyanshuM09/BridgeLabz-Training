package com.GamerZone;
import java.util.Scanner;

public class GamerZone {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of players: ");
        int n = sc.nextInt();
        sc.nextLine();

        Player[] players = new Player[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter player name: ");
            String name = sc.nextLine();

            System.out.print("Enter score: ");
            int score = sc.nextInt();
            sc.nextLine();

            players[i] = new Player(name, score);
        }

        QuickSorter sorter = new QuickSorter();
        sorter.sort(players, 0, players.length - 1);

        System.out.println("Leaderboard:");
        for (Player p : players) {
            p.display();
        }
    }
}
