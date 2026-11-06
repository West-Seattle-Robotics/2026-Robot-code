package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.collector.collector;
import org.firstinspires.ftc.teamcode.drivebase.MecanumDrive;
import org.firstinspires.ftc.teamcode.shooter.shooter;

@TeleOp(name="Mecanum Teleop", group="Iterative Opmode")

public class MecanumMain extends OpMode
{

    private MecanumDrive mecDrive;
    private collector collector;
    private shooter shooter;

    @Override
    public void init()
    {
        mecDrive = new MecanumDrive(hardwareMap);
        collector = new collector(hardwareMap);
        shooter = new shooter(hardwareMap);
    }

    @Override
    public void loop()
    {
        mecDrive.drive(gamepad1.left_stick_x, -gamepad1.left_stick_y, gamepad1.right_stick_x);

        if (gamepad2.circle) {
            collector.intake();
        } else {
            collector.stop();
        }

        if (gamepad2.cross) {
            collector.expel();
        } else {
            collector.stop();
        }

        if (gamepad2.left_trigger_pressed) {
            shooter.index();
        } else {
            shooter.indexStop();
        }

        if (gamepad2.left_trigger_pressed) {
            shooter.index();
        } else {
            shooter.indexStop();
        }

        //left_bumper or leftBumperWasPressed - moves in bursts(?)
        if (gamepad2.leftBumperWasPressed()) {
            shooter.indexReverse();
        } else {
            shooter.indexStop();
        }


        if (gamepad2.right_trigger_pressed) {
            shooter.shoot();
        } else {
            shooter.shootStop();
        }
    }
}
