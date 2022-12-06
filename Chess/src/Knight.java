public class Knight implements Piece {
    public Color color;
    public int x,y;
    Knight(Color color,int x, int y)
    {
        this.color=color;
        this.y = y;
        this.x=x;
    }
    public void computePossibleMoves()
    {}
}
