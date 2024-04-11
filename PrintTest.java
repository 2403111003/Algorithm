package NOop12;
class printer {
	private int num0fPapers;
	private boolean duplex;
	printer(int num0fPapers){
		this.num0fPapers = num0fPapers;
	}
	void print(int amount) {
		if(num0fPapers == 0)System.out.println("용지가 없습니다.");
		else if(num0fPapers >= amount) {
			this.num0fPapers -= amount;
			System.out.println(amount+"장 출력 했습니다. 현재"+num0fPapers+"장 남아 있습니다.");
		}else {
			System.out.println("모두 출력 하려면 용지가 "+(amount - num0fPapers)+"매 부족 합니다."
					+num0fPapers+"장만 출력합니다.");
			this.num0fPapers = 0;
		}
	}
	
}
public class PrintTest {
	public static void main(String[] agrs) {
		printer P = new printer(10);
		P.print(2);
		P.print(20);
		P.print(10);
	}
}
	