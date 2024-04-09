import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
    	System.out.println("\tAditya Suresh\n\t23mca004\n\t26/02/2024");
        int i,j,x=0;
        boolean state = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elemets in array:");
        int num=sc.nextInt();
        String word[]=new String[num];
        sc.nextLine();
        System.out.println("\nEnter a Word\n");
        for( i=0;i<num;i++){
        
        word[i]=sc.nextLine();
        }
        System.out.println("Enter the element to Search");
        String search = sc.nextLine();
        for( i=0;i<num;i++){
            if(word[i].equals(search)){
                 x = i+1;
                state = true;
            }
            }
            if(state){
        System.out.println("Element found at  position = "+x);
            }
            else{
        System.out.println("Element found not found");

            }
    }
    
}
