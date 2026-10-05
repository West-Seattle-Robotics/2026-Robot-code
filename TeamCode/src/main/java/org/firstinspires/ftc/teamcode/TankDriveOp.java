package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.tankDrive.TankDrivebase;

@TeleOp(name="Tankdrive OpMode", group="Iterative Opmode")
public class TankDriveOp extends OpMode {
    RobotContainer robotContainer;
    public void init() {
        robotContainer = new RobotContainer();
    }

    @Override
    public void loop() {
        robotContainer.periodic();
    }
}
