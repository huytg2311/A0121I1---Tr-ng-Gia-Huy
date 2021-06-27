package exceptions;

public class BirthdayException extends Exception{

    public BirthdayException() {
        super("Birthday > 1990, less than current year is 18 year and format: dd/mm/yyyy.");
    }
}
