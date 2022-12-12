
import java.util.ArrayList;
import java.util.HashMap;

public class Game {
    public static boolean whiteColor;
    public static ArrayList<String> PlayerAvailableMoves = new ArrayList<>();
    public static ArrayList<String> BotAvailableMoves = new ArrayList<>();
    public ArrayList<Piece> PlayerPieces=new ArrayList<>();
    public ArrayList<Piece> BotPieces=new ArrayList<>();
    public static HashMap<Integer,String> converter=new HashMap<>();
    public static int[][] board=new int[8][8];
    Game(boolean whiteColor)
    {
        this.whiteColor=whiteColor;
        converter.put(0,"a");
        converter.put(1,"b");
        converter.put(2,"c");
        converter.put(3,"d");
        converter.put(4,"e");
        converter.put(5,"f");
        converter.put(6,"g");
        converter.put(7,"h");
    }
    Game() {}
    void gameStart()
    {
        boolean gameDidntEnd= true;
        boolean unavailableMove=true;
        initiateGame();
        for(int i=7;i>=0;i--)
        {
            for(int j=0;j<=7;j++)
            {
                System.out.print(board[j][i] +" ");
            }
            System.out.println();
        }
        while(gameDidntEnd)
        {
            if(whiteColor)
            {
                PlayerAvailableMoves.clear();
                this.computePlayerAvailableMoves();
                System.out.println(PlayerAvailableMoves);
                BotAvailableMoves.clear();
                this.computeBotAvailableMoves();
                System.out.println(BotAvailableMoves);
            }
            else {
                BotAvailableMoves.clear();
                this.computeBotAvailableMoves();
                System.out.println(BotAvailableMoves);
                PlayerAvailableMoves.clear();
                this.computePlayerAvailableMoves();
                System.out.println(PlayerAvailableMoves);
            }
            gameDidntEnd=false;
        }

    }

    private void computeBotAvailableMoves() {
        for(Piece piece :BotPieces)
        {
            piece.computePossibleMoves();
        }
    }

