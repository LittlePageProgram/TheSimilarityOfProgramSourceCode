package com.littlepage.similarityMachine;

import java.util.Scanner;

public class SimilarityMachineClient {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("�������һ��Դ����ľ��Ե�ַ:");
		String fileName1=sc.nextLine();
		System.out.println("������ڶ���Դ����ľ��Ե�ַ:");
		String fileName2=sc.nextLine();
		double analysis=SimilarityJudgeUtils.detectionTwoFile(fileName1, fileName2);
		System.out.printf("�������:\n����Դ��������ƶ�Ϊ:   %.2f",analysis);
		sc.close();
		//D:\eclipse sts workspace\DataStructureCourse\BinaryNode.java
		//D:\eclipse sts workspace\DataStructureCourse\Person.java
	}
}
