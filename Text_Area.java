// a textarea which will show whatever you have written in the textfield

import java.awt.*;
import java.awt.event.*;

public class Text_Area extends Frame implements KeyListener , WindowListener{
	
	private Label lbl;
	private TextField txtInput;
	private TextArea txtArea;
	
	//constructor
	
	public Text_Area(){
		
		setLayout(new FlowLayout());
		
		lbl = new Label("Enter Text: ");
		add(lbl);
		
		txtInput = new TextField(10);
		add(txtInput);
		
		txtArea = new TextArea(5,45);
		add(txtArea);
		
		addWindowListener(this);
		txtInput.addKeyListener(this);
		//a key event is fired from this, when any letter is typed a key method will be executed
		
		setTitle("Text Area");
		setSize(400,300);
		setVisible(true);
	
	}//end constructor
	
	//-----------------------------------------------------------------------------------------------
	
	public static void main(String args[]){
		
		Text_Area app = new Text_Area();		
		
		
	}
	//end main
	
	@Override
	public void keyTyped(KeyEvent ka){
		txtArea.append("\n-> "+ ka.getKeyChar()+" ");
		txtInput.setText("");
		
	}
	
	@Override
	public void keyPressed(KeyEvent ka){}
	
	@Override
	public void keyReleased(KeyEvent ka){}
	
	//------------------------------------------------------------------------------------------
	
	// window methods
	
	@Override
	public void windowClosing(WindowEvent we){
		System.exit(0);
	}
	//we have to add the other abstract methods also but they should be left empty so that there would be no CTE
	
	@Override
	public void windowOpened(WindowEvent we){}
	
	@Override
	public void windowClosed(WindowEvent we){}
	
	@Override
	public void windowActivated(WindowEvent we){}
	
	@Override
	public void windowDeactivated(WindowEvent we){}
	
	@Override
	public void windowIconified(WindowEvent we){}
	
	@Override
	public void windowDeiconified(WindowEvent we){}
	
	
}//end class
