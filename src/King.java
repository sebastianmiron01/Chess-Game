public class King extends Game implements Piece{
    public Color color;
    public int x,y;
    King(Color color,int x,int y) {
        this.color=color;
        this.x=x;
        this.y=y;
    }
    public void computePossibleMoves() {
        if(y!=7){

        checkTopLeft();
        checkTop();
        checkTopRight();}
        if(x!=7){
        checkRight();}
        if(y!=0){
        checkBottomRight();
        checkBottom();
        checkBottomLeft();}
        if(x!=0){
        CheckLeft();}
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

    private void CheckLeft() {
        if(board[x-1][y]!=board[x][y])
        {
            if(whiteColor)
            {
                if(this.color==Color.WHITE)
                {
                    if(board[x-1][y]==0){PlayerAvailableMoves.add("k"+converter.get(x)+(y+1)+converter.get(x-1)+(y+1));}
                    else {PlayerAvailableMoves.add("k"+converter.get(x)+(y+1)+"x"+converter.get(x-1)+(y+1));}
                }
                else {
                    if(board[x-1][y]==0){BotAvailableMoves.add("k"+converter.get(x)+(y+1)+converter.get(x-1)+(y+1));}
                    else {BotAvailableMoves.add("k"+converter.get(x)+(y+1)+"x"+converter.get(x-1)+(y+1));}
                }
            }
            else {
                if(this.color==Color.WHITE)
                {
                    if(board[x-1][y]==0){BotAvailableMoves.add("k"+converter.get(x)+(y+1)+converter.get(x-1)+(y+1));}
                    else {BotAvailableMoves.add("k"+converter.get(x)+(y+1)+"x"+converter.get(x-1)+(y+1));}
                }
                else {
                    if(board[x-1][y]==0){PlayerAvailableMoves.add("k"+converter.get(x)+(y+1)+converter.get(x-1)+(y+1));}
                    else {PlayerAvailableMoves.add("k"+converter.get(x)+(y+1)+"x"+converter.get(x-1)+(y+1));}
                }
            }
        }

    }


    private void checkBottomLeft() {
        if(x!=0)
        {
            if(board[x-1][y-1]!=board[x][y])
            {
                if(whiteColor)
                {
                    if(this.color==Color.WHITE)
                    {
                        if(board[x-1][y-1]==0){PlayerAvailableMoves.add("k"+converter.get(x)+(y+1)+converter.get(x-1)+y);}
                        else {PlayerAvailableMoves.add("k"+converter.get(x)+(y+1)+"x"+converter.get(x-1)+y);}
                    }
                    else {
                        if(board[x-1][y-1]==0){BotAvailableMoves.add("k"+converter.get(x)+(y+1)+converter.get(x-1)+y);}
                        else {BotAvailableMoves.add("k"+converter.get(x)+(y+1)+"x"+converter.get(x-1)+y);}
                    }
                }
                else {
                    if(this.color==Color.WHITE)
                    {
                        if(board[x-1][y-1]==0){BotAvailableMoves.add("k"+converter.get(x)+(y+1)+converter.get(x-1)+y);}
                        else {BotAvailableMoves.add("k"+converter.get(x)+(y+1)+"x"+converter.get(x-1)+y);}
                    }
                    else {
                        if(board[x-1][y-1]==0){PlayerAvailableMoves.add("k"+converter.get(x)+(y+1)+converter.get(x-1)+y);}
                        else {PlayerAvailableMoves.add("k"+converter.get(x)+(y+1)+"x"+converter.get(x-1)+y);}
                    }
                }
            }
        }
    }

    private void checkBottom() {
        if(board[x][y-1]!=board[x][y])
        {
            if(whiteColor)
            {
                if(this.color==Color.WHITE)
                {
                    if(board[x][y-1]==0){PlayerAvailableMoves.add("k"+converter.get(x)+(y+1)+converter.get(x)+y);}
                    else {PlayerAvailableMoves.add("k"+converter.get(x)+(y+1)+"x"+converter.get(x)+y);}
                }
                else {
                    if(board[x][y-1]==0){BotAvailableMoves.add("k"+converter.get(x)+(y+1)+converter.get(x)+y);}
                    else {BotAvailableMoves.add("k"+converter.get(x)+(y+1)+"x"+converter.get(x)+y);}
                }
            }
            else {
                if(this.color==Color.WHITE)
                {
                    if(board[x][y-1]==0){BotAvailableMoves.add("k"+converter.get(x)+(y+1)+converter.get(x)+y);}
                    else {BotAvailableMoves.add("k"+converter.get(x)+(y+1)+"x"+converter.get(x)+y);}
                }
                else {
                    if(board[x][y-1]==0){PlayerAvailableMoves.add("k"+converter.get(x)+(y+1)+converter.get(x)+y);}
                    else {PlayerAvailableMoves.add("k"+converter.get(x)+(y+1)+"x"+converter.get(x)+y);}
                }
            }
        }
    }

    private void checkBottomRight() {
        if(board[x+1][y-1]!=board[x][y])
        {
            if(whiteColor)
            {
                if(this.color==Color.WHITE)
                {
                    if(board[x+1][y-1]==0){PlayerAvailableMoves.add("k"+converter.get(x)+(y+1)+converter.get(x+1)+y);}
                    else {PlayerAvailableMoves.add("k"+converter.get(x)+(y+1)+"x"+converter.get(x+1)+y);}
                }
                else {
                    if(board[x+1][y-1]==0){BotAvailableMoves.add("k"+converter.get(x)+(y+1)+converter.get(x+1)+y);}
                    else {BotAvailableMoves.add("k"+converter.get(x)+(y+1)+"x"+converter.get(x+1)+y);}
                }
            }
            else {
                if(this.color==Color.WHITE)
                {
                    if(board[x+1][y-1]==0){BotAvailableMoves.add("k"+converter.get(x)+(y+1)+converter.get(x+1)+y);}
                    else {BotAvailableMoves.add("k"+converter.get(x)+(y+1)+"x"+converter.get(x)+y);}
                }
                else {
                    if(board[x+1][y-1]==0){PlayerAvailableMoves.add("k"+converter.get(x)+(y+1)+converter.get(x+1)+y);}
                    else {PlayerAvailableMoves.add("k"+converter.get(x)+(y+1)+"x"+converter.get(x+1)+y);}
                }
            }
        }
    }

    private void checkRight() {
        if(board[x+1][y]!=board[x][y])
        {
            if(whiteColor)
            {
                if(this.color==Color.WHITE)
                {
                    if(board[x+1][y]==0){PlayerAvailableMoves.add("k"+converter.get(x)+(y+1)+converter.get(x+1)+(y+1));}
                    else {PlayerAvailableMoves.add("k"+converter.get(x)+(y+1)+"x"+converter.get(x+1)+y);}
                }
                else {
                    if(board[x+1][y]==0){BotAvailableMoves.add("k"+converter.get(x)+(y+1)+converter.get(x+1)+(y+1));}
                    else {BotAvailableMoves.add("k"+converter.get(x)+(y+1)+"x"+converter.get(x+1)+(y+1));}
                }
            }
            else {
                if(this.color==Color.WHITE)
                {
                    if(board[x+1][y]==0){BotAvailableMoves.add("k"+converter.get(x)+(y+1)+converter.get(x+1)+(y+1));}
                    else {BotAvailableMoves.add("k"+converter.get(x)+(y+1)+"x"+converter.get(x+1)+(y+1));}
                }
                else {
                    if(board[x+1][y]==0){PlayerAvailableMoves.add("k"+converter.get(x)+(y+1)+converter.get(x+1)+(y+1));}
                    else {PlayerAvailableMoves.add("k"+converter.get(x)+(y+1)+"x"+converter.get(x+1)+(y+1));}
                }
            }
        }
    }

    private void checkTopRight() {
        if(x!=7)
        {
            if(board[x+1][y+1]!=board[x][y])
            {
                if(whiteColor)
                {
                    if(this.color==Color.WHITE)
                    {
                        if(board[x+1][y+1]==0){PlayerAvailableMoves.add("k"+converter.get(x)+(y+1)+converter.get(x+1)+(y+2));}
                        else {PlayerAvailableMoves.add("k"+converter.get(x)+(y+1)+"x"+converter.get(x-1)+(y+2));}
                    }
                    else {
                        if(board[x+1][y+1]==0){BotAvailableMoves.add("k"+converter.get(x)+(y+1)+converter.get(x-1)+(y+2));}
                        else {BotAvailableMoves.add("k"+converter.get(x)+(y+1)+"x"+converter.get(x-1)+(y+2));}
                    }
                }
                else {
                    if(this.color==Color.WHITE)
                    {
                        if(board[x+1][y+1]==0){BotAvailableMoves.add("k"+converter.get(x)+(y+1)+converter.get(x-1)+(y+2));}
                        else {BotAvailableMoves.add("k"+converter.get(x)+(y+1)+"x"+converter.get(x-1)+(y+2));}
                    }
                    else {
                        if(board[x+1][y+1]==0){PlayerAvailableMoves.add("k"+converter.get(x)+(y+1)+converter.get(x-1)+(y+2));}
                        else {PlayerAvailableMoves.add("k"+converter.get(x)+(y+1)+"x"+converter.get(x-1)+(y+2));}
                    }
                }
            }
        }
    }

    private void checkTop() {
        if(board[x][y+1]!=board[x][y])
        {
            if(whiteColor)
            {
                if(this.color==Color.WHITE)
                {
                    if(board[x][y+1]==0){PlayerAvailableMoves.add("k"+converter.get(x)+(y+1)+converter.get(x)+(y+2));}
                    else {PlayerAvailableMoves.add("k"+converter.get(x)+(y+1)+"x"+converter.get(x)+(y+2));}
                }
                else {
                    if(board[x][y+1]==0){BotAvailableMoves.add("k"+converter.get(x)+(y+1)+converter.get(x)+(y+2));}
                    else {BotAvailableMoves.add("k"+converter.get(x)+(y+1)+"x"+converter.get(x)+(y+2));}
                }
            }
            else {
                if(this.color==Color.WHITE)
                {
                    if(board[x][y+1]==0){BotAvailableMoves.add("k"+converter.get(x)+(y+1)+converter.get(x)+(y+2));}
                    else {BotAvailableMoves.add("k"+converter.get(x)+(y+1)+"x"+converter.get(x)+(y+1));}
                }
                else {
                    if(board[x][y+1]==0){PlayerAvailableMoves.add("k"+converter.get(x)+(y+1)+converter.get(x)+(y+2));}
                    else {PlayerAvailableMoves.add("k"+converter.get(x)+(y+1)+"x"+converter.get(x)+(y+2));}
                }
            }
        }
    }

    private void checkTopLeft() {

        if(x!=0)
        {

            if(board[x-1][y+1]!=board[this.x][this.y])
            {

                if(whiteColor)
                {

                    if(this.color==Color.WHITE)
                    {

                        if(board[x-1][y+1]==0){PlayerAvailableMoves.add("k"+converter.get(x)+(y+1)+converter.get(x-1)+(y+2));}
                        else {PlayerAvailableMoves.add("k"+converter.get(x)+(y+1)+"x"+converter.get(x-1)+(y+2));}
                    }
                    else {
                        if(board[x-1][y+1]==0){BotAvailableMoves.add("k"+converter.get(x)+(y+1)+converter.get(x-1)+(y+2));}
                        else {BotAvailableMoves.add("k"+converter.get(x)+(y+1)+"x"+converter.get(x-1)+(y+2));}
                    }
                }
                else {
                    if(this.color==Color.WHITE)
                    {
                        if(board[x-1][y+1]==0){BotAvailableMoves.add("k"+converter.get(x)+(y+1)+converter.get(x-1)+(y+2));}
                        else {BotAvailableMoves.add("k"+converter.get(x)+(y+1)+"x"+converter.get(x-1)+(y+2));}
                    }
                    else {
                        if(board[x-1][y+1]==0){PlayerAvailableMoves.add("k"+converter.get(x)+(y+1)+converter.get(x-1)+(y+2));}
                        else {PlayerAvailableMoves.add("k"+converter.get(x)+(y+1)+"x"+converter.get(x-1)+(y+2));}
                    }
                }
            }
        }
    }

}
