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
    {
        int ax=x,ay=y;
        computeTopLeft(ax,ay);
        computeTopRight(ax,ay);
        computeBottomLeft(ax,ay);
        computeBottomRight(ax,ay);
    }

    @Override
    public void move(int x, int y) {

        if(board[this.x][this.y]==1)
            board[x][y]=1;
        else {
            board[x][y]=2;
        }
        board[this.x][this.y]=0;
        displayBoard[x][y]=displayBoard[this.x][this.y];
        displayBoard[this.x][this.y]="0 ";
        this.x=x;
        this.y=y;
    }

    private void computeBottomRight(int ax, int ay) {
        while(ax!=7&& ay!=0)
        {
            if(whiteColor)
            {
                if(board[x][y]!=board[ax+1][ay-1])
                {
                    if(this.color==Color.WHITE)
                    {
                        if(board[ax+1][ay-1]==0){PlayerAvailableMoves.add("b"+converter.get(x)+(y+1)+converter.get(ax+1)+ay);}
                        else{PlayerAvailableMoves.add("b"+converter.get(x)+(y+1)+"x"+converter.get(ax+1)+ay);break;}
                    }
                    else
                    {
                        if(board[ax+1][ay-1]==0){BotAvailableMoves.add("b"+converter.get(x)+(y+1)+converter.get(ax+1)+ay);}
                        else{BotAvailableMoves.add("b"+converter.get(x)+(y+1)+"x"+converter.get(ax+1)+ay);break;}
                    }
                }
                else {break;}
            }
            else {
                if(board[x][y]!=board[ax+1][ay-1])
                {
                    if(this.color==Color.WHITE)
                    {
                        if(board[ax+1][ay-1]==0){BotAvailableMoves.add("b"+converter.get(x)+(y+1)+converter.get(ax+1)+ay);}
                        else{BotAvailableMoves.add("b"+converter.get(x)+(y+1)+"x"+converter.get(ax+1)+ay);break;}
                    }
                    else
                    {
                        if(board[ax+1][ay-1]==0){PlayerAvailableMoves.add("b"+converter.get(x)+(y+1)+converter.get(ax+1)+ay);}
                        else{PlayerAvailableMoves.add("b"+converter.get(x)+(y+1)+"x"+converter.get(ax+1)+ay);break;}
                    }
                }
                else {break;}
            }
            ax++;
            ay--;
        }
    }

    private void computeBottomLeft(int ax, int ay) {
        while(ax!=0&& ay!=0)
        {
            if(whiteColor)
            {
                if(board[x][y]!=board[ax-1][ay-1])
                {
                    if(this.color==Color.WHITE)
                    {
                        if(board[ax-1][ay-1]==0){PlayerAvailableMoves.add("b"+converter.get(x)+(y+1)+converter.get(ax-1)+ay);}
                        else{PlayerAvailableMoves.add("b"+converter.get(x)+(y+1)+"x"+converter.get(ax-1)+ay);break;}
                    }
                    else
                    {
                        if(board[ax-1][ay-1]==0){BotAvailableMoves.add("b"+converter.get(x)+(y+1)+converter.get(ax-1)+ay);}
                        else{BotAvailableMoves.add("b"+converter.get(x)+(y+1)+"x"+converter.get(ax-1)+ay);break;}
                    }
                }
                else {break;}
            }
            else {
                if(board[x][y]!=board[ax-1][ay-1])
                {
                    if(this.color==Color.WHITE)
                    {
                        if(board[ax-1][ay-1]==0){BotAvailableMoves.add("b"+converter.get(x)+(y+1)+converter.get(ax-1)+ay);}
                        else{BotAvailableMoves.add("b"+converter.get(x)+(y+1)+"x"+converter.get(ax-1)+ay);break;}
                    }
                    else
                    {
                        if(board[ax-1][ay-1]==0){PlayerAvailableMoves.add("b"+converter.get(x)+(y+1)+converter.get(ax-1)+ay);}
                        else{PlayerAvailableMoves.add("b"+converter.get(x)+(y+1)+"x"+converter.get(ax-1)+ay);break;}
                    }
                }
                else {break;}
            }
            ax--;
            ay--;
        }
    }

    private void computeTopRight(int ax, int ay) {
        while(ax!=7&& ay!=7)
        {
            if(whiteColor)
            {
                if(board[x][y]!=board[ax+1][ay+1])
                {
                    if(this.color==Color.WHITE)
                    {
                        if(board[ax+1][ay+1]==0){PlayerAvailableMoves.add("b"+converter.get(x)+(y+1)+converter.get(ax+1)+(ay+2));}
                        else{PlayerAvailableMoves.add("b"+converter.get(x)+(y+1)+"x"+converter.get(ax+1)+(ay+2));break;}
                    }
                    else
                    {
                        if(board[ax+1][ay+1]==0){BotAvailableMoves.add("b"+converter.get(x)+(y+1)+converter.get(ax+1)+(ay+2));}
                        else{BotAvailableMoves.add("b"+converter.get(x)+(y+1)+"x"+converter.get(ax+1)+(ay+2));break;}
                    }
                }
                else {break;}
            }
            else {
                if(board[x][y]!=board[ax+1][ay+1])
                {
                    if(this.color==Color.WHITE)
                    {
                        if(board[ax+1][ay+1]==0){BotAvailableMoves.add("b"+converter.get(x)+(y+1)+converter.get(ax+1)+(ay+2));}
                        else{BotAvailableMoves.add("b"+converter.get(x)+(y+1)+"x"+converter.get(ax+1)+(ay+2));break;}
                    }
                    else
                    {
                        if(board[ax+1][ay+1]==0){PlayerAvailableMoves.add("b"+converter.get(x)+(y+1)+converter.get(ax+1)+(ay+2));}
                        else{PlayerAvailableMoves.add("b"+converter.get(x)+(y+1)+"x"+converter.get(ax+1)+(ay+2));break;}
                    }
                }
                else {break;}
            }
            ax++;
            ay++;
        }
    }

    private void computeTopLeft(int ax, int ay) {
        while(ax!=0&& ay!=7)
        {
            if(whiteColor)
            {
                if(board[x][y]!=board[ax-1][ay+1])
                {
                    if(this.color==Color.WHITE)
                    {
                        if(board[ax-1][ay+1]==0){PlayerAvailableMoves.add("b"+converter.get(x)+(y+1)+converter.get(ax-1)+(ay+2));}
                        else{PlayerAvailableMoves.add("b"+converter.get(x)+(y+1)+"x"+converter.get(ax-1)+(ay+2));break;}
                    }
                    else
                    {
                        if(board[ax-1][ay+1]==0){BotAvailableMoves.add("b"+converter.get(x)+(y+1)+converter.get(ax-1)+(ay+2));}
                        else{BotAvailableMoves.add("b"+converter.get(x)+(y+1)+"x"+converter.get(ax-1)+(ay+2));break;}
                    }
                }
                else {break;}
            }
            else {
                if(board[x][y]!=board[ax-1][ay+1])
                {
                    if(this.color==Color.WHITE)
                    {
                        if(board[ax-1][ay+1]==0){BotAvailableMoves.add("b"+converter.get(x)+(y+1)+converter.get(ax-1)+(ay+2));}
                        else{BotAvailableMoves.add("b"+converter.get(x)+(y+1)+"x"+converter.get(ax-1)+(ay+2));break;}
                    }
                    else
                    {
                        if(board[ax-1][ay+1]==0){PlayerAvailableMoves.add("b"+converter.get(x)+(y+1)+converter.get(ax-1)+(ay+2));}
                        else{PlayerAvailableMoves.add("b"+converter.get(x)+(y+1)+"x"+converter.get(ax-1)+(ay+2));break;}
                    }
                }
                else {break;}
            }
            ax--;
            ay++;
        }
    }
}
