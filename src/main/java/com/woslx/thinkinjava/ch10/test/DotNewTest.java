package com.woslx.thinkinjava.ch10.test;

import com.woslx.thinkinjava.ch10.s10_3.DotNew;

/**
 * Created by hy on 3/11/17.
 */
public class DotNewTest  {

    public static void main(String[] args) {
        DotNew dn = new DotNew();
        DotNew.Inner dni = dn.new Inner();
    }
}
