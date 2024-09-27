public class Date{
	int day;
	int month;
	int year;
	
	public Date(int day,int month,int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public void setDay(int day){
		this.day = day;
	}
	public int getDay(){
		return day;
	}
	public void setMonth(int month){
		this.month = month;
	}
	public int getMonth(){
		return month;
	}
	public void setYear(int year){
		this.day = year;
	}
	public int getYear(){
		return year;
	}
	@Override
	public String toString(){
		return String.format("Date :%02d-%02d-%04d",day,month,year);
	}
}