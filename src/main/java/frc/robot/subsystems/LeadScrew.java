/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.commands.Screwing;

public class LeadScrew extends SubsystemBase {
  /**
   * Creates a new leadScrew.
   */
  private TalonSRX screw = new TalonSRX(4);
  private boolean lock = true;

  public LeadScrew() {
    //this.setDefaultCommand(new Screwing());
  }
  public TalonSRX getScrewTalon() {
    return screw;
  }
  public void setLock(boolean lock) {
    this.lock = lock;
  }
  public boolean getLock() {
    return lock;
  }
  public boolean atTop() {
    return screw.getSensorCollection().isRevLimitSwitchClosed(); //this code is meant for the way the PowerUp limit switches were configured
  }
  public boolean atBottom() {
    return screw.getSensorCollection().isFwdLimitSwitchClosed();
  }
  public void spin(double speed){
    screw.set(ControlMode.PercentOutput,speed);
  }

  @Override
  public void periodic() {
    //setDefaultCommand(new Screwing());
    // This method will be called once per scheduler run
  }
  
}