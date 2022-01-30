// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

public class DriveSquareGyro extends SequentialCommandGroup {
  /**
   * Creates a new Autonomous Drive based on distance. This will drive out for a specified distance,
   * turn around and drive back.
   *
   * @param drivetrain The drivetrain subsystem on which this command will run
   */
  public DriveSquareGyro(Drivetrain drivetrain) {
    addCommands(
        new DriveStraight(0.5, 5, drivetrain),
        new TurnDegreesGyro(0.5, 90, drivetrain),
        new DriveStraight(0.5, 5, drivetrain),
        new TurnDegreesGyro(0.5, 90, drivetrain),
        new DriveStraight(0.5, 5, drivetrain),
        new TurnDegreesGyro(0.5, 90, drivetrain),
        new DriveStraight(0.5, 5, drivetrain),
        new TurnDegreesGyro(0.5, 90, drivetrain));
  }
}