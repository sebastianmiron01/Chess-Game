public class Bishop extends Game implements Piece{
    public Color color;
    public int x,y;
    Bishop(Color color,int x, int y)
    {
        this.color=color;
        this.y = y;
        this.x=x;
    }
    public void computePossibleMoves()
    {}
}
