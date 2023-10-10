import java.util.*;

public class roman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ans = RomanToInteger(s);
        System.out.println(ans);
        sc.close();
    }

    public static int RomanToInteger(String s) {
        HashMap<Character, Integer> hmap = new LinkedHashMap<>();
        hmap.put('I', 1);
        hmap.put('V', 5);
        hmap.put('X', 10);
        hmap.put('L', 50);
        hmap.put('C', 100);
        hmap.put('D', 500);
        hmap.put('M', 1000);
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (i == s.length() - 1)
                ans += hmap.get(c);
            else if (c == 'I') {
                char ch = s.charAt(i + 1);
                if (ch == 'V') {
                    ans += 4;
                    i++;
                } else if (ch == 'X') {
                    ans += 9;
                    i++;
                } else
                    ans += hmap.get(c);

            } else if (c == 'X') {
                char ch = s.charAt(i + 1);
                if (ch == 'L') {
                    ans += 40;
                    i++;
                } else if (ch == 'C') {
                    ans += 90;
                    i++;
                } else
                    ans += hmap.get(c);
            } else if (c == 'C') {
                char ch = s.charAt(i + 1);
                if (ch == 'D') {
                    ans += 400;
                    i++;
                } else if (ch == 'M') {
                    ans += 900;
                    i++;
                } else
                    ans += hmap.get(c);
            } else
                ans += hmap.get(c);
        }
        return ans;
        
    }
    
}
