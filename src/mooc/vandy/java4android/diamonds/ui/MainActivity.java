package mooc.vandy.java4android.diamonds.ui;

import mooc.vandy.java4android.diamonds.logic.Logic;
import mooc.vandy.java4android.diamonds.logic.LogicInterface;

public class MainActivity implements OutputInterface {
	String mOutput = "";
	private LogicInterface mLogic;
	
	public MainActivity(int size) {
		mLogic = new Logic(this);
		mLogic.process(size);
		System.out.print(getString());
	}
	
    /**
     * Add @a string to the EditText.
     */
    private void addToEditText(String string) {
        mOutput = "" + mOutput + string;
    }

    /**
     * Return the string.
     */
    @Override
    public String getString() {
        return mOutput;
    }

    /**
     * This prints to the output a string
     * @param text
     */
    @Override
    public void print(String text) {
        addToEditText(text);
    }

    /**
     * This prints to the output a char
     * @param _char
     */
    @Override
    public void print(char _char) {
        print("" + _char);
    }

    /**
     * This prints to the screen a string then a new line
     * @param text
     */
    @Override
    public void println(String text) {
        addToEditText(text + "\n");
    }

    /**
     * This prints to the screen a char then a new line
     * @param _char
     */
    @Override
    public void println(char _char) {
        println("" + _char);
    }

    /**
     * Reset the on-screen output (EditText box)
     */
    @Override
    public void resetText() {
        mOutput = "";
    }

    /**
     * Log @a something.
     */
    @Override
    public void log(String logtext) {

    }

}
