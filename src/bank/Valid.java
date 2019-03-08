package bank;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import model.User;

public class Valid {
	static int count=0;
	public static User setInfo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the details "+count);
		
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
		User user = new User();
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter aadhar");
		long aadhar=sc.nextLong();
		
		
		
		
			try {
				FileInputStream fileInputStream= new FileInputStream("D:\\Programs\\bank"+ ".txt");
				ObjectInputStream objectInputStream= new ObjectInputStream(fileInputStream);
				ArrayList<User> s=(ArrayList<User>)objectInputStream.readObject();
				
				int c=0;
				for (int i = 0; i < s.size(); i++) {
					if(s.get(i).getAadharNo()==aadhar)
					{
						System.out.println("valid");
						break;
					}
					else
					{
						c++;
					}
					
				}
				if(c==s.size())
				{
					ArrayList<User> list = new ArrayList<User>();
					list.add(setInfo());
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
			
			
			catch (FileNotFoundException e) {
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
