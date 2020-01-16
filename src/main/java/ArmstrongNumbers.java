class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {
		String num = Integer.toString(numberToCheck);
		int n = num.length();
		int sum=0;
		for(int i=0; i<n; i++){
			sum += Math.pow(num.charAt(i)-48, n);
		}
		if(sum == numberToCheck)
			return true;
		return false;
		//qwerty
	}

}