    public void computePlayerAvailableMoves()
    {
        for(Piece piece :PlayerPieces)
        {
            piece.computePossibleMoves();
        }
    }
    void initiateGame()
    {
        if(whiteColor)
        {
            /*Pawn wp1=new Pawn(Color.WHITE,0,1);board[0][1]=1;PlayerPieces.add(wp1);
            Pawn wp2=new Pawn(Color.WHITE,1,1);board[1][1]=1;PlayerPieces.add(wp2);
            Pawn wp3=new Pawn(Color.WHITE,2,1);board[2][1]=1;PlayerPieces.add(wp3);
            Pawn wp4=new Pawn(Color.WHITE,3,1);board[3][1]=1;PlayerPieces.add(wp4);
            Pawn wp5=new Pawn(Color.WHITE,4,1);board[4][1]=1;PlayerPieces.add(wp5);
            Pawn wp6=new Pawn(Color.WHITE,5,1);board[5][1]=1;PlayerPieces.add(wp6);
            Pawn wp7=new Pawn(Color.WHITE,6,1);board[6][1]=1;PlayerPieces.add(wp7);
            Pawn wp8=new Pawn(Color.WHITE,7,1);board[7][1]=1;PlayerPieces.add(wp8);*/
            Rook wr1=new Rook(Color.WHITE,0,0);board[0][0]=1;PlayerPieces.add(wr1);
            Rook wr2=new Rook(Color.WHITE,7,0);board[7][0]=1;PlayerPieces.add(wr2);
            //Knight wn1=new Knight(Color.WHITE,1,0);board[1][0]=1;PlayerPieces.add(wn1);
            //Knight wn2=new Knight(Color.WHITE,6,0);board[6][0]=1;PlayerPieces.add(wn2);
            Bishop wb1=new Bishop(Color.WHITE,2,0);board[2][0]=1;PlayerPieces.add(wb1);
            Bishop wb2=new Bishop(Color.WHITE,5,0);board[5][0]=1;PlayerPieces.add(wb2);
            //Queen wq=new Queen(Color.WHITE,3,0);board[3][0]=1;PlayerPieces.add(wq);
            //King wk=new King(Color.WHITE,4,0);board[4][0]=1;PlayerPieces.add(wk);

            Pawn bp1=new Pawn(Color.BLACK,0,6);board[0][6]=2;BotPieces.add(bp1);
            Pawn bp2=new Pawn(Color.BLACK,1,6);board[1][6]=2;BotPieces.add(bp2);
            Pawn bp3=new Pawn(Color.BLACK,2,6);board[2][6]=2;BotPieces.add(bp3);
            Pawn bp4=new Pawn(Color.BLACK,3,6);board[3][6]=2;BotPieces.add(bp4);
            Pawn bp5=new Pawn(Color.BLACK,4,6);board[4][6]=2;BotPieces.add(bp5);
            Pawn bp6=new Pawn(Color.BLACK,5,6);board[5][6]=2;BotPieces.add(bp6);
            Pawn bp7=new Pawn(Color.BLACK,6,6);board[6][6]=2;BotPieces.add(bp7);
            Pawn bp8=new Pawn(Color.BLACK,7,6);board[7][6]=2;BotPieces.add(bp8);
            Rook br1=new Rook(Color.BLACK,0,7);board[0][7]=2;BotPieces.add(br1);
            Rook br2=new Rook(Color.BLACK,7,7);board[7][7]=2;BotPieces.add(br2);
            Knight bn1=new Knight(Color.BLACK,1,7);board[1][7]=2;BotPieces.add(bn1);
            Knight bn2=new Knight(Color.BLACK,6,7);board[6][7]=2;BotPieces.add(bn2);
            Bishop bb1=new Bishop(Color.BLACK,2,7);board[2][7]=2;BotPieces.add(bb1);
            Bishop bb2=new Bishop(Color.BLACK,5,7);board[5][7]=2;BotPieces.add(bb2);
            Queen bq=new Queen(Color.BLACK,3,7);board[3][7]=2;BotPieces.add(bq);
            King bk=new King(Color.BLACK,4,7);board[4][7]=2;BotPieces.add(bk);
        }
        else
        {
            Pawn wp1=new Pawn(Color.WHITE,0,6);board[0][6]=1;BotPieces.add(wp1);
            Pawn wp2=new Pawn(Color.WHITE,1,6);board[1][6]=1;BotPieces.add(wp2);
            Pawn wp3=new Pawn(Color.WHITE,2,6);board[2][6]=1;BotPieces.add(wp3);
            Pawn wp4=new Pawn(Color.WHITE,3,6);board[3][6]=1;BotPieces.add(wp4);
            Pawn wp5=new Pawn(Color.WHITE,4,6);board[4][6]=1;BotPieces.add(wp5);
            Pawn wp6=new Pawn(Color.WHITE,5,6);board[5][6]=1;BotPieces.add(wp6);
            Pawn wp7=new Pawn(Color.WHITE,6,6);board[6][6]=1;BotPieces.add(wp7);
            Pawn wp8=new Pawn(Color.WHITE,7,6);board[7][6]=1;BotPieces.add(wp8);
            Rook wr1=new Rook(Color.WHITE,0,7);board[0][7]=1;BotPieces.add(wr1);
            Rook wr2=new Rook(Color.WHITE,7,7);board[7][7]=1;BotPieces.add(wr2);
            Knight wn1=new Knight(Color.WHITE,1,7);board[1][7]=1;BotPieces.add(wn1);
            Knight wn2=new Knight(Color.WHITE,6,7);board[6][7]=1;BotPieces.add(wn2);
            Bishop wb1=new Bishop(Color.WHITE,2,7);board[2][7]=1;BotPieces.add(wb1);
            Bishop wb2=new Bishop(Color.WHITE,5,7);board[5][7]=1;BotPieces.add(wb2);
            Queen wq=new Queen(Color.WHITE,3,7);board[3][7]=1;BotPieces.add(wq);
            King wk=new King(Color.WHITE,4,7);board[4][7]=1;BotPieces.add(wk);

            Pawn bp1=new Pawn(Color.BLACK,0,1);board[0][1]=2;PlayerPieces.add(bp1);
            Pawn bp2=new Pawn(Color.BLACK,1,1);board[1][1]=2;PlayerPieces.add(bp2);
            Pawn bp3=new Pawn(Color.BLACK,2,1);board[2][1]=2;PlayerPieces.add(bp3);
            Pawn bp4=new Pawn(Color.BLACK,3,1);board[3][1]=2;PlayerPieces.add(bp4);
            Pawn bp5=new Pawn(Color.BLACK,4,1);board[4][1]=2;PlayerPieces.add(bp5);
            Pawn bp6=new Pawn(Color.BLACK,5,1);board[5][1]=2;PlayerPieces.add(bp6);
            Pawn bp7=new Pawn(Color.BLACK,6,1);board[6][1]=2;PlayerPieces.add(bp7);
            Pawn bp8=new Pawn(Color.BLACK,7,1);board[7][1]=2;PlayerPieces.add(bp8);
            Rook br1=new Rook(Color.BLACK,0,0);board[0][0]=2;PlayerPieces.add(br1);
            Rook br2=new Rook(Color.BLACK,7,0);board[7][0]=2;PlayerPieces.add(br2);
            Knight bn1=new Knight(Color.BLACK,1,0);board[1][0]=2;PlayerPieces.add(bn1);
            Knight bn2=new Knight(Color.BLACK,6,0);board[6][0]=2;PlayerPieces.add(bn2);
            Bishop bb1=new Bishop(Color.BLACK,2,0);board[2][0]=2;PlayerPieces.add(bb1);
            Bishop bb2=new Bishop(Color.BLACK,5,0);board[5][0]=2;PlayerPieces.add(bb2);
            Queen bq=new Queen(Color.BLACK,3,0);board[3][0]=2;PlayerPieces.add(bq);
            King bk=new King(Color.BLACK,4,0);board[4][0]=2;PlayerPieces.add(bk);
        }
    }
}
