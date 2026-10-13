package org.firstinspires.ftc.teamcode.collector;

public class CollectorComand {
    Collector collector;
    CollectorConstants constants;

    public CollectorComand (Collector collector) {
        this.collector = collector;
        constants = new CollectorConstants();
    }

    // Intake Method
    public void intake () {
        collector.setRollerMotorPower(constants.rollerSpeed);
        collector.setLeftAgitateMotorPower(constants.agitateLeftPower);
        collector.setRightAgitateMotorPower(constants.agitateRightPower);
    }

    // Expel Method
    public void expel () {
        collector.setRollerMotorPower(constants.rollerSpeed);
        collector.setLeftAgitateMotorPower(constants.agitateRightPower);
        collector.setRightAgitateMotorPower(constants.agitateLeftPower);
    }

    // Stop Method
    public void stop() {
        collector.setRollerMotorPower(0);
        collector.setLeftAgitateMotorPower(0);
        collector.setRightAgitateMotorPower(0);
    }
}
