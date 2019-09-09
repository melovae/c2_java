package com.company;

//import com.sun.org.apache.xpath.internal.operations.String;

import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void print(int i,Object object) {
        //System.out.println(String.format("{%d}","%s",i,object.toString()));
//        System.out.println("{%d}","%s",i,object.toString());
        System.out.println(String.format("{%d},%s",i,object.toString()));

    }

    public static void demoString() {
        String str="hello liuzhi";
        print(2,str.codePointAt(2));
        print(3,str.compareTo("hello miuzhi"));
        print(4,str.compareTo("hello hiuzhi"));
        print(5,str.toCharArray());
        print(6,str.concat("59"));
        print(7,str.replace("e","a"));

        StringBuilder sb = new StringBuilder();
        sb.append(true);
        sb.append(1);
        sb.append(2.2);
        print(16, sb.toString());
        print(17, "a" + "b" + String.valueOf(12));

    }

    public static void demoController() {
        String grade="A";
        switch (grade){
            case "A":print(1,"90");
            case "B":print(2,"80");
            default:print(3,"60");
        }
    }

    public static void demoList() {
        List<String> list=new ArrayList<String>();
        list.add("12345");
        print(1,list);
        List<String> list2=new ArrayList<String>();
      /*  for (int i=4;i>0;i--){
            list2.add(String.valueOf(i));
        }*/
//        Collections.sort(list2);
//        print(2,list2);
//        print(3,list2.get(3));
        for (int i=0;i<4;i++){
            list2.add(String.valueOf(i));
        }
        Collections.sort(list2, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        print(3,list2);





    }

    public static void demoSet() {
        Set<String> stringSet=new HashSet<String>();
        stringSet.add("a");
        stringSet.add("b");
        stringSet.add("c");
        stringSet.addAll(Arrays.asList(new String[]{"d","e","f"}));
        for (String str: stringSet) {
            System.out.println(str);
        }

    }

    public static void demoKeyValue() {
        Map<String,String> stringMap=new HashMap<String, String>();
        stringMap.put("1","fasdf");
        stringMap.put("2","desdf");
//        print(1,stringMap);
        for (Map.Entry entry:stringMap.entrySet()) {
            print(1,entry.getKey()+":"+entry.getValue());
        }
        print(3,stringMap.keySet());
        print(4,stringMap.values());
    }

 /*   public static void demoException() {
        try {
          String s=null;
          int i=s.indexOf("a");
        }catch (NullPointerException e){
            print(1,"fail");
        }finally {
            print(2,"end");
        }
    }*/

    public static void demoException() throws NullPointerException{
        String s=null;
        int i=s.indexOf("a");
    }

    public static void demoCommon() {
        Random random=new Random();
        random.setSeed(1);
        for (int i=0;i<4;i++){
            print(i,random.nextInt(100));
        }

        List<Integer> list=Arrays.asList(new Integer[]{1,2,3,4});
        print(5,list);
        Collections.shuffle(list);
        print(6,list);

        Date date=new Date();
        print(7,date);
        print(8,date.getTime());

        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("YYYY-MM-dd hh:mm:ss");
        print(9,simpleDateFormat.format(date));

        print(10, UUID.randomUUID());
    }

    public static void demoClass() {
        Talking animal=new Animal("XS",1);
        animal.say();
        Animal animal1=new Human("FAR",2,"NANJING");
        animal1.say();

    }

    public static void main(String[] args) {
	// write your code here
        //System.out.println("hello,nowcoder");
        //print(1,"xs");
//        demoController();
//        demoString();
//        demoList();
//        demoSet();
//        demoKeyValue();
//        demoException();
    /*    try{
            demoException();
        }catch (NullPointerException e){
            print(1,"fail");
        }finally {
            print(2,"end");
        }*/
//    demoCommon();
        demoClass();

    }

}
