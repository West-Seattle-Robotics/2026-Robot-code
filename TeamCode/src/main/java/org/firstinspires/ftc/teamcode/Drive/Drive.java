package org.firstinspires.ftc.teamcode.Drive;

import com.qualcomm.robotcore.hardware.DcMotor;
public class Drive
{
    private DcMotor leftMotor;
    private DcMotor rightMotor;

    /**set velocity for motors
     * @param leftVelocity
     * @param rightVelocity
     * */
    public void drive(double leftVelocity, double rightVelocity)
    {
        leftMotor.setPower(leftVelocity);
        rightMotor.setPower(rightVelocity);
    }
}
