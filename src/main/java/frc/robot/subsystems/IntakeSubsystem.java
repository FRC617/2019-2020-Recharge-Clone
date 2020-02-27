/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class IntakeSubsystem extends SubsystemBase {
  private final Spark m_intakeMotor;

  /**
   * Creates a new DriveSubsystem.
   */
  public IntakeSubsystem() {
    m_intakeMotor = new Spark(Constants.kIntakeChannel);
  }

  public void Intake(double speed) {
    m_intakeMotor.setSpeed(speed*Constants.kMaxIntakeSpeed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}