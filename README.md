### 乐纳科技随时保项目PopWindow归纳便于以后所使用
### Usage

1. Add it in your root build.gradle ：
 ```java

 allprojects {
     epositories {
         ...
         maven {
             url 'https://jitpack.io'

         }

 }
 ```

2. Add the dependency
```java
dependencies {
	compile 'com.github.pinguo-zhouwei:CustomPopwindow:2.1.1'
}
```

3. 简便写法
```java
lPopWindow = new LPopWindow.Builder(MainActivity.this)
                        .setView(contentView)
                        .enableBackgroundDark(true) //弹出popWindow时，背景是否变暗
                        .setBgDarkAlpha(0.7f) // 控制亮度
                        .build()
                        .showAsDropDown(textView, 0, 20);
```