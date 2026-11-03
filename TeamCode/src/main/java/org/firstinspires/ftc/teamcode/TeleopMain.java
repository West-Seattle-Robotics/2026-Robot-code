package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="Tankdrive OpMode", group="Iterative Opmode")
public class TeleopMain extends OpMode {

    //robotContainer is where we will initiate all of our classes and commands
    RobotContainer robotContainer;
    public void init() {
        // Here we are checking whether or not the auto was run so that we can know whether or not to
        // create a new robotContainer or use the one the autonomous already created. We want to do
        // this so that we can keep information from the classes like mechanism states, setpoints,
        // or other important information between teleop and Autonomous, if Teleop and Autonomous
        // don't use this same robotContainer we will lose this information.

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

