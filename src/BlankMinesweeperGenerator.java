public class BlankMinesweeperGenerator implements MinesweeperGenerator
{
    private int numRows;
    private int numCols;

    public BlankMinesweeperGenerator(int numRows, int numCols)
    {
        this.numRows = numRows;
        this.numCols = numCols;
    }

    @Override
    public MinesweeperTile[][] generate()
    {
        MinesweeperTile[][] newBoard = new MinesweeperTile[numRows][numCols];

        for(MinesweeperTile[] row : newBoard)
        {
            for(MinesweeperTile tile : row)
            {
                // This board should have all tiles marked as unknown
                // This represents a board that has had nothing clicked yet
                tile = MinesweeperTile.UNKNOWN;
            }
        }

        return newBoard;
    }

    @Override
    public int getNumMines()
    {
        // Since this will always generate a blank board (for loading a game with no moves yet), we will never
        // have any mines when this method is called
        return 0;
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
