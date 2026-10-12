package org.firstinspires.ftc.teamcode.shooter;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

/** Shooter class, holds all motors and methods to run shooter and indexer */
public class shooter {

    //Motors
    private DcMotor flywheel;
    private CRServo indexer;

    //Constants
    private shooterConstants constants;

    /** Shooter class, holds all motors and methods to run shooter and indexer */
    public shooter (HardwareMap hardwareMap) {
        constants = new shooterConstants();

        flywheel = hardwareMap.get(DcMotor.class, constants.flywheelID);
        indexer = hardwareMap.get(CRServo.class, constants.indexer);
    }

    /** Indexes balls in*/
    public void index () {
        indexer.setPower(constants.indexerPower);
    }

    /** Shoots the balls using flywheel*/
    public void shoot () {
        flywheel.setPower(constants.flyhweelSpeed);
    }

    public void indexStop() {
        indexer.setPower(0);
    }

    public void shootStop() {
        flywheel.setPower(0);
    }
}
