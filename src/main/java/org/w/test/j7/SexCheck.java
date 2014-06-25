package org.w.test.j7;

import com.google.common.base.Strings;

/**
 * @version 1.5
 *          Created by wenzhouyang on 6/25/2014.
 */
public class SexCheck {

    public String getSex(String sex) {
        if (Strings.isNullOrEmpty(sex)) {
            throw new NullPointerException("the parameter of sex is null or empty");
        }
        String result = null;
        switch (sex) {
            case "male":
                result = "先生";
                break;
            case "female":
                result = "女士";
        }
        return result;
    }

}
