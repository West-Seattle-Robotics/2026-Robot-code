package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

//first opmode
@TeleOp(name="TeleOp Mode", group="Iterative Opmode")
public class MainOpMode extends OpMode {

    // Declare your robot's physical parts here
    private DcMotor leftMotor = null;
    private DcMotor rightMotor = null;

    @Override
    public void init() {

        leftMotor = hardwareMap.get(DcMotor.class, "FrontLeft");
        rightMotor = hardwareMap.get(DcMotor.class, "FrontRight");

        // Tell the driver station that setup is complete
        telemetry.addData("Status", "Initialized");
    }

    @Override
    public void loop() {
        // Read controller stick input (returns values between -1.0 and 1.0)
        double leftPower = -gamepad1.left_stick_y;
        double rightPower = gamepad1.right_stick_y;

        leftMotor.setPower(leftPower);
        rightMotor.setPower(rightPower);

        // Display current information back to the controller screen
        telemetry.addData("Left Power", leftPower);
        telemetry.addData("Right Power", rightPower);
    }
}