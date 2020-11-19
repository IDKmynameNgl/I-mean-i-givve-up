public static boolean loanDecisions (){
		
		boolean flag = false;
		
		File Apps = new File("MortgageApplications.csv");
		try{
		Scanner in = new Scanner (Apps);
		String[][] applacations = new String [37][7];
		 int rowCounter = 0;
            while(in.hasNext()){
                String row = in.nextLine();
                System.out.println(row);
                String[] tokens = row.split(",");
                applacations[rowCounter] = tokens;
                rowCounter ++;
				// This is going to read each line in each row stroing it with that value then going to the next
		String firstName = "";
		for(int i=1; i< applacations.length; i++) {
				 firstName = applacations[i][0];
		}
		String lastName = "";
		for(int i=1; i< applacations.length; i++){
				lastName =  applacations[i][1];
		}
		int annualIncome = 0;
		for(int i=1; i< applacations.length; i++) {
				 annualIncome = Integer.parseInt(applacations[i][2]);
		}
		int totalSavings = 0;
		for(int i=1; i< applacations.length; i++) {
				 totalSavings = Integer.parseInt(applacations[i][3]);
		}
		double creditScore = 0.00;
		for(int i=1; i< applacations.length; i++) {
				 creditScore = Double.parseDouble(applacations[i][4]);
		}
		int numMonth = 0;
		for(int i=1; i< applacations.length; i++) {
				 numMonth = Integer.parseInt(applacations[i][5]);
		}
		int homeValue = 0;
		for(int i=1; i< applacations.length; i++) {
				 homeValue = Integer.parseInt(applacations[i][6]);
		}
		isLoanapproved(annualIncome, totalSavings, creditScore, numMonth, homeValue);
		}
		}catch (IOException e) {
           e.printStackTrace();
		}
		return flag; 
	}