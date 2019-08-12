class ArmstrongNumbers {

    boolean isArmstrongNumber( int numberToCheck ) {
        int lengthOfDigit = String.valueOf( numberToCheck ).length();
        int calculation = 0;

        for ( char x: Integer.toString( numberToCheck ).toCharArray() ) {
            calculation += ( Math.pow( Character.getNumericValue( x ), lengthOfDigit ) );
        }

        return calculation == numberToCheck;
    }
}
