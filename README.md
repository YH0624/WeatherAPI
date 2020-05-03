# 天気予報アプリ
  WeatherAPI_MainScreen <br>
  <img src="https://https://github.com/YH0624/WeatherAPI/blob/master/MainScreen.jpg" 
  >
## 開発環境<br>
 Android Studio Ver 3.6.1
 
## プログラム言語<br>
   JAVA
   
## 概要<br>
   天気表示ボタンを押すと、本日の天気情報と天気画像が表示される。
   Weather HacksのAPIを使用
   http://weather.livedoor.com/weather_hacks/

## 使い方<br>
   天気を表示ボタンを押す。
   本日の天気情報と天気画像が表示される。

## 注力したソースコード<br>
   MainActivity.java(changeTextView function参照)
   AsyncHttpRequest.java(class AsyncHttpRequest extends AsyncTask<URL, Void, String>参照)

## 実際に書いたコード
   MainActivity.java
   https://github.com/YH0624/WeatherAPI/blob/master/Weather/Weather/app/src/main/java/com/example/weather/MainActivity.java
   
   AsyncHttpRequest.java
   https://github.com/YH0624/WeatherAPI/blob/master/Weather/Weather/app/src/main/java/com/example/weather/AsyncHttpRequest.java
   
   activity_main.xml
   https://github.com/YH0624/WeatherAPI/blob/master/Weather/Weather/app/src/main/res/layout/activity_main.xml
   
   network_security_config.xml
   https://github.com/YH0624/WeatherAPI/blob/master/Weather/Weather/app/src/main/res/xml/network_security_config.xml
  
  AndroidManifest.xml
   https://github.com/YH0624/WeatherAPI/blob/master/Weather/Weather/app/src/main/AndroidManifest.xml


