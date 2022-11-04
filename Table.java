package AMIT;
import java.util.*;

public class Table {
	public static Scanner reader = new Scanner(System.in);
	private String Cname1;
	private String Cname2;
	private String[] table1;
	private String[] table2;
	private int rowsC = 0;
	
	public void insertColumnNames(String name, String last_name) {
		this.Cname1 = name;
		this.Cname2 = last_name;
		this.table1[0] = this.Cname1;
		this.table2[0] = this.Cname2;
	}
	
	public void insertRow(String st1, String st2) {
		this.rowsC++;
		this.table1[rowsC] = st1;
		this.table2[rowsC] = st2;
	}
	
	public String GetValue(String C, int row) {
		int f;
		if(C.equals(this.Cname1)) return this.table1[row];
		else if (C.equals(this.Cname2)) return this.table2[row];
		return "collum wrong";
	
	}
	
	public void printTable() {
		System.out.println(this.Cname1 +  " " + this.Cname2);
		for(int i = 0; i <= this.rowsC; i++) {
			System.out.println(this.table1[i] +"  " + this.table2[i] );
		}
	}
}
