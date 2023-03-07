package practical13;

public class Player {
	private int choiseInt;
	private String choiseStr;
	public void setPlayer(int choise) {
		this.choiseInt=choise;
		if(choise==0) {
			this.choiseStr="Big";
		}else if(choise==1) {
			this.choiseStr="Small";
		}
	}
	public int getInt() {
		return this.choiseInt;
	}
	public String getStr() {
		return this.choiseStr;
	}
}
