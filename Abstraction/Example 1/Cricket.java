class Cricket extends Sports
{
	void howToPlay()
	{
		System.out.println("Cricket can be played between two teams using bat and ball");
	}
	
	void checkingWinner()
	{
		System.out.println("If team1 chases the given target or defends the target then team1 is the winner");
		System.out.println("If team2 chases the given target or defends the target then team2 is the winner");
	}
	
	void drawSituation()
	{
		System.out.println("If both teams levels the score then it will be declared as draw");
		System.out.println("In Draw situation winner will decided on the basis of Super Over");
	}
}