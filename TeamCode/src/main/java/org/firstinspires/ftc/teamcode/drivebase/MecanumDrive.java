package org.firstinspires.ftc.teamcode.drivebase;

import com.qualcomm.hardware.rev.RevHubOrientationOnRobot;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.IMU;

public class MecanumDrive
{
    //TODO: reset yaw?

    //Motors
    private DcMotor frontLeft, frontRight, backLeft, backRight;

    IMU imu;

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
        /* Just in case
        frontLeft = hardwareMap.get(DcMotor.class, "FrontLeft");
        frontRight = hardwareMap.get(DcMotor.class, "FrontRight");
        backLeft = hardwareMap.get(DcMotor.class, "BackLeft");
        backRight = hardwareMap.get(DcMotor.class, "BackRight");
         */

        frontLeft = hardwareMap.get(DcMotor.class, new DriveConstants().frontLeft);
        frontRight = hardwareMap.get(DcMotor.class,new DriveConstants().frontRight);
        backLeft = hardwareMap.get(DcMotor.class, new DriveConstants().backLeft);
        backRight = hardwareMap.get(DcMotor.class, new DriveConstants().backRight);

        //Mirroring might be an issue, test with and without
        frontLeft.setDirection(DcMotor.Direction.REVERSE);
        backLeft.setDirection(DcMotor.Direction.REVERSE);
/*
        //TODO: try with and without encoder
        frontLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        frontRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        backLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        backRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        //IMU stuff
        imu = hardwareMap.get(IMU.class, "imu");
        //Logo position, change as needed
        RevHubOrientationOnRobot.LogoFacingDirection logoDirection = RevHubOrientationOnRobot.LogoFacingDirection.UP;
        //USB position, change as needed
        RevHubOrientationOnRobot.UsbFacingDirection usbDirection = RevHubOrientationOnRobot.UsbFacingDirection.LEFT;
        //RevHubOrientation stuff
        RevHubOrientationOnRobot orientationOnRobot = new RevHubOrientationOnRobot(logoDirection, usbDirection);
        //Initialize IMU based on the revhub orientation
        imu.initialize(new IMU.Parameters(orientationOnRobot));
 */

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

    /**
     * Drive the robot based on the field instead of the robot
     * @param leftX left joystick x-axis value, strafing
     * @param leftY left joystick y-axis value, forward/backward
     * @param rightX right joystick x-axis value, rotation
     */
    public void fieldDrive (double leftX, double leftY, double rightX)
    {
        double newLeftX, newLeftY;

        //use corrected values to drive
    }
}
