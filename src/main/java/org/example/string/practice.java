package org.example.string;

public class practice {

    public static void practice1(){
        //Checking if the string a coming in the front or back of the string b and vice versa.

        //Checking the min size of a or b and checking the first and the last part of both the string if not match then return false.

        String a = "ab12";
        String b = "ab";
        String str5 = a.toLowerCase();
        String str6 = b.toLowerCase();
//        System.out.println(str5);
//        System.out.println(str6);
        int minSize = Math.min(a.length(), b.length());
        int maxSize = Math.max(a.length(), b.length());
        char c, cn;
        int cnt = 0;
        int count = 0;
//        System.out.println(minSize + " " + maxSize);
        if (b.length() > a.length()) {
            String temp = str5;
            str5 = str6;
            str6 = temp;
        }
        System.out.println(str5);
        System.out.println(str6);
        for (int i = 0; i < minSize; i++) {
            c = str5.charAt(i);
            cn = str6.charAt(i);
            System.out.print(c+" "+cn);
            if (c != cn) {
                count++;
                break;
            }
            System.out.println();
        }
        System.out.println(count);
        int j = 0;
        for (int i = maxSize - minSize; i < maxSize; i++) {
            c = str5.charAt(i);
            cn = str6.charAt(j++);
            System.out.println(c+" "+cn);
            if (c != cn) {
                cnt++;
                break;
            }
            System.out.println();
        }
        System.out.println(cnt + " " + count);
    }

    public static void practice2(){
        //Number of dog and cat should be same.
        String str = "catcatdogdog";
        int cnt1=0;
        int count1=0;
        for(int i=0;i<str.length()-2;i++){
            if(str.charAt(i)=='c' && str.charAt(i+1)=='a' && str.charAt(i+2)=='t')
                cnt1++;
            else if(str.charAt(i)=='d' && str.charAt(i+1)=='o' && str.charAt(i+2)=='g')
                count1++;
        }
        System.out.println(cnt1+" "+count1);
        if(count1==cnt1)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public static void practice3(){
        String str = "abc.xyzxyz";
//        I need to check till the '.' then the text like xyz(3 letter) so i will loop till '.' before the x like length-3.
//        for(int i=0;i<str.length()-3;i++)
//            System.out.print(str.charAt(i));
//        System.out.println();

//        String is less than size 3.
        if(str.length()<3)
            System.out.println("No");
//        xyz coming in the first.
        if(str.charAt(0)=='x' && str.charAt(1)=='y' &&
                str.charAt(2)=='z')
            System.out.println("Yes");

//        '.xyz' or 'xyz' coming in the middle of the string.
        for(int i=0;i<str.length()-3;i++){
            if(str.charAt(i)!='.' && str.charAt(i+1)=='x' && str.charAt(i+2)=='y' &&
                    str.charAt(i+3)=='z'){
                System.out.println("Yes");
            }
        }
        System.out.println("No");
    }

    public static void main(String[] args) {
//      practice1();
//      practice2();
//      practice3();
    }
}
