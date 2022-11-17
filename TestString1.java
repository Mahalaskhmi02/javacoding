class TestString1 {
public static void main(String args[]) {
	String s="Anudip";
	System.out.println(s);
	System.out.println(s.indexOf("n"));//1
	System.out.println(s.lastIndexOf("i"));//4
	//current string not found, it displays -1
	System.out.println(s.indexOf("r"));//-1
		
	}
}
