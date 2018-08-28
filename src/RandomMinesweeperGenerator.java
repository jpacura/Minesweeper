public class RandomMinesweeperGenerator implements MinesweeperGenerator
{
    private int numMines;
    private int numRows;
    private int numCols;

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

    @Override
    public int getNumMines()
    {
        return numMines;
    }

    @Override
    public int getNumRows()
    {
        return numRows;
    }

    @Override
    public int getNumCols()
    {
        return numCols;
    }
}
