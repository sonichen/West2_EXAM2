package restaurant.domain;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public abstract class Drinks {
	
//	�������
	protected String drinkName;//����
	protected double cost;//�ɱ�
	protected LocalDate dateInProduced;//��������
	protected int shelfLife;//������
	
//	��ȡ���ϵ�����
	public String getDrinkName() {
		return drinkName;
	}

	public Drinks() {
		super();
	}
	
	/**
	 * ȫ�ι�����
	 * 
	 * @param drinkName      ����
	 * @param cost           �ɱ�
	 * @param dateInProduced ��������
	 * @param expirationDate ������
	 */
	public Drinks(String drinkName, double cost, LocalDate dateInProduced, int shelfLife) {
		super();
		this.drinkName = drinkName;
		this.cost = cost;
		this.dateInProduced = dateInProduced;
		this.shelfLife = shelfLife;
	}

	/**
	 * �����toString����
	 */
	public abstract String toString();
	

	/**
	 * 
	 * �ж��Ƿ����
	 * @return
	 */
	public boolean checkIfOverDue() {
		DateTimeFormatter format=DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate start=LocalDate.parse(dateInProduced+"",format);
		LocalDate end=LocalDate.parse(LocalDate.now()+"",format);
		long time=start.until(end, ChronoUnit.DAYS);
		//����
		if(time>shelfLife) {
			return true;
		}
		return false;
		
	}

}
