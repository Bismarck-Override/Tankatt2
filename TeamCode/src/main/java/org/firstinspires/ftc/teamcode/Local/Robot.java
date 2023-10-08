package org.firstinspires.ftc.teamcode.Local;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class Robot {
    public Drive drive;

    public Flywheel flywheel;

    public Robot(Telemetry telemetry, HardwareMap hardwareMap) {
        drive = new Drive(hardwareMap);
    }

    public void setMotorPowers(double power) {
        drive.setMotorPowers(power);
    }

    public void setRightFlywheelPower(double rightPower) {
        flywheel.setRightPower();
    }

    public void setLeftFlywheelPower(double leftPower) {
        flywheel.setLeftPower();
    }
}
