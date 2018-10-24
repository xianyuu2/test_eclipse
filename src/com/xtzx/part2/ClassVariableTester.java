package com.xtzx.part2;

public abstract class ClassVariableTester 
{
	public static void main(String[] args) 
	{
		Circle x = new Circle();
		System.out.println(x.PI);
		System.out.println(Circle.PI);
		Circle.PI= 3.14;
		//访问类变量:<类名|实例对象名>.<类变量名>效果一样
		System.out.println(x.PI);
		System.out.println(Circle.PI);
	}
	
	
	//方法成员
	//语法形式
	/*[public|protected|private][static][final][abstract][native][synchronized] 
	    返回类型 方法名([参数列表])[throws exceptionList] 
	  {
		方法体
	  }*/
	//必须有 返回类型 方法名 
	//[public|protected|private] 访问控制
	//[static] 类方法(静态方法)
	//final终结方法
	//abstract抽象方法
	//native用于集成java代码和其他语言的代码
	//synchronized	多并发线程控制共享数据访问
	//返回类型
			//方法的返回值类型,可是任意类型的java数据类型
			//不需要返回值时,返回void
	//参数类型
			//简单数据类型,引用类型(数组,类,接口)
			//可以有多个,也可以没有参数,方法声明时的参数称为形式参数
	//方法体
			//方法的实现
			//包含局部变量的声明以及所有合法的java语句
			//局部变量的作用域只在该方法内部
	//throws exceptionList
			//抛出异常
	
	
	
	//实例方法
	//表示特定对象的行为
	//定义时不加static
	//调用语法
			//<对象名>.<方法名>([参数列表])	 类内部可以直接调用 方法名
	//参数传递
			//值传递:当参数类型为基本数据类型时,用实参初始化形参,一次性的单项传递,实参和形参之后再无联系
			//引用传递:参数类型为对象类型或数组时,本质上就是引用,别名,实参形参实际上指向同一个对象
	
	
	//类方法 static 静态方法 ,不能被声明为抽象方法
	//调用:可以直接不声明实例对象直接用类名调用,也可以通过类的实例对象去调用
	//适用于:除了传入参数和一些常量,功能不依赖具体的类实例的属性值,就可以声明为类方法
	
	
	
	//可变长参数--参数个数不确定
	//使用省略号表示,其实质是数组 String... s 表示String[]  s;
	//这样传入的参数就可以是0个或自定义个数
	
	
	
	
	
	
	
	
}
