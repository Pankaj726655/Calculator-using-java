import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class calci implements ActionListener
{
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdel,bdot,bmul,bdiv,badd,bsub,bmod,bclr,bequ,bsqu,bsqrt,bmc,bmp,bmm,bmr,bms,bpow,bcub,bfact;
	JTextField t1,t2;
	JLabel l1;
	JFrame f1;
	static double a=0,b=0,result=0;
	int operator=0;
	public static void main(String args[])
	{
		new calci();
	}
	calci()
	{
		f1=new JFrame("Calculator");
		f1.setSize(345,420);
		f1.setLayout(null);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b1=new JButton("1");
		b2=new JButton("2");
		b3=new JButton("3");
		b4=new JButton("4");
		b5=new JButton("5");
		b6=new JButton("6");
		b7=new JButton("7");
		b8=new JButton("8");
		b9=new JButton("9");
		b0=new JButton("0");
		bclr=new JButton("C");
		bmod=new JButton("%");
		badd=new JButton("+");
		bsub=new JButton("-");
		bmul=new JButton("*");
		bdiv=new JButton("/");
		bdot=new JButton(".");
		bequ=new JButton("=");
		bdel=new JButton("<=");
		bsqu=new JButton("x^2");
		bsqrt=new JButton("x^.5");
		bmc=new JButton("MC");
		bmr=new JButton("MR");
		bmp=new JButton("M+");
		bmm=new JButton("M-");
		bms=new JButton("MS");
		bpow=new JButton("x^y");
		bcub=new JButton("x^3");
		bfact=new JButton("x!");
		
		
		
		t1=new JTextField();
		t2=new JTextField();
		l1=new JLabel("Memory");
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b0.addActionListener(this);
		badd.addActionListener(this);
		bsub.addActionListener(this);
		bmul.addActionListener(this);
		bdiv.addActionListener(this);
		bdot.addActionListener(this);
		bclr.addActionListener(this);
		bdel.addActionListener(this);
		bequ.addActionListener(this);
		bmod.addActionListener(this);
		bsqu.addActionListener(this);
		bsqrt.addActionListener(this);
		bmc.addActionListener(this);
		bmp.addActionListener(this);
		bmm.addActionListener(this);
		bms.addActionListener(this);
		bmr.addActionListener(this);
		bpow.addActionListener(this);
		bcub.addActionListener(this);
		bfact.addActionListener(this);
		
		
		t1.setBounds(5,5,255,100);
		t2.setBounds(265,35,60,70);
		
		l1.setBounds(270,2,60,30);
		
		bclr.setBounds(5,110,60,40);
		bdiv.setBounds(70,110,60,40);
		bmul.setBounds(135,110,60,40);
		bdel.setBounds(200,110,60,40);
		bpow.setBounds(265,110,60,40);
		b7.setBounds(5,155,60,40);
		b8.setBounds(70,155,60,40);
		b9.setBounds(135,155,60,40);
		bsub.setBounds(200,155,60,40);
		b4.setBounds(5,200,60,40);
		b5.setBounds(70,200,60,40);
		b6.setBounds(135,200,60,40);
		badd.setBounds(200,200,60,40);
		b1.setBounds(5,245,60,40);
		b2.setBounds(70,245,60,40);
		b3.setBounds(135,245,60,40);
		bequ.setBounds(200,245,60,85);
		bcub.setBounds(265,245,60,40);
		bmod.setBounds(5,290,60,40);
		b0.setBounds(70,290,60,40);
		bdot.setBounds(135,290,60,40);
		bfact.setBounds(265,290,60,40);
		bsqu.setBounds(265,155,60,40);
		bsqrt.setBounds(265,200,60,40);
		bmc.setBounds(5,335,60,40);
		bmr.setBounds(70,335,60,40);
		bmp.setBounds(135,335,60,40);
		bmm.setBounds(200,335,60,40);
		bms.setBounds(265,335,60,40);
		
		
		
		f1.add(t1);
		f1.add(t2);
		f1.add(l1);
		f1.add(b1);
		f1.add(b2);
		f1.add(b3);
		f1.add(b4);
		f1.add(b5);
		f1.add(b6);
		f1.add(b7);
		f1.add(b8);
		f1.add(b9);
		f1.add(b0);
		f1.add(badd);
		f1.add(bsub);
		f1.add(bdiv);
		f1.add(bmul);
		f1.add(bdot);
		f1.add(bdel);
		f1.add(bmod);
		f1.add(bequ);
		f1.add(bclr);
		f1.add(bsqu);
		f1.add(bsqrt);
		f1.add(bpow);
		f1.add(bcub);
		f1.add(bfact);
		
		f1.add(bmr);
		f1.add(bmp);
		f1.add(bmm);
		f1.add(bmc);
		f1.add(bms);
		
		bmc.setEnabled(false);
		bmr.setEnabled(false);
		f1.setVisible(true);
		
		b1.setBackground(Color.pink);
		b2.setBackground(Color.pink);
		b3.setBackground(Color.pink);
		b4.setBackground(Color.pink);
		b5.setBackground(Color.pink);
		b6.setBackground(Color.pink);
		b7.setBackground(Color.pink);
		b8.setBackground(Color.pink);
		b9.setBackground(Color.pink);
		b0.setBackground(Color.pink);
		bdot.setBackground(Color.cyan);
		bclr.setBackground(Color.cyan);
		bdel.setBackground(Color.cyan);
		badd.setBackground(Color.cyan);
		bmul.setBackground(Color.cyan);
		bsub.setBackground(Color.cyan);
		bdiv.setBackground(Color.cyan);
		bmod.setBackground(Color.cyan);
		bequ.setBackground(Color.cyan);
		
		bmc.setBackground(Color.orange);
		bmr.setBackground(Color.orange);
		bmp.setBackground(Color.orange);
		bmm.setBackground(Color.orange);
		bms.setBackground(Color.orange);
		bpow.setBackground(Color.orange);
		bsqu.setBackground(Color.orange);
		bsqrt.setBackground(Color.orange);
		bcub.setBackground(Color.orange);
		bfact.setBackground(Color.orange);
		
	}
	int sum=0;
	public void actionPerformed(ActionEvent e1)
	{
		
		
		if(e1.getSource()==bclr)
			t1.setText("");
		if(e1.getSource()==b0)
			t1.setText(t1.getText().concat("0"));
		if(e1.getSource()==b1)
			t1.setText(t1.getText().concat("1"));
		if(e1.getSource()==b2)
			t1.setText(t1.getText().concat("2"));
		if(e1.getSource()==b3)
			t1.setText(t1.getText().concat("3"));
		if(e1.getSource()==b4)
			t1.setText(t1.getText().concat("4"));
		if(e1.getSource()==b5)
			t1.setText(t1.getText().concat("5"));
		if(e1.getSource()==b6)
			t1.setText(t1.getText().concat("6"));
		if(e1.getSource()==b7)
			t1.setText(t1.getText().concat("7"));
		if(e1.getSource()==b8)
			t1.setText(t1.getText().concat("8"));
		if(e1.getSource()==b9)
			t1.setText(t1.getText().concat("9"));
		if(e1.getSource()==bfact)
		{
			int fact=1;
			a=Double.parseDouble(t1.getText());
			for(int i=1;i<=a;i++)
			{
				if(a==1){
					fact=1;
					break;
				}
				if(a==2){
					fact=2;
					break;
				}
				fact=fact*i;
			}
			t1.setText(""+fact);
		}
		if(e1.getSource()==bdel)
		{
			{
				String s=t1.getText();
				t1.setText("");
				for(int i=0;i<s.length()-1;i++)
				t1.setText(t1.getText()+s.charAt(i));
			}
		}
		if(e1.getSource()==bdot)
			t1.setText(t1.getText().concat("."));
		
		if(e1.getSource()==badd)
			{
			a=Double.parseDouble(t1.getText());
			operator=1;
			t1.setText("");
			}
			if(e1.getSource()==bsub)
			{
			a=Double.parseDouble(t1.getText());
			operator=2;
			t1.setText("");
			}
			if(e1.getSource()==bmul)
			{
			a=Double.parseDouble(t1.getText());
			operator=3;
			t1.setText("");
			}
			if(e1.getSource()==bsqu)
			{
			a=Double.parseDouble(t1.getText());
			t1.setText(""+(a*a));
			}
			if(e1.getSource()==bcub)
			{
			a=Double.parseDouble(t1.getText());
			t1.setText(""+(a*a*a));
			}
			if(e1.getSource()==bsqrt)
			{
			a=Double.parseDouble(t1.getText());
			t1.setText(""+Math.sqrt(a));
			}
			if(e1.getSource()==bdiv)
			{
			a=Double.parseDouble(t1.getText());
			operator=4;
			t1.setText("");
			}
			if(e1.getSource()==bmod)
			{
			a=Double.parseDouble(t1.getText());
			operator=5;
			t1.setText("");
			}
			
			if(e1.getSource()==bpow)
			{
			a=Double.parseDouble(t1.getText());
			operator=6;
			t1.setText("");
			}
			if(e1.getSource()==bequ)
			{
			b=Double.parseDouble(t1.getText());
			switch(operator)
			{
			case 1: result=a+b;
			break;
			case 2: result=a-b;
			break;
			case 3: result=a*b;
			break;
			case 4: result=a/b;
			break;
			case 5: result=a%b;
			break;
			case 6: result=Math.pow(a,b);
			break;
			default: result=0;
			}
			t1.setText(""+result);
		}
			//llllll
			if(e1.getSource()==bmc)
			{
			a=0;
			t2.setText(""+a);
			bmc.setEnabled(false);
			bmr.setEnabled(false);
			}
			if(e1.getSource()==bmr)
			{
			a=Double.parseDouble(t2.getText());
			b=0;
			t1.setText(""+a);
			t2.setText(""+b);
			bmc.setEnabled(false);
			bmr.setEnabled(false);
			}
			if(e1.getSource()==bmp)
			{
			a=Double.parseDouble(t1.getText());
			b=Double.parseDouble(t2.getText());
			t2.setText(""+(a+b));
			bmc.setEnabled(true);
			bmr.setEnabled(true);
			}
			if(e1.getSource()==bmm)
			{
			a=Double.parseDouble(t1.getText());
			b=Double.parseDouble(t2.getText());
			t2.setText(""+(b-a));
			bmc.setEnabled(true);
			bmr.setEnabled(true);
			}
			if(e1.getSource()==bms)
			{
			a=Double.parseDouble(t1.getText());
			t2.setText(""+a);
			bmc.setEnabled(true);
			bmr.setEnabled(true);
			}
	}
}
