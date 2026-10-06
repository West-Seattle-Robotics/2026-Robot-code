package org.firstinspires.ftc.teamcode.collector;

import com.qualcomm.robotcore.hardware.Servo;

public class collectorConstants {
    //Motor names
    public String overheadID = "Overhead";
    public String agitateLeftID = "Agitate Left";
    public String agitateRightID = "Agitate Right";

    //Overhead speed
    public double overheadSpeed = 1;

    //Servo direction
    public Servo.Direction agitateLeftDirection = Servo.Direction.FORWARD;
    public Servo.Direction agitateRightDirection = Servo.Direction.REVERSE;
}
