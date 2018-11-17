/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2399.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team2399.robot.OI;
import org.usfirst.frc.team2399.robot.Robot;
import org.usfirst.frc.team2399.robot.subsystems.Drivetrain;

/**
 * An example command.  You can replace me with your own command.
 */
public class TankDrive extends Command {
	Drivetrain dt;
	OI oi;
	
	public TankDrive(Drivetrain drivetrain, OI operatorInterface) {
		dt = drivetrain;
		oi = operatorInterface;
		
		// Use requires() here to declare subsystem dependencies
		requires(dt);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		dt.tankDrive(oi.getLeftStickY(), oi.getRightStickY());
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
	}
}
