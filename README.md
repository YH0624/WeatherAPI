# 天気予報アプリ
  WeatherAPI_MainScreen <br>
  <img src="https://github.com/YH0624/WeatherAPI/blob/master/MainScreen.jpg">
  
  WeatherAPI_Result <br>
  <img src="https://github.com/YH0624/WeatherAPI/blob/master/result.jpg">
  
## 開発環境<br>
 Android Studio Ver 3.6.1
 
## プログラム言語<br>
   JAVA
   
## 概要<br>
   天気表示ボタンを押すと、本日の天気情報と天気画像を表示<br>
   Weather HacksのAPIを使用
   http://weather.livedoor.com/weather_hacks/

## 使い方<br>
   天気を表示ボタンを押す<br>
   本日の天気情報と天気画像を表示<br>

## 注力したソースコード<br>
   MainActivity.java(changeTextView function参照)<br>
   AsyncHttpRequest.java(class AsyncHttpRequest extends AsyncTask<URL, Void, String>参照)

## 実際に書いたコード
   MainActivity.java<br>
   https://github.com/YH0624/WeatherAPI/blob/master/Weather/Weather/app/src/main/java/com/example/weather/MainActivity.java
   
   AsyncHttpRequest.java<br>
   https://github.com/YH0624/WeatherAPI/blob/master/Weather/Weather/app/src/main/java/com/example/weather/AsyncHttpRequest.java
   
   activity_main.xml<br>
   https://github.com/YH0624/WeatherAPI/blob/master/Weather/Weather/app/src/main/res/layout/activity_main.xml
   
   network_security_config.xml<br>
   https://github.com/YH0624/WeatherAPI/blob/master/Weather/Weather/app/src/main/res/xml/network_security_config.xml
  
   AndroidManifest.xml<br>
   https://github.com/YH0624/WeatherAPI/blob/master/Weather/Weather/app/src/main/AndroidManifest.xml


