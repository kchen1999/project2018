package hw4.puzzle;
import edu.princeton.cs.algs4.StdOut;

public class WordPuzzleSolver {

    public static void main(String[] args) {
        String start = "donors";
        String goal = "robots";

        Word startState = new Word(start, goal);
        Solver solver = new Solver(startState);

        StdOut.println("Minimum number of moves = " + solver.moves());
        for (WorldState ws : solver.solution()) {
            StdOut.println(ws);
        }
    }
}
