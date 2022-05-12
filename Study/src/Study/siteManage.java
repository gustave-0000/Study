package Study;

public class siteManage {

	 public  static void main(String[] args) {

		 System.out.println("本日の天気予報♪");
		 
		  int weather = 100;
		  
		  
		  //100< 49 && 100 > 100 
		  //日本語に訳すとweather:100が49より大きい時　かつ　weather:100が100より大きい時だから両方の条件を満たすことはないので　晴れですに入らない
		  if(weather < 49 && weather > 100) {
		 	  System.out.println("晴れです。");
		 	  
		  // 100 < 48 && 100 >11 これですね。条件が一致することがないので雨も表示されません。
		  }else if(weather < 48 && weather > 11){
		 	  System.out.println("雨でしょう。");
		 	  System.out.println("傘を忘れずに!!");
		  
		  // 100 > 10 　11以上は常にここに入ります。
		  }else if(weather >10){
		       System.out.println("大気が大変不安定です、外出は控えましょう");
		  
		  }else{
		 	  System.out.println("エラー");
		  };
		  
		  
		  
		  System.out.println("-----平城修正-----");
		  //こんな感じかな？？
		  //雨の確立
		  int sunPersent = 100;
		  
		  
		  // 晴れの確立が50％以上　かつ　100以下の場合「晴れを表示」
		  if( sunPersent >= 50 && sunPersent <= 100 ) {
			  System.out.println("晴れです");
		  //晴れの確立が11%以上　かつ　48以下の時
		  }else if (sunPersent >= 11 && sunPersent <= 49) {
			  System.out.println("あめでしょう。傘を忘れずに");
		  //10以下は大気不安定
		  }else if(sunPersent <= 10){
			  System.out.println("大気が不安定です。外出は控えましょう");
		  }else {
			  System.out.println("エラー");
		  }
		  
		  
		  //条件式をもう一回復習しよう！
		  		  
	 }
}
