package com.javalec.ex;

public class Dongjoon {

	private String Name;
	private String msg1;
	private String msg2;
	private int tall ;
	private int Age;
	private int StudentNum;
	private int BusNum;
	
	public Dongjoon(int Age, int StudentNum, int BusNum){
		this.Age = Age;
		this.StudentNum = StudentNum;
		this.BusNum = BusNum;
	}
	
	public int getBusNum(){
		return BusNum;
	}
	public int getAge(){
		return Age;
	}
	public int getStudentNum(){
		return StudentNum;
	}
	
	public void setName(String name){
		this.Name = name;
	}
	public String getName(){
		return Name;
	}
	
	public void setMsg1(String msg1){
		this.msg1 = msg1;
	}
	
	public String getMsg1(){
		return msg1;
	}
	
	public void setMsg2(String msg2){
		this.msg2 = msg2;
	}
	
	public String getMsg2(){
		return msg2;
	}
	
	public void setTall(int tall){
		this.tall = tall;
	}
	
	public int getTall(){
		return tall;
	}
	
}
