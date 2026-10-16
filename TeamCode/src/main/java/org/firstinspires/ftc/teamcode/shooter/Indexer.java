package org.firstinspires.ftc.teamcode.shooter;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Indexer {
    private final DcMotor indexerMotor;

    ShooterConstants constants;

    public Indexer (HardwareMap hardwareMap) {
        constants = new ShooterConstants();
        indexerMotor = hardwareMap.get(DcMotor.class, constants.indexerID);
    }

    public void setIndexerPower (double power) {
        indexerMotor.setPower(power);
    }
}
