import edu.illinois.cs.cs125.lib.mazemaker.Maze;

/**
 * Solve a randomly-generated maze.
 *
 * @see <a href="https://github.com/cs125-illinois/mazemaker">Mazemaker on GitHub</a>
 * @see <a href="https://cs125-illinois.github.io/mazemaker/">Mazemaker Documentation</a>
 * @see <a href="https://cs125.cs.illinois.edu/lab/2/#maze">Lab 2 Writeup</a>
 */
@SuppressWarnings("checkstyle:emptyblock")
public class SolveMaze {

    /**
     * Implement your maze solving algorithm in the main method below.
     *
     * @param unused unused input arguments
     */




    public static void main(final String[] unused) {
        /*
         * Create a new 10 x 10 maze. Feel free to change these values.
         */
        Maze maze = new Maze(1000, 1000);

        /*
         * Pick (0, 0), the bottom left corner, as the starting point.
         * Put the end in the top right corner.
         */
        maze.startAtZero();
        maze.endAtTopRight();

        /*
         * You should be able to solve a 10 x 10 maze in (far fewer than) 1000 steps.
         * Feel free to adjust this number if you experiment with other mazes.
         */
        int steps = 0;


        while (!maze.isFinished()) {
            /*
            try {
                Thread.sleep(1000);
            }
            catch (Exception e) {

            }
            */
            maze.turnRight();
            while (!maze.canMove()) {
                maze.turnLeft();
            }
            maze.move();
            steps++;
        }
        /*
        while (!maze.isFinished()) {

            if (steps % 100 == 0) {
                try {
                    Thread.sleep(100);
                } catch (Exception e) {

                }
            }


            if (maze.canMove()) {
                maze.move();
            }

            double rand = Math.random()*10;
            if (rand > 5) {
                maze.turnLeft();
            }
            else {
                maze.turnRight();
            }
            //System.out.println(maze);
            steps++;
        }
        */
        System.out.println(steps);
        if (maze.isFinished()) {
            System.out.println("You solved the maze!");
        } else {
            System.out.println("Try again!");
        }
    }
}
