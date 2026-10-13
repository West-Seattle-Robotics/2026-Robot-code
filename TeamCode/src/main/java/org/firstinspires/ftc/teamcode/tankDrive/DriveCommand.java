package org.firstinspires.ftc.teamcode.tankDrive;

import java.util.function.DoubleSupplier;

// This is a command, it runs periodically* and controls a class
public class DriveCommand {

    TankDrivebase drivebase;

    DoubleSupplier leftJoyY;
    DoubleSupplier rightJoyY;

    // DriveCommand will be passed a TankDrivebase when it's initialized in RobotContainer
    public DriveCommand(TankDrivebase drivebase, DoubleSupplier leftJoyY, DoubleSupplier rightJoyY) {
        this.drivebase = drivebase;

        this.leftJoyY = leftJoyY;
        this.rightJoyY = rightJoyY;
    }

    //This periodic method will be called by the periodic method in robot container so that it can
    // run periodically
    public void periodic() {
        // Here we are telling drivebase, our TankDrivebase class, to run the left and right motors
        // at the speed of the Y value of the joystick by calling the setLeftDrive and setRightDrive
        // methods
        drivebase.setRightDrive(leftJoyY.getAsDouble());
        drivebase.setLeftDrive(rightJoyY.getAsDouble());
    }
}
