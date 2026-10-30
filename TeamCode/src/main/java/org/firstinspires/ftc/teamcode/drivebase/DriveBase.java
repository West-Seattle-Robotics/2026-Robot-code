package org.firstinspires.ftc.teamcode.drivebase;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

/** The Drive Base Class*/
public class DriveBase {
    //Motors
    private DcMotor frontLeft;
    private DcMotor frontRight;

    //movement percent speed
    private double speedPercentage;

    /** The drive class contains all of the drive base motors and methods to make it drive*/
    public DriveBase (HardwareMap hardwareMap) {
        frontLeft = hardwareMap.get(DcMotor.class, new DriveConstants().frontLeft);
        frontRight = hardwareMap.get(DcMotor.class, new DriveConstants().frontRight);
    }

    /** The drive method, takes values between -1 to +1 and gives the motors a speed
     * @param leftSpeed
     * @param rightSpeed
     * */
    public void drive (double leftSpeed, double rightSpeed) {
        frontLeft.setPower(leftSpeed * speedPercentage);
        frontRight.setPower(rightSpeed * speedPercentage);
    }
}
