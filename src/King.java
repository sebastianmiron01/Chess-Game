public class King extends Game implements Piece{
    public Color color;
    public int x,y;
    King(Color color,int x,int y) {
        this.color=color;
        this.x=x;
        this.y=y;
    }
    public void computePossibleMoves() {
        String aux;
        Integer a;
        if(whiteColor)
        {
            if (this.x == 0) {
                if (this.y == 0) {
                    if (board[x + 1][y + 1] !=1)
                    {
                        if(board[x+1][y+1]==2)
                        {
                            a = y + 1;
                            aux = a.toString();
                            PlayerAvailableMoves.add("Kx" +converter.get(x + 1) + aux);
                        }
                        else if (board[x+1][y+1]==0)
                        {
                            a = y + 1;
                            aux = a.toString();
                            PlayerAvailableMoves.add("K" +converter.get(x + 1) + aux);
                        }
                    }
                    if (board[x + 1][y] !=1)
                    {
                        if(board[x+1][y]==2)
                        {
                            a = y ;
                            aux = a.toString();
                            PlayerAvailableMoves.add("Kx" +converter.get(x + 1) + aux);
                        }
                        else if (board[x+1][y]==0)
                        {
                            a = y;
                            aux = a.toString();
                            PlayerAvailableMoves.add("K" +converter.get(x + 1) + aux);
                        }
                    }
                    if (board[x][y+1] !=1)
                    {
                        if(board[x][y+1]==2)
                        {
                            a = y+1;
                            aux = a.toString();
                            PlayerAvailableMoves.add("Kx" +converter.get(x) + aux);
                        }
                        else if (board[x][y]==0)
                        {
                            a = y+1;
                            aux = a.toString();
                            PlayerAvailableMoves.add("K" +converter.get(x) + aux);
                        }
                    }
                }
            }
        }
    }
}
