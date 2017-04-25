package oo.mid;

public class Meal {
	String meal;
	String attached;
	String drink;
	int mp;
	int ap;
	int dp;
	int sum = mp + ap + dp;
	public Meal (String meal, int mp, String attached, int ap, String drink,int dp){
		this.meal = meal;
		this.mp = mp;
		this.attached = attached;
		this.ap = ap;
		this.drink = drink;
		this.dp = dp;
	}
	
	public void setSum(int s){
		sum = s;
	}
	
	public int addSum(int s){
		return sum = sum + s;
	}

}
