import java.util.*;
public class VegitableApp{
	public static void main(String[] args){
		Vegitable.showTotal();
		Scanner sc=new Scanner(System.in);
		System.out.print("野菜をいくつ購入しますか>>");
		int num=sc.nextInt();
		Vegitable[] data=new Vegitable[num];
		for(int i=0;i<data.length;i++){
			System.out.printf("%dつめの野菜>>",i+1);
			String name=sc.next();
			System.out.printf("%sの価格>>",name);
			int price=sc.nextInt();
			data[i]=new Vegitable(name,price);
		}
		for(Vegitable v:data){
			v.show();
			//v.showTotal(); 非推奨
		}
		Vegitable.showTotal();
	}
}
class Vegitable{
	//staticフィールド、クラスメンバー、静的フィールド、クラスフィールド
	static int total=0;//メモリ空間に一つ
	//インスタンスフィールド
	String name;
	int price;
	public Vegitable(String name,int price){
		this.name=name;
		this.price=price;
		total+=this.price;
	}
	//インスタンスメソッド
	public void show(){
		System.out.printf("%s(%d円)%n",this.name,this.price);
	}
	//クラスメソッド、staticメソッド
	//staticメソッド内から、インスタンス値を参照できない
	public static void showTotal(){
		System.out.println("合計金額は:"+total+"円です");
	}
}
