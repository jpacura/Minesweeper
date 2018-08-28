public class Minesweeper
{
    private int NUMBER_MINES;
    private int NUMBER_ROWS;
    private int NUMBER_COLS;

    public Minesweeper()
    {
        // Default settings for Windows XP Minesweeper on Beginner mode
        NUMBER_MINES = 10;
        NUMBER_ROWS  = 9;
        NUMBER_COLS  = 9;
    }

    public Minesweeper(int rows, int cols, int mines)
    {
        NUMBER_MINES = mines;
        NUMBER_ROWS  = rows;
        NUMBER_COLS  = cols;
    }

    public int getMines()
    {
        return NUMBER_MINES;
    }

    public int getRows()
    {
        return NUMBER_ROWS;
    }

    public int getCols()
    {
        return NUMBER_COLS;
    }
}
