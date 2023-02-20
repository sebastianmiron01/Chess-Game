
import javax.management.QueryEval;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Random;
public class Game {
    public static boolean whiteColor;
    public static ArrayList<String> PlayerAvailableMoves = new ArrayList<>();
    public static ArrayList<String> BotAvailableMoves = new ArrayList<>();
    public static ArrayList<Piece> PlayerPieces=new ArrayList<>();
    public static ArrayList<Piece> BotPieces=new ArrayList<>();
    public static HashMap<Integer,String> converter=new HashMap<>();
    public static HashMap<Character, Integer> deconverter=new HashMap<>();
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
        deconverter.put('a',0);
        deconverter.put('b',1);
        deconverter.put('c',2);
        deconverter.put('d',3);
        deconverter.put('e',4);
        deconverter.put('f',5);
        deconverter.put('g',6);
        deconverter.put('h',7);
    }
    Game() {}
    void gameStart()
    {
        boolean gameDidntEnd= true;
        boolean unavailableMove=true;
        Scanner myObj = new Scanner(System.in);
        String playermove;
        Random rn= new Random();
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
                BotAvailableMoves.clear();
                this.computeBotAvailableMoves();
                PlayerAvailableMoves.clear();
                this.computePlayerAvailableMoves();
                System.out.println(PlayerAvailableMoves);
                playermove=myObj.nextLine();
                while(!PlayerAvailableMoves.contains(playermove))
                {
                    System.out.println("Impossible move");
                    playermove=myObj.nextLine();
                }
                System.out.println("Nice move!");
                char c=playermove.charAt(0);
                boolean b=true;
                switch(c)
                {
                    default:
                        break;
                    case 'n':
                        char c2=playermove.charAt(1);
                        int c3=playermove.charAt(2)-49;
                        for(Piece k:PlayerPieces)
                        {
                            if(k instanceof Knight)
                            {
                                if(deconverter.get(c2)==((Knight) k).x && c3==((Knight) k).y)
                                {
                                    char c4=playermove.charAt(3);
                                    if(c4=='x')
                                    {
                                         
                                        char c5=playermove.charAt(4);
                                        int c6 =playermove.charAt(5)-49;
                                        k.move(deconverter.get(c5),c6);elimPiece(deconverter.get(c5),c6,b);


                                    }
                                    else {
                                         
                                        int c5 =playermove.charAt(4)-49;
                                        k.move(deconverter.get(c4),c5);
                                    }

                                }
                            }
                        }
                    case 'p':
                        c2=playermove.charAt(1);
                        c3=playermove.charAt(2)-49;
                        for(Piece k:PlayerPieces)
                        {
                            if(k instanceof Pawn)
                            {
                                if(deconverter.get(c2)==((Pawn) k).x && c3==((Pawn) k).y)
                                {
                                    char c4=playermove.charAt(3);

                                    if(c4=='x')
                                    {

                                         
                                        char c5=playermove.charAt(4);
                                        int c6 =playermove.charAt(5)-49;
                                        k.move(deconverter.get(c5),c6); elimPiece(deconverter.get(c5),c6,b);

                                    }
                                    else {
                                         
                                        int c5 =playermove.charAt(4)-49;
                                        k.move(deconverter.get(c4),c5);
                                    }

                                }
                            }
                        }
                    case 'b':
                        c2=playermove.charAt(1);
                        c3=playermove.charAt(2)-49;
                        for(Piece k:PlayerPieces)
                        {
                            if(k instanceof Bishop)
                            {
                                if(deconverter.get(c2)==((Bishop) k).x && c3==((Bishop) k).y)
                                {
                                    char c4=playermove.charAt(3);

                                    if(c4=='x')
                                    {

                                         
                                        char c5=playermove.charAt(4);
                                        int c6 =playermove.charAt(5)-49;
                                        k.move(deconverter.get(c5),c6); elimPiece(deconverter.get(c5),c6,b);

                                    }
                                    else {
                                         
                                        int c5 =playermove.charAt(4)-49;
                                        k.move(deconverter.get(c4),c5);
                                    }

                                }
                            }
                        }
                    case 'r':
                        c2=playermove.charAt(1);
                        c3=playermove.charAt(2)-49;
                        for(Piece k:PlayerPieces)
                        {
                            if(k instanceof Rook)
                            {
                                if(deconverter.get(c2)==((Rook) k).x && c3==((Rook) k).y)
                                {
                                    char c4=playermove.charAt(3);


                                    if(c4=='x')
                                    {

                                         
                                        char c5=playermove.charAt(4);
                                        int c6 =playermove.charAt(5)-49;
                                        k.move(deconverter.get(c5),c6); elimPiece(deconverter.get(c5),c6,b);

                                    }
                                    else {
                                         
                                        int c5 =playermove.charAt(4)-49;
                                        k.move(deconverter.get(c4),c5);
                                    }

                                }
                            }
                        }
                    case 'q':
                        c2=playermove.charAt(1);
                        c3=playermove.charAt(2)-49;
                        for(Piece k:PlayerPieces)
                        {
                            if(k instanceof Queen)
                            {
                                if(deconverter.get(c2)==((Queen) k).x && c3==((Queen) k).y)
                                {
                                    char c4=playermove.charAt(3);
                                    if(c4=='x')
                                    {

                                         
                                        char c5=playermove.charAt(4);
                                        int c6 =playermove.charAt(5)-49;
                                        k.move(deconverter.get(c5),c6); elimPiece(deconverter.get(c5),c6,b);

                                    }
                                    else {
                                         
                                        int c5 =playermove.charAt(4)-49;
                                        k.move(deconverter.get(c4),c5);
                                    }

                                }
                            }
                        }
                    case 'k':
                        c2=playermove.charAt(1);
                        c3=playermove.charAt(2)-49;
                        for(Piece k:PlayerPieces)
                        {
                            if(k instanceof King)
                            {
                                if(deconverter.get(c2)==((King) k).x && c3==((King) k).y)
                                {
                                    char c4=playermove.charAt(3);
                                    if(c4=='x')
                                    {

                                         
                                        char c5=playermove.charAt(4);
                                        int c6 =playermove.charAt(5)-49;
                                        k.move(deconverter.get(c5),c6); elimPiece(deconverter.get(c5),c6,b);

                                    }
                                    else {
                                         
                                        int c5 =playermove.charAt(4)-49;
                                        k.move(deconverter.get(c4),c5);
                                    }

                                }
                            }
                        }
                }

                BotAvailableMoves.clear();
                this.computeBotAvailableMoves();
                String botMove=BotAvailableMoves.get(rn.nextInt(BotAvailableMoves.size()));
                System.out.println(botMove);
                c=botMove.charAt(0);
                b=false;
                switch(c)
                {
                    default:
                        break;
                    case 'n':
                        char c2=botMove.charAt(1);
                        int c3=botMove.charAt(2)-49;
                        for(Piece k:BotPieces)
                        {
                            if(k instanceof Knight)
                            {
                                if(deconverter.get(c2)==((Knight) k).x && c3==((Knight) k).y)
                                {
                                    char c4=botMove.charAt(3);


                                    if(c4=='x')
                                    {

                                         
                                        char c5=botMove.charAt(4);
                                        int c6 =botMove.charAt(5)-49;
                                        k.move(deconverter.get(c5),c6); elimPiece(deconverter.get(c5),c6,b);

                                    }
                                    else {
                                         
                                        int c5 =botMove.charAt(4)-49;
                                        k.move(deconverter.get(c4),c5);
                                    }

                                }
                            }
                        }
                    case 'p':
                        c2=botMove.charAt(1);
                        c3=botMove.charAt(2)-49;
                        for(Piece k:BotPieces)
                        {
                            if(k instanceof Pawn)
                            {
                                if(deconverter.get(c2)==((Pawn) k).x && c3==((Pawn) k).y)
                                {
                                    char c4=botMove.charAt(3);


                                    if(c4=='x')
                                    {

                                         
                                        char c5=botMove.charAt(4);
                                        int c6 =botMove.charAt(5)-49;
                                        k.move(deconverter.get(c5),c6); elimPiece(deconverter.get(c5),c6,b);

                                    }
                                    else {
                                         
                                        int c5 =botMove.charAt(4)-49;
                                        k.move(deconverter.get(c4),c5);
                                    }

                                }
                            }
                        }
                    case 'b':
                        c2=botMove.charAt(1);
                        c3=botMove.charAt(2)-49;
                        for(Piece k:BotPieces)
                        {
                            if(k instanceof Bishop)
                            {
                                if(deconverter.get(c2)==((Bishop) k).x && c3==((Bishop) k).y)
                                {
                                    char c4=botMove.charAt(3);


                                    if(c4=='x')
                                    {

                                         
                                        char c5=botMove.charAt(4);
                                        int c6 =botMove.charAt(5)-49;
                                        k.move(deconverter.get(c5),c6); elimPiece(deconverter.get(c5),c6,b);

                                    }
                                    else {
                                         
                                        int c5 =botMove.charAt(4)-49;
                                        k.move(deconverter.get(c4),c5);
                                    }

                                }
                            }
                        }
                    case 'r':
                        c2=botMove.charAt(1);
                        c3=botMove.charAt(2)-49;
                        for(Piece k:BotPieces)
                        {
                            if(k instanceof Rook)
                            {
                                if(deconverter.get(c2)==((Rook) k).x && c3==((Rook) k).y)
                                {
                                    char c4=botMove.charAt(3);

                                    if(c4=='x')
                                    {

                                         
                                        char c5=botMove.charAt(4);
                                        int c6 =botMove.charAt(5)-49;
                                        k.move(deconverter.get(c5),c6); elimPiece(deconverter.get(c5),c6,b);

                                    }
                                    else {
                                         
                                        int c5 =botMove.charAt(4)-49;
                                        k.move(deconverter.get(c4),c5);
                                    }

                                }
                            }
                        }
                    case 'q':
                        c2=botMove.charAt(1);
                        c3=botMove.charAt(2)-49;
                        for(Piece k:BotPieces)
                        {
                            if(k instanceof Queen)
                            {
                                if(deconverter.get(c2)==((Queen) k).x && c3==((Queen) k).y)
                                {
                                    char c4=botMove.charAt(3);
                                    if(c4=='x')
                                    {

                                         
                                        char c5=botMove.charAt(4);
                                        int c6 =botMove.charAt(5)-49;
                                        k.move(deconverter.get(c5),c6); elimPiece(deconverter.get(c5),c6,b);

                                    }
                                    else {
                                         
                                        int c5 =botMove.charAt(4)-49;
                                        k.move(deconverter.get(c4),c5);
                                    }

                                }
                            }
                        }
                    case 'k':
                        c2=botMove.charAt(1);
                        c3=botMove.charAt(2)-49;
                        for(Piece k:BotPieces)
                        {
                            if(k instanceof King)
                            {
                                if(deconverter.get(c2)==((King) k).x && c3==((King) k).y)
                                {
                                    char c4=botMove.charAt(3);


                                    if(c4=='x')
                                    {

                                         
                                        char c5=botMove.charAt(4);
                                        int c6 =botMove.charAt(5)-49;
                                        k.move(deconverter.get(c5),c6); elimPiece(deconverter.get(c5),c6,b);

                                    }
                                    else {
                                         
                                        int c5 =botMove.charAt(4)-49;
                                        k.move(deconverter.get(c4),c5);
                                    }

                                }
                            }
                        }
                }
                System.out.println(BotPieces);
                for(int i=7;i>=0;i--)
                {
                    for(int j=0;j<=7;j++)
                    {
                        System.out.print(board[j][i] +" ");
                    }
                    System.out.println();
                }
            }

            else {
                BotAvailableMoves.clear();
                this.computeBotAvailableMoves();
                System.out.println(BotAvailableMoves);
                PlayerAvailableMoves.clear();
                this.computePlayerAvailableMoves();
                System.out.println(PlayerAvailableMoves);
            }
            //gameDidntEnd=false;
        }

    }

    private void computeBotAvailableMoves() {
        for(Piece piece :BotPieces)
        {
            piece.computePossibleMoves();
        }
    }
 
    private void elimPiece(Integer x,Integer y,boolean b)
    {
        Piece eliminated = null;
            if(b)
            {
                for(Piece p:BotPieces)
                {
                    if(p instanceof Pawn)
                        if(((Pawn) p).x==x &&((Pawn) p).y==y)
                            eliminated=p;
                    if(p instanceof Queen)
                        if(((Queen) p).x==x &&((Queen) p).y==y)
                            eliminated=p;
                    if(p instanceof Bishop)
                    {
                        if(((Bishop) p).x==x &&((Bishop) p).y==y)
                        {
                            eliminated=p;
                        }
                    }
                    if(p instanceof Knight)
                    {
                        if(((Knight) p).x==x &&((Knight) p).y==y)
                        {
                            eliminated=p;
                        }
                    }
                    if(p instanceof Rook)
                    {
                        if(((Rook) p).x==x &&((Rook) p).y==y)
                        {
                            eliminated=p;
                        }
                    }
                }
                BotPieces.remove(eliminated);
            }
            else {
                for(Piece p:PlayerPieces)
                {
                    if(p instanceof Pawn)
                    {
                        if(((Pawn) p).x==x &&((Pawn) p).y==y)
                        {
                            eliminated=p;
                        }
                    }
                    if(p instanceof Queen)
                    {
                        if(((Queen) p).x==x &&((Queen) p).y==y)
                        {
                            eliminated=p;
                        }
                    }
                    if(p instanceof Bishop)
                    {
                        if(((Bishop) p).x==x &&((Bishop) p).y==y)
                        {
                            eliminated=p;
                        }
                    }
                    if(p instanceof Knight)
                    {
                        if(((Knight) p).x==x &&((Knight) p).y==y)
                        {
                            eliminated=p;
                        }
                    }
                    if(p instanceof Rook)
                    {
                        if(((Rook) p).x==x &&((Rook) p).y==y)
                        {
                            eliminated=p;
                        }
                    }
                }
                PlayerPieces.remove(eliminated);
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
            Pawn wp1=new Pawn(Color.WHITE,0,1);board[0][1]=1;PlayerPieces.add(wp1);
            Pawn wp2=new Pawn(Color.WHITE,1,1);board[1][1]=1;PlayerPieces.add(wp2);
            Pawn wp3=new Pawn(Color.WHITE,2,1);board[2][1]=1;PlayerPieces.add(wp3);
            Pawn wp4=new Pawn(Color.WHITE,3,1);board[3][1]=1;PlayerPieces.add(wp4);
            Pawn wp5=new Pawn(Color.WHITE,4,1);board[4][1]=1;PlayerPieces.add(wp5);
            Pawn wp6=new Pawn(Color.WHITE,5,1);board[5][1]=1;PlayerPieces.add(wp6);
            Pawn wp7=new Pawn(Color.WHITE,6,1);board[6][1]=1;PlayerPieces.add(wp7);
            Pawn wp8=new Pawn(Color.WHITE,7,1);board[7][1]=1;PlayerPieces.add(wp8);
            Rook wr1=new Rook(Color.WHITE,0,0);board[0][0]=1;PlayerPieces.add(wr1);
            Rook wr2=new Rook(Color.WHITE,7,0);board[7][0]=1;PlayerPieces.add(wr2);
            Knight wn1=new Knight(Color.WHITE,1,0);board[1][0]=1;PlayerPieces.add(wn1);
            Knight wn2=new Knight(Color.WHITE,6,0);board[6][0]=1;PlayerPieces.add(wn2);
            Bishop wb1=new Bishop(Color.WHITE,2,0);board[2][0]=1;PlayerPieces.add(wb1);
            Bishop wb2=new Bishop(Color.WHITE,5,0);board[5][0]=1;PlayerPieces.add(wb2);
            Queen wq=new Queen(Color.WHITE,3,0);board[3][0]=1;PlayerPieces.add(wq);
            King wk=new King(Color.WHITE,4,0);board[4][0]=1;PlayerPieces.add(wk);

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
