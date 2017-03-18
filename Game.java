package homeWork;
import java.util.*;
public class Game {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		chess Chess = new chess();
		Chess.printChessBoard();
			///First Make order	
		int Person = Chess.MakeFirst();
		String PersonColor [] = {"red" , "yellow"};
		char ChessColor [] = {'R','Y'};
		System.out.println(PersonColor[Person % 2] +" is the first. " );
		do{
			Scanner in = new Scanner (System.in);
			System.out.println("Drop a "+PersonColor[Person%2] +" disk at column (0-6)"  );
			int column = in.nextInt();
			if(column > 6 || !Chess.judgeFull(column)){
				System.out.println("Please choose another number between 0 - 6");
			}
			else{ // also consider a column is full 
				Chess.changeChess(ChessColor[Person % 2], column);
				//print chess
				Chess.printChessBoard();
				Person++;	
				}
			}while(Chess.JudgeRow(ChessColor[(Person -1)%2])  && Chess.JudgeColumn(ChessColor[(Person -1)%2]) &&
				Chess.JudgeDia1(ChessColor[(Person -1)%2]) && Chess.JudgeDia2(ChessColor[(Person -1)%2]) &&
				Chess.draw());//
		if(Chess.draw())
		System.out.println( "The " +PersonColor[(Person -1 ) % 2] + " players won! ");
		else {
			System.out.println("You guys draw");
		}
	}
	
}
class chess{
	char [][] chessBoard = new char[6][7];
	//初始化棋盘
	chess (){
		for(int i = 0;  i < chessBoard.length; i++ ){
			for(int j = 0 ; j < chessBoard[i].length; j++){
				chessBoard[i][j] = ' ';
			}
		}
	}
	//打印棋盘 display
	void printChessBoard(){
		for(int i = 0;  i < chessBoard.length; i++ ){
			for(int j = 0 ; j < chessBoard[i].length; j++){
				System.out.printf("| %c", chessBoard[i][j]);
			}
			System.out.println("|");
		}
	}
	
	int judgeBottom(int row, int column){
		int ReturnRow = row;	
		if(chessBoard[row][column] != ' ' ){	
				ReturnRow = judgeBottom(--row, column);
			}

		return ReturnRow; 
	}
	void changeChess(char Color,int column){
		int row = this.judgeBottom(5, column);
		chessBoard[row][column] = Color;
	}
	boolean judgeFull(int column){
		if(chessBoard[0][column] != ' '){
			return false;
		}
		return true;
	}
	int MakeFirst(){
		///Y 传 1   R 传 2 
		double Y = Math.random();
		double R = Math.random();
		if(Y >= R){
			return 1;
		}
		else
			return 2;	
	}
	boolean JudgeRow(char Color){
		for(int i = 0; i< chessBoard.length; i++){
			int count = 0;
			for(int j = 0; j < chessBoard[i].length - 1; j++){
				if(chessBoard[i][j] == Color && chessBoard[i][j+1] == Color){
					count++;
				}
				if(count == 3){
					return false;
				}
			}
		}
		return true; 
		// 当有人胜利false
	}
	boolean JudgeColumn(char Color){
		for(int j = 0; j < 7; j++){
			int count = 0;
			for(int i = 0; i < 5; i++){
				if(chessBoard[i][j] == Color && chessBoard[i+1][j] == Color ){
					count++;
				}
				if(count == 3){
					return false;
				}
			}
		}
		return true ;
		// 有人胜利false
	}
	boolean JudgeDia1(char Color){// form left-up to right-down
		for(int i = 0; i< 3; i++){
			for(int j = 0; j < 4; j++){
				int row = i;
				int column = j;
				int count = 0;
				for(int round = 0; round < 3; round++){
					if(chessBoard[row][column] == Color && chessBoard[++row][++column] == Color){
						count++;
					}
					if(count == 3){
						return false;
					}
				}
			}
		}
		
		return true; // 有人胜利
	}
	boolean JudgeDia2(char Color){ // form right-up to left-down
		for(int i = 0; i< 3; i++){
			for(int j = 3; j < 7; j++){
				int row = i;
				int column = j;
				int count = 0;
				for(int round =0 ; round < 3; round++){
					if(chessBoard[row][column] == Color && chessBoard[++row][--column] == Color ){
						count++;
					}
					if(count == 3){
						return false;
					}
				}
			}
		}
		return true;  // 有人胜利
	}
	boolean draw(){
		for(int i = 0; i< chessBoard.length; i++){
			for (int j = 0; j < chessBoard[i].length;j++){
				if(chessBoard[i][j] == ' '){
					return true; // 不是平局
				}
			}
		}
		return false; // 是平局
	}
}