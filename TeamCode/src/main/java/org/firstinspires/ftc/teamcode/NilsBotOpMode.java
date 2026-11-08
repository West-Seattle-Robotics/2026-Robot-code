package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.firstinspires.ftc.teamcode.drive.NilsBotDrive;
import org.firstinspires.ftc.teamcode.drive.NilsBotFancyDrive;

public class NilsBotOpMode extends OpMode {

    //bot... drives.... drive things... send tweet
    public NilsBotFancyDrive driveBase;

    //thing that does a thing (initiation stuff)
    @Override
    public void init() {

        driveBase = new NilsBotFancyDrive(hardwareMap);
    }

    //
    @Override
    public void loop() {

        driveBase.drive(gamepad1.right_stick_y, gamepad1.right_stick_x);
    }
}
