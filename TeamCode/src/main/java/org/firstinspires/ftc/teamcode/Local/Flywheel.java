package org.firstinspires.ftc.teamcode.Local;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.Range;

public class Flywheel {
    private DcMotorEx flywheelL;
    private DcMotorEx flywheelR;

    public Flywheel(HardwareMap hardwareMap) {
        flywheelL = hardwareMap.get(DcMotorEx.class, "flywheelL");
        flywheelR = hardwareMap.get(DcMotorEx.class, "flywheelR");
        leftPower = Range.clip(leftPower, -1.0, 1.0);
        rightPower = Range.clip(rightPower, -1.0, 1.0);
        flywheelL.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        flywheelR.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }

   double leftPower;
    double rightPower;
    public void setLeftPower(double leftPower){
        flywheelL.setPower(leftPower);
    }

    public void setRightPower(double rightPower){
        flywheelR.setPower(rightPower);
    }

}
