package org.eclipse.jetty.websocket.frames;

import org.eclipse.jetty.websocket.api.OpCode;

public abstract class ControlFrame extends BaseFrame
{
    public ControlFrame()
    {
        super();
    }

    public ControlFrame(BaseFrame copy)
    {
        super(copy);
    }

    public ControlFrame(OpCode opcode)
    {
        super(opcode);
    }
}