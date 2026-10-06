package org.firstinspires.ftc.teamcode.tankDrive;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.gamepad1;

// This is a command, it runs periodically* and controls a class
public class DriveCommand {

    TankDrivebase drivebase;

    // DriveCommand will be passed a TankDrivebase when it's initialized in RobotContainer
    public DriveCommand(TankDrivebase drivebase) {
        this.drivebase = drivebase;
    }

    //This periodic method will be called by the periodic method in robot container so that it can run periodically
    public void periodic() {
        // Here we are telling drivebase, our TankDrivebase class, to run the left and right motors
        // at the speed of the Y value of the joystick by calling the setLeftDrive and setRightDrive
        // methods
        drivebase.setRightDrive(-gamepad1.left_stick_y);
        drivebase.setLeftDrive(-gamepad1.left_stick_y);
    }
}
