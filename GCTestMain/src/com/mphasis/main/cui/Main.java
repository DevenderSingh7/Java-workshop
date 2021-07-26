package com.mphasis.main.cui;

import javax.management.*;
import java.lang.management.ManagementFactory;

public class Main {
    private static void init() throws MalformedObjectNameException, InstanceAlreadyExistsException, MBeanRegistrationException, NotCompliantMBeanException, NotCompliantMBeanException {
        MBeanServer mbs = null;
        mbs = ManagementFactory.getPlatformMBeanServer();
        GCTestAgent agent = new GCTestAgent();
        ObjectName agentName;
        agentName = new ObjectName("AATests:name=GCTestAgent");
        mbs.registerMBean(agent, agentName);
    }
    public static void main(String[] args) {
	// write your code here

        for (;;) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
