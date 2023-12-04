package org.firstinspires.ftc.teamcode.OpModes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import org.firstinspires.ftc.teamcode.Local.Robot;

@TeleOp(name = "DCEXTS")
public class FlywheelTester extends OpMode {

    Robot robot;
    double motorRpm = 6000;

    @Override
    public void init() {
        robot = new Robot(telemetry, hardwareMap);

        telemetry.update();
        telemetry.addLine("deez nuts");
    }

    @Override
    public void loop() {

        double rightTrigger = gamepad1.right_trigger;
        double rightRpm = motorRpm * rightTrigger;

        double leftTrigger = gamepad1.right_trigger;
        double leftRpm = motorRpm * leftTrigger;

        robot.setLeftFlywheelPower(leftTrigger);
        robot.setRightFlywheelPower(rightTrigger);

        telemetry.update();
    }
}
