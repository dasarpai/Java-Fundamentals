package edureka3;

import java.util.ArrayList;

public class CustomArray {
	int i, n=4;
	class StuData{
		int roll;
		String name;
		int marks;
		long phone;
		StuData(int roll, String name, int marks, long phone){
			this.roll=roll;
			this.name=name;
			this.marks=marks;
			this.phone=phone;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int roll[]= {1,2,3,4};
		String name[] = {"Hari","Ram","Lakshman","Dhanush"};
		int marks[]= {70,80,90,78};
		long phone[]= {999999L, 888888L, 777777L, 6666666L};
		CustomArray ca = new CustomArray();
		ca.addValues(roll, name, marks, phone);

	}
	public void addValues(int roll[], String name[], int marks[], long phone[]) {
		ArrayList<StuData> list = new ArrayList<CustomArray.StuData>();
		for (int i=0; i<n; i++) {
			list.add(new StuData(roll[i], name[i], marks[i], phone[i]));
			
		}
		
		printValues(list);
	}
	public void printValues(ArrayList<StuData> list) {
		for (int i=0; i<n; i++) {
			StuData data = list.get(i);
			System.out.println(data.name+ " "+data.roll+" "+ data.marks+ " "+data.phone);
		}
		
		
		System.out.println("===============");
		list.remove(2);
		for (StuData value: list) {
			//StuData data = list.get(i);
			System.out.println(value.name+ " "+value.roll+" "+ value.marks+ " "+value.phone);
		}
			
		System.out.println("===============");
		list.add(2, new StuData(100, "Jane",93,678905));
		for (StuData value: list) {
			//StuData data = list.get(i);
			System.out.println(value.name+ " "+value.roll+" "+ value.marks+ " "+value.phone);
		}
		
		StuData std1 = new StuData(100, "Jane",93,678905); 
		//StuData std2 = new StuData(100, "Jane",93,678905); 
		StuData std2 = std1;
		System.out.println(std1.equals(std2));
	}

	
}
