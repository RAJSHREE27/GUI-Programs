// to calculate the accumulated sum

import java.awt.*;
import java.awt.event.*;

public class AccumulatedSum extends Frame implements ActionListener ,WindowListener{
											//ActionListener has an abstract method called actionPerformed
	private Label lblInput;
	private Label lblOutput;
	private TextField txtInput;
	private TextField txtOutput;
	private Button Bt;
	private int sum = 0;
	
	//defining constructor
	
	public AccumulatedSum(){
		
		setLayout(new FlowLayout());
		
		lblInput = new Label("Enter integer value : ");
		add(lblInput);
		
		txtInput = new TextField(10);
		txtInput.setEditable(true);
		add(txtInput);
		
		lblOutput = new Label("Accumulated sum  : ");
		add(lblOutput);
		
		txtOutput = new TextField(10);
		txtOutput.setEditable(false);
		add(txtOutput);
		
		Bt = new Button("Result");
		add(Bt);
		
		Bt.addActionListener(this);
		addWindowListener(this);		//fire the windowEvent on 'this' listner object
		
		
		setTitle("ACCUMULATED COUNTER");
		setSize(300, 250);
		
		System.out.println(this);
		System.out.println(lblInput);
		System.out.println(lblOutput);
		System.out.println(Bt);
		System.out.println(txtInput);
		System.out.println(txtOutput);
		
		setVisible(true);
		
		System.out.println("\n --------------------------------------------------\n");
		System.out.println(this);
		System.out.println(lblInput);
		System.out.println(lblOutput);
		System.out.println(Bt);
		System.out.println(txtInput);
		System.out.println(txtOutput);
		                                                              
		
		
	}//end constructor 
		
	public static void main(String args[]){
		 
		 //making a new AccumulatedSum object
		 AccumulatedSum app = new AccumulatedSum();
		 System.out.println("\n !!!!!! ONLY INTEGER VALUE HAS TO BE ADDED !!!!\n");
		 
	}//end main
	
	//System.out.println("\n --------------------------------------------------\n");
	
	@Override
	public void actionPerformed(ActionEvent ae){
		
		int number = Integer.parseInt(txtInput.getText());		//string converted to integer
		sum += number;
		
		txtInput.setText("");
		txtOutput.setText(sum + "");
		
	}//end actionPerformed
	//-------------------------------------------------------------------
	
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