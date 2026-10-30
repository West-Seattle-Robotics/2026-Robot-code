package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.drivebase.MecanumDrive;

@TeleOp(name="Mecanum Teleop", group="Iterative Opmode")

public class MecanumMain extends OpMode
{
    private MecanumDrive mecDrive;

    @Override
    public void init()
    {
        mecDrive = new MecanumDrive(hardwareMap);
    }

    @Override
    public void loop()
    {
        mecDrive.drive(gamepad1.left_stick_x, -gamepad1.left_stick_y, gamepad1.right_stick_x);
    }
}
