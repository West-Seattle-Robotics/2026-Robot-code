package org.firstinspires.ftc.teamcode.Autos;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

/**
 * Moves motors forward
 * Robot stops after 1.5 seconds
 */
@Autonomous(name="Moves Forward - AutoOp Mode", group="Iterative Opmode", preselectTeleOp = "Main Teleop Mode")
@Disabled
public class NotNullAuto extends LinearOpMode {
    private DcMotor leftMotor   = null;
    private DcMotor rightMotor  = null;

    private ElapsedTime runtime = new ElapsedTime();

    static final double FORWARD_SPEED = 0.2;

    @Override
    public void runOpMode()
    {
        leftMotor  = hardwareMap.get(DcMotor.class, "FrontLeft");
        rightMotor = hardwareMap.get(DcMotor.class, "FrontRight");

        leftMotor.setDirection(DcMotor.Direction.REVERSE);
        rightMotor.setDirection(DcMotor.Direction.FORWARD);

        //press start on driver station
        waitForStart();

        //move forward 1.5 sec
        leftMotor.setPower(FORWARD_SPEED);
        rightMotor.setPower(FORWARD_SPEED);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < 1.5))
        {
            telemetry.addData("Path", "Moving: %4.1f S Elapsed", runtime.seconds());
            telemetry.update();
        }

        //stops motors
        leftMotor.setPower(0);
        rightMotor.setPower(0);

        telemetry.addData("Path", "huzzah");
        telemetry.update();
        sleep(1000);
    }
}