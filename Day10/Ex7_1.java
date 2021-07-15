class SutdaDeck{
	final int CARD_NUM=20;
	SutdaCard[] cards=new SutdaCard[CARD_NUM];
	int num;
	boolean isKwang;
	SutdaDeck() {
		for(int i=0; i<cards.length;i++) {
			//int num = i%10+1;
			//boolean isKwang = (i < 10)&&(num==1||num==3||num==8);
			//cards[i] = new SutdaCard(num,isKwang);
			if(i<10) {
				num=i+1;	
				isKwang=false;
				if(num==1||num==3||num==8) {
					isKwang=true;
				}					
			}
			if(i>=10) {num=(i%10)+1;}
			cards[i]=new SutdaCard(num,isKwang);
		}
	}
	
	void shuffle() {
		for(int i=0;i<cards.length;i++) {
		int random=(int)(Math.random()*20);
		SutdaCard temp=new SutdaCard();
		temp=cards[i];
		cards[i]=cards[random];
		cards[random]=temp;
		}
	}
}

class SutdaCard{
	int num;
	boolean isKwang;
	
	SutdaCard(){
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang){
		this.num=num;
		this.isKwang=isKwang;
	}

	@Override
	public String toString() {
		return num+(isKwang ? "K" : "");
	}
	
	
}
public class Ex7_1 {
	public static void main(String[] args) {
		SutdaDeck deck=new SutdaDeck();
		
		for(int i=0; i<deck.cards.length;i++) {
			System.out.print(deck.cards[i]+",");
		}
		System.out.println("");
		deck.shuffle();
		for(int i=0; i<deck.cards.length;i++) {
			System.out.print(deck.cards[i]+",");
		}
	}

}
