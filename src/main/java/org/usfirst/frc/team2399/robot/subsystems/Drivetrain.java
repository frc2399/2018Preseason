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
	
	TalonSRX leftSide, rightSide;

	public Drivetrain() {
		leftSide = new TalonSRX(3);
		rightSide = new TalonSRX(7);
	}
	
	public void tankDrive(double left, double right) {
		double leftSpeed = left * RobotMap.LEFT_FORWARD;
		double rightSpeed = right * RobotMap.RIGHT_FORWARD;
		
		leftSide.set(ControlMode.PercentOutput, leftSpeed);
		rightSide.set(ControlMode.PercentOutput, rightSpeed);
	}
	
	public void initDefaultCommand(Command c) {
		setDefaultCommand(c);
	}

	@Override
	protected void initDefaultCommand() {		
	}
}
