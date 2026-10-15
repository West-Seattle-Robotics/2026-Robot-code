package org.firstinspires.ftc.teamcode.shooter;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Flywheel {
    private final DcMotor flywheel;

    private ShooterConstants constants;

    public Flywheel (HardwareMap hardwareMap) {
        flywheel = hardwareMap.get(DcMotor.class, constants.flywheelID);
    }

    public void setFlywheelPower(double power) {
        flywheel.setPower(power);
    }
}
