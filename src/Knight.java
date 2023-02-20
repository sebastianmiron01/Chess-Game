public class Knight extends Game implements Piece {
    public Color color;
    public int x,y;
    Knight(Color color,int x, int y)
    {
        this.color=color;
        this.y = y;
        this.x=x;
    }
    public void computePossibleMoves()
    {
        if(y>1) {Bottom();}
        if(y<6){Top();}
        if(x>1){Left();}
        if(x<6){Right();}
    }
    public void move(int x,int y)
    {

        if(board[this.x][this.y]==1)
            board[x][y]=1;
        else {
            board[x][y]=2;
        }
        board[this.x][this.y]=0;
        this.x=x;
        this.y=y;
    }

    private void Right() {
        if(y>0) {
            if(board[x+2][y-1]!=board[x][y]) {
                if(whiteColor) {
                    if(this.color==Color.WHITE) {
                        if(board[x+2][y-1]==0){PlayerAvailableMoves.add("n"+converter.get(x)+(y+1)+converter.get(x+2)+(y));}
                        else{PlayerAvailableMoves.add("n"+converter.get(x)+(y+1)+"x"+converter.get(x+2)+(y));}
                    }
                    else {
                        if(board[x+2][y-1]==0){BotAvailableMoves.add("n"+converter.get(x)+(y+1)+converter.get(x+2)+(y));}
                        else{BotAvailableMoves.add("n"+converter.get(x)+(y+1)+"x"+converter.get(x+2)+(y));}
                    }
                }
                else {
                    if(this.color==Color.WHITE) {
                        if(board[x+2][y-1]==0){BotAvailableMoves.add("n"+converter.get(x)+(y+1)+converter.get(x+2)+(y));}
                        else{BotAvailableMoves.add("n"+converter.get(x)+(y+1)+"x"+converter.get(x+2)+(y));}
                    }
                    else {
                        if(board[x+2][y-1]==0){PlayerAvailableMoves.add("n"+converter.get(x)+(y+1)+converter.get(x+2)+(y));}
                        else{PlayerAvailableMoves.add("n"+converter.get(x)+(y+1)+"x"+converter.get(x+2)+(y));}
                    }
                }

            }
        }
        if(y<7) {
            if(board[x+2][y+1]!=board[x][y]) {
                if(whiteColor) {
                    if(this.color==Color.WHITE) {
                        if(board[x+2][y+1]==0){PlayerAvailableMoves.add("n"+converter.get(x)+(y+1)+converter.get(x+2)+(y+2));}
                        else{PlayerAvailableMoves.add("n"+converter.get(x)+(y+1)+"x"+converter.get(x+2)+(y+2));}
                    }
                    else {
                        if(board[x+2][y+1]==0){BotAvailableMoves.add("n"+converter.get(x)+(y+1)+converter.get(x+2)+(y+2));}
                        else{BotAvailableMoves.add("n"+converter.get(x)+(y+1)+"x"+converter.get(x+2)+(y+2));}
                    }
                }
                else {
                    if(this.color==Color.WHITE) {
                        if(board[x+2][y+1]==0){BotAvailableMoves.add("n"+converter.get(x)+(y+1)+converter.get(x+2)+(y+2));}
                        else{BotAvailableMoves.add("n"+converter.get(x)+(y+1)+"x"+converter.get(x+2)+(y+2));}
                    }
                    else {
                        if(board[x+2][y+1]==0){PlayerAvailableMoves.add("n"+converter.get(x)+(y+1)+converter.get(x+2)+(y+2));}
                        else{PlayerAvailableMoves.add("n"+converter.get(x)+(y+1)+"x"+converter.get(x+2)+(y+2));}
                    }
                }

            }
        }
    }

    private void Left() {
        if(y>0) {
            if(board[x-2][y-1]!=board[x][y]) {
                if(whiteColor) {
                    if(this.color==Color.WHITE) {
                        if(board[x-2][y-1]==0){PlayerAvailableMoves.add("n"+converter.get(x)+(y+1)+converter.get(x-2)+(y));}
                        else{PlayerAvailableMoves.add("n"+converter.get(x)+(y+1)+"x"+converter.get(x-2)+(y));}
                    }
                    else {
                        if(board[x-2][y-1]==0){BotAvailableMoves.add("n"+converter.get(x)+(y+1)+converter.get(x-2)+(y));}
                        else{BotAvailableMoves.add("n"+converter.get(x)+(y+1)+"x"+converter.get(x-2)+(y));}
                    }
                }
                else {
                    if(this.color==Color.WHITE) {
                        if(board[x-2][y-1]==0){BotAvailableMoves.add("n"+converter.get(x)+(y+1)+converter.get(x-2)+(y));}
                        else{BotAvailableMoves.add("n"+converter.get(x)+(y+1)+"x"+converter.get(x-2)+(y));}
                    }
                    else {
                        if(board[x-2][y-1]==0){PlayerAvailableMoves.add("n"+converter.get(x)+(y+1)+converter.get(x-2)+(y));}
                        else{PlayerAvailableMoves.add("n"+converter.get(x)+(y+1)+"x"+converter.get(x-2)+(y));}
                    }
                }

            }
        }
        if(y<7) {
            if(board[x-2][y+1]!=board[x][y]) {
                if(whiteColor) {
                    if(this.color==Color.WHITE) {
                        if(board[x-2][y+1]==0){PlayerAvailableMoves.add("n"+converter.get(x)+(y+1)+converter.get(x-2)+(y+2));}
                        else{PlayerAvailableMoves.add("n"+converter.get(x)+(y+1)+"x"+converter.get(x-2)+(y+2));}
                    }
                    else {
                        if(board[x-2][y+1]==0){BotAvailableMoves.add("n"+converter.get(x)+(y+1)+converter.get(x-2)+(y+2));}
                        else{BotAvailableMoves.add("n"+converter.get(x)+(y+1)+"x"+converter.get(x-2)+(y+2));}
                    }
                }
                else {
                    if(this.color==Color.WHITE) {
                        if(board[x-2][y+1]==0){BotAvailableMoves.add("n"+converter.get(x)+(y+1)+converter.get(x-2)+(y+2));}
                        else{BotAvailableMoves.add("n"+converter.get(x)+(y+1)+"x"+converter.get(x-2)+(y+2));}
                    }
                    else {
                        if(board[x-2][y+1]==0){PlayerAvailableMoves.add("n"+converter.get(x)+(y+1)+converter.get(x-2)+(y+2));}
                        else{PlayerAvailableMoves.add("n"+converter.get(x)+(y+1)+"x"+converter.get(x-2)+(y+2));}
                    }
                }

            }
        }
    }

    private void Top() {
        if(x>0) {
            if(board[x-1][y+2]!=board[x][y]) {
                if(whiteColor) {
                    if(this.color==Color.WHITE) {
                        if(board[x-1][y+2]==0){PlayerAvailableMoves.add("n"+converter.get(x)+(y+1)+converter.get(x-1)+(y+3));}
                        else{PlayerAvailableMoves.add("n"+converter.get(x)+(y+1)+"x"+converter.get(x-1)+(y+3));}
                    }
                    else {
                        if(board[x-1][y+2]==0){BotAvailableMoves.add("n"+converter.get(x)+(y+1)+converter.get(x-1)+(y+3));}
                        else{BotAvailableMoves.add("n"+converter.get(x)+(y+1)+"x"+converter.get(x-1)+(y+3));}
                    }
                }
                else {
                    if(this.color==Color.WHITE) {
                        if(board[x-1][y+2]==0){BotAvailableMoves.add("n"+converter.get(x)+(y+1)+converter.get(x-1)+(y+3));}
                        else{BotAvailableMoves.add("n"+converter.get(x)+(y+1)+"x"+converter.get(x-1)+(y+3));}
                    }
                    else {
                        if(board[x-1][y+2]==0){PlayerAvailableMoves.add("n"+converter.get(x)+(y+1)+converter.get(x-1)+(y+3));}
                        else{PlayerAvailableMoves.add("n"+converter.get(x)+(y+1)+"x"+converter.get(x-1)+(y+3));}
                    }
                }

            }
        }
        if(x<7) {
            if(board[x+1][y+2]!=board[x][y]) {
                if(whiteColor) {
                    if(this.color==Color.WHITE) {
                        if(board[x+1][y+2]==0){PlayerAvailableMoves.add("n"+converter.get(x)+(y+1)+converter.get(x+1)+(y+3));}
                        else{PlayerAvailableMoves.add("n"+converter.get(x)+(y+1)+"x"+converter.get(x+1)+(y+3));}
                    }
                    else {
                        if(board[x+1][y+2]==0){BotAvailableMoves.add("n"+converter.get(x)+(y+1)+converter.get(x+1)+(y+3));}
                        else{BotAvailableMoves.add("n"+converter.get(x)+(y+1)+"x"+converter.get(x+1)+(y+3));}
                    }
                }
                else {
                    if(this.color==Color.WHITE) {
                        if(board[x+1][y+2]==0){BotAvailableMoves.add("n"+converter.get(x)+(y+1)+converter.get(x+1)+(y+3));}
                        else{BotAvailableMoves.add("n"+converter.get(x)+(y+1)+"x"+converter.get(x+1)+(y+3));}
                    }
                    else {
                        if(board[x+1][y+2]==0){PlayerAvailableMoves.add("n"+converter.get(x)+(y+1)+converter.get(x+1)+(y+3));}
                        else{PlayerAvailableMoves.add("n"+converter.get(x)+(y+1)+"x"+converter.get(x+1)+(y+3));}
                    }
                }

            }
        }
    }

    private void Bottom() {
        if(x>0) {
            if(board[x-1][y-2]!=board[x][y]) {
                if(whiteColor) {
                    if(this.color==Color.WHITE) {
                        if(board[x-1][y-2]==0){PlayerAvailableMoves.add("n"+converter.get(x)+(y+1)+converter.get(x-1)+(y-1));}
                        else{PlayerAvailableMoves.add("n"+converter.get(x)+(y+1)+"x"+converter.get(x-1)+(y-1));}
                    }
                    else {
                        if(board[x-1][y-2]==0){BotAvailableMoves.add("n"+converter.get(x)+(y+1)+converter.get(x-1)+(y-1));}
                        else{BotAvailableMoves.add("n"+converter.get(x)+(y+1)+"x"+converter.get(x-1)+(y-1));}
                    }
                }
                else {
                    if(this.color==Color.WHITE) {
                        if(board[x-1][y-2]==0){BotAvailableMoves.add("n"+converter.get(x)+(y+1)+converter.get(x-1)+(y-1));}
                        else{BotAvailableMoves.add("n"+converter.get(x)+(y+1)+"x"+converter.get(x-1)+(y-1));}
                    }
                    else {
                        if(board[x-1][y+2]==0){PlayerAvailableMoves.add("n"+converter.get(x)+(y+1)+converter.get(x-1)+(y-1));}
                        else{PlayerAvailableMoves.add("n"+converter.get(x)+(y+1)+"x"+converter.get(x-1)+(y-1));}
                    }
                }

            }
        }
        if(x<7) {
            if(board[x+1][y-2]!=board[x][y]) {
                if(whiteColor) {
                    if(this.color==Color.WHITE) {
                        if(board[x+1][y-2]==0){PlayerAvailableMoves.add("n"+converter.get(x)+(y+1)+converter.get(x+1)+(y-1));}
                        else{PlayerAvailableMoves.add("n"+converter.get(x)+(y+1)+"x"+converter.get(x+1)+(y-1));}
                    }
                    else {
                        if(board[x+1][y-2]==0){BotAvailableMoves.add("n"+converter.get(x)+(y+1)+converter.get(x+1)+(y-1));}
                        else{BotAvailableMoves.add("n"+converter.get(x)+(y+1)+"x"+converter.get(x+1)+(y-1));}
                    }
                }
                else {
                    if(this.color==Color.WHITE) {
                        if(board[x+1][y-2]==0){BotAvailableMoves.add("n"+converter.get(x)+(y+1)+converter.get(x+1)+(y-1));}
                        else{BotAvailableMoves.add("n"+converter.get(x)+(y+1)+"x"+converter.get(x+1)+(y-1));}
                    }
                    else {
                        if(board[x+1][y-2]==0){PlayerAvailableMoves.add("n"+converter.get(x)+(y+1)+converter.get(x+1)+(y-1));}
                        else{PlayerAvailableMoves.add("n"+converter.get(x)+(y+1)+"x"+converter.get(x+1)+(y-1));}
                    }
                }

            }
        }
    }
}
