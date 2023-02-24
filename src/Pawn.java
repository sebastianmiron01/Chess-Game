

public class Pawn extends Game implements Piece {
    public Color color;
    public Integer x, y;


    Pawn(Color color, int x, int y) {
        this.color = color;
        this.y = y;
        this.x = x;
    }

    public void computePossibleMoves() {
        computePlayerPawns();
        computeBotPawns();
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

    private void computeBotPawns() {
        if (whiteColor) {
            if (this.color == Color.BLACK) {
                if (board[x][y - 1] == 0) {
                    if (y == 1) {
                        BotAvailableMoves.add("p"+converter.get(x) +(y+1)+converter.get(x)+ y + "Q");
                    } else {
                        BotAvailableMoves.add("p"+converter.get(x) +(y+1)+converter.get(x)+ y);
                    }
                }
            }
            if (y == 6) {
                if (board[x][y - 2] == 0 && board[x][y - 1] == 0) {
                    BotAvailableMoves.add("p"+converter.get(x) +(y+1)+converter.get(x)+ (y - 1));
                }
            }
            if (x > 0) {
                if (board[x - 1][y - 1] == 1) {
                    BotAvailableMoves.add("p"+converter.get(x) +(y+1) + "x" + converter.get(x - 1) + y);
                }
            }
            if (x < 7) {
                if (board[x + 1][y - 1] == 1) {
                    BotAvailableMoves.add("p"+converter.get(x) +(y+1) + "x" + converter.get(x + 1) + y);
                }
            }
        } else {
            if (this.color == Color.WHITE) {
                if (board[x][y - 1] == 0) {
                    if (y == 1) {
                        BotAvailableMoves.add("p"+converter.get(x) +(y+1)+converter.get(x)+ y + "Q");
                    } else {
                        BotAvailableMoves.add("p"+converter.get(x) +(y+1)+converter.get(x)+ y);
                    }
                }
                if (y == 6) {
                    if (board[x][y - 2] == 0 && board[x][y - 1] == 0) {
                        BotAvailableMoves.add("p"+converter.get(x) +(y+1)+converter.get(x)+ (y - 1));
                    }
                }
                if (x > 0) {
                    if (board[x - 1][y - 1] == 2) {
                        BotAvailableMoves.add("p"+converter.get(x) +(y+1) + "x" + converter.get(x - 1) + y);
                    }
                }
                if (x < 7) {
                    if (board[x + 1][y - 1] == 2) {
                        BotAvailableMoves.add("p"+converter.get(x) +(y+1) + "x" + converter.get(x + 1) + y);
                    }
                }
            }
        }
    }

    private void computePlayerPawns() {
        if(whiteColor) {
            if (this.color == Color.WHITE) {
                if (board[x][y + 1] == 0) {
                    if(y==6)
                    {
                        PlayerAvailableMoves.add("p"+converter.get(x) +(y+1)+converter.get(x)+ (y+2)+"Q");
                    }
                    else {PlayerAvailableMoves.add("p"+converter.get(x) +(y+1)+converter.get(x)+ (y+2));}
                }
                if (y == 1) {
                    if (board[x][y+2] == 0 && board[x][y +1] == 0) {
                        PlayerAvailableMoves.add("p"+converter.get(x) +(y+1)+converter.get(x)+ (y +3));
                    }
                }
                if (x > 0) {
                    if (board[x-1][y+1]==2) {
                        PlayerAvailableMoves.add("p"+converter.get(x) +(y+1)+"x"+converter.get(x-1)+(y+2));
                    }
                }
                if(x<7)
                {
                    if(board[x+1][y+1]==2)
                    {
                        PlayerAvailableMoves.add("p"+converter.get(x) +(y+1)+"x"+converter.get(x+1)+(y+2));
                    }
                }
            }
        }
        else {
            if (this.color == Color.BLACK) {
                if (board[x][y + 1] == 0) {
                    if(y==6)
                    {
                        PlayerAvailableMoves.add("p"+converter.get(x) +(y+1)+converter.get(x)+ (y+2)+"Q");
                    }
                    else {PlayerAvailableMoves.add("p"+converter.get(x) +(y+1)+converter.get(x)+ (y+2));}
                }
                if (y == 1) {
                    if (board[x][y+2] == 0 && board[x][y +1] == 0) {
                        PlayerAvailableMoves.add("p"+converter.get(x) +(y+1)+converter.get(x)+ (y +3));
                    }
                }
                if (x > 0) {
                    if (board[x-1][y+1]==1) {
                        PlayerAvailableMoves.add("p"+converter.get(x) +(y+1)+"x"+converter.get(x-1)+(y+2));
                    }
                }
                if(x<7)
                {
                    if(board[x+1][y+1]==1)
                    {
                        PlayerAvailableMoves.add("p"+converter.get(x) +(y+1)+"x"+converter.get(x+1)+(y+2));
                    }
                }
            }
        }
    }
}
