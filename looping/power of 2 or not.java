/*Problem Name
Check if a Number is a Power of 2

Problem Statement
Write a C program to find whether the given number is a power of 2 or not.

Input Format
Input an integer

Constraints
Nill

Output Format
Print YES if the number is a power of 2, otherwise print NO

Sample Test Cases
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
        while (0 < n) {
            if (n == 2) break;
            if (n % 2 == 0) {
                n /= 2;
            } else {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
