package org.usfirst.frc.team2399.robot.commands;

import org.usfirst.frc.team2399.robot.subsystems.Intake;

import edu.wpi.first.wpilibj.command.Command;

public class SpinOut extends Command {

	Intake in;

	public SpinOut(Intake in){
		this.in = in;
		requires(in);
	}

	@Override
	protected void initialize() {
	}

	@Override
	protected void execute() {
		in.setSpeed(-1);
	}

	@Override
	protected void end() {
		super.end();
	}

	@Override
	protected boolean isFinished() {
		return false;
	}
}
