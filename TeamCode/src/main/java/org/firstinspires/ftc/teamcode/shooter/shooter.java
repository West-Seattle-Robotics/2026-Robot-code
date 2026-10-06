package org.firstinspires.ftc.teamcode.shooter;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

/** Shooter class, holds all motors and methods to run shooter and indexer */
public class shooter {

    //Motors
    private DcMotor flywheel;
    private Servo indexer;

    //Constants
    private shooterConstants constants;

    /** Shooter class, holds all motors and methods to run shooter and indexer */
    public shooter (HardwareMap hardwareMap) {
        constants = new shooterConstants();

        flywheel = hardwareMap.get(DcMotor.class, constants.flywheelID);
        indexer = hardwareMap.get(Servo.class, constants.indexer);
    }

    /** Indexes balls in*/
    public void index () {
        indexer.setDirection(constants.indexerDirection);
    }

    /** Shoots the balls using flywheel*/
    public void shoot () {
        flywheel.setPower(constants.flyhweelSpeed);
    }

    public void indexStop() {
        indexer.setPosition(0);
    }

    public void shootStop() {
        flywheel.setPower(0);
    }
}
