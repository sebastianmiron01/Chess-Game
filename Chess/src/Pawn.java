import java.sql.SQLOutput;
import java.util.ArrayList;

public class Pawn extends Game implements Piece {
    public Color color;
    public  Integer x,y;


    Pawn(Color color,int x, int y)
    {
        this.color=color;
        this.y = y;
        this.x=x;
    }
    public void computePossibleMoves()
    {
        String aux;
        Integer a;
        if(whiteColor && this.color==Color.WHITE &&this.y==1)
        {
            if(board[x][y+1]!=1)
            {
                aux="3";
                PlayerAvailableMoves.add(converter.get(x)+aux);

            }
            if(board[x][y+2]!=1)
            {
                aux="4";
                PlayerAvailableMoves.add(converter.get(x)+aux);

            }
        }
        else if(whiteColor && this.color==Color.WHITE &&this.y!=1&&board[x][y+1]!=1)
        {
            a=y+2;
            aux=a.toString();
            PlayerAvailableMoves.add(converter.get(x)+aux);

        }
        if(this.x!=7&&board[this.x+1][this.y+1]==2)
        {
            a=x+2;
            aux=a.toString();
            PlayerAvailableMoves.add(converter.get(x)+"x"+aux);

        }
        if(this.x!=0&&board[this.x-1][this.y+1]==2)
        {
            a=x;
            aux=a.toString();
            PlayerAvailableMoves.add(converter.get(x)+"x"+aux);

        }
    }
}
