public class BruteForceStringMatching {
    int bruteForceStringMatching(char[] text, char[] pattern){
        for(int i=0;i<text.length-pattern.length;i++){
            int j=0;
            while(j< pattern.length && pattern[j] == text[i+j]){
                j+=1;
                if(j==pattern.length)
                    return i;
            }

        }
        return -1;
    }

    public static void main(String[] args){
        BruteForceStringMatching b1 = new BruteForceStringMatching();
        System.out.println(b1.bruteForceStringMatching("nobody noticed him".toCharArray(), "not".toCharArray()));

    }
}
