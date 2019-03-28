/* 
 * 	@(#)MainClass.java				03/25/2019
 */

package com.sunkwan1weekMission;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * MainClass: main메서드가 포함되어있는 class이며 숫자야구게임의 시작부터 종료까지를 담당한다.
 * 
 * @author			김선관
 * @version			우아한 테크코스 1주차 미션 - 숫자 야구 게임
 */
public class JavaBaseball {
	
	/**
	 * NUMBERS:			숫자의 개수를 의미하는 상수
	 * THREE_DIGITS:	숫자야구게임을 몇 자리수로 할 것인지를 의미하는 상수, 현재는 세 자리수를 이용
	 */
	static final int NUMBERS = 10;
	static final int THREE_DIGITS = 3;
	
	/** 
	 * ansArr:		컴퓨터가 무작위로 뽑은 숫자가 저장될 배열
	 * userInArr:	사용자가 선택한 숫자가 저장될 배열 
	 */
	public static int[] ansArr = new int[THREE_DIGITS];
	public static int[] userInArr = new int[THREE_DIGITS];
	
	/** 
	 * strike:	strike의 수를 세는 변수
	 * ball:	ball의 수를 세는 변수
	 */
	public static int strike;
	public static int ball;
	
	public static Scanner scanner = new Scanner(System.in);
	
	/**
	 * main(args):		main메서드이며, parameter는 사용하지 않는다
	 * 					숫자야구게임의 시작부터 종료까지를 담당하는 메서드
	 * 					exitMode메서드의 리턴값으로부터 불린 변수 status에 게임을 계속 할지에 대한 정보를 저장한다.
	 * 					1. status = true:	다음 게임을 시작한다.
	 * 					2. status = false:  프로그램을 종료한다.	
	 * @param args:	미사용
	 */
	public static void main(String[] args) {
		boolean status = true;
		
		while (status) {
//            setAnsArr();			/* 0 ~ 9의 수를 무작위로 뽑아 ansArr배열에 저장한다. */
//            startGame();			/* 현재 게임을 시작한다. 게임은 ansArr배열과 userInArr배열이 일치할 경우 종료된다. */
//			status = exitMode();	/* 사용자에게 다음 게임을 시작할지에 대해 입력받는다. */
		}
		scanner.close();
	}
	
	/** 
	 * setAnsArr(): 	무작위로 숫자를 뽑아 ansArr에 저장하는 메서드.
	 */
	/*-
	 * setAnsArr의 구현:	0 ~ 9의 수가 순차적으로 저장된 ArrayList에서 무작위 번째 방을 선택하여 pop한다.
	 * 					이를 THREE_DIGITS번 만큼 반복한다. 결과적으로 THREE_DIGITS개수만큼의 서로다른 무작위 수를 만들 수 있다.
	 */
	public static void setAnsArr() {
		ArrayList<Integer> numbSeqArr = new ArrayList<>();
		
//		setArrayList(numbSeqArr);
//		popArrayList(numbSeqArr);
	}
}










