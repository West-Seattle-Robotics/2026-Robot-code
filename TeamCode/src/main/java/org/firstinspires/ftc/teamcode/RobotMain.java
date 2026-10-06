package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.HardwareMap;

@TeleOp(name="Tankdrive OpMode", group="Iterative Opmode")
public class RobotMain extends OpMode {

    //robotContainer is where we will initiate all of our classes and commands
    RobotContainer robotContainer;
    public void init() {
        robotContainer = new RobotContainer(hardwareMap);
    }

    // This will constantly run the periodic method in robotContainer, if you want your command to
    // run periodically call its periodic method(s) in robotContainer.periodic
    @Override
    public void loop() {
        robotContainer.periodic();
    }
}
