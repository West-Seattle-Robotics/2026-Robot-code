package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.tankDrive.DriveCommand;
import org.firstinspires.ftc.teamcode.tankDrive.TankDrivebase;

public class RobotContainer {

    // This is where we will define all commands and classes
    DriveCommand driveCommand;
    TankDrivebase tankDrivebase;

    //Hardware map is only accessible from the OpMode so if we want to create a new piece of
    // hardware we have to reference the hardware map from RobotMain
    public RobotContainer(HardwareMap hardwareMap) {
        // and here is where we will initiate them
        tankDrivebase = new TankDrivebase(hardwareMap);
        driveCommand = new DriveCommand(tankDrivebase);

    }

    // any method called in RobotContainer.periodic will be run constantly by RobotMain, place any
    // periodic methods in here
    public void periodic(){
        driveCommand.periodic();
    }
}
