package org.usfirst.frc.team2399.robot.commands;

import org.usfirst.frc.team2399.robot.subsystems.Intake;

import edu.wpi.first.wpilibj.command.Command;

public class IntakeDoNothing extends Command {

	private Intake in;

	public IntakeDoNothing(Intake in) {
		this.in = in;
		requires(in);
		setInterruptible(true);
	}
		
	@Override
	protected void execute() {
		in.setSpeed(0);
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

}
