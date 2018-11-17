/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2399.robot.subsystems;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;

	/**
	 * An example subsystem.  You can replace me with your own Subsystem.
	 */
	public class Intake extends Subsystem {
	
	//solenoid = pneumatics
	DoubleSolenoid extender;
	VictorSPX victor1;
	
	public Intake() {
		victor1 = new VictorSPX(9);
		extender = new DoubleSolenoid(3, 7, 6);
	}
	
	@Override
	protected void initDefaultCommand() {
	}

	public void initDefaultCommand(Command c) {
			setDefaultCommand(c);
		}

	public void setSpeed(double speed) {
		victor1.set(ControlMode.PercentOutput, speed);
	}

	public void extend(){
		extender.set(DoubleSolenoid.Value.kForward);
	}

	public void retract(){
		extender.set(DoubleSolenoid.Value.kReverse);
	}
	
}	