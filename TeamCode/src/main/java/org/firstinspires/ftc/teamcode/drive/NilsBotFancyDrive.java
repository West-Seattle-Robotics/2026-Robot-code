package org.firstinspires.ftc.teamcode.drive;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class NilsBotFancyDrive {
    //motors and such
    private DcMotorEx frontLeftDrive;
    private DcMotorEx frontRightDrive;
    private DcMotorEx backLeftDrive;
    private DcMotorEx backRightDrive;

    //map hardware and such blup
    //blup blup
    public NilsBotFancyDrive(HardwareMap hardwareMap){
        frontLeftDrive = hardwareMap.get(DcMotorEx.class, NilsBotConstants.frontLeftDriveConstant);
        backRightDrive = hardwareMap.get(DcMotorEx.class, NilsBotConstants.backRightDriveConstant);
        frontRightDrive = hardwareMap.get(DcMotorEx.class, NilsBotConstants.frontRightDriveConstant);
        backLeftDrive = hardwareMap.get(DcMotorEx.class, NilsBotConstants.backLeftDriveConstant);
    }
    // Proportional Integral Derivative
    public double PID(double speed, DcMotorEx motor){
        Double Kp = NilsBotConstants.Kp;
        Double processVariable = motor.getVelocity();
        Double error = speed - processVariable;
        return Kp * error;
    }
    //ALL DIRECTIONAL DRIVE RAHHHH
    public void drive (double motorX, double motorY){
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
            frontLeftDrive.setPower(finalX - PID(finalX, frontLeftDrive));
            backRightDrive.setPower(finalX - PID(finalX, backRightDrive));
            frontRightDrive.setPower(finalY - PID(finalY, frontRightDrive));
            backLeftDrive.setPower(finalY - PID(finalY, backLeftDrive));
    }

    //this one rotates
    public void rotate (Double direction){
        frontLeftDrive.setPower(direction);
        backRightDrive.setPower(-direction);
        frontRightDrive.setPower(-direction);
        backLeftDrive.setPower(direction);
    }
}
