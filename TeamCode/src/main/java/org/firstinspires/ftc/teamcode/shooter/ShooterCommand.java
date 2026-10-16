package org.firstinspires.ftc.teamcode.shooter;

public class ShooterCommand {
    Shooter shooter;

    ShooterConstants constants;
    public ShooterCommand(Shooter shooter) {
        this.shooter = shooter;
        constants = new ShooterConstants();
    }

    public void periodic() {
        shooter.setFlywheelPower(constants.flyhweelSpeed);

    }

    public void runIndexer() {
        shooter.setIndexerPower(constants.indexerPower);
    }

    public void runFlywheel() {
        shooter.setFlywheelPower(constants.flyhweelSpeed);
    }
}
