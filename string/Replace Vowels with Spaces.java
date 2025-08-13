/*
Problem Name
Replace Vowels with Spaces

Problem Statement
Write a program to replace all vowels with spaces

Input Format
Accept string as an input

Constraints
NIL

Output Format
Print the replaced string

Sample Test Cases
Sample Input 0
Replace all vowels 

Sample Output 0
R pl c   ll v w ls 
*/

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = "".toLowerCase();
        for(int i=0;i<a.length();i++){
            char ch = a.charAt(i);
            if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u') b = b +' ';
            else b=b+ch;
        }
        System.out.println(b);
    }
}
