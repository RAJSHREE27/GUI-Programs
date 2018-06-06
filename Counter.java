// to make a counter which counts the number of times 'count' button is clicked by the user

import java.awt.*;
import java.awt.event.*;

public class Counter extends Frame implements ActionListener, WindowListener{
	
	private Label lbl;
	private TextField txt;
	private Button btn;
	private int count =0;
	
	//constructor to start the GUI
	public Counter(){
		//setting the layout first
		
		setLayout(new FlowLayout());
		
		lbl = new Label(" -: Counter :-");
		add(lbl);
		
		txt = new TextField(count + " ",20);
		txt.setEditable(false);		//in read mode only :::::::::: cannot be edited directly by textField
		add(txt);
		
		btn = new Button(" COUNT ");
		add(btn);
		
		btn.addActionListener(this);
		
		addWindowListener(this);		//fire the windowEvent on 'this' listner object
		
		//setting title
		
		setTitle(" Counter Frame ");
		setSize(300, 200);
		
		//for checking
		System.out.println(this);
		System.out.println(lbl);
		System.out.println(txt);
		System.out.println(btn);
		
		System.out.println("\n ------------------------------------------------\n"); 
		
		//now setting visibility
		
		setVisible(true);
		//after setting visibility
		// objects checked again
		
		System.out.println(this);
		System.out.println(lbl);
		System.out.println(txt);
		System.out.println(btn);
	
	}
	//constructor ends
	// upto this, the application GUI will be called whenever object will be created as it lies inside the constructor
	
	public static void main(String args[]){
		
		// just to initialise a 'counter' object
			
			Counter app = new Counter();
			
			//alternate way
			//System.out.println("\n ********************** USE 'CNTRL+C' TO CLOSE THE WINDOW *************************\n"); 
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		++count;
		txt.setText(count+"");
		
		//System.out.println(" USE 'CNTRL+C' TO CLOSE THE WINDOW"); 
	}
	//when button is clicked, it fires ActionEvent Listener which provides actionevent handler called actionPerformed(internally) 
	//ActionListener has only 1 abstract method actionPerformed() , hence no other method is called...
	
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