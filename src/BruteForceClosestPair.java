public class BruteForceClosestPair {
    int bruteForceClosestPair(int[][] numArr){
        int distance = 1000000;
        if(numArr.length<2)
            return -1;
        for(int i=0;i<numArr.length-1;i++){
            for(int j=i+1;j<=numArr.length-1;j++){
                distance = (int) Math.min(distance, Math.sqrt((numArr[i][0]-numArr[j][0])*(numArr[i][0]-numArr[j][0])+(numArr[i][1]-numArr[j][1])*(numArr[i][1]-numArr[j][1])));
            }
        }
        return distance;
    }

    public static void main(String[] args){
        int[][] numArr = {{2, 3}, {4, 5}};
        BruteForceClosestPair b1 = new BruteForceClosestPair();
        System.out.println(b1.bruteForceClosestPair(numArr));

    }
}
