public class Solution {
    public int[] countBits(int num) {
        int[] arr= new int[num+1];
        int k = 0;
        for(int i = 0; i <= num; i++){
            String bin = Integer.toBinaryString(i);
            int count = 0;
            int n = bin.length();
            for(int j = 0; j < n; j++){
                String s = "";
                s = s + bin.charAt(j);
                if(s.equals("1")){
                    ++count;
                }
                
            }
            arr[k++] = count;
        }
        return arr;
        
    }
}
