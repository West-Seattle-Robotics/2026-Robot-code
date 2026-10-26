package org.firstinspires.ftc.teamcode.collector;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class collector {
    //Overhead Motor
    private DcMotor overHeadMotor;

    //Constants
    private collectorConstants constants;

    /** Collector class that contains the collector motors & methods*/
    public collector (HardwareMap hardwareMap) {
        constants = new collectorConstants();

        overHeadMotor = hardwareMap.get(DcMotor.class, constants.overheadID);

    }

    // Intake Method
    public void intake () {
        overHeadMotor.setPower(constants.overheadSpeed);

    }

    // Expel Method
    public void expel () {
        overHeadMotor.setPower(-constants.overheadSpeed);
      }

    public void stop() {
        overHeadMotor.setPower(0);
      }
}
