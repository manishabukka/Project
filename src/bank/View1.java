package bank;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;



import model.User;

public class View1 {
	
	public static void main(String[] args) {
		try {
			FileInputStream fileInputStream= new FileInputStream("D:\\Programs\\bank"+ ".txt");
			ObjectInputStream objectInputStream= new ObjectInputStream(fileInputStream);
			ArrayList<User> s=(ArrayList<User>)objectInputStream.readObject();
		User u=new User();
		u=s.get(1);
		System.out.println(u.getLastname());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
	}
