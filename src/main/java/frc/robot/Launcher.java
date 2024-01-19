package frc.robot;

import com.ctre.phoenix.*;
import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class Launcher {
    TalonSRX m_launcherLeft;
    TalonSRX m_launcherRight;

    Launcher() {
        //TODO: Can ID for left launcher is currently 17. WILL NEED TO UPDATE.
        m_launcherLeft = new TalonSRX(17);

        //TODO: Can ID for right launcher is currently 18. WILL NEED TO UPDATE.
        m_launcherRight = new TalonSRX(18);
    }

    /**
     * Method that tells the motors how fast to spin using percentages.
     * 
     * @param leftSpeed percent power to spin the left motor.
     * @param rightSpeed percent power to spin the right motor.
     * 
     * @return void 
     */
    public void setSpeed(double leftSpeed, double rightSpeed) {

        m_launcherLeft.set(TalonSRXControlMode.PercentOutput, leftSpeed);
        m_launcherRight.set(TalonSRXControlMode.PercentOutput, rightSpeed);
    }
}
