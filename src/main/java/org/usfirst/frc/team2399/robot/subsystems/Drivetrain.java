/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2399.robot.subsystems;

import org.usfirst.frc.team2399.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class Drivetrain extends Subsystem {
	
	TalonSRX leftFront, rightFront;
	VictorSPX leftMiddle, leftBack, rightMiddle, rightBack;

	public Drivetrain() {
		leftFront = new TalonSRX(14);
		leftMiddle = new VictorSPX(13);
		leftBack = new VictorSPX(15);
		rightFront = new TalonSRX(21);
		rightMiddle = new VictorSPX(20);
		rightBack = new VictorSPX(22);	
		
		leftMiddle.follow(leftFront);
		leftBack.follow(leftFront);
		rightMiddle.follow(rightFront);
		rightBack.follow(rightFront);
	}
	
	public void tankDrive(double left, double right) {
		double leftSpeed = left * RobotMap.LEFT_FORWARD;
		double rightSpeed = right * RobotMap.RIGHT_FORWARD;
		
		leftFront.set(ControlMode.PercentOutput, leftSpeed);
		rightFront.set(ControlMode.PercentOutput, rightSpeed);
	}
	
	public void initDefaultCommand(Command c) {
		setDefaultCommand(c);
	}

	@Override
	protected void initDefaultCommand() {		
	}
}
