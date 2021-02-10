import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;
class Calculator implements ActionListener
{
	JFrame f;
	JButton b;
	JTextField t1,t2,t3;
	JLabel l1,l2,l3;
	Calculator()
	{
		f=new JFrame("CALCULATOR");
		l1=new JLabel("FIRST NUMBER");
		t1=new JTextField(15);
		l2=new JLabel("SECOND NUMBER");
		t2=new JTextField(15);
		l3=new JLabel("SUM");
		t3=new JTextField(15);
		b=new JButton("ADD");
		b.addActionListener(this);
		f.setSize(300,300);
		f.setLayout(new FlowLayout());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(b);
		f.add(l3);
		f.add(t3);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		String s1= t1.getText();
		String s2= t2.getText();
		int sum = Integer.parseInt(s1)+Integer.parseInt(s2);
		t3.setText(String.valueOf(sum));
	}
}
class Main{
	public static void main(String[]args)
	{
		Calculator cal = new Calculator();
	}
}