    import java.awt.*;
    import java.awt.event.*;
    import java.util.EventListener;

    class Calculator extends Frame implements ActionListener,WindowListener
    {
        Frame f = new Frame();
        Panel p1 = new Panel();
        Panel p2 = new Panel();
        TextField t = new TextField();
        Button b1 = new Button("1");
        Button b2 = new Button("2");
        Button b3 = new Button("3");
        Button b4 = new Button("4");
        Button b5 = new Button("5");
        Button b6 = new Button("6");
        Button b7 = new Button("7");
        Button b8 = new Button("8");
        Button b9 = new Button("9");
        Button b0 = new Button("0");
        Button ba = new Button("+");
        Button bs = new Button("-");
        Button bm = new Button("*");
        Button bd = new Button("/");
        Button be = new Button("=");
        Button bc = new Button("C");

        String s="";
        String st="";
        Double a=0.0,b=0.0;

        Calculator()
        {
            f.setLayout(null);
            p1.setBounds(50,50,400,50);
            p1.setLayout(null);
            p2.setBounds(50,100,400,350);
            p2.setLayout(new GridLayout(4,4,5,5));
            p2.add(b1);p2.add(b2);p2.add(b3);p2.add(bc);
            p2.add(b4);p2.add(b5);p2.add(b6);p2.add(ba);
            p2.add(b7);p2.add(b8);p2.add(b9);p2.add(bs);
            p2.add(b0);p2.add(bm);p2.add(bd);p2.add(be);
            t.setFont(new Font("Arial", Font.PLAIN, 34));
            t.setSize(400, 50);
            p1.add(t);
            f.add(p1);
            f.add(p2);
            f.setSize(500,500);
            f.setBackground(Color.LIGHT_GRAY);
            f.setVisible(true);
            f.setTitle("Calculator");

            b1.setFont(new Font("Arial", Font.PLAIN, 24));
            b2.setFont(new Font("Arial", Font.PLAIN, 24));
            b3.setFont(new Font("Arial", Font.PLAIN, 24));
            b4.setFont(new Font("Arial", Font.PLAIN, 24));
            b5.setFont(new Font("Arial", Font.PLAIN, 24));
            b6.setFont(new Font("Arial", Font.PLAIN, 24));
            b7.setFont(new Font("Arial", Font.PLAIN, 24));
            b8.setFont(new Font("Arial", Font.PLAIN, 24));
            b9.setFont(new Font("Arial", Font.PLAIN, 24));
            b0.setFont(new Font("Arial", Font.PLAIN, 24));
            ba.setFont(new Font("Arial", Font.PLAIN, 24));
            bs.setFont(new Font("Arial", Font.PLAIN, 24));
            bm.setFont(new Font("Arial", Font.PLAIN, 24));
            bd.setFont(new Font("Arial", Font.PLAIN, 24));
            be.setFont(new Font("Arial", Font.PLAIN, 24));
            bc.setFont(new Font("Arial", Font.PLAIN, 24));

            b1.setBackground(Color.DARK_GRAY);
            b2.setBackground(Color.DARK_GRAY);
            b3.setBackground(Color.DARK_GRAY);
            b4.setBackground(Color.DARK_GRAY);
            b5.setBackground(Color.DARK_GRAY);
            b6.setBackground(Color.DARK_GRAY);
            b7.setBackground(Color.DARK_GRAY);
            b8.setBackground(Color.DARK_GRAY);
            b9.setBackground(Color.DARK_GRAY);
            b0.setBackground(Color.DARK_GRAY);
            ba.setBackground(Color.DARK_GRAY);
            bs.setBackground(Color.DARK_GRAY);
            bm.setBackground(Color.DARK_GRAY);
            bd.setBackground(Color.DARK_GRAY);
            be.setBackground(Color.DARK_GRAY);
            bc.setBackground(Color.DARK_GRAY);
            t.setBackground(Color.DARK_GRAY);

            b1.setForeground(Color.WHITE);
            b2.setForeground(Color.WHITE);
            b3.setForeground(Color.WHITE);
            b4.setForeground(Color.WHITE);
            b5.setForeground(Color.WHITE);
            b6.setForeground(Color.WHITE);
            b7.setForeground(Color.WHITE);
            b8.setForeground(Color.WHITE);
            b9.setForeground(Color.WHITE);
            b0.setForeground(Color.WHITE);
            ba.setForeground(Color.WHITE);
            bs.setForeground(Color.WHITE);
            bm.setForeground(Color.WHITE);
            bd.setForeground(Color.WHITE);
            bc.setForeground(Color.WHITE);
            be.setForeground(Color.WHITE);
            t.setForeground(Color.WHITE);
            t.setEditable(false);

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
            ba.addActionListener(this);
            bs.addActionListener(this);
            bm.addActionListener(this);
            bd.addActionListener(this);
            bc.addActionListener(this);
            be.addActionListener(this);
            f.addWindowListener(this);

        }


        public static void main(String args[])
        {
            Calculator c = new Calculator();
        }


         @Override
        public void actionPerformed(ActionEvent e)
        {
            st=e.getActionCommand();
            if (st.equals("="))
            {
                s=s+st;
                String n="";
                char o = '+';
                for (int i=0;i<s.length();i++)
                {
                    char j = s.charAt(i);
                    if(j=='+' || j=='-' || j=='*' || j=='/' || j=='=')
                    {
                        b=Double.parseDouble(n);
                        if(o=='+')
                        {
                            a += b;
                        }
                        else if(o=='-')
                        {
                            a -= b;
                        }
                        else if(o=='*')
                        {
                            a *= b;
                        }
                        else if(o=='/')
                        {
                            a /= b;
                        }
                       if(j!='=')
                            o=j;
                        n="";
                    }
                    else
                    {
                        n = n + Character.toString(j);
                    }
                }
                t.setText(Double.toString(a));
                s=Double.toString(a);
                a=0.0;
            }
            else if(st.equals("C"))
            {
                s="";
                t.setText(s);
            }
            else
            {
                s=s+st;
                t.setText(s);
            }
        }

    @Override
    public void windowOpened(WindowEvent e)
    {
    }

    @Override
    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e)
    {
    }

    @Override
    public void windowIconified(WindowEvent e)
    {
    }

    @Override
    public void windowDeiconified(WindowEvent e)
    {
    }

    @Override
    public void windowActivated(WindowEvent e)
    {
    }

    @Override
    public void windowDeactivated(WindowEvent e)
    {
    }
    }
