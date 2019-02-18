package com.leetcode.java;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName SpecialEmailAddress
 * @Description 929.独特的电子邮件地址
 * @Author zgz
 * @Date 2019-02-14 17:59
 * @Version 1.0
 */
public class SpecialEmailAddress {

    public int numUniqueEmails(String[] emails) {
        Set set = new HashSet();
        if(1 <= emails.length && emails.length <= 100)
        {
            for (int i = 0; i < emails.length; i++) {

                String email = emails[i].trim();
                if(!"".equals(email) && email != null && email.length() >= 1 &&email.length() <= 100)
                {
                    String[] names = email.split("@");
                    String firstName = names[0].replace(".", "");
                    String lastName = names[1];
                    if(!"".equals(firstName) && firstName != null)
                    {
                        System.out.println("firstName:"+firstName);
                        if(firstName.contains("+"))
                        {
                            firstName = firstName.substring(0, firstName.indexOf("+"));
                        }
                        if(!"".equals(lastName) && lastName != null){
                            String name = firstName + lastName;
                            set.add(name);
                        }
                    }
                }

            }
        }

        return set.size();
    }

    public static void main(String[] args) {

        String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        SpecialEmailAddress specialEmailAddress = new SpecialEmailAddress();
        int i = specialEmailAddress.numUniqueEmails(emails);
        System.out.println("实际收到邮件的地址数目是:" + i);

    }
}
