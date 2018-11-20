/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2399.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team2399.robot.OI;
import org.usfirst.frc.team2399.robot.subsystems.Drivetrain;

/**
 * An example command.  You can replace me with your own command.
 */
public class KajDrive extends Command {
	Drivetrain dt;
	OI oi;
	
	public KajDrive(Drivetrain drivetrain, OI operatorInterface) {
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
		double forward = oi.getLeftStickY();
    	double turn = oi.getRightStickX();
    	
    	double leftSideSpeed = (forward + turn * (Math.abs(forward)));
    	double rightSideSpeed = (forward - turn * (Math.abs(forward)));
    	
    	if(inRange(forward, 0, 0.1 * 2))
		{
			leftSideSpeed = turn/ 2;
			rightSideSpeed = -turn / 2;
		}
    	
    	dt.drivePercent(leftSideSpeed, rightSideSpeed);
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
	
	public static boolean inRange(double first, double second, double tolerance)
	{
		double upperBound = first + tolerance;
		double lowerBound = first - tolerance;
		
		return (second < upperBound) && (second > lowerBound);
	}
}
