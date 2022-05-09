package Study;

public class sIte_manage {
 public  static void main(String[] args) {

System.out.println("本日の天気予報♪");
 int weather = 100;
 if(weather < 49 && weather > 100) {
	  System.out.println("晴れです。");
 }else if(weather < 48 && weather > 11){
	  System.out.println("雨でしょう。");
	  System.out.println("傘を忘れずに!!");
 }else if(weather >10){
      System.out.println("大気が大変不安定です、外出は控えましょう");
 }else{
	  System.out.println("");
    } 
  }
}