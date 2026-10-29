package org.firstinspires.ftc.teamcode.driveBase;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

/** The Drive Base Class*/
public class driveBase {
    //Motors
    private DcMotor frontLeft;
    private DcMotor frontRight;

    private DcMotor backLeft;
    private DcMotor backRight;

    //movement percent speed
    private double speedPercentage;

    /** The drive class contains all of the drive base motors and methods to make it drive*/
    public driveBase (HardwareMap hardwareMap) {
        frontLeft = hardwareMap.get(DcMotor.class, new driveConstants().frontLeft);
        frontRight = hardwareMap.get(DcMotor.class, new driveConstants().frontRight);
        backRight = hardwareMap.get(DcMotor.class, new driveConstants().backRight);
        backLeft = hardwareMap.get(DcMotor.class, new driveConstants().backLeft);
        speedPercentage = new driveConstants().speedPercentage;
    }

    /** The drive method, takes values between -1 to +1 and gives the motors a speed
     * @param leftSpeed
     * @param rightSpeed
     * */
    public void drive (double speedForward, double strafeSpeed){
        double a = Math.abs(strafeSpeed/2);
        double b = strafeSpeed/2;
        double fl = speedForward - a - b;
        double fr = speedForward - a + b;
        double bl = speedForward - a + b;
        double br = speedForward - a - b;
        frontLeft.setPower(fl * speedPercentage);
        frontRight.setPower(fr * speedPercentage);
        backRight.setPower(bl * speedPercentage);
        backLeft.setPower(br * speedPercentage);
    }


    //end added
}
