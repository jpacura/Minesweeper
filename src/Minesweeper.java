public class Minesweeper
{
    private int numMines;
    private int numRows;
    private int numCols;

    // Board that cannot be accessed from outside this class
    // This is how the game remembers where the mines are
    private MinesweeperTile[][] internalBoard;

    // Board that can be accessed from public methods
    // This is how the game keeps track of user input
    private MinesweeperTile[][] externalBoard;

    private MinesweeperGenerator generator;

    public Minesweeper(MinesweeperGenerator generator)
    {
        this.generator = generator;

        generate();
    }

    private void generate()
    {
        // This doesn't HAVE to be a separate method since it is only called by the constructor,
        // But I am separating this in case it needs to be changed / abstracted

        internalBoard = generator.generate();
    }

    public int getNumMines()
    {
        return numMines;
    }

    public int getNumRows()
    {
        return numRows;
    }

    public int getNumCols()
    {
        return numCols;
    }
}
