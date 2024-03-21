package com.ohgiraffers.section05.logical;

public class Application2 {
    public static void main(String[] args){
        /*수업 목표 : 논리 연산자의 우선순위에 대해 이해하고 이를 활용할 수 있다. */
        /* 논리 연산자의 우선순위와 활용
        * 논리and연산자와 논리or연산자의 우선순위
        * && : 11순위
        * || : 12순위
        * 논리and연산자가 논리or연산자보다 우선한다.
        * */

        /* 1. 1부터 100 사이의 값인지 확인할 때*/
        /* '1<=변수<=100'으로 사용 불가 -> '변수>=1 && 변수 <=100'*/
        int num1 = 55;
        System.out.println("1부터 100 사이인지 확인 : "+(num1 >=1 && num1 <=100));
        int num2 = 166;
        System.out.println("1부터 100 사이인지 확인 : "+(num2 >=1 && num2 <=100));


    }
}
