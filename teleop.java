package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "teleop", group= "blah")
public class Teleop extends LinearOpMode {
    DcMotor motor1;
    DcMotor motor2;
    DcMotor motor3;
    DcMotor motor4;

    @Override
    public void runOpMode() throws InterruptedException {
        motor1 = hardwareMap.dcMotor.get("m1");
        motor2 = hardwareMap.dcMotor.get("m2");
        motor3 = hardwareMap.dcMotor.get("m3");
        motor4 = hardwareMap.dcMotor.get("m4");

        waitForStart();
        while(true) {
            motor1.setPower(gamepad1.left_stick_y);
            motor2.setPower(gamepad1.left_stick_y);
            motor3.setPower(gamepad1.left_stick_y);
            motor4.setPower(gamepad1.left_stick_y);

            if((gamepad1.left_stick_y > 0) && (gamepad1.right_stick_y <0))
            {
                motor1.setPower(-gamepad1.left_stick_y);
                motor2.setPower(-gamepad1.left_stick_y);
                motor3.setPower(gamepad1.left_stick_y);
                motor4.setPower(gamepad1.left_stick_y);
            }
            else if((gamepad1.left_stick_y < 0) && (gamepad1.right_stick_y > 0))
            {
                motor1.setPower(gamepad1.left_stick_y);
                motor2.setPower(gamepad1.left_stick_y);
                motor3.setPower(-gamepad1.left_stick_y);
                motor4.setPower(-gamepad1.left_stick_y);
            }

        }

    }
}