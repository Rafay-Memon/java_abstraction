class Informal extends Outfit
{
	void howToDressed()
	{
		System.out.println("Wear smart slacks or dark coloured jeans, tailored jeans are often best for informal meetings.");
	}
	
	public static void main(String[] args)
	{
		Formal f = new Formal();
		Informal i = new Informal();
		
		System.out.println("-------------Dress Code For Formal Meeting--------------");
		f.howToDressed();
		
		System.out.println();
		
		System.out.println("-------------Dress Code For Informal Meeting--------------");
		i.howToDressed();
	
	}
}