package bank.management.system;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;

public class SignUpOne extends JFrame {
	
	SignUpOne(){
		
		setLayout(null);
		
		Random ran = new Random();
		long random = Math.abs((ran.nextLong() % 9000L) + 1000L);
		
		JLabel formno = new JLabel("APPLICATION FORM NO. " + random);
		formno.setFont(new Font("Raleway", Font.BOLD, 18));
		formno.setBounds(200, 20, 700, 40);
		add(formno);
		
		JLabel personalDetails = new JLabel("Page 1 : Personal Details");
		personalDetails.setFont(new Font("Raleway", Font.BOLD, 18));
		personalDetails.setBounds(220, 50, 350, 30);
		add(personalDetails);
		
		JLabel name = new JLabel("Name: ");
		name.setFont(new Font("Raleway", Font.BOLD, 18));
		name.setBounds(100, 100, 300, 30);
		add(name);
		
		JTextField nameTextField = new JTextField();
		nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		nameTextField.setBounds(300,100,350,30);
		add(nameTextField);
		
		
		JLabel fname = new JLabel("Father's Name: ");
		fname.setFont(new Font("Raleway", Font.BOLD, 18));
		fname.setBounds(100, 140, 300, 30);
		add(fname);
		
		JTextField fnameTextField = new JTextField();
		fnameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		fnameTextField.setBounds(300,140,350,30);
		add(fnameTextField);
		
		JLabel dob = new JLabel("Date Of Birth: ");
		dob.setFont(new Font("Raleway", Font.BOLD, 18));
		dob.setBounds(100, 190, 300, 30);
		add(dob);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(300,190,350,30);
		add(dateChooser);
		
		JLabel gender = new JLabel("Gender: ");
		gender.setFont(new Font("Raleway", Font.BOLD, 18));
		gender.setBounds(100, 240, 300, 30);
		add(gender);
		
		JRadioButton male = new JRadioButton("Male");
		male.setBounds(300,240,100,30);
		add(male);
		
		JRadioButton female = new JRadioButton("Female");
		female.setBounds(450,240,100,30);
		add(female);
		
		ButtonGroup genderGroup = new ButtonGroup();
		genderGroup.add(male);
		genderGroup.add(female);
		
		JLabel email = new JLabel("Email Address: ");
		email.setFont(new Font("Raleway", Font.BOLD, 18));
		email.setBounds(100, 290, 300, 30);
		add(email);
		
		JTextField emailTextField = new JTextField();
		emailTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		emailTextField.setBounds(300,290,350,30);
		add(emailTextField);
		
		JLabel maritalStatus = new JLabel("Marital Status: ");
		maritalStatus.setFont(new Font("Raleway", Font.BOLD, 18));
		maritalStatus.setBounds(100, 340, 300, 30);
		add(maritalStatus);
		
		JRadioButton single = new JRadioButton("Single");
		single.setBounds(300,340,70,30);
		add(single);
		
		JRadioButton married = new JRadioButton("Married");
		married.setBounds(430,340,70,30);
		add(married);
		
		JRadioButton other = new JRadioButton("Other");
		other.setBounds(580,340,70,30);
		add(other);
		
		ButtonGroup maritalStatusGroup = new ButtonGroup();
		maritalStatusGroup.add(single);
		maritalStatusGroup.add(married);
		maritalStatusGroup.add(other);
		
		JLabel address = new JLabel("Address: ");
		address.setFont(new Font("Raleway", Font.BOLD, 18));
		address.setBounds(100, 390, 350, 30);
		add(address);
		
		JTextField addressTextField = new JTextField();
		addressTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		addressTextField.setBounds(300,390,350,30);
		add(addressTextField);
		
	 	JLabel city = new JLabel("City: ");
		city.setFont(new Font("Raleway", Font.BOLD, 18));
		city.setBounds(100, 440, 350, 30);
		add(city);
		
		JTextField cityTextField = new JTextField();
		cityTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		cityTextField.setBounds(300,440,350,30);
		add(cityTextField);
		
		JLabel state = new JLabel("State: ");
		state.setFont(new Font("Raleway", Font.BOLD, 18));
		state.setBounds(100, 490, 350, 30);
		add(state);
		
		JTextField stateTextField = new JTextField();
		stateTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		stateTextField.setBounds(300,490,350,30);
		add(stateTextField);
		
		JLabel pinCode = new JLabel("Pin Code: ");
		pinCode.setFont(new Font("Raleway", Font.BOLD, 18));
		pinCode.setBounds(100, 540, 350, 30);
		add(pinCode);
		
		JTextField pinCodeTextField = new JTextField();
		pinCodeTextField.setFont(new Font("Raleway", Font.BOLD, 14));
		pinCodeTextField.setBounds(300,540,350,30);
		add(pinCodeTextField);
		
		JButton next = new JButton("NEXT");
		next.setBounds(550,600, 100,30);
		next.setBackground(Color.BLACK);
		next.setForeground(Color.WHITE);
		add(next);
		
		getContentPane().setBackground(Color.WHITE);
		
		setSize(750, 700);
		setLocation(350, 05);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new SignUpOne();
	}

}
