package com.leetcode.java;

import java.util.*;

/**
 * @ClassName SubDomainVisits
 * @Description 811. 子域名访问计数
 * @Author zgz
 * @Date 2019-02-16 18:10
 * @Version 1.0
 */
public class SubDomainVisits {

    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String,Integer> map=new HashMap<String,Integer>();
        for(String cpdomain:cpdomains){
            String[] cpArray=cpdomain.split(" ");
            Integer cc= Integer.parseInt(cpArray[0]);
            map.put(cpArray[1],map.get(cpArray[1])==null?cc:map.get(cpArray[1])+cc);
            while(cpArray[1].indexOf(".")!=-1){
                String ss= cpArray[1].substring(cpArray[1].indexOf(".")+1);
                map.put(ss,map.get(ss)==null?cc:map.get(ss)+cc);
                cpArray[1]=ss;
            }
        }
        List<String> list=new ArrayList<String>();
        for(Map.Entry<String,Integer> entry :map.entrySet()){
            String domain=entry.getKey();
            Integer count=entry.getValue();
            list.add(count+" "+domain);
        }
        return list;
    }

    public static void main(String[] args) {
        String[] cpdomains  =  {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        List<String> visits = new SubDomainVisits().subdomainVisits(cpdomains);

        System.out.println(Arrays.toString(visits.toArray()));
    }
}
