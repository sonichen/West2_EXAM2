package restaurant.service;
/**
 * ��֭��ơ������
 * @author 
 *
 */
public class IngredientSortOutException extends RuntimeException{

	static final long serialVersionUID=-152674832929414L;
	
	public IngredientSortOutException() {
		
	}
	public IngredientSortOutException(String msg) {
		super(msg);
	}
}
