package chess;

public class CheckInput {
	public static boolean checkCoordinateValidity(String input){
		return input.matches("^[1-8][a-h]$");
	}
}
