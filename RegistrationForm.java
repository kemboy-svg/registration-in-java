/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrationform;
  import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
class tablet
    extends JFrame
    implements ActionListener {
 
    
    private final JLabel title;
    private final Container c;
    private final JLabel name;
    private final JTextField tname;
    private final JLabel Lname;
    private final JTextField lname;
    private final JLabel reg;
    private final JTextField regno;
    private final JLabel gender;
    private final JRadioButton male;
    private final JRadioButton female;
    private final ButtonGroup gengp;
    private final JLabel course;
    private final JComboBox type;
    private final JCheckBox term;
    private final JButton sub;
    private final JButton reset;
    private final JTextArea textout;
    private final JLabel res;
    private final JTextArea resadd;
 
    private final String types[]
        = { "BIT", "BCS", "BSE",};
   
   
 
    // constructor, to initialize the components
    // with default values.
    public tablet()
    {
        setTitle("Registration Form");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
 
        c = getContentPane();
        c.setLayout(null);
 
        title = new JLabel("Student Resgistration Form");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(400, 30);
        title.setLocation(200, 30);
        c.add(title);
 
        name = new JLabel(" First name");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setSize(120, 20);
        name.setLocation(80, 100);
        c.add(name);
        
        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(190, 20);
        tname.setLocation(200, 100);
        c.add(tname);
        
        Lname = new JLabel("Last name");
        Lname.setFont(new Font("Arial", Font.PLAIN, 20));
        Lname.setSize(100, 20);
        Lname.setLocation(84, 140);
        c.add(Lname);
       
        lname = new JTextField();
        lname.setFont(new Font("Arial", Font.PLAIN, 15));
        lname.setSize(190, 20);
        lname.setLocation(200, 140);
        c.add(lname);
 
        reg = new JLabel("Reg No:");
        reg.setFont(new Font("Arial", Font.PLAIN, 20));
        reg.setSize(100, 20);
        reg.setLocation(100, 190);
        c.add(reg);
 
        regno = new JTextField();
        regno.setFont(new Font("Arial", Font.PLAIN, 15));
        regno.setSize(150, 20);
        regno.setLocation(200, 190);
        c.add(regno);
 
        gender = new JLabel("Gender");
        gender.setFont(new Font("Arial", Font.PLAIN, 20));
        gender.setSize(100, 20);
        gender.setLocation(100, 240);
        c.add(gender);
 
        male = new JRadioButton("Male");
        male.setFont(new Font("Arial", Font.PLAIN, 15));
        male.setSelected(true);
        male.setSize(75, 20);
        male.setLocation(200, 240);
        c.add(male);
 
        female = new JRadioButton("Female");
        female.setFont(new Font("Arial", Font.PLAIN, 15));
        female.setSelected(false);
        female.setSize(80, 20);
        female.setLocation(275, 240);
        c.add(female);
 
        gengp = new ButtonGroup();
        gengp.add(male);
        gengp.add(female);
 
        course = new JLabel("Course");
        course.setFont(new Font("Arial", Font.PLAIN, 20));
        course.setSize(100, 20);
        course.setLocation(100, 280);
        c.add(course);
 
        type = new JComboBox();
        type.setFont(new Font("Arial", Font.PLAIN, 15));
        type.setSize(50, 20);
        type.setLocation(200, 280);
        c.add(type);
 
 
        term = new JCheckBox("Accept Terms And Conditions.");
        term.setFont(new Font("Arial", Font.PLAIN, 15));
        term.setSize(250, 20);
        term.setLocation(150, 320);
        c.add(term);
 
        sub = new JButton("Ok");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(150, 350);
        sub.addActionListener(this);
        c.add(sub);
 
        reset = new JButton("Cancel");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(270, 350);
        reset.addActionListener(this);
        c.add(reset);
 
        textout = new JTextArea();
        textout.setFont(new Font("Arial", Font.PLAIN, 15));
        textout.setSize(300, 200);
        textout.setLocation(500, 100);
        textout.setLineWrap(true);
        textout.setEditable(false);
        c.add(textout);
 
        res = new JLabel("");
        res.setFont(new Font("Arial", Font.PLAIN, 20));
        res.setSize(200, 25);
        res.setLocation(100, 500);
        c.add(res);
 
        resadd = new JTextArea();
        resadd.setFont(new Font("Arial", Font.PLAIN, 15));
        resadd.setSize(200, 75);
        resadd.setLocation(580, 175);
        resadd.setLineWrap(true);
        c.add(resadd);
 
        setVisible(true);
    }
 
    // method actionPerformed()
    // to get the action performed
    // by the user and act accordingly
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == sub) {
            if (term.isSelected()) {
                String data1;
                String data
                    = "Name : "
                      + tname.getText() + "\n"
                     +"Last Name : "+lname.getText()+"\n" + "Reg No : "
                      + regno.getText() + "\n";
                if (male.isSelected())
                    data1 = "Gender : Male\n";
                else
                    data1 = "Gender : Female\n";
                String data2
                    = "Course : "
                      + (String)type.getSelectedItem() + "\n";
 
              
                textout.setText(data + data1 + data2  );
                textout.setEditable(false);
                res.setText("Registration Successfully..");
            }
            else {
                textout.setText("");
                resadd.setText("");
               
            }
        }
 
        else if (e.getSource() == reset) {
            String def = "";
            tname.setText(def);
            lname.setText(def);
            regno.setText(def);
            res.setText(def);
            textout.setText(def);
            term.setSelected(false);
            type.setSelectedIndex(0);
            resadd.setText(def);
        }
    }
}


/**
 *
 * @author Elias
 */
public class RegistrtionForm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                 tablet f = new tablet();
        // TODO code application logic here
    }
    
}
