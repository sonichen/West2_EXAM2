package restaurant.service;
/**
 * �������ó���ӵ�����
 * @author 
 *
 */
public class OverdraftBalanceException extends RuntimeException{

	static final long serialVersionUID=-1526748329876444L;
	
	public OverdraftBalanceException() {
	
	}
	public OverdraftBalanceException(String msg) {
		super(msg);
	}
}