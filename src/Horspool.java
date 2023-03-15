import java.util.HashMap;

public class Horspool {
    HashMap<Character, Integer> shiftTable(char[] str) {

        HashMap<Character, Integer> table = new HashMap<>();
        int i=0;
        for (char ch = 'a'; ch <= 'z'; ++ch){
            table.put(ch, str.length);
            i++;
        }

        for (i=0; i<=str.length-2;i++){
            table.put(str[i] ,str.length - 1 - i);
        }
        return table;
    }
    public int strStr(String haystack, String needle) {
        char[] needleCharArr = needle.toCharArray();
        char[] haystackCharArr = haystack.toCharArray();
        HashMap<Character, Integer> table = shiftTable(needleCharArr);
        int i = needleCharArr.length-1;
        while(i<=haystackCharArr.length - 1){
            int k = 0;
            while (k<=needleCharArr.length-1 && needleCharArr[needleCharArr.length-1-k] == haystackCharArr[i-k]){
                k+=1;
            }
            if(k == needleCharArr.length)
                return i-needleCharArr.length+1;
            else
                i+=table.get(haystackCharArr[i]);

        }
        return -1;
    }
    public static void main(String[] args){
        Horspool str = new Horspool();
        System.out.println(str.strStr("hello", "ll"));
    }
}
