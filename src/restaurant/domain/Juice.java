package restaurant.domain;

import java.time.LocalDate;
import java.util.Date;

public class Juice extends Drinks {

	public Juice() {
		super();

	}

	public Juice(String drinkName, double cost, LocalDate dateInProduced) {
		super(drinkName, cost, dateInProduced, 2);//������2��
	}

	@Override
	public String toString() {
		return "[��֭��" + drinkName + "\t��Ǯ��" + cost + "]";
	}

}
