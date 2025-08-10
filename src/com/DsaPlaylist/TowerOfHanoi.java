package com.DsaPlaylist;

public class TowerOfHanoi {
    // Recursive method to solve Tower of Hanoi puzzle
    public static int solve(int n, char source, char auxiliary, char target) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + target);
            return 1;
        }
        int moves = 0;
        moves += solve(n - 1, source, target, auxiliary); // Move top n-1 disks to auxiliary
        System.out.println("Move disk " + n + " from " + source + " to " + target); // Move nth disk to target
        moves += 1;
        moves += solve(n - 1, auxiliary, source, target); // Move n-1 disks from auxiliary to target
        return moves;
    }

    public static void main(String[] args) {
        int numDisks = 8;
        int totalMoves = solve(numDisks, 'A', 'B', 'C');
        System.out.println("\nTotal moves required: " + totalMoves);
    }
}
