package bank;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import model.User;

public class View {
	static int count=0;
	public static User setInfo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the details"+count);
		
		User user=new User();
		user.setFirstname(sc.next());
		user.setLastname(sc.next());
		user.setAadharNo(sc.nextLong());
		user.setAccountNo(sc.nextLong());
		user.setAccountType(sc.next());
		user.setPancardNo(sc.next());
		user.setPhoneNo(sc.nextLong());
		user.setAddress(sc.next());
		count++;
		return user;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t=1;
		ArrayList<User> list=new ArrayList<>();
		for (int i = 0; i <=t; i++) {
			list.add(setInfo());
		}
		 long val[] = new long[t];
		User user1[] = new User[t];
		for (int j = 0; j <=t; j++) {
			
			user1[j]=list.get(1);
			val[j]=user1[j].getAadharNo();
		}
		for (int i = 0; i <=t ; i++) {
			System.out.println(val[i]);
		}
		
		
		
		System.out.println(list);
		try {
			FileOutputStream fileOutputStream= new FileOutputStream("D://programs//bank.txt");
			ObjectOutputStream objectOutputStream =new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(list);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
