package com.codemanship.refactoring.legacycode;

import java.io.IOException;

public interface Orders {
    Order fetchOrder(int orderId) throws IOException, InterruptedException;
}
