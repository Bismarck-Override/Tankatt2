package org.firstinspires.ftc.teamcode.OpModes;

import static java.lang.Math.pow;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Local.Drive;
import org.firstinspires.ftc.teamcode.Local.Robot;

@TeleOp(name = "Tank Drive")
public class Tank extends OpMode {

    Robot robot;

    /*double lowSpeed = 0.25;
    double leftSpeed = 0.5;
    double rightSpeed = 0.75; */
    double topSpeed = 1.0;

    @Override
    public void init() {
        robot = new Robot(telemetry, hardwareMap);

        telemetry.addLine("Ready");
        telemetry.update();
    }

    @Override
    public void loop() {
        double x = (-gamepad1.left_stick_y);

        double r =(gamepad1.right_stick_x);

        robot.drive.leftFront.setPower((x + r) * topSpeed);
        robot.drive.leftBack.setPower((x + r) * topSpeed);
        robot.drive.rightFront.setPower((x - r)* topSpeed);
        robot.drive.rightBack.setPower((x - r)* topSpeed);




        telemetry.update();
    }
}

