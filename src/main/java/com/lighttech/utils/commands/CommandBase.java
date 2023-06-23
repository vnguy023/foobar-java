package com.lighttech.utils.commands;

import lombok.Getter;
import lombok.Setter;

public abstract class CommandBase {
    @Getter
    private CommandResult result = CommandResult.AWAITING_EXECUTION;
    public void setResult(CommandResult result) { this.result = result;}

    @Getter @Setter
    private String resultErrorMsg = "";

    public abstract void execute();

    // Helper
    public void setResult(CommandBase cmd) {
        this.result = cmd.getResult();
        this.resultErrorMsg = cmd.getResultErrorMsg();
    }
}
