package com.test;

import com.util.Customer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author luojiaying
 * @date 2019-09-29 22:22
 */
public class TemplatesTest {
    //prsf 可以生成 private static final
    private static final Customer CUST=new Customer(); ;
    //变形psf
    public static final int NUM=1;
    //psfi
    public static final int  aaaa=2;
    //psfs
    public static final String aaaaaaa="";



    //psvm
    public static void main(String[] args) {

    //sout
        System.out.println();
    // /soutp /soutm/soutv/xxx.sout
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("TemplatesTest.main");
       int a=1;
       System.out.println("i = " + a);
       System.out.println(a);

        //fori普通for循环
        String[] arr=new String[]{"lilei","jerry","ddd"};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
        //iter
        for (String s : arr) {
            System.out.println(s);
        }
        //itar
        for (int j = 0; j < args.length; j++) {
            String arg = args[j];
        }
        //变形itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }
     //list.for
     ArrayList list=new ArrayList();
        for (Object o : list) {
            
        }
        //list.fori
        for (int i = 0; i < list.size(); i++) {
            
        }
        //list.forr
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }
        String aa="luojaiying";
    //ifn
        if (aa == null) {
            
        }
     //inn
        if (aa != null) {

        }
    //变形 ：xxx.null / xxx.nn
        if (list != null) {

        }
        if (list == null) {

        }

    }



}
