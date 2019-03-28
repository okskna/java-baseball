/* 
 * 	@(#)MainClass.java				03/25/2019
 */

package com.sunkwan1weekMission;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * MainClass: main�޼��尡 ���ԵǾ��ִ� class�̸� ���ھ߱������� ���ۺ��� ��������� ����Ѵ�.
 * 
 * @author			�輱��
 * @version			����� ��ũ�ڽ� 1���� �̼� - ���� �߱� ����
 */
public class JavaBaseball {
	
	/**
	 * NUMBERS:			������ ������ �ǹ��ϴ� ���
	 * THREE_DIGITS:	���ھ߱������� �� �ڸ����� �� �������� �ǹ��ϴ� ���, ����� �� �ڸ����� �̿�
	 */
	static final int NUMBERS = 10;
	static final int THREE_DIGITS = 3;
	
	/** 
	 * ansArr:		��ǻ�Ͱ� �������� ���� ���ڰ� ����� �迭
	 * userInArr:	����ڰ� ������ ���ڰ� ����� �迭 
	 */
	public static int[] ansArr = new int[THREE_DIGITS];
	public static int[] userInArr = new int[THREE_DIGITS];
	
	/** 
	 * strike:	strike�� ���� ���� ����
	 * ball:	ball�� ���� ���� ����
	 */
	public static int strike;
	public static int ball;
	
	public static Scanner scanner = new Scanner(System.in);
	
	/**
	 * main(args):		main�޼����̸�, parameter�� ������� �ʴ´�
	 * 					���ھ߱������� ���ۺ��� ��������� ����ϴ� �޼���
	 * 					exitMode�޼����� ���ϰ����κ��� �Ҹ� ���� status�� ������ ��� ������ ���� ������ �����Ѵ�.
	 * 					1. status = true:	���� ������ �����Ѵ�.
	 * 					2. status = false:  ���α׷��� �����Ѵ�.	
	 * @param args:	�̻��
	 */
	public static void main(String[] args) {
		boolean status = true;
		
		while (status) {
            setAnsArr();			/* 0 ~ 9�� ���� �������� �̾� ansArr�迭�� �����Ѵ�. */
//            startGame();			/* ���� ������ �����Ѵ�. ������ ansArr�迭�� userInArr�迭�� ��ġ�� ��� ����ȴ�. */
//			status = exitMode();	/* ����ڿ��� ���� ������ ���������� ���� �Է¹޴´�. */
		}
		scanner.close();
	}
	
	/** 
	 * setAnsArr(): 	�������� ���ڸ� �̾� ansArr�� �����ϴ� �޼���.
	 */
	/*-
	 * setAnsArr�� ����:	0 ~ 9�� ���� ���������� ����� ArrayList���� ������ ��° ���� �����Ͽ� pop�Ѵ�.
	 * 					�̸� THREE_DIGITS�� ��ŭ �ݺ��Ѵ�. ��������� THREE_DIGITS������ŭ�� ���δٸ� ������ ���� ���� �� �ִ�.
	 */
	public static void setAnsArr() {
		ArrayList<Integer> numbSeqArr = new ArrayList<>();
		
		setArrayList(numbSeqArr);
		popArrayList(numbSeqArr);
	}
	
	/**
	 * setArrayList(numbSeqArr): 0 ~ 9 ���� ���������� ����� ArrayList�� �����.
	 * 
	 * @param numbSeqArr: 0 ~ 9 ���� ���������� ����Ǿ� �ִ� ArrayList
	 */
	public static void setArrayList(ArrayList<Integer> numbSeqArr) {
		for (int i = 0; i < NUMBERS; ++i) {
			numbSeqArr.add(i);						// 0 ~ 9 ���� ���������� ����� ArrayList�� �����.
		}
	}
	
	/**
	 * popArrayList(numbSeqArr): numbSeqArr�� ������ ��° ���� ���� ansArr[i = 0 ~ THREE_DIGITS]�� �����Ѵ�.  
	 * 
	 * @param numbSeqArr: 0 ~ 9 ���� ���������� ����Ǿ� �ִ� ArrayList
	 */
	public static void popArrayList(ArrayList<Integer> numbSeqArr) {
		Random random = new Random();
		int popIdx;
		
		for (int i = 0; i < THREE_DIGITS; ++i) {
			popIdx = random.nextInt(NUMBERS - i);	// ��������° ArrayList�� ���� ansArr[i]�� �����Ѵ�. 
			ansArr[i] = numbSeqArr.get(popIdx);
			numbSeqArr.remove(popIdx);				// ���õ� ArrayList�� ���� remove�Ͽ� ���� �ߺ��� ���Ѵ�.
		}
	}
	
	/** startGame():	���� ���� �޼���
	 *					ansArr�迭�� userInArr�迭�� ��ġ�� ��� ���� ������ �����Ѵ�. 
	 */
	public static void startGame () {
		boolean isEnd = false;
		int userInNum;
		while(!isEnd) {
            strike = 0;
            ball = 0;
            
            System.out.print("���ڸ� �Է����ּ���: ");
			userInNum = scanner.nextInt();
			
			numDivider(userInNum);		
			idxCounter();				
			
			isEnd = is3Strike();		
		}
	}
	
	/**
	 * numDivider(userInNum):	userInNum�� �� �ڸ����� �и��Ͽ� userInArr�� ���������� �����Ű�� �޼����̴�.
	 * 
	 * @param userInNum:	����ڰ� �Է��� ���� ����Ǿ� �ִ� ����
	 */
	public static void numDivider(int userInNum) {
		int divider;
		for (int i = 0; i < THREE_DIGITS; ++i) {
			divider = 1;
			for (int j = i; j < THREE_DIGITS - 1; ++j) {
				divider *= NUMBERS;
			}
			userInArr[i] = userInNum / divider;
			userInNum = userInNum % divider;
		}
	}
	
	/**
	 * idxCounter():	ansArr�� userInArr�� ���ϱ� ���� index�� ���������� ������Ű�� �޼���.
	 */
	public static void idxCounter() {
		for (int ansIdx = 0; ansIdx < THREE_DIGITS; ++ansIdx) {
			for (int inIdx = 0; inIdx < THREE_DIGITS; ++inIdx) {
//				compareValue(ansIdx, inIdx);		// 2-2-1
			}
		}
	}
	
	/** ��Ʈ����ũ�� THREE_DIGITS�� ��� ������ �����Ѵ�. �� ���� ��� strike�� ball�� ������ ���� �޼����� ���.
	 * 
	 * @return	boolean������ ��ȯ�Ѵ�.
	 * 			true: ������ ����, false: ������ �����
	 */
	public static boolean is3Strike () {
		if (strike == THREE_DIGITS) {
			System.out.println(strike + "��Ʈ����ũ");
			System.out.println(THREE_DIGITS + "���� ���ڸ� ��� �����̽��ϴ�! ��������");
			return true;	/* 3 strike�� ��� ���� ���� */
		} else {
			if ((strike == 0) && (ball == 0)) {
				System.out.println("����");
			} else if (strike == 0) {
				System.out.println(ball + " ��");
			} else if(ball == 0) {
				System.out.println(strike + " ��Ʈ����ũ");
			} else {
				System.out.println(strike + " ��Ʈ����ũ " + ball + " ��");	
			}
			return false;	/* 3 strike�� �ƴ� ��� ���� ��� */
		}
	}
}










