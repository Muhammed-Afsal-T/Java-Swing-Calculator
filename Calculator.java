import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;


public class Calculator implements ActionListener{
   String oldvalue;
   String newvalue;
   String oper;
private boolean isResultDisplayed = false;
   
   JFrame fm;
   JLabel lb;
   JButton bnseven;
   JButton bneight;
   JButton bnnine;
   JButton four;
   JButton five;
   JButton six;
   JButton one;
   JButton two;
   JButton three;
   JButton zero;
   JButton dot;
   JButton mode;
   JButton pluse;
   JButton minues;
   JButton mul;
   JButton div;
   JButton equal;
   JButton clear;
   
  public Calculator() {
   
        fm = new JFrame("Calculator");
        
        fm.setSize(390, 550);
        fm.setLayout(null);
        fm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fm.setLocation(500,100);
        fm.getContentPane().setBackground(Color.BLACK);

        lb=new JLabel("");
        fm.add(lb);
        lb.setOpaque(true);
        lb.setBounds(10,10,370,100);
        lb.setBackground(Color.GRAY);
	lb.setForeground(Color.WHITE);
	lb.setHorizontalAlignment(SwingConstants.RIGHT);
	lb.setBorder(new EmptyBorder(10,20,10,20));
	
	Font fontbox=new Font("Arial", Font.BOLD,20);
	Font Fontminus=new Font("Arial",Font.BOLD,15);
	
        
        bnseven = new JButton("7");
	bnseven.setBounds(10,150,50,50);
	bnseven.setFont(fontbox);
	bnseven.addActionListener(this);
	fm.add(bnseven);
        
        bneight = new JButton("8");
	bneight.setBounds(80,150,50,50);
	bneight.setFont(fontbox);
	bneight.addActionListener(this);
        fm.add(bneight);
      
      bnnine = new JButton("9");
	bnnine.setBounds(150,150,50,50);
	bnnine.setFont(fontbox);
	bnnine.addActionListener(this);
        fm.add(bnnine);
      
      four = new JButton("4");
	four.setBounds(10,250,50,50);
	four.setFont(fontbox);
	four.addActionListener(this);
	fm.add(four);
        
        five = new JButton("5");
	five.setBounds(80,250,50,50);
	five.setFont(fontbox);
	five.addActionListener(this);
        fm.add(five);
      
      six = new JButton("6");
	six.setBounds(150,250,50,50);
	six.setFont(fontbox);
	six.addActionListener(this);
        fm.add(six);
        
       one = new JButton("1");
	one.setBounds(10,350,50,50);
	one.setFont(fontbox);
	one.addActionListener(this);
	fm.add(one);
        
        two = new JButton("2");
	two.setBounds(80,350,50,50);
	two.setFont(fontbox);
	two.addActionListener(this);
        fm.add(two);
      
      three = new JButton("3");
	three.setBounds(150,350,50,50);
	three.setFont(fontbox);
	three.addActionListener(this);
        fm.add(three);
      
        mode = new JButton("%");
	mode.setBounds(10,450,50,50);
	mode.setFont(Fontminus);
	mode.addActionListener(this);
	fm.add(mode);
        
        zero = new JButton("0");
	zero.setBounds(80,450,50,50);
	zero.setFont(fontbox);
	zero.addActionListener(this);
        fm.add(zero);
      
       dot = new JButton(".");
	dot.setBounds(150,450,50,50);
	dot.setFont(fontbox);
	dot.addActionListener(this);
        fm.add(dot);
        
        pluse = new JButton("+");
	pluse.setBounds(260,150,50,50);
	pluse.setFont(Fontminus);
	pluse.addActionListener(this);
        fm.add(pluse);
        
        minues = new JButton("-");
	minues.setBounds(330,150,50,50);
	minues.setFont(fontbox);
	minues.addActionListener(this);
        fm.add(minues);
        
        mul = new JButton("x");
	mul.setBounds(260,250,50,50);
	mul.setFont(fontbox);
	mul.addActionListener(this);
        fm.add(mul);
        
        div = new JButton("/");
	div.setBounds(330,250,50,50);
	div.setFont(fontbox);
	div.addActionListener(this);
        fm.add(div);
        
        equal = new JButton("=");
	equal.setBounds(260,350,120,50);
	equal.setFont(fontbox);
	equal.setBackground(Color.YELLOW);
	equal.addActionListener(this);
        fm.add(equal);
        
        clear = new JButton("CLEAR");
	clear.setBounds(260,450,120,50);
	clear.setBackground(Color.YELLOW);
	clear.setFont(fontbox);
	clear.addActionListener(this);
        fm.add(clear);
        fm.validate();
        fm.setVisible(true);
        }
        
        
        public void actionPerformed(ActionEvent e){
       if(e.getSource()==bnseven || e.getSource()==bneight || e.getSource()==bnnine || e.getSource()==four || e.getSource()==five || e.getSource()==six || e.getSource()==one || e.getSource()==two || e.getSource()==three || e.getSource()==dot  || e.getSource()==zero){
       
       String digit = e.getActionCommand();

        if (isResultDisplayed) {
        lb.setText("");
        isResultDisplayed = false; 
        }
        lb.setText(lb.getText()+ digit);
        } 
        else if(e.getSource()==mode){
        
        if (oldvalue != null && !oldvalue.isEmpty() && !lb.getText().isEmpty() && !oper.isEmpty()) {
        

        newvalue = lb.getText(); 
        float b = Float.parseFloat(newvalue);
        float a = Float.parseFloat(oldvalue);
        float result = 0f;


        switch (oper) {
        
        case "%":
        result = a % b;
        break;
        
        case "+":
        result = a+b;
        break;
        
        case "-":
        result = a-b;
        break;
        
        case "*":
        result = a*b;
        break;
        
        case "/":
        result = a/b;
        break;
        }


        lb.setText(String.valueOf(result));
        oldvalue = String.valueOf(result); 
        
        oper = ""; 
        newvalue = "";
        
    }
        oldvalue = lb.getText();
        lb.setText("");
        oper="%";
        
        }
         else if(e.getSource()==pluse){
         if (oldvalue != null && !oldvalue.isEmpty() && !lb.getText().isEmpty() && !oper.isEmpty()) {
        

        newvalue = lb.getText(); 
        float b = Float.parseFloat(newvalue);
        float a = Float.parseFloat(oldvalue);
        float result = 0f;


        switch (oper) {
        
        case "%":
        result = a % b;
        break;
        
        case "+":
        result = a+b;
        break;
        
        case "-":
        result = a-b;
        break;
        
        case "*":
        result = a*b;
        break;
        
        case "/":
        result = a/b;
        break;
        }


        lb.setText(String.valueOf(result));
        oldvalue = String.valueOf(result); 
        
        oper = ""; 
        newvalue = "";
        
    }
         
        oldvalue = lb.getText();
        lb.setText("");
        oper="+";
        
        
        }
        else if(e.getSource()==minues){
        if (oldvalue != null && !oldvalue.isEmpty() && !lb.getText().isEmpty() && !oper.isEmpty()) {
        

        newvalue = lb.getText(); 
        float b = Float.parseFloat(newvalue);
        float a = Float.parseFloat(oldvalue);
        float result = 0f;


        switch (oper) {
        
        case "%":
        result = a % b;
        break;
        
        case "+":
        result = a+b;
        break;
        
        case "-":
        result = a-b;
        break;
        
        case "*":
        result = a*b;
        break;
        
        case "/":
        result = a/b;
        break;
        }


        lb.setText(String.valueOf(result));
        oldvalue = String.valueOf(result); 
        
        oper = ""; 
        newvalue = "";
        
    }
        oldvalue = lb.getText();
        lb.setText("");
        oper="-";
        
        }
        else if(e.getSource()==mul){
        if (oldvalue != null && !oldvalue.isEmpty() && !lb.getText().isEmpty() && !oper.isEmpty()) {
        

        newvalue = lb.getText(); 
        float b = Float.parseFloat(newvalue);
        float a = Float.parseFloat(oldvalue);
        float result = 0f;


        switch (oper) {
        
        case "%":
        result = a % b;
        break;
        
        case "+":
        result = a+b;
        break;
        
        case "-":
        result = a-b;
        break;
        
        case "*":
        result = a*b;
        break;
        
        case "/":
        result = a/b;
        break;
        }


        lb.setText(String.valueOf(result));
        oldvalue = String.valueOf(result); 
        
        oper = ""; 
        newvalue = "";
        
    }
        oldvalue = lb.getText();
        lb.setText("");
        oper="*";
        
        }
        else if(e.getSource()==div){
        if (oldvalue != null && !oldvalue.isEmpty() && !lb.getText().isEmpty() && !oper.isEmpty()) {
        

        newvalue = lb.getText(); 
        float b = Float.parseFloat(newvalue);
        float a = Float.parseFloat(oldvalue);
        float result = 0f;


        switch (oper) {
        
        case "%":
        result = a % b;
        break;
        
        case "+":
        result = a+b;
        break;
        
        case "-":
        result = a-b;
        break;
        
        case "*":
        result = a*b;
        break;
        
        case "/":
        result = a/b;
        break;
        }


        lb.setText(String.valueOf(result));
        oldvalue = String.valueOf(result); 
        
        oper = ""; 
        newvalue = "";
        
    }
        oldvalue = lb.getText();
        lb.setText("");
        oper="/";
        
        }
        else if(e.getSource()==clear){
        lb.setText("");
        oldvalue = newvalue = oper = "";
        }
        else if(e.getSource()==equal){
        newvalue = lb.getText();
        float b = Float.parseFloat(newvalue);
        float a = Float.parseFloat(oldvalue); 
        float result = 0f;
        isResultDisplayed = true;

        
        switch (oper){
        
        case "%":
        result = a % b;
        break;
        
        case "+":
        result = a+b;
        break;
        
        case "-":
        result = a-b;
        break;
        
        case "*":
        result = a*b;
        break;
        
        case "/":
        result = a/b;
        break;
        
        }
        
        oper = "";
        lb.setText(String.valueOf(result));
        oldvalue=String.valueOf(result);
       
        }
        }
        public static void main(String[] args) {
        new Calculator(); 
    }
    
}
