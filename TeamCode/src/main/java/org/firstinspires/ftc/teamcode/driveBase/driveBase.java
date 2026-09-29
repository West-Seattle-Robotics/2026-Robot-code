package org.firstinspires.ftc.teamcode.driveBase;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;

import com.qualcomm.robotcore.hardware.DcMotor;

/** The Drive Base Class*/
public class driveBase {
    //Motors
    private DcMotor frontLeft;
    private DcMotor frontRight;
    /** The drive class contains all of the drive base motors and methods to make it drive*/
    public driveBase () {
        frontLeft = hardwareMap.get(DcMotor.class, new driveConstants().frontLeft);
        frontRight = hardwareMap.get(DcMotor.class, new driveConstants().frontRight);
    }

    /** The drive method, takes values between -1 to +1 and gives the motors a speed
     * @param leftSpeed
     * @param rightSpeed
     * */
    public void drive (double leftSpeed, double rightSpeed) {
        frontLeft.setPower(leftSpeed);
        frontRight.setPower(rightSpeed);
    }
}
