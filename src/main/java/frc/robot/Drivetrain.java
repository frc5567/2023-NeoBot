package frc.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;

public class Drivetrain {
    private CANSparkMax m_leftLeader;
    private CANSparkMax m_rightLeader;
    private CANSparkMax m_leftFollower;
    private CANSparkMax m_rightFollower;

    private MotorControllerGroup m_leftGroup;
    private MotorControllerGroup m_rightGroup;

    private DifferentialDrive m_drive;

    /**
     * Main constructor for the drivetrain class
     * @param pidgey IMU pigeon instance
     */
    public Drivetrain() {
        m_leftLeader = new CANSparkMax(RobotMap.DrivetrainConstants.LEFT_LEADER_CAN_ID, MotorType.kBrushless);
        m_rightLeader = new CANSparkMax (RobotMap.DrivetrainConstants.RIGHT_LEADER_CAN_ID, MotorType.kBrushless);
        m_leftFollower = new CANSparkMax(RobotMap.DrivetrainConstants.LEFT_FOLLOWER_CAN_ID, MotorType.kBrushless);
        m_rightFollower = new CANSparkMax(RobotMap.DrivetrainConstants.RIGHT_FOLLOWER_CAN_ID, MotorType.kBrushless);
        
        m_leftGroup = new MotorControllerGroup(m_leftLeader, m_leftFollower);
        m_rightGroup = new MotorControllerGroup(m_rightLeader, m_rightFollower);   
        
        m_drive = new DifferentialDrive(m_leftGroup, m_rightGroup);
    }

    /**
     * Init function to intialize the Drivetrain in its entirety
     */
    public void initDrivetrain() {
 
        m_leftLeader.setInverted(true);
        m_leftFollower.setInverted(true);
        
        m_rightLeader.setInverted(false);
        m_rightFollower.setInverted(false);

    }

    /**
     * Method that makes the drivetrain move forward/backwards and turn.
     * @param speed Value between -1 and 1 for robot speed.
     * @param turn Value between -1 and 1 for turning
     */
    public void arcadeDrive(double speed, double turn) {
        m_drive.arcadeDrive(speed, turn);
    }
}
