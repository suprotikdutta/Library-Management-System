
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener{

	private JPanel contentPane;
        private JButton b1,b2,b3,b4,b5,b6,b30;

	public static void main(String[] args) {
            new Home().setVisible(true);
	}
        
        public Home() {
            super("Library Management System");
            setBounds(400, 150, 1000, 800);
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);

            
            JMenuBar menuBar = new JMenuBar();
            menuBar.add(Box.createRigidArea(new Dimension(400,100)));
            menuBar.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 128, 0), new Color(128, 128, 128)));
            menuBar.setBackground(Color.white);
            menuBar.setBounds(0, 10, 1000, 40);
            contentPane.add(menuBar);

            JMenu mnExit = new JMenu("Exit");
            mnExit.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
            
            
            JMenuItem mntmLogout = new JMenuItem("Logout");
            mntmLogout.setBackground(Color.white);
            mntmLogout.setForeground(Color.red);
            mntmLogout.addActionListener(this);
            mnExit.add(mntmLogout);
            
            JMenuItem mntmExit = new JMenuItem("Exit");
            mntmExit.setForeground(Color.red);
            mntmExit.setBackground(Color.white);
            mntmExit.addActionListener(this);
            mnExit.add(mntmExit);
                
            
/*
            JMenu mnHelp = new JMenu("Help");
            mnHelp.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
            

            JMenuItem mntmReadme = new JMenuItem("Read Me");
            mntmReadme.setBackground(Color.white);
            mntmReadme.setForeground(Color.red);
            mnHelp.add(mntmReadme);
*/
          /*
            JMenuItem mntmAboutUs = new JMenuItem("About Us");
            mntmAboutUs.setForeground(Color.red);
            mntmAboutUs.setBackground(Color.white);
            mntmAboutUs.addActionListener(this);
            mnHelp.add(mntmAboutUs);
*/
            JMenu mnRecord = new JMenu("Record");
            mnRecord.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
            

            JMenuItem bookdetails = new JMenuItem("Book Details");
            bookdetails.addActionListener(this);
            bookdetails.setBackground(Color.white);
            bookdetails.setForeground(Color.red);
            mnRecord.add(bookdetails);

            JMenuItem studentdetails = new JMenuItem("Student Details");
            studentdetails.setBackground(Color.white);
            studentdetails.setForeground(Color.red);
            studentdetails.addActionListener(this);
            mnRecord.add(studentdetails);
            
            menuBar.add(mnRecord);
            //menuBar.add(mnHelp);
            menuBar.add(mnExit);

            
            JLabel l1 = new JLabel("Library Management System");
            l1.setForeground(new Color(204, 51, 102));
            l1.setFont(new Font("Segoe UI Semilight", Font.BOLD, 30));
            l1.setBounds(268, 30, 701, 80);
            contentPane.add(l1);

            JLabel l2 = new JLabel("");
            l2.setVerticalAlignment(SwingConstants.TOP);
            ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/addbooks.png"));
            Image i2 = i1.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            l2 = new JLabel(i3);
            l2.setBounds(60, 140, 159, 152);
            contentPane.add(l2);

            JLabel l3 = new JLabel("");
            ImageIcon i4  = new ImageIcon(ClassLoader.getSystemResource("icons/stats.png"));
            Image i5 = i4.getImage().getScaledInstance(200, 200,Image.SCALE_DEFAULT);
            ImageIcon i6 = new ImageIcon(i5);
            l3 = new JLabel(i6);
            l3.setBounds(300, 160, 134, 128);
            contentPane.add(l3);

            JLabel l4 = new JLabel("");
            ImageIcon i7  = new ImageIcon(ClassLoader.getSystemResource("icons/addstudent.png"));
            Image i8 = i7.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i9 = new ImageIcon(i8);
            l4 = new JLabel(i9);
            l4.setBounds(500, 140, 225, 152);
            contentPane.add(l4);
            
            JLabel l30 = new JLabel("");
            ImageIcon i30  = new ImageIcon(ClassLoader.getSystemResource("icons/addfaculty.png"));
            Image i31 = i30.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i32 = new ImageIcon(i31);
            l30 = new JLabel(i32);
            l30.setBounds(730, 140, 225, 152);
            contentPane.add(l30);

            b1 = new JButton("Add Books");
            b1.addActionListener(this);
            b1.setBackground(Color.PINK);
            b1.setForeground(Color.black);
            b1.setBounds(60, 320, 159, 44);
            contentPane.add(b1);

            b2 = new JButton("Statistics");
            b2.addActionListener(this);
            b2.setBackground(Color.PINK);
            b2.setForeground(Color.black);
            b2.setBounds(300, 320, 139, 44);
            contentPane.add(b2);

            b3 = new JButton("Add Student");
            b3.addActionListener(this);
            b3.setBackground(Color.PINK);
            b3.setForeground(Color.black);
            b3.setBounds(530, 320, 167, 44);
            contentPane.add(b3);
            
            b30 = new JButton("Add Faculty");
            b30.addActionListener(this);
            b30.setBackground(Color.PINK);
            b30.setForeground(Color.black);
            b30.setBounds(760, 320, 167, 44);
            contentPane.add(b30);
            

            JPanel panel = new JPanel();
            panel.setBorder(new TitledBorder(new LineBorder(new Color(250, 128, 114), 2), "Operation", TitledBorder.LEADING,
				TitledBorder.TOP, null, new Color(220, 20, 60)));
            panel.setBounds(10, 120, 950, 260);
            panel.setBackground(Color.WHITE);
            contentPane.add(panel);

            b4 = new JButton("Issue Book");
            b4.addActionListener(this);
            b4.setBackground(Color.pink);
            b4.setForeground(Color.black);
            b4.setBounds(110, 620, 143, 41);
            contentPane.add(b4);

            b5 = new JButton("Return Book");
            b5.addActionListener(this);
            b5.setBackground(Color.pink);
            b5.setForeground(Color.black);
            b5.setBounds(400, 620, 159, 41);
            contentPane.add(b5);

            b6 = new JButton("Add Journal");
            b6.addActionListener(this);
            b6.setBackground(Color.pink);
            b6.setForeground(Color.black);
            b6.setBounds(700, 620, 159, 41);
            contentPane.add(b6);

            JLabel l5 = new JLabel("");
            ImageIcon i10  = new ImageIcon(ClassLoader.getSystemResource("icons/issue.png"));
            Image i11 = i10.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i12 = new ImageIcon(i11);
            l5 = new JLabel(i12);
            l5.setBounds(100, 440, 159, 163);
            contentPane.add(l5);

            JLabel l6 = new JLabel("");
            ImageIcon i13  = new ImageIcon(ClassLoader.getSystemResource("icons/return.png"));
            Image i14 = i13.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i15 = new ImageIcon(i14);
            l6 = new JLabel(i15);
            l6.setBounds(400, 440, 139, 152);
            contentPane.add(l6);

            JLabel l7 = new JLabel("");
            ImageIcon i16  = new ImageIcon(ClassLoader.getSystemResource("icons/addjournal.png"));
            Image i17 = i16.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i18 = new ImageIcon(i17);
            l7 = new JLabel(i18);
            l7.setBounds(700, 440, 157, 152);
            contentPane.add(l7);
            

            JPanel panel2 = new JPanel();
            panel2.setBorder(new TitledBorder(new LineBorder(new Color(205, 133, 63), 2), "Action", TitledBorder.LEADING,
				TitledBorder.TOP, null, new Color(233, 150, 122)));
            panel2.setBounds(10, 420, 950, 270 );
            panel2.setBackground(Color.WHITE);
            contentPane.add(panel2);
            
            getContentPane().setBackground(Color.WHITE);
            contentPane.setBackground(Color.WHITE);
	}
        
        
        public void actionPerformed(ActionEvent ae){
            String msg = ae.getActionCommand();
            if(msg.equals("Logout")){
                setVisible(false);
		new Login_user().setVisible(true);
            }else if(msg.equals("Exit")){
                System.exit(ABORT);
            
            }else if(msg.equals("Read Me")){
            
           /* }else if(msg.equals("About Us")){
                setVisible(false);
		new aboutUs().setVisible(true);
                */
            
            }else if(msg.equals("Book Details")){
                setVisible(false);
		new BookDetails().setVisible(true);
            }else if(msg.equals("Student Details")){
                setVisible(false);
                new StudentDetails().setVisible(true);
			
            }
            
            if(ae.getSource() == b1){
                this.setVisible(false);
                new AddBook().setVisible(true);
            }
            if(ae.getSource() == b2){
                this.setVisible(false);
                new Statistics().setVisible(true);
            }
            if(ae.getSource() == b3){
                this.setVisible(false);
                new AddStudent().setVisible(true);
            }
            if(ae.getSource() == b30){
                this.setVisible(false);
                new AddFaculty().setVisible(true);
            }
            if(ae.getSource() == b4){
                this.setVisible(false);
                new IssueBook().setVisible(true);
            }
            if(ae.getSource() == b5){
                this.setVisible(false);
                new ReturnBook().setVisible(true);
            
            }
            if(ae.getSource() == b6){
                this.setVisible(false);
                new AddJournal().setVisible(true);
            
            }
            
        }
}
