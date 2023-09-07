import java.util.ArrayDeque;
import java.util.Deque;

public class Utils {
    public int reversed(int num){
        String s = String.valueOf(num);
        Deque<Character> dq = new ArrayDeque<>;
        
        for(char c: s.toCharArray()){
            dq.addLast(c);
        }

        StringBuilder sb = new StringBuilder();
        int size = dq.size();
        while(size-- > 0){
            char c = dq.removeLast();
            sb.append(c);
        }

        return Integer.valueOf(sb.toString());
    }

    public int[] formatter(int num){
        int binary = Integer.parseInt(Integer.toBinaryString(number));
        int octal = Integer.parseInt(Integer.toOctalString(number));

        return new int[]{binary, octal};
    }
}