
package org.usfirst.frc.team5180.robot;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.buttons.Button;


/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	//Makes a RobotDrive for maindrive.
	private RobotDrive mainDrive;
	private Jaguar lift;
	private XboxController controller;
	private Compressor mainCompressor;
	private DoubleSolenoid mainSolenoid;
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
    	this.mainSolenoid = new DoubleSolenoid(0,1);
    	this.controller = new XboxController(0);
		this.mainDrive = new RobotDrive(0,1);
		this.lift = new Jaguar(2);
		mainDrive.setInvertedMotor(RobotDrive.MotorType.kRearRight ,true);
    }


	/**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {

    }

    /**
     * This function is called periodically during operator control
     * @return 
     * @return 
     */
    public void teleopPeriodic() {
    			//Driving
    		 double rotateValue = controller.getRightX();
        	 double moveValue = controller.getRightY();
        	 	mainDrive.arcadeDrive(rotateValue, moveValue);
        	 	//Pneumatics
        	 	if(this.controller.getButton(XboxController.BUTTON_A)) {
        	 		mainSolenoid.set(Value.kReverse);
        	 	} 
        	 	
        	 	if(this.controller.getButton(XboxController.BUTTON_B)){
        	 		mainSolenoid.set(Value.kForward);
        	 	}
        	 	//Code to Lift the boxes/Elevator
        	 	double liftHeight = controller.getLeftX();
        	 	lift.set(liftHeight);
        	 	
        		
        	 	   Timer.delay(0.01);

        }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    
    }
    
}

