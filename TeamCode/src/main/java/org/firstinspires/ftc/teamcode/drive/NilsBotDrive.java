package org.firstinspires.ftc.teamcode.drive;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class NilsBotDrive {
    //motors and such
    private DcMotor leftDrive;
    private DcMotor rightDrive;

    //map hardware and such
    public NilsBotDrive(HardwareMap hardwareMap){
        leftDrive = hardwareMap.get(DcMotor.class, "leftDrive");
        rightDrive = hardwareMap.get(DcMotor.class, "rightDrive");
    }

    public void drive (double leftSpeed, double rightSpeed){
        leftDrive.setPower(leftSpeed);
        rightDrive.setPower(rightSpeed);
    }


}
