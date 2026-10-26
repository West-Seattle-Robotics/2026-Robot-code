package org.firstinspires.ftc.teamcode.Autos;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

/**
 * It does nothing
 */
@Autonomous(name="Does Nothing - AutoOp Mode", group="Iterative Opmode", preselectTeleOp = "Main Teleop Mode")
@Disabled
public class NullAuto extends OpMode {

    public NullAuto() {

    }

    @Override
    public void init() {

    }

    @Override
    public void loop() {

    }
}
