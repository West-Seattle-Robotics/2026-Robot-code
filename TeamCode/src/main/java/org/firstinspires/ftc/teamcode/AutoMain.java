package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Autonomous(name="Tankdrive OpMode Auto", group="Iterative Opmode", preselectTeleOp = "Tankdrive OpMode")
public class AutoMain extends OpMode {

    //robotContainer is where we will initiate all of our classes and commands
    RobotContainer robotContainer;
    public void init() {
        Globals.robotContainer = new RobotContainer(hardwareMap, gamepad1, gamepad2);
        Globals.autoHasRun = true;
    }

    // This will constantly run the periodic method in robotContainer, if you want your command to
    // run periodically call its periodic method(s) in robotContainer.periodic
    @Override
    public void loop() {
        robotContainer.periodic();
    }
}
