package org.firstinspires.ftc.teamcode.tankDrive;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.gamepad1;

public class DriveCommand {

    TankDrivebase drivebase;

    public DriveCommand(TankDrivebase drivebase) {
        this.drivebase = drivebase;
    }

    public void periodic() {
        drivebase.setRightDrive(-gamepad1.left_stick_y);
        drivebase.setLeftDrive(-gamepad1.left_stick_y);
    }
}
