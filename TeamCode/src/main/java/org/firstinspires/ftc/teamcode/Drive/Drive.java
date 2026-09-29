package org.firstinspires.ftc.teamcode.Drive;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;

//tank drive
public class Drive
{
    private DcMotor frontLeft, frontRight;
    public DriveConstants constants = new DriveConstants();
    /** This is the drive class constructor*/
    public Drive()
    {
        frontLeft = hardwareMap.get(DcMotor.class, constants.frontLeft);
        frontRight = hardwareMap.get(DcMotor.class, constants.frontRight);
    }

    /**set velocity for motors
     * @param leftVelocity
     * @param rightVelocity
     * */
    public void drive(double leftVelocity, double rightVelocity)
    {
        frontLeft.setPower(leftVelocity);
        frontRight.setPower(rightVelocity);
    }
}