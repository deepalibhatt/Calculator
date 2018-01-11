


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class Gui extends JFrame {
  private JTextField answerfield;
  private JButton one, two, three, four, five, six, seven, eight, nine, zero ,decimal , neg ,  add, sub, multiply, div, equals, clear, backspace, on, off; 
  private JLabel  emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8, emp9, emp10;
  private String num_one, num_two, sanswer;
  private double answer =0.0;
  private JPanel contentPanel;
  private boolean equalsClicked= false, opChosen= false;
  char operation= ' ';
  public Gui(){
      super("Calculator");
      
      answerfield= new JTextField();
      answerfield.setEditable(false);
  

      
      
      // BUTTONS
      one= new JButton("1");
      two= new JButton("2");
      three= new JButton("3");
      four= new JButton("4");
      five= new JButton("5");
      six= new JButton("6");
      seven= new JButton("7");
      eight= new JButton("8");
      nine= new JButton("9");
      zero= new JButton("0");
      decimal= new JButton(".");
      neg= new JButton("±");
      add= new JButton("+");
      sub= new JButton("-");
      multiply= new JButton("x");
      div= new JButton("÷");
      equals= new JButton("=");
      clear = new JButton("RESET");
      backspace = new JButton("DEL");
      emp1 = new JLabel("");
      emp2 = new JLabel("");
      emp3 = new JLabel("");
      emp4 = new JLabel("");
      emp5 = new JLabel("");
      emp6 = new JLabel("");
      emp7 = new JLabel("");
      emp8 = new JLabel("");
      emp9 = new JLabel("");
      emp10 = new JLabel("");
      on= new JButton("ON");
      off= new JButton("OFF");
      
      
      
      //DIMENSIONS
      answerfield.setPreferredSize(new Dimension(340,100));
      one.setPreferredSize(new Dimension(60,50));
      two.setPreferredSize(new Dimension(60,50));
      three.setPreferredSize(new Dimension(60,50));
      four.setPreferredSize(new Dimension(60,50));
      five.setPreferredSize(new Dimension(60,50));
      six.setPreferredSize(new Dimension(60,50));
      seven.setPreferredSize(new Dimension(60,50));
      eight.setPreferredSize(new Dimension(60,50));
      nine.setPreferredSize(new Dimension(60,50));
      zero.setPreferredSize(new Dimension(60,50));
      decimal.setPreferredSize(new Dimension(60,50));
      neg.setPreferredSize(new Dimension(60,50));
      add.setPreferredSize(new Dimension(60,50));
      sub.setPreferredSize(new Dimension(60,50));
      multiply.setPreferredSize(new Dimension(60,50));
      div.setPreferredSize(new Dimension(60,50));
      equals.setPreferredSize(new Dimension(60,50));
      clear.setPreferredSize(new Dimension(80,50));
      backspace.setPreferredSize(new Dimension(60,50));
      on.setPreferredSize(new Dimension(60,50));
      off.setPreferredSize(new Dimension(60,50));
      emp1.setPreferredSize(new Dimension(60,50));
      emp2.setPreferredSize(new Dimension(60,50));
      emp3.setPreferredSize(new Dimension(60,50));
      emp4.setPreferredSize(new Dimension(50,50));
      emp5.setPreferredSize(new Dimension(50,50));
      emp6.setPreferredSize(new Dimension(10,10));
      emp7.setPreferredSize(new Dimension(10,10));
      emp8.setPreferredSize(new Dimension(10,10));
      emp9.setPreferredSize(new Dimension(10,10));
      emp10 .setPreferredSize(new Dimension(10,10));
      
      Numbers n = new Numbers();
      Calc c = new Calc();
      
      
      //ACTIONLISTENERS
      one.addActionListener(n);two.addActionListener(n);three.addActionListener(n);
      four.addActionListener(n);five.addActionListener(n);six.addActionListener(n);
      seven.addActionListener(n);eight.addActionListener(n);nine.addActionListener(n);
      zero.addActionListener(n); decimal.addActionListener(n);neg.addActionListener(n);
      backspace.addActionListener(n); on.addActionListener(n); off.addActionListener(n);
     
      
      add.addActionListener(c);sub.addActionListener(c);multiply.addActionListener(c);
      div.addActionListener(c);equals.addActionListener(c);clear.addActionListener(c);
      
   
      //PANELS
      contentPanel= new JPanel();
      contentPanel.setBackground(Color.getHSBColor(6, 90, 293));
      contentPanel.setLayout(new FlowLayout());
      contentPanel.add(answerfield, BorderLayout.NORTH);
      contentPanel.add(emp4);contentPanel.add(emp5);contentPanel.add(clear);contentPanel.add(emp10);contentPanel.add(on);contentPanel.add(off);
      contentPanel.add(seven);contentPanel.add(emp6);contentPanel.add(eight);contentPanel.add(nine);contentPanel.add(emp9);contentPanel.add(add);contentPanel.add(sub);
      contentPanel.add(four);contentPanel.add(five);contentPanel.add(six);contentPanel.add(emp6);contentPanel.add(multiply);contentPanel.add(div);
      contentPanel.add(one);contentPanel.add(two);contentPanel.add(three);contentPanel.add(emp7);contentPanel.add(emp1);contentPanel.add(emp2);
      contentPanel.add(zero);contentPanel.add(decimal);contentPanel.add(emp8);contentPanel.add(emp3);contentPanel.add(backspace); contentPanel.add(equals);
      this.setContentPane(contentPanel);
        
      //NUMBERS
  }

    void setJFieldSize(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
  private class Numbers implements ActionListener{
     public void actionPerformed(ActionEvent event){
        JButton src = (JButton) event.getSource(); 
        if(event.getSource()==on)
		{
			enable();
		}
		
		else if(event.getSource()==off)
		{
			disable();
		}
        if(src.equals(one)){
            if(opChosen==false){
                if(num_one==null){
                   num_one= "1"; 
                } else{ 
                    num_one= num_one  + "1";
                }
            }else{
                if(num_two==null){
                   num_two= "1"; 
                } else{ 
                    num_two= num_two  + "1";
            }
        }
     }
        if(src.equals(two)){
            if(opChosen==false){
                if(num_one==null){
                   num_one= "2"; 
                } else{ 
                    num_one= num_one  + "2";
                }
            }else{
                if(num_two==null){
                   num_two= "2"; 
                } else{ 
                    num_two= num_two  + "2";
            }
        }
     }
        if(src.equals(three)){
            if(opChosen==false){
                if(num_one==null){
                   num_one= "3"; 
                } else{ 
                    num_one= num_one  + "3";
                }
            }else{
                if(num_two==null){
                   num_two= "3"; 
                } else{ 
                    num_two= num_two  + "3";
            }
        }
     }
        if(src.equals(four)){
            if(opChosen==false){
                if(num_one==null){
                   num_one= "4"; 
                } else{ 
                    num_one= num_one  + "4";
                }
            }else{
                if(num_two==null){
                   num_two= "4"; 
                } else{ 
                    num_two= num_two  + "4";
            }
        }
     }
        if(src.equals(five)){
            if(opChosen==false){
                if(num_one==null){
                   num_one= "5"; 
                } else{ 
                    num_one= num_one  + "5";
                }
            }else{
                if(num_two==null){
                   num_two= "5"; 
                } else{ 
                    num_two= num_two  + "5";
            }
        }
     }
        if(src.equals(six)){
            if(opChosen==false){
                if(num_one==null){
                   num_one= "6"; 
                } else{ 
                    num_one= num_one  + "6";
                }
            }else{
                if(num_two==null){
                   num_two= "6"; 
                } else{ 
                    num_two= num_two  + "6";
            }
        }
     }
        if(src.equals(seven)){
            if(opChosen==false){
                if(num_one==null){
                   num_one= "7"; 
                } else{ 
                    num_one= num_one  + "7";
                }
            }else{
                if(num_two==null){
                   num_two= "7"; 
                } else{ 
                    num_two= num_two  + "7";
            }
        }
     }
        if(src.equals(eight)){
            if(opChosen==false){
                if(num_one==null){
                   num_one= "8"; 
                } else{ 
                    num_one= num_one  + "8";
                }
            }else{
                if(num_two==null){
                   num_two= "8"; 
                } else{ 
                    num_two= num_two  + "8";
            }
        }
     }
        if(src.equals(nine)){
            if(opChosen==false){
                if(num_one==null){
                   num_one= "9"; 
                } else{ 
                    num_one= num_one  + "9";
                }
            }else{
                if(num_two==null){
                   num_two= "9"; 
                } else{ 
                    num_two= num_two  + "9";
            }
        }
     }
        if(src.equals(zero)){
            if(opChosen==false){
                if(num_one==null){
                   num_one= "0"; 
                } else{ 
                    num_one= num_one  + "0";
                }
            }else{
                if(num_two==null){
                   num_two= "0"; 
                } else{ 
                    num_two= num_two  + "0";
            }
        }
     }
        if(src.equals(decimal)){
            if(opChosen==false){
                if(num_one==null){
                   num_one= "0."; 
                } else
                	if(num_one != null) {
                	  if(num_one.contains(".")) {
                		  System.out.println("A decimal has been detected!");
                	  }else {
                		  num_one += "."; 
                	  } 
                  
                }
            }else{
                if(num_two==null){
                   num_two= "0."; 
                } else 
                	if(num_two != null) {
                		if(num_two.contains(".")) {
                			System.out.println("A decimal has been detected!");
                		} else {
                			num_two += ".";
                		}
            }
        }
     }
        
        if(src.equals(neg)) {
        	if(opChosen==false){
                if(num_one==null){
                   num_one= "-"; 
                } else 
                	if(num_one != null && num_one.startsWith("-")) { 
                    num_one= num_one.substring(1);
                }else {
                	num_one = "-" + num_one;
               }
        	}
            else{
                if(num_two==null){
                   num_two= "-"; 
                } else
                     if(num_two != null && num_two.startsWith("-")){ 
                      num_two= num_two.substring(1);
            }else {
            	num_two = "-" + num_two;
            }
        }
        }
        
        if(src.equals(backspace)) {
        	 if(opChosen==false){
                 if(num_one==null) {
                	 System.out.print("Can't delete");
                 } else {
                	 num_one= num_one.substring(0, num_one.length()-1);
                 }
        	 }else {
        		 if(num_two==null) {
                	 System.out.print("Can't delete");
                 } else {
                	 num_two= num_two.substring(0, num_two.length()-1);
        	 }
          }
        }
        
        if(equalsClicked==false){
            if(opChosen==false){
           answerfield.setText(num_one);
        }else{
             answerfield.setText(num_two);
        }
       } 
     }
  } 
  
  
  
  //CALC
   private class Calc implements ActionListener{
        public void actionPerformed(ActionEvent event){
          JButton src = (JButton) event.getSource(); 
          
          if(src.equals(add)){
              if(num_one==null){
                  System.out.println("Choose your numbers first");
              }else
                  if(num_one != null && num_two == null){
                      opChosen= true;
                      operation = '+';
                  }else
                      if(num_one != null && num_two != null){
                          System.out.println("Two operations only");
                      }
          }
          if(src.equals(sub)){
              if(num_one==null){
                  System.out.println("Choose your numbers first");
              }else
                  if(num_one != null && num_two == null){
                      opChosen= true;
                      operation = '-';
                  }else
                      if(num_one != null && num_two != null){
                          System.out.println("Two operations only");
                      }
          }
          if(src.equals(multiply)){
              if(num_one==null){
                  System.out.println("Choose your numbers first");
              }else
                  if(num_one != null && num_two == null){
                      opChosen= true;
                      operation = '*';
                  }else
                      if(num_one != null && num_two != null){
                          System.out.println("Two operations only");
                      }
          }
          if(src.equals(div)){
              if(num_one==null){
                  System.out.println("Choose your numbers first");
              }else
                  if(num_one != null && num_two == null){
                      opChosen= true;
                      operation = '/';
                  }else
                      if(num_one != null && num_two != null){
                          System.out.println("Two operations only");
                      }
          }
          if(src.equals(equals)){
              if(num_one==null){
                  System.out.println("Choose your numbers first");
              }else
                  if(num_one != null && num_two == null){
                    System.out.println("Choose BOTH numbers first");
                  }
              if(num_one != null && num_two !=null){
                  double r1 = 0.0, r2=0.0;
                  
                  r1= Double.parseDouble(num_one);
                  r2= Double.parseDouble(num_two);
                  
                  switch(operation){
                  case '+': 
                     answer= r1 + r2;
                     break;
                  case '-': 
                      answer= r1 - r2;
                      break;
                  case '*': 
                      answer= r1 * r2;
                      break;
                  case '/': 
                      answer= r1 / r2;
                      break;
                  } 
                  
                  sanswer= Double.toString(answer);
                  answerfield.setText(sanswer); 
                  if(operation == '/' && r2 == 0.0) {
                	  answerfield.setText("Math ERROR");
                  }
                 }
               }
              
                 if(src.equals(clear)) {
                	 num_one = null;
                	 num_two = null;
                	 equalsClicked= false;
                	 opChosen = false;
                	 operation = ' ';
                	 answerfield.setText(null);
                	 sanswer = null;
               }
          }
     }

	public void disable()
	{
		answerfield.setText(" ");
		off.setEnabled(false);
		on.setEnabled(true);
		answerfield.setEnabled(false);
		decimal.setEnabled(false);
		zero.setEnabled(false);
		one.setEnabled(false);
		two.setEnabled(false);
		three.setEnabled(false);
		four.setEnabled(false);
		five.setEnabled(false);
		six.setEnabled(false);
		seven.setEnabled(false);
		eight.setEnabled(false);
		nine.setEnabled(false);
		add.setEnabled(false);
		sub.setEnabled(false);
		multiply.setEnabled(false);
		div.setEnabled(false);
		equals.setEnabled(false);
		clear.setEnabled(false);
		backspace.setEnabled(false);
	}
	
	public void enable()
	{
		on.setEnabled(false);
		off.setEnabled(true);
		answerfield.setEnabled(true);
		decimal.setEnabled(true);
		zero.setEnabled(true);
		one.setEnabled(true);
		two.setEnabled(true);
		three.setEnabled(true);
		four.setEnabled(true);
		five.setEnabled(true);
		six.setEnabled(true);
		seven.setEnabled(true);
		eight.setEnabled(true);
		nine.setEnabled(true);
		add.setEnabled(true);
		sub.setEnabled(true);
		multiply.setEnabled(true);
		div.setEnabled(true);
		equals.setEnabled(true);
		clear.setEnabled(true);
		backspace.setEnabled(true);
		
	}
	}
	
  



