package org.firstinspires.ftc.teamcode.Local;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class Robot {
    public Drive drive;

    public Flywheel flywheel;

    public Gantry gantry;
    public RackServo rackServo;

    public Robot(Telemetry telemetry, HardwareMap hardwareMap) {
        drive = new Drive(hardwareMap);
    }

    public void setMotorPowers(double power) {
        drive.setMotorPowers(power);
    }

    public void setLeftFlywheelPower(float leftTrigger){
        flywheel.setLeftPower(leftTrigger);
    }
    public void setRightFlywheelPower(float rightTrigger){
        flywheel.setRightPower(rightTrigger);
    }



    public void setRoundPrime(){rackServo.setPrimed();}
    public void setRoundLoading(){rackServo.setLoading();}
}
