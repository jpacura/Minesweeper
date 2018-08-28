public class Minesweeper
{
    // Board that cannot be accessed from outside this class
    // This is how the game remembers where the mines are
    private MinesweeperTile[][] internalBoard;

    // Board that can be accessed from public methods
    // This is how the game keeps track of user input
    private MinesweeperTile[][] externalBoard;

    private MinesweeperGenerator internalGenerator;
    private MinesweeperGenerator externalGenerator;

    public Minesweeper(MinesweeperGenerator boardGenerator, MinesweeperGenerator moveGenerator)
    {
        this.internalGenerator = boardGenerator;
        this.externalGenerator = moveGenerator;

        generate();
    }

    private void generate()
    {
        // This doesn't HAVE to be a separate method since it is only called by the constructor,
        // But I am separating this in case it needs to be changed / abstracted

        // Both boards must be the same size, otherwise the game is broken
        // We should confirm that here since the dimensions cannot change in the generators
        // It is assumed that a generator will provide the correct-sized board, otherwise the implementation does NOT
        // properly implement the interface
        if(internalGenerator.getNumRows() != externalGenerator.getNumCols())
        {
            // The number of rows does not match between the two generators
            throw new IllegalArgumentException("The number of rows does not match between the two generators");
        }

        if(internalGenerator.getNumCols() != externalGenerator.getNumCols())
        {
            // The number of columns does not match between the two generators
            throw new IllegalArgumentException("The number of columns does not match between the two generators");
        }

        // We DO NOT check the number of mines, as the external board may not have revealed all of them yet (game in progress)

        internalBoard = internalGenerator.generate();
        externalBoard = externalGenerator.generate();
    }

    public int getNumMines()
    {
        return externalGenerator.getNumMines();
    }

    public int getNumRows()
    {
        return externalGenerator.getNumRows();
    }

    public int getNumCols()
    {
        return externalGenerator.getNumCols();
    }
}
