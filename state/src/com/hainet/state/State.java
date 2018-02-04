package com.hainet.state;

import com.hainet.context.Context;

// State role
public interface State {

    void setContext(Context context, int temperature);

    void eat();
}
