package PowerSimulator;


import javax.swing.JButton;


public class KButton extends JButton {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int Num;
	
	public KButton(String a) {
		this.setText(a);
	}
	
	public void setNum(int a) {
		Num = a;
	}
	
	public int getNum() {
		return Num;
	}
}
