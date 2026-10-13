package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.collector.Collector;
import org.firstinspires.ftc.teamcode.collector.CollectorComand;
import org.firstinspires.ftc.teamcode.tankDrive.DriveCommand;
import org.firstinspires.ftc.teamcode.tankDrive.TankDrivebase;

public class RobotContainer {

    // This is where we will define all commands and classes
    DriveCommand driveCommand;
    TankDrivebase tankDrivebase;

    Collector collector;
    CollectorComand collectorComand;

    Gamepad gamepad1;
    Gamepad gamepad2;
    //Hardware map is only accessible from the OpMode so if we want to create a new piece of
    // hardware we have to reference the hardware map from RobotMain
    public RobotContainer(HardwareMap hardwareMap, Gamepad gamepad1, Gamepad gamepad2) {
        // and here is where we will initiate them
        this.gamepad1 = gamepad1;
        this.gamepad2 = gamepad2;


        tankDrivebase = new TankDrivebase(hardwareMap);
        driveCommand = new DriveCommand(
                tankDrivebase,
                () -> gamepad1.left_stick_y,
                () -> gamepad1.right_stick_y);

        collector = new Collector(hardwareMap);
        collectorComand = new CollectorComand(collector);

    }

    // any method called in RobotContainer.periodic will be run constantly by RobotMain, place any
    // periodic methods in here

    public void periodic(){
        driveCommand.periodic();

        //Button bindings
        if (gamepad1.circle) {
            collectorComand.intake();
        }
        else {
            collectorComand.stop();
        }

        if(gamepad1.cross) {
            collectorComand.expel();
        }
        else {
            collectorComand.stop();
        }


    }
}
