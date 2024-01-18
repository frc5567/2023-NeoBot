package frc.robot;

import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class Intake {
    TalonSRX m_intake;

    Intake() {
        //can ID for the intake is currently set to 19. TODO: update when prototyping
        m_intake = new TalonSRX(19);
    }
    
    /**
     * This method sets the speed of the intake motor.
     * 
     * @param intakeSpeed Percent power to spin the intake motor.
     * 
     * @return void
     */
    public void setSpeed(double intakeSpeed) {
        m_intake.set(TalonSRXControlMode.PercentOutput, intakeSpeed);
    }
}
