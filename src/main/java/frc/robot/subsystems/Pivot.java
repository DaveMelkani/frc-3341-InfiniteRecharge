/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Robot;
import frc.robot.commands.RotatePivot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.Joystick;



public class Pivot extends SubsystemBase {
  /**
   * Creates a new Pivot.
   */
    private final TalonSRX motorLeft = new TalonSRX(2);
  private final TalonSRX motorRight = new TalonSRX(3);
  public boolean canUseLeadScrew;

  public void Pivot(final double JOY) {
    motorLeft.set(ControlMode.PercentOutput, JOY);
    motorRight.set(ControlMode.PercentOutput, -JOY);
}
  public Pivot() {

  }

  @Override
  public void periodic() {
    setDefaultCommand(new RotatePivot());
    // This method will be called once per scheduler run
    //Pivot(Robot.m_robotContainer.getPivotJoy().getY());
  }
  public TalonSRX getPivotTalon() {
    return motorLeft;
  }
}
