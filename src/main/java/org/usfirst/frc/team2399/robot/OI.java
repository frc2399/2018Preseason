/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2399.robot;

import org.usfirst.frc.team2399.robot.commands.Arm;
import org.usfirst.frc.team2399.robot.commands.Disarm;
import org.usfirst.frc.team2399.robot.commands.Extend;
import org.usfirst.frc.team2399.robot.commands.Retract;
import org.usfirst.frc.team2399.robot.commands.SpinIn;
import org.usfirst.frc.team2399.robot.commands.SpinOut;
import org.usfirst.frc.team2399.robot.subsystems.Drivetrain;
import org.usfirst.frc.team2399.robot.subsystems.Intake;
import org.usfirst.frc.team2399.robot.subsystems.Shooter;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
	
	Joystick xBox = new Joystick(0);
	
	Button button1;
	Button button2;
	Button button3;
	Button button4;
	Button button5;
	Button button6;
	
	public OI(Drivetrain dt, Shooter sh, Intake in){
		
		button1 = new JoystickButton(xBox, 1);
		button2 = new JoystickButton(xBox, 2);
		button3 = new JoystickButton(xBox, 3);
		button4 = new JoystickButton(xBox, 4);
		button5 = new JoystickButton(xBox, 5);
		button6 = new JoystickButton(xBox, 6);
		
		//intake
		button1.whileHeld(new SpinIn(in));
		button2.whileHeld(new SpinOut(in));
		button3.whenPressed(new Extend(in));
		button4.whenPressed(new Retract(in));
		
		//shooter
		button5.whenPressed(new Arm(sh));
		button6.whenPressed(new Disarm(sh));
		
	}
	
	public double getLeftStickX() {
		return xBox.getRawAxis(0);
	}
	
	public double getLeftStickY() {
		return xBox.getRawAxis(1) * RobotMap.LEFT_STICK_FORWARD;
	}
	
	public double getRightStickX() {
		return xBox.getRawAxis(4); 
	}
	
	public double getRightStickY() {
		return xBox.getRawAxis(5) * RobotMap.RIGHT_STICK_FORWARD; 
	}
	
	
	
}
