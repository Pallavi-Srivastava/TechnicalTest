package com.btm.checkprc;

public class TicTacToe 
{
	//UC1 here we solve
	static int[][] Board=new int[3][3];
	
	static void freshBoard()
	{
		System.out.println("TIC TAC TOE Game");
		for(int i=0;i<Board.length;i++)
		{
			for(int j=0;j<Board[i].length;j++)
				Board[i][j]=10;
		}
		System.out.println("Board is here");
	}
	public static void main(String[] args) 
	{
		freshBoard();
	}
}
