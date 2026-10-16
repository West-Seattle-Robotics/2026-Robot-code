package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;import com.qualcomm.robotcore.hardware.DcMotor;import org.firstinspires.ftc.teamcode.drive.BotDrive;
public class BotOpMode extends OpMode {

    //bot... drives.... drive things... send tweet
    public BotDrive driveBase;

    //thing that does a thing (initiation stuff)
    @Override
    public void init() {
        driveBase = new BotDrive(hardwareMap);
    }

    //
    @Override
    public void loop() {
        driveBase.drive(-gamepad1.left_stick_y, gamepad1.right_stick_y);
    }
}
