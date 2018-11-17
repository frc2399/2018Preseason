package org.usfirst.frc.team2399.robot.commands;

import org.usfirst.frc.team2399.robot.subsystems.Intake;
import org.usfirst.frc.team2399.robot.subsystems.Shooter;

import edu.wpi.first.wpilibj.command.Command;

public class Arm extends Command {

	Shooter shooter;

	public Arm(Shooter shooter){
		this.shooter = shooter;
		requires(shooter);
	}

	@Override
	protected void initialize() {
	}

	@Override
	protected void execute() {
		shooter.arm();
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
