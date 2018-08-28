public interface MinesweeperGenerator
{
    MinesweeperTile[][] generate();
    int getNumMines();
    int getNumRows();
    int getNumCols();
}
