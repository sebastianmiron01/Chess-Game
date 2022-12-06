public class Queen extends Game implements Piece {
    public Color color;
    public int x,y;
    Queen(Color color,int x, int y)
    {
        this.color=color;
        this.y = y;
        this.x=x;
    }
    public void computePossibleMoves()
    {}
}
