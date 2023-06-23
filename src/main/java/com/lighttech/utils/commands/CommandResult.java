package com.lighttech.utils.commands;

public enum CommandResult {
    AWAITING_EXECUTION,
    SUCCESS,
    FAIL,
    FAIL_UNKNOWN,
    FAIL_FILE_NOT_FOUND,
    FAIL_BAD_FILE,
    FAIL_BAD_DATA,

    DATA_NOT_FOUND,
    FAIL_INSUFFICIENT_ITEM_SPACE,
    FAIL_UNABLE_TO_DROP_ITEM,
}
