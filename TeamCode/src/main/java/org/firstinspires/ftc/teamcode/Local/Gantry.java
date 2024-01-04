package org.firstinspires.ftc.teamcode.Local;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.Range;

public class Gantry {
    private DcMotorEx gantry;

    public Gantry(HardwareMap hardwareMap){
        gantry = hardwareMap.get(DcMotorEx.class, "gantryMotor");
        gantryPower = Range.clip(gantryPower, -1.0, 1.0);
        gantry.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }

    double gantryPower;

    public void setGantryPower(double gantryPower1){
        gantry.setPower(gantryPower1);
    }
}
