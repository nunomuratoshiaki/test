package jp.co.internous.action;

public class ChekLoadJDBC {

	public static void main(String[] args)throws InstantiationException,IllegalAccessException {
        String msg="";

        try {
        	Class.forName("com.mysql.jdbc.Driver").newInstance();
        	msg="ドライブのロードに成功しました";
        }catch(ClassNotFoundException e) {
        	msg="ドライブのロードに失敗しました";
        }
        System.out.println(msg);
	}

}