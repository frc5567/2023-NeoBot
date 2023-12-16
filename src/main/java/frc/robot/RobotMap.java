package frc.robot;

public class RobotMap {
    
    /**
     * All drivetrain constants
     */
    public static class DrivetrainConstants {

        /**
         * CAN ID of the left leader motor controller
         */
        public static final int LEFT_LEADER_CAN_ID = 5;

        /**
         * CAN ID of the right leader motor controller
         */
        public static final int RIGHT_LEADER_CAN_ID = 4;

        /**
         * CAN ID of the left follower motor controller
         */
        public static final int LEFT_FOLLOWER_CAN_ID = 7;

        /**
         * CAN ID of the left follower motor controller
         */
        public static final int RIGHT_FOLLOWER_CAN_ID = 6;

    }

        /**
     * All pilot controller constants
     */
    public static class PilotControllerConstants {

        /**
         * USB port number of the pilot x-box controller
         */
        public static final int XBOX_CONTROLLER_USB_PORT = 0;

        /**
         * Absolute value of the deadband range for stick input
         */
        public static final double STICK_DEADBAND = 0.09;

        /**
         * adjust output of turns to tone down the final output.
         */
        public static final double TURN_SCALER = 0.7;

        /*
         * Rate limit for acceleration to prevent brownouts. 
         * Initial value matches 2022 robot value of 2.25, but can be adjusted as needed
         */
        public static final double ACCEL_SLEW_RATE = 1.6;
    }
}
