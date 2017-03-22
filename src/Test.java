import java.util.*;


class student implements Comparable{
	int sno;
	String sname;
	int age;

public student(int sno,String sname,int age){
	
this.sno= sno;
this.sname=sname;
this.age=age;

}

@Override
public int compareTo(Object o) {
	student st=(student)o;
	if(age==st.age)
		return 0;
	else if(age>st.age)
		return 1;
	else
		return -1;
}
}
public class Test {

	public static void main(String[] args) {
		ArrayList al= new ArrayList();
		al.add(new student(100,"sup",23));
		al.add(new student(101,"supr",43));
		al.add(new student(102,"supra",3));
		
		Collections.sort(al);
		Iterator itr=al.iterator();
		while(itr.hasNext()){
			student st= (student)itr.next();
			System.out.println(st.sno+""+st.sname+""+st.age);

	}

}}
