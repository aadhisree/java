import java.util.Scanner;
public class addmarix{
	public static void main(String args[])
	{
	System.out.println("\tAditya Suresh\n\t23mca004\n\t13/02/2024");
	int row, col,i,j;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the number of rows");
	row =in.nextInt();
	System.out.println("Enter the number of columns");
	col =in.nextInt();
	int mat1[][] =new int[row][col];
	int mat2[][] =new int[row][col];
	int mat3[][] =new int[row][col];
	System.out.println("Enter the elements of matrix1");
	for(i=0;i<row;i++)
	{
	for(j=0;j<col;j++)
	mat1[i][j]=in.nextInt();
	System.out.println();
	}
	System.out.println("Enter the elements of matrix2");
	for(i=0;i<row;i++)
	{
	for(j=0;j<col;j++)
	mat2[i][j]=in.nextInt();
	System.out.println();
	}
	for(i=0;i<row;i++)
	for(j=0;j<col;j++)
	mat3[i][j]=mat1[i][j]+mat2[i][j];
	System.out.println("Sum of matix:");
	for(i=0;i<row;i++)
	{
	for(j=0;j<col;j++)
	System.out.print(mat3[i][j]+"\t");
	System.out.println();
	}
}
}	

