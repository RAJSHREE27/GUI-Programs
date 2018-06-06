// to convert the given character into its ASCII code

import java.awt.*;
import java.awt.event.*;

public class ASCIIconverter extends Frame implements ActionListener, WindowListener{
	
	private Label character;
	private Label code;
	private TextField txtInput;
	private TextField txtOutput;
	private Button btn;
	int result = -1;
	
	public ASCIIconverter(){
		
		setLayout(new FlowLayout());
		
		character = new Label("Character : ");
		add(character);
		
		txtInput = new TextField(5);
		txtInput.setEditable(true);
		add(txtInput);
		
		code = new Label("code : ");
		add(code);
		
		
		txtOutput = new TextField(5);
		txtOutput.setEditable(false);
		add(txtOutput);
		
		btn = new Button("Result");
		add(btn);
		btn.addActionListener(this);
		addWindowListener(this);		//fire the windowEvent on 'this' listner object
		
		setTitle("ASCII Converter");
		setSize(400,200);
		
		setVisible(true);
		
	}//end constructor
	
	//MAIN BODY
	
	public static void main(String args[]){
		
		ASCIIconverter app = new ASCIIconverter();
		
		System.out.println("\n ########### USER HAS TO ENTER ONLY A SINGLE CHARACTER #########"); 
		System.out.println("\n ############ [cntrl + c] to 'CLOSE' ############");

		}//end main
	
	@Override
	public void actionPerformed(ActionEvent ae){
		
		char val = txtInput.getText().charAt(0);
		int value = (int)val;
		txtInput.setText("");
		txtOutput.setText(value+"");
		
	}//end actionPerformed
	
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