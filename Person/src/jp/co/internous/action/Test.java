package jp.co.internous.action;

public class Test {

	public static void main(String[]args){
		Person taro=new Person();
		taro.name="山田太郎";
		taro.age=20;

		Person zirou=new Person();
		zirou.name="木村次郎";
		zirou.age=18;

		Person hanako=new Person();
		hanako.name="鈴木花子";
		hanako.age=16;

		System.out.println(taro.name);
		System.out.println(taro.age);
		taro.talk();
		taro.walk();
		taro.run();
		System.out.println(zirou.name);
		System.out.println(zirou.age);
		zirou.talk();
		zirou.walk();
		zirou.run();
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		hanako.talk();
		hanako.walk();
		hanako.run();

		Robot aibo=new Robot();
		aibo.name="aibo";

		Robot asimo=new Robot();
		asimo.name="asimo";

		Robot pepper=new Robot();
		pepper.name="pepper";

		aibo.talk();
		aibo.walk();
		aibo.run();

		asimo.talk();
		asimo.walk();
		asimo.run();

		pepper.talk();
		pepper.walk();
		pepper.run();
	}
	}
