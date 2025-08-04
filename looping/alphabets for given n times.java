/*
Problem Name
Print Alphabets N Times

Problem Statement
Print all the alphabets for given n times.

Input Format
Integer

Constraints
Nill

Output Format
Display the alphabets N times

Sample Test Cases
Sample Input 0
2

Sample Output 0
a b c d e f g h i j k l m n o p q r s t u v w x y z
a b c d e f g h i j k l m n o p q r s t u v w x y z

*/
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) 
            System.out.println("a b c d e f g h i j k l m n o p q r s t u v w x y z");
    }
}
