package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="Tankdrive OpMode", group="Iterative Opmode")
public class TeleopMain extends OpMode {

    //robotContainer is where we will initiate all of our classes and commands
    RobotContainer robotContainer;
    public void init() {
        if (!Globals.autoHasRun) {
            robotContainer = Globals.robotContainer;
        }
        else {
            robotContainer = new RobotContainer(hardwareMap, gamepad1, gamepad2);
        }
    }

    // This will constantly run the periodic method in robotContainer, if you want your command to
    // run periodically call its periodic method(s) in robotContainer.periodic
    @Override
    public void loop() {
        robotContainer.periodic();
    }
}

