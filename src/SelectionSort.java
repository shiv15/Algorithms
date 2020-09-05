import java.util.Scanner;

public class SelectionSort {

    void sort(int[] numArray) {
        int temp;
        for(int i=0;i<numArray.length;i++){
            for(int j=i+1;j<numArray.length;j++)
                if(numArray[j] < numArray[i]) {
                    temp = numArray[j];
                    numArray[j] = numArray[i];
                    numArray[i] = temp;
                }
        }
    }
    public static void main(String[] args) {
        SelectionSort s = new SelectionSort();

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of elements to sort : ");
        int n = scan.nextInt();
        int[] numArray = new int[n];
        System.out.println("Enter the numbers : ");
        for(int i=0;i<n;i++) {
            numArray[i] = scan.nextInt();
        }
        s.sort(numArray);
        System.out.println("Sorted array is : ");
        for(int num: numArray) {
            System.out.print(num + "\t");
        }
    }
}