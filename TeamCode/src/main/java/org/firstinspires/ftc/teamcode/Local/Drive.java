package org.firstinspires.ftc.teamcode.Local;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.configuration.typecontainers.MotorConfigurationType;

import java.util.Arrays;
import java.util.List;

public class Drive {
    public final DcMotorEx leftFront;
    public final DcMotorEx leftBack;
    public final DcMotorEx rightBack;
    public final DcMotorEx rightFront;

    private final List<DcMotorEx> motors;

    public Drive(HardwareMap hardwareMap) {
        leftFront = hardwareMap.get(DcMotorEx.class, "leftFront"); //0
        leftBack = hardwareMap.get(DcMotorEx.class, "leftBack"); //1
        rightBack = hardwareMap.get(DcMotorEx.class, "rightBack");  //2
        rightFront = hardwareMap.get(DcMotorEx.class, "rightFront"); //3

        leftFront.setDirection(DcMotorSimple.Direction.REVERSE);
        leftBack.setDirection(DcMotorSimple.Direction.REVERSE);

        motors = Arrays.asList(leftFront, leftBack, rightBack, rightFront);
    }

    public void setMotorPowers(double power) {
        leftFront.setPower(power);
        leftBack.setPower(power);
        rightBack.setPower(power);
        rightFront.setPower(power);
    }

    public void stop() {
        setMotorPowers(0.0);
    }

}
