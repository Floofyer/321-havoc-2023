package org.robolancers321.subsystems.arm.commands;

import org.robolancers321.Constants;
import org.robolancers321.subsystems.arm.Arm;

import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

public class MoveArmSeparateBackwards extends SequentialCommandGroup{
    public MoveArmSeparateBackwards(Arm arm, Constants.RawArmSetpoints setpoints){
        addCommands(
            new MoveAnchor(arm, setpoints),
            new MoveFloating(arm, setpoints)
        );
    }
    
}
