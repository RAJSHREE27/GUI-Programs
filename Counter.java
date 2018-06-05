// to make a counter which counts the number of times 'count' button is clicked by the user

import java.awt.*;
import java.awt.event.*;

public class Counter extends Frame implements ActionListener{
	
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
			System.out.println("\n ********************** USE 'CNTRL+C' TO CLOSE THE WINDOW *************************\n"); 
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		++count;
		txt.setText(count+"");
		
		//System.out.println(" USE 'CNTRL+C' TO CLOSE THE WINDOW"); 
	}
	//when button is clicked, it fires ActionEvent Listener which provides actionevent handler called actionPerformed(internally) 
	
}//end class