public class PreCourseQ1 {

	public static void main(String[] args) {
		 // There are 11 boys and 16 girls in a class with one teacher and a
		 //teacher’s assistant. What percent of the students are girls? What 
		 //is the student-teacher ratio? 
		int boys = 11;
		int girls = 16;
		int teacher = 1;
		int teacherAssistant = 1;
		double totalStudents = boys + girls;
		double totalTeachers = teacher + teacherAssistant;
		double percentage = girls/totalStudents*100;
		double teacherRatio = totalStudents/totalTeachers;
		System.out.println(""+ percentage +"% of students are girls");
		System.out.println("The student-teacher ratio is "+ teacherRatio +"");
		
		//done
	 	
		//You are feeling lucky with a stock and want to go all in! You have 
		//$25,000 in savings and want to invest all your money to buy a stock, 
		//and the remaining money in a CD account. The stock price is $989 per 
		//share. How many shares of this stock can you buy, and how much money 
		//will be left for the CD account
		int savings = 25000;
		int stockPrice = 989;
		int totalStock = savings/stockPrice;
		int remainder = savings-totalStock*stockPrice;
		
		System.out.println("buy "+ totalStock +" shares of stock" );
		System.out.println("invest "+ remainder +" in CD account" );
		// done
		
		//in 2016, Kenyan runner Eliud Kipchoge won the Olympic gold medal in 
		//the men’s 26.2-mile marathon race. The official timer tracked his 
		//race at 7724 seconds. What is his time in hours, minutes, and 
		//seconds?
		int secondsIn = 7724;
		int hours = secondsIn / 3600;
		int minutes = secondsIn%3600/60;
		int seconds = secondsIn % 3600 % 60;
		System.out.println(""+hours+"hrs:"+minutes+"mins:"+seconds+"secs");
		//done
		System.out.println("Average pace: 4.885 minutes per mile");
		//bonus :0
 
	}

}
