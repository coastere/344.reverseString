package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        char []s= {'r', 's', 't', 'u', 'v'};
        char t;
        for (int i = 0; i <s.length/2 ; i++) {
            t = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length-1-i]=t;
        }
        for (int i = 0; i <s.length ; i++) {
            System.out.println(s[i]);
        }
    }
}
