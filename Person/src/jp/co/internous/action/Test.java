package jp.co.internous.action;

public class Test {

	public static void main(String[]args){
		Person taro=new Person();
		taro.name="山田太郎";
		taro.age=20;

		Person zirou=new Person();
		zirou.neme="木村次郎";
		zirou.age=18;

		Person hanako=new Person();
		hanako.name="鈴木花子";
		hanako.age=16;

		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(zirou.name);
		System.out.println(zirou.age);
		System.out.println(hanako.name);
		System.out.println(hanako.age);

	}
	}
