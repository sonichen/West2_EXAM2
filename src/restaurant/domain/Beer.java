package restaurant.domain;

import java.time.LocalDate;

public class Beer extends Drinks{
	private float alcoholContent;//�ƾ�����
	

	public Beer() {
		super();
	}
	public Beer(String drinkName, double cost, LocalDate dateInProduced,float alcoholContent) {
		super(drinkName, cost, dateInProduced, 30);//������30��
		this.alcoholContent=alcoholContent;
	}


	//��ȡ�ƾ�����
	public float getAlcoholContent() {
		return alcoholContent;
	}

	
	@Override
	public String toString() {
		
		String detalis="[���ࣺ"+drinkName+"\t��Ǯ��"+cost+"]";
		return detalis;

	}

	


	

}
