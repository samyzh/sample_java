package com.zsy.frame.sample.java.control.designmode.behavioral.command.homeauto.advance;

public class StereoOnCommand implements Command {
  private Stereo setreo;

  public StereoOnCommand(Stereo setreo) {
    this.setreo = setreo;
  }

  @Override public void execute() {
    // TODO Auto-generated method stub
    setreo.On();
    setreo.SetCd();
  }

  @Override public void undo() {
    // TODO Auto-generated method stub
    setreo.Off();
  }
}
