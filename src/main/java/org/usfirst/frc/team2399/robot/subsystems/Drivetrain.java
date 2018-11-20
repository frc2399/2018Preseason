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

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class Drivetrain extends Subsystem {
	
	TalonSRX leftSide, rightSide;

	public Drivetrain() {
		leftSide = new TalonSRX(7);
		rightSide = new TalonSRX(3);
	}
	
	public void drivePercent(double leftPercent, double rightPercent) {
		
		double leftPercentForward = leftPercent * RobotMap.LEFT_FORWARD;
		double rightPercentForward = rightPercent * RobotMap.RIGHT_FORWARD;
		
		leftSide.set(ControlMode.PercentOutput, leftPercentForward);
		rightSide.set(ControlMode.PercentOutput, rightPercentForward);
	
	}
	
	public void initDefaultCommand(Command c) {
		setDefaultCommand(c);
	}

	@Override
	protected void initDefaultCommand() {		
	}
}
