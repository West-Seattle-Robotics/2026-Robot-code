package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

//first opmode 2
@TeleOp(name="My First OpMode", group="Iterative Opmode")
public class ExampleClass extends OpMode {

    // Declare your robot's physical parts here
    private DcMotor leftDrive = null;
    private DcMotor anotherDrive = null;
    private DcMotor anotherAnotherDrive = null;


    @Override
    public void init() {
        // Connect code variables to the Driver Station configuration names
        leftDrive  = hardwareMap.get(DcMotor.class, "left_drive");

        anotherDrive = hardwareMap.get(DcMotor.class, "anotherDrive_drive");

        anotherAnotherDrive = hardwareMap.get(DcMotor.class, "anotherAnotherDrive_drive");

        // Tell the driver station that setup is complete
        telemetry.addData("Status", "Initialized");
    }


    @Override
    public void loop() {
        // Read controller stick input (returns values between -1.0 and 1.0)
        double drivePower = -gamepad1.left_stick_y;

        // Send power to the motor
        leftDrive.setPower(drivePower);

        anotherDrive.setPower(drivePower);

        anotherAnotherDrive.setPower(drivePower);

        // Display current information back to the controller screen
        telemetry.addData("Motor Power", drivePower);
    }
}