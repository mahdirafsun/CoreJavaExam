package employee.info.system;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class CnnEmployee {

	/**
	 * CnnEmployee class has a main methods where you will be able to create
	 * Object from EmployeeInfo class to use fields and attributes.Demonstrate
	 * as many methods as possible to use with proper business work flow.Think
	 * as a Software Architect, Product Designer and as a Software
	 * Developer.(employee.info.system) package is given as an outline,you need
	 * to elaborate more to design an application that will meet for fortune 500
	 * Employee Information Services.
	 * 
	 **/
	public static void main(String[] args) {
		String input;
		double sal;
		double percentage;
		input = JOptionPane.showInputDialog("Please enter your EmpId");
		int empID = Integer.parseInt(input);
		
		input = JOptionPane
				.showInputDialog("what would you like to do: \n 1 Calculate Bonus \n 2 calculate pension");
		int choice = Integer.parseInt(input);
		EmployeeInfo EI = new EmployeeInfo(empID);

		if (choice == 1) {
			input = JOptionPane.showInputDialog("Please enter your salary");
			sal = Integer.parseInt(input);

			input = JOptionPane
					.showInputDialog("Please enter the bonus precentage ");
			percentage = Integer.parseInt(input);
			double bonus = EI.calculateEmployeBonus(sal, percentage);
			DecimalFormat dollar = new DecimalFormat("0.00");
			JOptionPane.showMessageDialog(null,
					"Your bonus is: " + dollar.format(bonus));

		}
		if (choice == 2) {
			input = JOptionPane.showInputDialog("Please enter your salary");
			sal = Integer.parseInt(input);

			input = JOptionPane
					.showInputDialog("Please enter the bonus precentage ");
			percentage = Integer.parseInt(input);
			double pension =EI.calculateEmployePension(sal, percentage);
			DecimalFormat dollar = new DecimalFormat("0.00");
			JOptionPane.showMessageDialog(null,
					"Your bonus is: " + dollar.format(pension));
		

		} else {
			JOptionPane.showMessageDialog(null, "Invalid Entry");
			System.exit(0);
		}

	}

}
