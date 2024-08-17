
public class DemoObjectClass {

	int i=10 , j=100;
	static int k=2000;
	public static void main(String[] args) {
		Object obj= new Object();
		System.out.println(obj.getClass());
		System.out.println(obj.toString());
		
		DemoObjectClass demoObj = new DemoObjectClass();
		demoObj.i=1000;
		demoObj.k=5000; // not the way to access static
		System.out.println(demoObj.toString());
		
		DemoObjectClass demoObj1 = new DemoObjectClass();
		System.out.println(demoObj1); //1
	}
	public void show() {
		System.out.println("Show method called");
	}
	@Override
	public String toString() { //2
		return "DemoObjectClass [i=" + i + ", j=" + j + ", k=" + k + "]";
	}
	
	/*DemoObjectClass(int i , int j){
		this.i=i;
		this.j=j;
	}*/
	/*public String toString() {
		Class c = getClass(); 
        return c.getName() + "@" + Integer.toHexString(hashCode());
//		 return "Print Object ";
    }*/
	// java.lang.Object@15db9742
	

}
