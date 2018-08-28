public class RandomMinesweeperGenerator implements MinesweeperGenerator
{
    private int numMines;
    private int numRows;
    private int numCols;

    public RandomMinesweeperGenerator()
    {
        // Default settings for Windows XP Minesweeper on Beginner mode
        numMines = 10;
        numRows = 9;
        numCols = 9;
    }

    public RandomMinesweeperGenerator(int numRows, int numCols, int numMines)
    {
        this.numMines = numMines;
        this.numRows = numRows;
        this.numCols = numCols;
    }

    @Override
    public MinesweeperTile[][] generate()
    {
        // Not implemented yet
        throw new java.lang.UnsupportedOperationException();
    }
}
