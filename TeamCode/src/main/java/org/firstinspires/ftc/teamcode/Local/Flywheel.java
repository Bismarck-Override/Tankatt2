package org.firstinspires.ftc.teamcode.Local;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.Range;

public class Flywheel {
    private DcMotorEx flywheel;

    public Flywheel(HardwareMap hardwareMap) {
        flywheel = hardwareMap.get(DcMotorEx.class, "flywheel");
        leftPower = Range.clip(leftPower, -1.0, 1.0);
        rightPower = Range.clip(rightPower, -1.0, 1.0);
        flywheel.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }

   double leftPower;
    double rightPower;
    public void setLeftPower(){
        flywheel.setPower(leftPower);
    }

    public void setRightPower(){
        flywheel.setPower(rightPower);
    }

}
