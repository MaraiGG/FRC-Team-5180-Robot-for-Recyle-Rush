
package org.usfirst.frc.team5180.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.RobotDrive;



/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	//Edit the numbers at the end to the amount of motors to turn on.
	private RobotDrive mainDrive;
	private XboxController controller;
	
	public Robot() {
		this.controller = new XboxController(1);
		this.mainDrive = new RobotDrive(1, 2, 3, 4);
	}
	
	
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {

    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {

    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        while (isOperatorControl() && isEnabled()) {
        	 double moveValue = controller.getLeftStickY();
        		        double rotateValue = controller.getLeftStickX();
        		 
        		        mainDrive.arcadeDrive(moveValue, rotateValue);
        }
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    
    }
    
}

