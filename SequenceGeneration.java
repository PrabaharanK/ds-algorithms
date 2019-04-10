package com.test;

import java.math.BigDecimal;
import java.text.MessageFormat;

public class SequenceGeneration {
    public static void main(String[] args) {
        MessageFormat messageFormat = new MessageFormat("IAR_{0}");
        String auditId = messageFormat.format(new Object[]{String.format("%6s", new BigDecimal("517")).replace(' ', '0')});
        System.out.println(auditId);

    }
}
