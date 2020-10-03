package com.btm.checkprc;

import java.util.Scanner;

public class TicTacToe 
{
	//UC1 here we solve
	static int[][] Board=new int[3][3];
	static boolean isEmpty=true;

	static void freshBoard()
	{
		System.out.println("TIC TAC TOE Game");
		for(int i=0;i<Board.length;i++)
		{
			for(int j=0;j<Board[i].length;j++)
				Board[i][j]=10;
		}
		System.out.println("Board is here");
		//displayBoard();
	}
	//Uc2
	static void takeIput()
	{
		Scanner sc=new Scanner(System.in);
		String displayChar;
		System.out.println("Enter a character x or 0");
		String choice=sc.nextLine();
				if(choice.equals("x"))
				{
					System.out.println("user start with x");
					displayChar="0";
					System.out.println(" computer start with:"+displayChar);
				}
				else if(choice.equals("0"))
				{
					System.out.println("if user start with 0");
					displayChar="x";
					System.out.println(" computer start with:"+displayChar);
				}
				else
				{
					System.out.println("Please Enter valid char");
				}
				//sc.close();
	}
	//uc3
	static void displayBoard()
	{
		int count=0;
		for(int row=0;row<Board.length;row++)
		{
			System.out.println("----------------");
			System.out.print("||");
			for(int col=0;col<Board[row].length;col++)
			{
				if(Board[row][col]== 0)
				{
					count++;
					System.out.print(" o |");
				}
				else if(Board[row][col]== 1)
				{
					count++;
					System.out.print(" x |");
				}
				else
					System.out.print(" |");
			}
			System.out.println("|");
		}
		if(count == 9)
		{
			isEmpty=false;
		}
		System.out.println("-----------------");
	}
	
	public static void main(String[] args) 
	{
		freshBoard();
		takeIput();
		displayBoard();
		//placedSpecifyChar();
	}
}
