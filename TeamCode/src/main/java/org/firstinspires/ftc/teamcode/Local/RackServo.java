package org.firstinspires.ftc.teamcode.Local;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class RackServo {
    double primed;
    double loading;
    Servo rackServo;

    public RackServo(HardwareMap hardwareMap){
        rackServo = hardwareMap.get(Servo.class, "rackServo");
    }

    public void setPrimed(){
        rackServo.setPosition(primed);
    }

    public void setLoading(){
        rackServo.setPosition(loading);
    }
}
