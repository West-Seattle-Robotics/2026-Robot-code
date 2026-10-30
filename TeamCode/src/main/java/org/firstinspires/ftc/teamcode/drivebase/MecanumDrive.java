package org.firstinspires.ftc.teamcode.drivebase;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class MecanumDrive
{
    //Motors
    private DcMotor frontLeft, frontRight, backLeft, backRight;

    /**
     * Maps motors
     *
     * NOTE:
     * Reverses left motors(?)
     * Constructor or init?
     * Add encoders?
     */
    public MecanumDrive (HardwareMap hardwareMap)
    {
        frontLeft = hardwareMap.get(DcMotor.class, new DriveConstants().frontLeft);
        frontRight = hardwareMap.get(DcMotor.class, new DriveConstants().frontRight);
        backLeft = hardwareMap.get(DcMotor.class, new DriveConstants().backLeft);
        backRight = hardwareMap.get(DcMotor.class, new DriveConstants().backRight);

        //Mirroring might be an issue, test with and without
        frontLeft.setDirection(DcMotor.Direction.REVERSE);
        backLeft.setDirection(DcMotor.Direction.REVERSE);
    }

    /**
     * Moves robot based on robot's orientation
     * Left joystick controls front/back/left/right - (relative to robot's position)
     * Right joystick controls rotation
     *
     * @param leftX left joystick x-axis value, strafing
     * @param leftY left joystick y-axis value, forward/backward
     * @param rightX right joystick x-axis value, rotation
     *
     * NOTE: diagonal motors should move the same direction for strafing
     */
    public void drive(double leftX, double leftY, double rightX)
    {
        //Power for each motor
        double frontLeftPower = leftX + leftY + rightX;
        double backLeftPower = -leftX + leftY + rightX;
        double frontRightPower = -leftX + leftY - rightX;
        double backRightPower = leftX + leftY - rightX;

        /*
        - ratioMaintainer maintains the power ratio between motors if power exceeds 1.0 or -1.0
        - prevents greater values from getting clamped(I think)

        TODO: Find out if it actually has a cap at 1.0 or -1.0
        I'm pretty sure the value gets clipped if > abs.1
         */
        double ratioMaintainer = 1.0;
        ratioMaintainer = Math.max(ratioMaintainer, Math.abs(frontLeftPower));
        ratioMaintainer = Math.max(ratioMaintainer, Math.abs(backRightPower));
        ratioMaintainer = Math.max(ratioMaintainer, Math.abs(frontRightPower));
        ratioMaintainer = Math.max(ratioMaintainer, Math.abs(backLeftPower));


        /*
        Sets power to each motor
        Scale with ratioMaintainer if necessary
         */
        frontLeft.setPower(frontLeftPower / ratioMaintainer);
        backRight.setPower(backRightPower / ratioMaintainer);
        frontRight.setPower(frontRightPower / ratioMaintainer);
        backLeft.setPower(backLeftPower / ratioMaintainer);
    }

    //NOTE: need imu probably
    public void fieldDrive (double leftX, double leftY, double rightX)
    {

    }

    //left joystick backwards: spins the robot clockwise
    //left joystick left: front wheels spin backwards, back wheels spin forwards
    //left right: same as last, but reversed I think
    //left joystick forward: spins the wheel counter-clockwise

    //right joystick right: robot drives straight backwards
    //right joystick left: robot drives straight forwards

    //some input from right joystick yAxis for some reason
}
