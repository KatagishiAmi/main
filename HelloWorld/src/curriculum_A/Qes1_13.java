package curriculum_A;

public class Qes1_13 {		
	public static void main(String[] args) {
	  // 下記9個をローカル変数として宣言のみしてください			
	  // バイト型
	  byte b;
	  // 短整数型
	  short s;
	  // 整数型
	  int i;
	  // 長整数型		
	  long l;
	  // 単精度浮動小数点数型
	  float f;
	  // 倍精度浮動小数点数型	
	  double d;
	  // 文字型　
	  char c;
	  // 文字列型		
	  String str;
	  // ブーリアン型	
	  boolean boo; 
	  
	  // それぞれのローカル変数をローカル内でそれぞれの初期値を代入し初期化してください
	  b = 0;
	  s = 0;
	  i = 0;
	  l = 0L;
	  f = 0.0f;
	  d = 0.0d;
	  c = '\u0000';
	  str = null;
	  boo = false;
	  
	  // 初期化をしたそれぞれの変数に下記の値を代入してください
	  // ・バイト型 10
	  b = 10;
	  // ・短整数型 100  
	  s = 100;
	  // ・整数型 1000
	  i = 1000;
	  // ・長整数型 10000
	  l = 10000;
	  // ・単精度浮動小数点数型 9.5
	  f = 9.5f;
	  // ・倍精度浮動小数点数型 10.5
	  d = 10.5d;
	  // ・文字型 a
	  c = 'a';
	  // ・文字列型 ハロー
	  str = "ハロー";
	  // ・ブーリアン型 true
	  boo = true; 
	  
	  // 下記の通りにコンソール出力されるようにしてください  
	  // 上記で作成した変数を必ず使用すること
	  // 11110 11110
	  int num;
	  num = (int)(b + s + i + l); 
	  System.out.println(num);
  
	  // 20 20
	  num = (int) (b * 2); 
	  System.out.println(num);
	  
	  // a ハロー true a ハロー true
      System.out.println(c + str + boo);
	  
	  // 11130 11130 数字を全て足す
	  num = (int) (b + s + i + l + f + d); 
	  System.out.println(num);
	  
	  // 10000000000  10000000000 小数点以外の数字を全てかける
	  long longB = (long)b;
      long longS = (long)s;
      long longI = (long)i;
      long longX;
      
      longX = (longB * longS * longI * l); 
      System.out.println(longX);
	
	  // 0.105 0.105  10.5割る100をする
	  String s1 = "100";
	  String d1 = "10.5";
	  int num2 = Integer.parseInt(s1);
	  double db = Double.parseDouble(d1);
	  System.out.println(db / num2);
	  
	  // -90 -90 10引く100をする
	  num = (int) (b - s);
	  System.out.println(num + "\n");
	  
	  // 問5
	  // 次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
	  //「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。
	  // String num="20"; 　int num1=23; 　System.out.println("ハローJAVA"+(num+num1));
	  num = 20;
	  num += 23;
	  System.out.println("ハローJAVA" + num + "\n");
	
	  // 問6
	  //『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください
	  // ローカル変数に代入し○○に入れてください
	  // 『山田太郎 18歳 170.5cm 62.2kg 寿司』
	  // ↓↓format↓↓
	  String name = "山田太郎";
	  int age = 18;
	  double height =  170.5;
	  double weight =  62.2;
	  String food = "寿司";

	  // 「初めまして○○です」
	  System.out.println("初めまして" + name + "です");
	  // 「年齢は○○歳です」
	  System.out.println("年齢は" + age + "歳です");
	  // 「身長は○○cmです」
	  System.out.println("身長は" + height + "cmです");
	  // 「体重は○○kgです」
	  System.out.println("体重は" + weight + "kgです");
	  // 「好きな食べ物は○○です」
	  System.out.println("好きな食べ物は" + food + "です" + "\n");
	  
	  // 問7
	  // 6で作成した自己紹介に続いてBMIが出力されるようにしてください
	  //「BMIは○○です」
	  // ただし計算は数値を直書きせず、全て変数を使ってすること
	  // 変数bmiに、bmiメソッドを用いてBMIを代入してください
      double bmi = weight / ((height / s) * (height / s));
	    
	  // 変数bmiを用いて、「BMIは◯◯です」と出力してください
      System.out.println(String.format("BMIは%.1fです" + "\n" ,bmi));
      
      // 問8
      // 6で宣言した変数に再代入し下記の通りコンソールに出力してください" 
      name = "鈴木一郎";
 	  age = 24; 
      height = 168.5;        
      weight = 64.2;        
 	  food = "オムライス";
 	  bmi = 22.6;
      
      // 初めまして鈴木一郎です
	  System.out.println("初めまして" + name + "です");
	  // 年齢は24歳です
	  System.out.println("年齢は" + age + "歳です");
	  // 身長168.5cmです
	  System.out.println("身長" + height + "cmです");
	  // 体重は64.2kgです
	  System.out.println("体重は" + weight + "kgです");
	  // 好きな食べ物はオムライスです
	  System.out.println("好きな食べ物は" + food + "です");
	  // BMIは22.6です     
	  System.out.println("BMIは" + bmi + "です" + "\n");
	  
      // 問9
      // 8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、下記の通りコンソールに出力してください
	  age = age + 24; 
	  height = height + 168.5;
	  weight = weight + 64.2;
      bmi = bmi - 11.29;
      // 初めまして鈴木一郎です
	  System.out.println("初めまして" + name + "です");
      // 年齢は48歳です
	  System.out.println("年齢は" + age + "歳です");
      // 身長337.0cmです
      System.out.println("身長" + height + "cmです");
	  // 体重は128.4kgです
      System.out.println("体重は" + weight + "kgです");
	  // 好きな食べ物はオムライスです
	  // BMIは11.31です  
	  System.out.println("BMIは" + bmi + "です" + "\n");
	
	  // 問10
      // 8で使用した年齢が25歳以上ならtrueが出力されるようにしてください。ただしif文は使いません 
	  age = 24; 
	  height = 168.5;
	  weight = 64.2;
      bmi = 22.6;
	  boolean booleanA = age >= 25;
	  System.out.println(booleanA + "\n");	  

	  // 問11
      // 8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力してください
	  String strAge = String.valueOf(age);
	  String strHeight = String.valueOf(height);
	  String strWeight = String.valueOf(weight);
      System.out.println( strAge +  strHeight +  strWeight + "\n");
      
      // 問12
      // 11で変換した【年齢・身長】を整数型に変換して出力してください
      short shAge = Short.parseShort(strAge);
      System.out.println(shAge); 
      double douHeight = Double.parseDouble(strHeight);
      short shHeight = (short)douHeight;
      System.out.println(shHeight + "\n"); 
      
      // 問13
      // 12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力してください
      // ただしif文は使わないでください 
	  boolean booleanB = (shAge ==  25 || shHeight >= 160);
	  System.out.println(booleanB);	  
	}
      
}