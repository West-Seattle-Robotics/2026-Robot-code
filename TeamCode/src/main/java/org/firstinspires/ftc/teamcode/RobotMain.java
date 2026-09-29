package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.collector.collector;
import org.firstinspires.ftc.teamcode.driveBase.driveBase;
import org.firstinspires.ftc.teamcode.shooter.shooter;

@TeleOp(name="Main Teleop Mode", group="Iterative Opmode")
public class RobotMain extends OpMode {
    // Declare your robot's physical parts here
    private driveBase driveBase;
    private collector collector;
    private shooter shooter;


    @Override
    public void init() {
        // Set up parts
        driveBase = new driveBase();
        collector = new collector();
        shooter = new shooter();

        // Tell the driver station that setup is complete
        telemetry.addData("Status", "Initialized");
    }


    @Override
    public void loop() {
        //Set part movements to controller inputs
        driveBase.drive(-gamepad1.left_stick_y, -gamepad1.right_stick_y);

        while(gamepad1.a) {
            collector.intake();
        }

        while(gamepad1.b) {
            collector.expel();
        }

        while(gamepad1.left_trigger_pressed) {
            shooter.index();
        }

        while(gamepad1.right_trigger_pressed) {
            shooter.shoot();
        }
        // Display current information back to the controller screen TODO: Later

    }
}