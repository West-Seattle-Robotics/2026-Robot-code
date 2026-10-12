package org.firstinspires.ftc.teamcode.collector;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class collector {
    //Overhead Motor
    private DcMotor overHeadMotor;

    //Agitate motors
    private CRServo agitateMotorLeft;
    private CRServo agitateMotorRight;

    //Constants
    private collectorConstants constants;

    /** Collector class that contains the collector motors & methods*/
    public collector (HardwareMap hardwareMap) {
        constants = new collectorConstants();

        overHeadMotor = hardwareMap.get(DcMotor.class, constants.overheadID);
        agitateMotorLeft = hardwareMap.get(CRServo.class, constants.agitateLeftID);
        agitateMotorRight = hardwareMap.get(CRServo.class, constants.agitateRightID);
    }

    // Intake Method
    public void intake () {
        overHeadMotor.setPower(constants.overheadSpeed);
        agitateMotorLeft.setPower(constants.agitateLeftPower);
        agitateMotorRight.setPower(constants.agitateRightPower);
    }

    // Expel Method
    public void expel () {
        overHeadMotor.setPower(constants.overheadSpeed);
        agitateMotorLeft.setPower(constants.agitateRightPower);
        agitateMotorRight.setPower(constants.agitateLeftPower);
    }

    public void stop() {
        overHeadMotor.setPower(0);
        agitateMotorLeft.setPower(0);
        agitateMotorRight.setPower(0);
    }
}
