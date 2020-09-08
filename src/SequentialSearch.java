import java.util.Scanner;

public class SequentialSearch {
    int search(int[] numArray, int n){
        int i=0;
        while (i<numArray.length && numArray[i] != n) i++;
        if(i<numArray.length) return i;
        return -1;
    }
    public static void main(String[] args){
        SequentialSearch s = new SequentialSearch();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of elements in an array : ");
        int n = scan.nextInt();
        int[] numArray = new int[n];
        System.out.println("Enter the numbers : ");
        for(int i=0;i<n;i++) {
            numArray[i] = scan.nextInt();
        }
        System.out.println("Enter the number to be searched in an array : ");
        n = scan.nextInt();
        scan.close();
        n = s.search(numArray, n);
        if(n<0) System.out.println("Number not in the array");
        else System.out.println("Number found at "+n+"th index");
    }
}
