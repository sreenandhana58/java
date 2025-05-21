package record;
class publisher{
	String publisher;
	publisher(String publi){
		this.publisher=publi;
	}
}
class book{
	String name;
	publisher publisher;
	book(){}
	public book(String name,publisher publisher) {
		this.name=name;
		this.publisher=publisher;
		
	}
};
class literature extends book{
	String lit_type="litrature";
	literature(String name,publisher publisher){
		super(name,publisher);
	}
	void display() {
		System.out.println("name :"+super.name);
		System.out.println("Type:"+this.lit_type);
		System.out.println("Publisher:"+this.publisher.publisher);
	
	}
};
class fiction extends book{
	String lit_type="Fiction";
	fiction(String name,publisher publisher){
		super(name,publisher);
	}
	void display() {
		System.out.println("name :"+super.name);
		System.out.println("Type:"+this.lit_type);
		System.out.println("Publisher:"+this.publisher.publisher);
	
	}
}
public class InheritanceBook {

	public static void main(String[] args) {

publisher lp=new publisher("s.chand");
literature l=new literature("As you like it",lp);
l.display();
publisher fp=new publisher("Tata McGraw Hill");
fiction f=new fiction("Tempest",fp);
f.display();

	}

}
