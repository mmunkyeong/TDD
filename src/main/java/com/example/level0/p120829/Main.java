package com.example.level0.p120829;

public class  Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
class Solution{

    public int solution(int angle) {
       if(angle==180) return 4;
        else if(angle==90) return 2;
        else if(angle>90)return 3;
       return 1;
    }
}