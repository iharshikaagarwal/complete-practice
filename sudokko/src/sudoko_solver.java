public class sudoko_solver {
    public boolean issafe(char[][]board , int row ,int col , int number){
//        for col and rows
        for (int i = 0 ; i<board.length;i++){
            if(board[i][col]==(char) (number+'0')){
                return false;
            }
            if (board[col][i]==(char) (number+'0')){
                return false;
            }
        }
//        grid
        int startrow =(row/3)*3;
        int startcol =(col/3)*3;
        for (int i = startrow ; i <startrow+3;i++){
            for (int j = startcol;i<startcol+3;j++){
                if( board[i][j]==(char) (number+'0')){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean helper (char [][]board ,int row ,int col ) {
        int newrow =0 ;
        int newcol =  0;
        if (col== board.length-1) {
            newrow =row+1;
            newcol=0;

        }else {
            newrow=row;
            newcol=col+1;

        }
        if (board[row][col]!='.'){
            if(helper(board,newrow,newrow)){
                return true;
            }
        }else {
            for (int i = 1 ; i <=9 ; i++){
                if (issafe(board,row,col,i)){
                    board[row][col]=(char)(i+'0');
                    if(helper(board,newrow,newcol)){
                        return true;
                    }else {
                        board[row][col]='.';
                    }
                }
            }

        }
        return false;
    }
    public void solvesukodo(char[][]board){
        helper(board,0,0);
    }
}
