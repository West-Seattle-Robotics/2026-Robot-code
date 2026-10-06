package org.firstinspires.ftc.teamcode.tankDrive;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.gamepad1;
import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;
import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.telemetry;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;


public class TankDrivebase {

    // Declare your robot's physical parts here
    private final DcMotor leftDrive;
    private final DcMotor rightDrive;

    private final DrivebaseConstants constants;

    // We have to get this hardwareMap from the OpMode RobotMain because it's only acessible from the
    // OpMode
    public TankDrivebase(HardwareMap hardwareMap) {
        constants = new DrivebaseConstants();

        // Connect code variables to the Driver Station configuration names
        leftDrive  = hardwareMap.get(DcMotor.class, DrivebaseConstants.leftMotorName);
        rightDrive = hardwareMap.get(DcMotor.class, DrivebaseConstants.rightMotorName);

        // Tell the driver station that setup is complete
        telemetry.addData("Status", "Initialized");
    }

    // These methods will be used the DriveCommand command
    public void setLeftDrive(double power) {
        leftDrive.setPower(power);
    }

    public void setRightDrive(double power) {
        rightDrive.setPower(power);
    }
}