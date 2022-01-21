### Math.round() 주의점

* (Math.round(ratio*1000))/**1000.0;**

  => 40.0%
  57.143%
  33.333%
  66.667%
  55.556%

* (Math.round(ratio*1000))/**1000;**

  => 40.0%
  57.0%
  33.0%
  66.0%
  55.0%



### String.format()

* String.format("%.3f", num);
* 예제
  * double pie = 3.14159265358979; double money = 4424.243423; System.out.println(String.format("%.2f", pie)); //결과 : 3.14 System.out.println(String.format("%.3f", pie)); //결과 : 3.142 System.out.println(String.format("%,.3f", money)); //결과 : 4,424.243



