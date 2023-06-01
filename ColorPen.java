public class ColorPen{
	//フィールド
	String color;
	int len;
	//コンストラクタ(仮引数)引数の違いでオーバーロード可
	public ColorPen(){
		this("白",10); //デフォルト例
	}
	//classに一つもコンストラクタがない場合、空が作られる
	public ColorPen(String color,int len){
		//自クラスのコンストラクタの呼び出し
		//this.()は必ず一行目に配置(*コンパイルエラー)
		this(color);
		this.len=len;
	}
	public ColorPen(String color){
		this.color=color;
	}
	//メソッド
	public void write(){
		if(this.len==0){
			System.out.println("もう描けません!");
			return;
		}
		System.out.printf("%sで描いた%n",this.color);
		this.len--;	
	}
	public void showStatus(){
		String str="";
		for(int i=0;i<this.len;i++){
			str+="=";
		}
		str+=">";
		str+="("+this.color+")";
		System.out.println(str);
	}


}
