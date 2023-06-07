import java.util.*;
public class BookApp2{
	public static void main(String[] args){
		Book b1=new Book("すっきりJava入門",2600,"インプレス");
		Book b2=new Book("すっきりMySQL",2200,"インプレス");
		b1.show();
		b2.show();
	}
}
class Book{
	String name;
	int price;
	String publish;
	public Book(String name,int price,String publish){
		this.name=name;
		this.price=price;
		this.publish=publish;
	}
	public void show(){
		System.out.printf("%s:%s(%d円)%n",this.name,this.publish,this.price);
	}
}
