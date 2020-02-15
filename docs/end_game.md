End Game Software Documentation:
Procedure:
Prerequisite:  Match has entered endgame
 C (pivot) rotated down (0 deg, horizontal), B (lead screw) is retracted, A (hook) is not moving
Drive to rendezvous zone facing switch ( 2 feet away)
Stop driving (drivetrain ends) -> according to situation
Camera used to help drivers determine when to stop
Rotate C fully up (~90 deg) and stop at limit switch
Under user control
Extend B until bottom of hook is higher than part of switch you are facing -> stop extending
Drive forward until hook is directly above the switch
Retract B until fully retracted or until the entire robot is > 5 inches off the ground
If any part of the robot is still touching the ground, then we will rotate C towards 0 deg until the entire robot is off the ground.
Depending on the situation, rotate hook motor A to translate robot left or right along switch
Stop translation -> robot stops moving and remains lifted -> does not slide along switch (stay for 5 seconds with match ending)
PID implemented in pivot to hold position (position control) 
Timeline / Details:
Pivot: 
Subsystem
Left motor controller: talon SRX
Right motor controller: talon SRX
Encoder
User interface
Buttons
Commands
Up (speed)
Down (speed)
Stop ()
Isfinished 
Execute
Set speed
Isinterrupted


Hardware
Limits switches, external view of subsystems 
Lead Screw:
Subsystem
1 motor controller (Lead screw motor controller)
Encoder
Commands
Move forward 
Retract
Limit switches
Hook:
Subsystem
Motor controller
encoder?
Commands:
Automation
Pivot joint 
Translation of bar (PID method)
Addresses step 11 
PID uses NavX gyro as an input sensor
Lead screw can't extend beyond the restricted area 
Facilitated by hardware switches, eg limit switches 
Apply software limits, would address transition from step 5 to 6 
Get robot off switch after match
Reset lead screw and pivot to starting point 





 


