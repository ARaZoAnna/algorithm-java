import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for (int i = 0; i < a.length(); i++) {
            char tmp = a.charAt(i);
            if (Character.isUpperCase(tmp)) System.out.print(Character.toLowerCase(tmp));
            else {
                System.out.print(Character.toUpperCase(tmp));
            }
        }
    }
}