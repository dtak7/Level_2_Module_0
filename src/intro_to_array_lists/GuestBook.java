package intro_to_array_lists;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements MouseListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	String arrayText;
	ArrayList<String> array;
	JFrame frame=new JFrame();
	JButton add = new JButton();
	JButton view = new JButton();
	JPanel panel = new JPanel();
	public static void main(String[] args) {
		GuestBook book = new GuestBook();	
	
	}
	GuestBook(){
		 array = new ArrayList<String>();
		frame.setVisible(true);
		frame.setSize(50, 50);
		frame.add(panel);
		panel.add(add);
		panel.add(view);
		frame.pack();
		
		view.setText("view");
		add.setText("add");
		add.addMouseListener(this);
		view.addMouseListener(this);
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==add) {
		arrayText =JOptionPane.showInputDialog("add a guest");
		if(arrayText!=null) {
			array.add(arrayText);
		}
	
		}
		else if((JButton)e.getSource()==view) {
			
			for(int i = 0; i < array.size(); i++){
				String s = array.get(i);
				JOptionPane.showMessageDialog(null, "guest number "+i+ " is "+s);
			}
			}
		}
	
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
