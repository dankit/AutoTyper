import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;


public class AutoTyper {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		Robot autoTyper = new Robot();
		int counter = 0;
		String startingCode = "19995000999999"; //entity we are printing out
		
		autoTyper.delay(10000); //10 second delay before it starts typing
		
		
		int X = 1000;
		while(counter <= X){ //prints it X times
			Thread.sleep(50); //slight delay between prints so autoTyper doesn't fumble over itself
		for(char a:startingCode.toCharArray()){ //prints each individual letter one by one
			autoTyper.keyPress(a);
			autoTyper.keyRelease(a);
		}
		counter++;
		startingCode = String.valueOf(Long.valueOf(startingCode) + 1); 
		//if its a non-static entity you're printing, adjust it here ^^, else comment it out
		autoTyper.keyPress(KeyEvent.VK_ENTER);
		autoTyper.keyRelease(KeyEvent.VK_ENTER);
		}
		//This program can easily be adjusted to take in user input if needed
	}
	

}
