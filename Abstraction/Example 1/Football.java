class Football extends Sports
{
	void howToPlay()
	{
		System.out.println("Football can be played between two teams using only ball");
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
}