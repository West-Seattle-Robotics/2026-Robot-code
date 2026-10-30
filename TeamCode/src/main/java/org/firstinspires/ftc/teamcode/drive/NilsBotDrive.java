package org.firstinspires.ftc.teamcode.drive;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class NilsBotDrive {
    //motors and such
    private DcMotor frontLeftDrive;
    private DcMotor frontRightDrive;
    private DcMotor backLeftDrive;
    private DcMotor backRightDrive;

    //map hardware and such blup
    //blup blup
    public NilsBotDrive(HardwareMap hardwareMap){
        frontLeftDrive = hardwareMap.get(DcMotor.class, NilsBotConstants.frontLeftDriveConstant);
        frontRightDrive = hardwareMap.get(DcMotor.class, NilsBotConstants.frontRightDriveConstant);
        backLeftDrive = hardwareMap.get(DcMotor.class, NilsBotConstants.backLeftDriveConstant);
        backRightDrive = hardwareMap.get(DcMotor.class, NilsBotConstants.backRightDriveConstant);
    }

    public void drive (double frontLeftSpeed, double frontRightSpeed, double backLeftSpeed, double backRightSpeed){
        double x;
        double y;
        frontLeftDrive.setPower(frontLeftSpeed);
        frontRightDrive.setPower(frontRightSpeed);
        backLeftDrive.setPower(speed);
        backRightDrive.setPower(speed);

    }
}
