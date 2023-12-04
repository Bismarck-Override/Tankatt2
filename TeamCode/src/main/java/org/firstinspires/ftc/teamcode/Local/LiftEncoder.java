package org.firstinspires.ftc.teamcode.Local;


import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class LiftEncoder {

    static final double  TICKS_PER_REV = 28;
    static final double SPOOL_DIAMETER_MM = 15;
    static final double TICKS_PER_MM = (TICKS_PER_REV) / (SPOOL_DIAMETER_MM * Math.PI);

    private DcMotorEx liftDrive;

    public LiftEncoder(HardwareMap hardwareMap){
        liftDrive = hardwareMap.get(DcMotorEx.class, "LiftMotor");

        liftDrive.setMode(DcMotorEx.RunMode.STOP_AND_RESET_ENCODER);
        liftDrive.setMode(DcMotorEx.RunMode.RUN_TO_POSITION);
    }



}
