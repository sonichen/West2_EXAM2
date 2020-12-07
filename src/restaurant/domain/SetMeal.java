package restaurant.domain;

public class SetMeal {

	private String mealName;//�ײ���
	private double mealPrice;//�ײͼ۸�
	private String chickenName;//ը����
	private Drinks type;//��������

	public SetMeal() {
		super();
	}

	public SetMeal(String mealName, double mealPrice, String chickenName, Drinks type) {
		super();
		this.mealName = mealName;
		this.mealPrice = mealPrice;
		this.chickenName = chickenName;
		this.type = type;
	}
	
	public String getMealName() {
		return mealName;
	}


	public double getMealPrice() {
		return mealPrice;
	}


	public String getChickenName() {
		return chickenName;
	}


	public Drinks getType() {
		return type;
	}


	@Override
	public String toString() {
		String details = "-------�ײ���Ϣ-------";
		details += "\n�ײ�����" + mealName+"\t";
		details += "�ײͼ۸�" + mealPrice+"Ԫ\t";
		details += "ը������" + chickenName+"\t";
		details += "���ϣ�" + type;
		return details;
	}

	
}
