package org.firstinspires.ftc.teamcode.shooter;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Shooter {
    private final Flywheel flywheel;
    private final Indexer indexer;

    private ShooterConstants constants;

    public Shooter (Flywheel flywheel, Indexer indexer) {
        constants = new ShooterConstants();

        this.flywheel = flywheel;
        this.indexer = indexer;
    }

    public void setFlywheelPower(double power) {
        flywheel.setPower(power);
    }

    public void setIndexerPower(double power) {
        indexer.setPower(power);
    }
}
