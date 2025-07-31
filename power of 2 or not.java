/*
Write a c program to find whether the given number is power of 2 or not.

Input Format
Input an integer

Constraints
Nill

Output Format
YES/NO

Sample Input 0
8
Sample Output 0
YES

Sample Input 1
17
Sample Output 1
NO
*/
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(0<n){
            if(n==2) break;
            if(n%2==0){
                n /= 2;
            }
            else{
            System.out.println("NO");
            return;
            }
        }
        System.out.println("YES");
    }
}
