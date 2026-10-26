package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.firstinspires.ftc.teamcode.drive.NilsBotDrive;
public class NilsBotOpMode extends OpMode {

    //bot... drives.... drive things... send tweet
    public NilsBotDrive driveBase;

    //thing that does a thing (initiation stuff)
    @Override
    public void init() {
        driveBase = new NilsBotDrive(hardwareMap);
    }

    //
    @Override
    public void loop() {
        driveBase.drive(-gamepad1.left_stick_y, gamepad1.right_stick_y);
    }
}
