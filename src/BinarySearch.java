import java.util.Scanner;

public class BinarySearch {

    void sort(int[] numArray) {
        int temp;
        for (int i = 0; i < numArray.length; i++) {
            for (int j = i + 1; j < numArray.length; j++)
                if (numArray[j] < numArray[i]) {
                    temp = numArray[j];
                    numArray[j] = numArray[i];
                    numArray[i] = temp;
                }
        }
    }

    int search(int[] numArray, int n) {
        int l = 0;
        int r = numArray.length - 1;
        int m;
        while (l <= r) {
            m = (l + r) / 2;
            if (n == numArray[m]) return m;
            else if (n <= numArray[m]) r = m - 1;
            else l = m + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch s = new BinarySearch();

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of elements of your array : ");
        int n = scan.nextInt();
        int[] numArray = new int[n];
        System.out.println("Enter the numbers : ");
        for (int i = 0; i < n; i++) {
            numArray[i] = scan.nextInt();
        }
        System.out.println("Enter the number you want to search : ");
        n = scan.nextInt();

        scan.close();
        s.sort(numArray);
        System.out.println("Sorted array (Selection sort) is : ");
        for(int num: numArray) {
            System.out.print(num + "\t");
        }
        n = s.search(numArray, n);
        if (n > 0) {
            System.out.println("Number found at " + n + "th position!");
        } else {
            System.out.println("Number not found!");
        }
    }
}