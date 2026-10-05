package org.firstinspires.ftc.teamcode.tankDrive;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.gamepad1;
import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;
import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.telemetry;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;


public class TankDrivebase {

    // Declare your robot's physical parts here
    private DcMotor leftDrive;
    private DcMotor rightDrive;

    private DrivebaseConstants constants;
    public TankDrivebase() {
        constants = new DrivebaseConstants();

        // Connect code variables to the Driver Station configuration names
        leftDrive  = hardwareMap.get(DcMotor.class, constants.leftMotorName);
        rightDrive = hardwareMap.get(DcMotor.class, constants.rightMotorName);

        // Tell the driver station that setup is complete
        telemetry.addData("Status", "Initialized");
    }

    public void setLeftDrive(double power) {
        leftDrive.setPower(power);
    }

    public void setRightDrive(double power) {
        rightDrive.setPower(power);
    }
}