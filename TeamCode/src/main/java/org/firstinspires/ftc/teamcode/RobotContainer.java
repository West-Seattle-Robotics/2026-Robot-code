package org.firstinspires.ftc.teamcode;

import org.firstinspires.ftc.teamcode.tankDrive.DriveCommand;
import org.firstinspires.ftc.teamcode.tankDrive.TankDrivebase;

public class RobotContainer {
    DriveCommand driveCommand;
    TankDrivebase tankDrivebase;

    public RobotContainer() {
        tankDrivebase = new TankDrivebase();
    }

    public void periodic(){
        driveCommand.periodic();
    }
}
