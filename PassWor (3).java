import java.awt.*;
import java.awt.event.*;
public class PassWor extends Frame implements ActionListener, WindowListener{
 Button b;
	 TextField tf1,tf2;
	 
	 Label l1,l2,l3;
	 Frame ob;
	 
	 PassWor()
	{
	b=new Button("Request OTP");
		tf1=new TextField();
		tf2=new TextField();
		l1=new Label();
		l1.setText("Welcome To Mody Bank");
		l2=new Label();
		l2.setText("Username");
		l3=new Label();
		l3.setText("OTP generated ");
		Font fo=new Font("Comic Sans MS",0,25);
		l1.setFont(fo);
		l2.setFont(fo);
		tf1.setFont(fo);
		b.setFont(fo);
		l3.setFont(fo);
		tf2.setFont(fo);
		Color c=new Color(166,202,255);
		setBackground(c);
		
		l1.setBounds(100,50,400,50);
		l2.setBounds(50,150,200,50);
		tf1.setBounds(300,150,200,50);
		b.setBounds(250,250,200,50);
		l3.setBounds(50,350,200,50);
		tf2.setBounds(300,350,200,50);
		setLayout(null);
		
		add(l1);
		add(l2);
		add(l3);
		add(b);
		add(tf1);
		add(tf2);
		addWindowListener(this);
		
		b.addActionListener(this );
		
		
	}
	//implementing windowlistener 
	public void	windowActivated(WindowEvent e){}
public void	windowClosed(WindowEvent e){}
public void	windowClosing(WindowEvent e){System.exit(0);}
public void	windowDeactivated(WindowEvent e){}
public void	windowDeiconified(WindowEvent e){}
public void	windowIconified(WindowEvent e){}
public void	windowOpened(WindowEvent e){}

// implementing action listener 
 public void actionPerformed(ActionEvent e)
	{
	 
		   int size=10;
		   PasswordGenerator ob=new PasswordGenerator(size);
		   
		   if(e.getSource()==b)
		   {
			   
			   String msg3=tf1.getText();
			   if(msg3!="")
			   {
				   
			   
			   String msg=new String(ob.get());
			   tf2.setText(msg);}
			   
		   }
		   else 
		   {
			   String msg2=new String("no username");
			   tf2.setText(msg2);
		   }
		   
	   }
	    public static void main(String[] args) {
		PassWor ob=new PassWor();
       
		  ob.setTitle("generate OTP");
	  ob.setSize(600,500);
	  ob.setResizable(false);
	  ob.setVisible(true);
	
         
    }
}