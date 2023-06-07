import java.util.*;
public class BookApp{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<2;i++){
			System.out.print("本の名前>>");
			String name=sc.next();
			System.out.print("本の価格>>");
			int price=sc.nextInt();
			System.out.print("出版社>>");
			String publish=sc.next();
			Book b=new Book(name,price,publish);
			b.show();
		}

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
		System.out.printf("%s:%s(%d円)%n",name,publish,price);
	}
}
