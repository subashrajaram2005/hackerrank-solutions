/*
Problem Name
Print Alternating 0-1 Star Pattern

Problem Statement
Print the following pattern of alternating 1s and 0s as shown.

Input Format
Integer

Constraints
Input > 0

Output Format
Star pattern

Sample Test Cases
Sample Input 0
5

Sample Output 0
10101
01010
10101
01010
10101

Sample Input 1
6

Sample Output 1
101010
010101
101010
010101
101010
010101

*/

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print(((i + j) + 1) % 2);
            }
            System.out.println();
        }
    }
}
