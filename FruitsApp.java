import java.util.*;
public class FruitsApp{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("野菜をいくつ購入しますか>>");
		int num=sc.nextInt();
		//型指定　型使用
		Fruits[] data=new Fruits[num];
		for(int i=0;i<data.length;i++){
			System.out.printf("%dつめの野菜>>",i+1);
			String name=sc.next();
			System.out.printf("%sの値段>>",name);
			int price=sc.nextInt();
			data[i]=new Fruits(name,price);
		}
		int sum=0;
		for(Fruits f:data){
			f.show();
			sum+=f.price;
		}
		System.out.printf("合計は%d円です。%n",sum);
	}
}

class Fruits{
	String name;
	int price;
	public Fruits(String name,int price){
		this.name=name;
		this.price=price;
	}
	public void show(){
			System.out.printf("%s(%d円)%n",this.name,this.price);
	}

}
