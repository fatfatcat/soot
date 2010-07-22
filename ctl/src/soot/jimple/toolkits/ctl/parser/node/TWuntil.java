/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.toolkits.ctl.parser.node;

import soot.jimple.toolkits.ctl.parser.analysis.*;

@SuppressWarnings("nls")
public final class TWuntil extends Token
{
    public TWuntil()
    {
        super.setText("W");
    }

    public TWuntil(int line, int pos)
    {
        super.setText("W");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TWuntil(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTWuntil(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TWuntil text.");
    }
}