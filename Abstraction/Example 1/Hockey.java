class Hockey extends Sports
{
	void howToPlay()
	{
		System.out.println("Hockey can be played between two teams using hockey stick and a ball");
	}
	
	void checkingWinner()
	{
		System.out.println("The teams with highest goal will be declared as Winner");
	}
	
	void drawSituation()
	{
		System.out.println("If both teams scores the same amount of goal then it will be declared as draw");
		System.out.println("In Draw situation winner will decided on the basis of Penalty shoot-out");
	}
	
	public static void main(String[] args)
	{
		Cricket c = new Cricket();
		Football f = new Football();
		Hockey h = new Hockey();
		
		System.out.println("----------------Cricket Game----------------");
		c.howToPlay();
		c.checkingWinner();
		c.drawSituation();
		
		System.out.println();
		
		System.out.println("----------------Football Game----------------");
		f.howToPlay();
		f.checkingWinner();
		f.drawSituation();
		
		System.out.println();
		
		System.out.println("----------------Hockey Game----------------");
		h.howToPlay();
		h.checkingWinner();
		h.drawSituation();
		
	}
}
