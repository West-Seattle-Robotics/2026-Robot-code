package org.firstinspires.ftc.teamcode.collector;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class collector {
    //Overhead Motor
    private DcMotor overHeadMotor;

    //Agitate motors
    private Servo agitateMotorLeft;
    private Servo agitateMotorRight;

    //Constants
    private collectorConstants constants;

    /** Collector class that contains the collector motors & methods*/
    public collector (HardwareMap hardwareMap) {
        constants = new collectorConstants();

        overHeadMotor = hardwareMap.get(DcMotor.class, constants.overheadID);
        agitateMotorLeft = hardwareMap.get(Servo.class, constants.agitateLeftID);
        agitateMotorRight = hardwareMap.get(Servo.class, constants.agitateRightID);
    }

    // Intake Method
    public void intake () {
        overHeadMotor.setPower(constants.overheadSpeed);
        agitateMotorLeft.setDirection(constants.agitateLeftDirection);
        agitateMotorRight.setDirection(constants.agitateRightDirection);
    }

    // Expel Method
    public void expel () {
        overHeadMotor.setPower(constants.overheadSpeed);
        agitateMotorLeft.setDirection(constants.agitateRightDirection);
        agitateMotorRight.setDirection(constants.agitateLeftDirection);
    }

    public void stop() {
        overHeadMotor.setPower(0);
        agitateMotorLeft.setPosition(0);
        agitateMotorRight.setPosition(0);
    }
}
