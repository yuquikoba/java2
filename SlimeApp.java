import java.util.*;
public class SlimeApp{
	public static void main(String[] args){
		Slime s1=new Slime("スラキチ",25);
		Slime s2=new Slime(30);
		s1.appear();
		s2.appear();
		System.out.printf("%d体のスライムが襲ってきた%n",Slime.getCount());
	}
}
class Slime{
	String name;
	int hp;
	static int count=0; 
	public Slime(String name,int hp){
		this.name=name;
		this.hp=hp;
		count++;
	}
	public Slime(int hp){
		this("スライム",hp);//自身のコンストラクタの呼び出し
	}
	public void appear(){
		System.out.printf("%s(%d)があらわれた!%n",this.name,this.hp);
	}
	public static int getCount(){
		return count;
	}
}

