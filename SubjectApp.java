import java.util.*;
public class SubjectApp{
	public static void main(String[] args){
		//スキャナーインスタンスの作成
		Scanner sc=new Scanner(System.in);
		System.out.print("何科目ありますか>>");
		int numSubject=sc.nextInt();
		//Subject[]作成
		Subject[] data=new Subject[numSubject];
		//科目数分回るループ
		for(int i=0;i<data.length;i++){
			System.out.printf("%d科目の名前>>%n",i+1);
			String nameSubject=sc.next();
			System.out.printf("%d科目の点数>>%n",i+1);
			int scoreSubject=sc.nextInt();
			//インスタンスを配列に格納
			Subject s=new Subject(nameSubject,scoreSubject);
			data[i]=s;
		}
		//拡張forでそれぞれのインスタンスにアクセス
		for(Subject s:data){
			//グラフを描画するインスタンスメソッドの実行
			s.showGraph();
		}
	}
}
