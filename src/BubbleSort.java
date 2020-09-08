import java.util.Scanner;

public class BubbleSort {

    void sort(int[] numArray){
        int temp;
        for(int i=0;i<numArray.length;i++){
            for(int j=i+1;j<numArray.length;j++){
                if(numArray[i]>numArray[j]){
                    temp=numArray[i];
                    numArray[i]=numArray[j];
                    numArray[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of elements to sort : ");
        int n = scan.nextInt();
        int[] numArray = new int[n];
        System.out.println("Enter the numbers : ");
        for(int i=0;i<n;i++) {
            numArray[i] = scan.nextInt();
        }
        scan.close();
        BubbleSort s = new BubbleSort();
        s.sort(numArray);
        System.out.println("Sorted array(Bubble Sort) is : ");
        for(int num: numArray) {
            System.out.print(num + "\t");
        }
    }
}
