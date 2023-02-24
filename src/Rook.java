public class Rook extends Game implements Piece {
    public Color color;
    public int x,y;
    Rook(Color color,int x, int y)
    {
        this.color=color;
        this.y = y;
        this.x=x;
    }
    public void computePossibleMoves()
    {
        int ax=x,ay=y;
        computeTop(ax,ay);
        computeLeft(ax,ay);
        computeBottom(ax,ay);
        computeRight(ax,ay);
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

    private void computeLeft(int ax, int ay) {
        while(ax!=0)
        {
            if(whiteColor)
            {
                if(board[x][y]!=board[ax-1][ay])
                {
                    if(this.color==Color.WHITE)
                    {
                        if(board[ax-1][ay]==0){PlayerAvailableMoves.add("r"+converter.get(x)+(y+1)+converter.get(ax-1)+(ay+1));}
                        else{PlayerAvailableMoves.add("r"+converter.get(x)+(y+1)+"x"+converter.get(ax-1)+(ay+1));break;}
                    }
                    else
                    {
                        if(board[ax-1][ay]==0){BotAvailableMoves.add("r"+converter.get(x)+(y+1)+converter.get(x)+converter.get(ax-1)+(ay+1));}
                        else{BotAvailableMoves.add("r"+converter.get(x)+(y+1)+"x"+converter.get(ax-1)+(ay+1));break;}
                    }
                }
                else {break;}
            }
            else {
                if(board[x][y]!=board[ax-1][ay])
                {
                    if(this.color==Color.WHITE)
                    {
                        if(board[ax-1][ay]==0){BotAvailableMoves.add("r"+converter.get(x)+(y+1)+converter.get(x)+converter.get(ax-1)+(ay+1));}
                        else{BotAvailableMoves.add("r"+converter.get(x)+(y+1)+"x"+converter.get(ax-1)+(ay+1));break;}
                    }
                    else
                    {
                        if(board[ax-1][ay]==0){PlayerAvailableMoves.add("r"+converter.get(x)+(y+1)+converter.get(ax-1)+(ay+1));}
                        else{PlayerAvailableMoves.add("r"+converter.get(x)+(y+1)+"x"+converter.get(ax-1)+(ay+1));break;}
                    }
                }
                else {break;}
            }
            ax--;
        }
    }

    private void computeRight(int ax, int ay) {
        while(ax!=7)
        {
            if(whiteColor)
            {
                if(board[x][y]!=board[ax+1][ay])
                {
                    if(this.color==Color.WHITE)
                    {
                        if(board[ax+1][ay]==0){PlayerAvailableMoves.add("r"+converter.get(x)+(y+1)+converter.get(ax+1)+(ay+1));}
                        else{PlayerAvailableMoves.add("r"+converter.get(x)+(y+1)+"x"+converter.get(ax+1)+(ay+1));break;}
                    }
                    else
                    {
                        if(board[ax+1][ay]==0){BotAvailableMoves.add("r"+converter.get(x)+(y+1)+converter.get(ax+1)+(ay+1));}
                        else{BotAvailableMoves.add("r"+converter.get(x)+(y+1)+"x"+converter.get(ax+1)+(ay+1));break;}
                    }
                }
                else {break;}
            }
            else {
                if(board[x][y]!=board[ax+1][ay])
                {
                    if(this.color==Color.WHITE)
                    {
                        if(board[ax+1][ay]==0){BotAvailableMoves.add("r"+converter.get(x)+(y+1)+converter.get(ax+1)+(ay+1));}
                        else{BotAvailableMoves.add("r"+converter.get(x)+(y+1)+"x"+converter.get(ax+1)+(ay+1));break;}
                    }
                    else
                    {
                        if(board[ax+1][ay]==0){PlayerAvailableMoves.add("r"+converter.get(x)+(y+1)+converter.get(ax+1)+(ay+1));}
                        else{PlayerAvailableMoves.add("r"+converter.get(x)+(y+1)+"x"+converter.get(ax+1)+(ay+1));break;}
                    }
                }
                else {break;}
            }
            ax++;
        }
    }

    private void computeBottom(int ax, int ay) {
        while(ay!=0)
        {
            if(whiteColor)
            {
                if(board[ax][ay-1]!=board[x][y])
                {
                    if(this.color==Color.WHITE)
                    {
                        if(board[ax][ay-1]==0){PlayerAvailableMoves.add("r"+converter.get(x)+(y+1)+converter.get(ax)+ay);}
                        else{PlayerAvailableMoves.add("r"+converter.get(x)+(y+1)+"x"+converter.get(ax)+ay);break;}
                    }
                    else
                    {
                        if(board[ax][ay-1]==0){BotAvailableMoves.add("r"+converter.get(x)+(y+1)+converter.get(ax)+ay);}
                        else{BotAvailableMoves.add("r"+converter.get(x)+(y+1)+"x"+converter.get(ax)+ay);break;}
                    }
                }
                else {break;}
            }
            else {
                if(board[ax][ay-1]!=board[x][y])
                {
                    if(this.color==Color.WHITE)
                    {
                        if(board[ax][ay-1]==0){BotAvailableMoves.add("r"+converter.get(x)+(y+1)+converter.get(ax)+ay);}
                        else{BotAvailableMoves.add("r"+converter.get(x)+(y+1)+"x"+converter.get(ax)+ay);break;}
                    }
                    else
                    {
                        if(board[ax][ay-1]==0){PlayerAvailableMoves.add("r"+converter.get(x)+(y+1)+converter.get(ax)+ay);}
                        else{PlayerAvailableMoves.add("r"+converter.get(x)+(y+1)+"x"+converter.get(ax)+ay);break;}
                    }
                }
                else {break;}
            }
            ay--;
        }
    }

    private void computeTop(int ax, int ay) {
        while(ay!=7)
        {
            if(whiteColor)
            {
                if(board[ax][ay+1]!=board[x][y])
                {
                    if(this.color==Color.WHITE)
                    {
                        if(board[ax][ay+1]==0){PlayerAvailableMoves.add("r"+converter.get(x)+(y+1)+converter.get(ax)+(ay+2));}
                        else{PlayerAvailableMoves.add("r"+converter.get(x)+(y+1)+"x"+converter.get(ax)+(ay+2));break;}
                    }
                    else
                    {
                        if(board[ax][ay+1]==0){BotAvailableMoves.add("r"+converter.get(x)+(y+1)+converter.get(ax)+(ay+2));}
                        else{BotAvailableMoves.add("r"+converter.get(x)+(y+1)+"x"+converter.get(ax)+(ay+2));break;}
                    }
                }
                else {break;}
            }
            else {
                if(board[ax][ay+1]!=board[x][y])
                {
                    if(this.color==Color.WHITE)
                    {
                        if(board[ax][ay+1]==0){BotAvailableMoves.add("r"+converter.get(x)+(y+1)+converter.get(ax)+(ay+2));}
                        else{BotAvailableMoves.add("r"+converter.get(x)+(y+1)+"x"+converter.get(ax)+(ay+2));break;}
                    }
                    else
                    {
                        if(board[ax][ay+1]==0){PlayerAvailableMoves.add("r"+converter.get(x)+(y+1)+converter.get(ax)+(ay+2));}
                        else{PlayerAvailableMoves.add("r"+converter.get(x)+(y+1)+"x"+converter.get(ax)+(ay+2));break;}
                    }
                }
                else {break;}
            }
            ay++;
        }
    }
}
