class ReverseInteger007 {
    public int reverse(int x) {
        int reverseInt = 0;

    while (x != 0){
    	int temp = reverseInt * 10 + x % 10;
    	x = x / 10;
    	if (temp /10 != reverseInt){
    		reverseInt = 0;
    		break;
    	}
    	reverseInt = temp;
    }

    if (reverseInt < Integer.MIN_VALUE || reverseInt > Integer.MAX_VALUE){
        	reverseInt = 0;
    }
    return reverseInt;
    }
}