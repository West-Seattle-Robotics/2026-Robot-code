package org.firstinspires.ftc.teamcode.collector;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Collector {
    //Top roller motor
    private DcMotor rollerMotor;

    //Left and right agitate motors
    private CRServo agitateMotorLeft;
    private CRServo agitateMotorRight;

    //Constants
    private CollectorConstants constants;

    /** Collector class that contains the collector motors & methods*/
    public Collector (HardwareMap hardwareMap) {
        constants = new CollectorConstants();

        rollerMotor = hardwareMap.get(DcMotor.class, constants.rollerID);
        agitateMotorLeft = hardwareMap.get(CRServo.class, constants.agitateLeftID);
        agitateMotorRight = hardwareMap.get(CRServo.class, constants.agitateRightID);
    }

    public void setRollerMotorPower(double power) {
        rollerMotor.setPower(power);
    }

    public void setLeftAgitateMotorPower(double power) {
        agitateMotorLeft.setPower(power);
    }

    public void setRightAgitateMotorPower(double power) {
        agitateMotorRight.setPower(power);
    }
}