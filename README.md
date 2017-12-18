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
	compile 'com.github.gmgw0909:LPopWindow:2.0.0'
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

### LPopWindow Builder类说明
```java
size(10, 100)                                     //设置大小（宽，高）ps：基本不用设置大小 布局view里面提前设置好
setView(R.layout.pop_layout1)                     //填充布局view ps：可以是resLayoutId or view
setFocusable(true)                                //设置pop是否需要获取焦点 ps：此方法可不调用
setOutsideTouchable(true)                         //设置pop外部是否可以触摸 ps：此方法可不调用
setAnimationStyle(R.style.CustomPopWindowStyle)   //设置弹窗动画
setOnDismissListener(dismissListener)             //设置pop的dismiss监听器
enableBackgroundDark(true)                        //设置弹框背景是否可以变暗 ps：默认为false 不变暗
setBgDarkAlpha(0.7f)                              //设置背景变暗的值 ps:如果设置的值在0 - 1的范围内可用，否则用默认值
enableOutsideTouchableDismiss(false)              //设置是否允许点击 pop之外的地方，关闭pop ps：默认为true 可以关闭
build()                                           //完成构建
showAsDropDown(mButton6, 0, 10);                  //弹出PopupWindow
```