package org.firstinspires.ftc.teamcode.OpModes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;
@TeleOp(name= "Servoington")
public class ServoPosFinder extends OpMode{

    Servo servo;

    @Override
    public void init() {
        servo = hardwareMap.get(Servo.class, "rackServo");

        telemetry.addLine("Ready For Start!");
        telemetry.update();
    }

    @Override
    public void loop() {
        if(gamepad1.right_trigger > 0){
            servo.setPosition(servo.getPosition() + 0.001);
        }

        if(gamepad1.left_trigger > 0){
            servo.setPosition(servo.getPosition() - 0.001);
        }

        if(gamepad1.y){
            servo.setPosition(1);
        }

        if(gamepad1.a){
            servo.setPosition(0);
        }


        telemetry.addLine("Current Servo Position: " + servo.getPosition());
        telemetry.update();

    }
}
