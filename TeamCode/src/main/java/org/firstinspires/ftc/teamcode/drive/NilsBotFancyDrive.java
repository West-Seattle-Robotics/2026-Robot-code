package org.firstinspires.ftc.teamcode.drive;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class NilsBotFancyDrive {
    //motors and such
    private DcMotor frontLeftDrive;
    private DcMotor frontRightDrive;
    private DcMotor backLeftDrive;
    private DcMotor backRightDrive;

    //map hardware and such blup
    //blup blup
    public NilsBotFancyDrive(HardwareMap hardwareMap){
        frontLeftDrive = hardwareMap.get(DcMotor.class, NilsBotConstants.frontLeftDriveConstant);
        backRightDrive = hardwareMap.get(DcMotor.class, NilsBotConstants.backRightDriveConstant);
        frontRightDrive = hardwareMap.get(DcMotor.class, NilsBotConstants.frontRightDriveConstant);
        backLeftDrive = hardwareMap.get(DcMotor.class, NilsBotConstants.backLeftDriveConstant);
    }

    public void drive (double motorX, double motorY){
        {
            double powerX = motorX;
            double powerY = motorY;
            double powerConstant = Math.atan2(powerX, powerY);
            double pi = Math.PI;

            double finalX = (Math.sin(powerConstant + (pi / 4)));
            double finalY = (Math.cos(powerConstant + (pi / 4)));

            if(finalX < 0){
                powerX *= -1;
            }
            if(finalY < 0){
                powerY *= -1;
            }

            if(powerX == 0){
                finalX *= powerY;
                finalY *= powerY;

            }
            if(powerY == 0) {
                finalY *= powerX;
                finalX *= powerX;
            }
            frontLeftDrive.setPower(finalX);
            backRightDrive.setPower(finalX);
            frontRightDrive.setPower(finalY);
            backLeftDrive.setPower(finalY);
            ;
        }
    }
}
