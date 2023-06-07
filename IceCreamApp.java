import java.util.*;
public class IceCreamApp{
	public static void main(String[] args){
		IceCream ice1=new IceCream("ピノ",160);
		IceCream ice2=new IceCream("スーパーカップ");
		ice1.show();
		ice2.show();
	}
}
class IceCream{
	String name;
	int price;
	public IceCream(String name,int price){
		this.name=name;
		this.price=price;
	}
	public IceCream(String name){
		this(name,120);
	}
	public void show(){
		System.out.printf("%s(%d円)%n",this.name,this.price);
	}
}
