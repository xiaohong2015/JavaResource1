package Time;

/* 题目要求：
 * 设计一个表示时间的Time类，类中包含整型变量hour,minute,second,定义两个构造方法（分别用整型时、分、秒和String“时：
 * 分：秒”做参数）、分别获取时分秒的方法。并将Time类打包到Time包下。编写应用程序引入Time包中的Time类，并测试Time类。
 * 
 * 题目分析
 * 打包采用package Time语句，引入包采用import Tim.Time语句
 */

public class Time {
	int hour,minute,second;
	public void setTime(int h,int m,int s){
		hour = (h<0)?0:h%24;
		minute  = (h<0)?0:h%60;
		second  = (h<0)?0:h%60;
	}
	
	
	public void setTime(String time){
		hour = Integer.parseInt(time.substring(0,2));
		hour = hour<0?0:hour%24;
		minute = Integer.parseInt(time.substring(3,5));
		minute = minute<0?0:minute%60;
		second = Integer.parseInt(time.substring(6,8));
		second = second<0?0:second%60;	
	}
	
	public int getHour(){
		return hour;
	}
	
	public int getMinute(){
		return minute;
	}
	
	public int getSecond(){
		return second;
	}

}