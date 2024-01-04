package org.firstinspires.ftc.teamcode.OpModes;

import static java.lang.Math.pow;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Local.Drive;
import org.firstinspires.ftc.teamcode.Local.Flywheel;
import org.firstinspires.ftc.teamcode.Local.Gantry;
import org.firstinspires.ftc.teamcode.Local.RackServo;
import org.firstinspires.ftc.teamcode.Local.Robot;

@TeleOp(name = "Tank Drive")
public class Tank extends OpMode {

    Robot robot;
    RackServo rackServo;

    Flywheel flywheel;
    Gantry gantry;

    /*double lowSpeed = 0.25;
    double leftSpeed = 0.5;
    double rightSpeed = 0.75; */
    double topSpeed = 1.0;

    @Override
    public void init() {
        robot = new Robot(telemetry, hardwareMap);
        flywheel = new Flywheel(hardwareMap);
        gantry = new Gantry(hardwareMap);
        rackServo = new RackServo(hardwareMap);

        telemetry.addLine("Ready");
        telemetry.update();
    }

    @Override
    public void loop() {
        double l = (-gamepad1.left_stick_y);

        double r = (-gamepad1.right_stick_y);

        robot.drive.leftFront.setPower((l) * topSpeed);
        robot.drive.leftBack.setPower((l) * topSpeed);
        robot.drive.rightFront.setPower((r) * topSpeed);
        robot.drive.rightBack.setPower((r) * topSpeed);

        if (gamepad2.right_trigger > 0) {
            flywheel.setRightPower(gamepad2.right_trigger);
        }
        else{
            flywheel.setRightPower(0);
        }

        if (gamepad2.left_trigger > 0) {
            flywheel.setLeftPower(-gamepad2.left_trigger);
        }
        else{
            flywheel.setLeftPower(0);
        }
            if (gamepad2.right_bumper) {
                gantry.setGantryPower(1);
            } else {
                gantry.setGantryPower(0);
            }

            if (gamepad2.left_bumper) {
                gantry.setGantryPower(-1);
            } else {
                gantry.setGantryPower(0);
            }

            if (gamepad2.a) {
                rackServo.setPrimed();
            }

            if (gamepad2.b) {
                rackServo.setLoading();
            }

            telemetry.update();
        }
    }

