package com.Service;

import com.domain.t_org;

public class testApplication {
    public static void main(String args[]) throws Exception {
        test test = new test();
        t_org t_org = test.doIt("侠");
        if (t_org == null) {
            System.out.println("null");
        } else {
            System.out.println(t_org.getContent() + "\n" + t_org.getT_url().get(0).getBase_url()+"\n"
            + t_org.getT_url().get(0).getOrg_id());
        }
    }
}