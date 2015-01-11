package org.usfirst.frc.team5180.robot;



import edu.wpi.first.wpilibj.Joystick;

/**
 * XBox controller wrapper for a joystick.
 * @author Matthew.Lythgoe
 */
public class XboxController extends Joystick {
    
    public static final int A = 0;
    public static final int B = 1;
    public static final int X = 2;
    public static final int Y = 3;
    public static final int LEFT_BUMPER = 4;
    public static final int RIGHT_BUMPER = 5;
    public static final int BACK = 6;
    public static final int START = 7;
    public static final int LEFT_STICK = 8;
    public static final int RIGHT_STICK = 9;
    
    public static final int LEFT_X = 1;
    public static final int LEFT_Y = 2;
    public static final int TRIGGERS = 3;
    public static final int RIGHT_X = 4;
    public static final int RIGHT_Y = 5;
    public static final int D_PAD_X = 6;
    public static final int D_PAD_Y = 7;
    
    public XboxController(int port) {
        super(port);
    }
 
    /**
     * Read the value of the right joystick's X axis.
     * @return the value of the right joystick's X axis.
     */
    public double getRightStickX() {
        return getRawAxis(RIGHT_X);
    }

    /**
     * Read the value of the right joystick's Y axis.
     * @return the value of the right joystick's Y axis.
     */
    public double getRightStickY() {
        return getRawAxis(RIGHT_Y);
    }

    /**
     * Read the value of the left joystick's X axis.
     * @return the value of the left joystick's X axis.
     */
    public double getLeftStickX() {
        return getRawAxis(LEFT_X);
    }

    /**
     * Read the value of the left joystick's Y axis.
     * @return the value of the left joystick's Y axis.
     */
    public double getLeftStickY() {
        return getRawAxis(LEFT_Y);
    }
    
    /**
     * Read the value of the d-pad's X axis.
     * @return the value of the d-pad's X axis.
     */
    public double getDPadX() {
        return getRawAxis(D_PAD_X);
    }
    
    /**
     * Read the value of the d-pad's Y axis.
     * @return the value of the d-pad's Y axis.
     */
    public double getDPadY() {
        return getRawAxis(D_PAD_Y);
    }

    /**
     * Read the state of the A button.
     * @return the state of the A button.
     */
    public boolean getAButton() {
        return getRawButton(A);
    }

    /**
     * Read the state of the B button.
     * @return the state of the B button.
     */
    public boolean getBButton() {
        return getRawButton(B);
    }

    /**
     * Read the state of the X button.
     * @return the state of the X button.
     */
    public boolean getXButton() {
        return getRawButton(X);
    }

    /**
     * Read the state of the Y button.
     * @return the state of the Y button.
     */
    public boolean getYButton() {
        return getRawButton(Y);
    }

    /**
     * Read the state of the back button.
     * @return the state of the back button.
     */
    public boolean getBackButton() {
        return getRawButton(BACK);
    }

    /**
     * Read the state of the start button.
     * @return the state of the start button.
     */
    public boolean getStartButton() {
        return getRawButton(START);
    }

    /**
     * Read the state of the right bumper button.
     * @return the state of the right bumper button.
     */
    public boolean getRightBumperButton() {
        return getRawButton(RIGHT_BUMPER);
    }

    /**
     * Read the state of the left bumper button.
     * @return the state of the left bumper button.
     */
    public boolean getLeftBumperButton() {
        return getRawButton(LEFT_BUMPER);
    }

    /**
     * Read the state of the left stick button.
     * @return the state of the left stick button.
     */
    public boolean getLeftStickButton() {
        return getRawButton(LEFT_STICK);
    }

    /**
     * Read the state of the right stick button.
     * @return the state of the right stick button.
     */
    public boolean getRightStickButton() {
        return getRawButton(RIGHT_STICK);
    } 
        
    /**
     * Read the state of the right trigger.
     * @return the state of the right trigger.
     */
    public double getRightTrigger() {
        return -Math.min(getRawAxis(TRIGGERS), 0);
    }

    /**
     * Read the state of the left trigger.
     * @return the state of the left trigger.
     */
    public double getLeftTrigger() {
        return Math.max(getRawAxis(TRIGGERS), 0);
    }
}
