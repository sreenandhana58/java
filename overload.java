package record;
class OverLoadDemo{
	void area(float x) {
		System.out.println("area of square is " +Math.pow(x, 2)+"sq units");}
	void area(float x,float y) {
		System.out.println("area of rectangle is " +x*y+"sq units");}
	
    void area(Double x) {
    	double z=3.14*x*x;
    	System.out.println("area of circle is " +z+"sq units");}
}
public class Overload {

	public static void main(String[] args) {
	OverLoadDemo ob = new OverLoadDemo();
	ob.area(5);
	ob.area(11, 12);
	ob.area(2.5);
	}

}
