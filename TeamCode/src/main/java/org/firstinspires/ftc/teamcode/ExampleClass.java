package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.teamcode.Drive.Drive;

//first opmode 222
@TeleOp(name="My First OpMode", group="Iterative Opmode")
public class ExampleClass extends OpMode {

    private Drive drive;

    @Override
    public void init() {

        drive = new Drive();

        // Tell the driver station that setup is complete
        telemetry.addData("Status", "Initialized");
    }


    @Override
    public void loop() {
        // Read controller stick input (returns values between -1.0 and 1.0)
        double leftPower = -gamepad1.left_stick_y;
        double rightPower = -gamepad1.right_stick_y;

        drive.drive(leftPower, rightPower);

        // Display current information back to the controller screen
        telemetry.addData("Left Power", leftPower);
        telemetry.addData("Right Power", rightPower);
    }
}