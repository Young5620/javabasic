
/*
  switch-case 구문 - if문과 비슷하지만 좀 더 절차를 단순화 시키는 조건 판단문
*/

import java.util.Calendar;
public class Main {
  public static void main(String[] args) {
    int month = Calendar.getInstance().get(Calendar.MONTH) + 1;

    String season = "";

    if(month == 12 || month == 1 || month==2) {
      System.out.println("겨울");
    } else if(month == 3 || month  ==4 || month==5) {
      System.out.println("봄");
    } else if(month == 6||month == 7||month == 8) {
        System.out.println("여름");
    } else if(month == 9||month == 10||month == 11) {
        System.out.println("겨울");
  }
}
}

// import java.util.Calendar;
// public class Main {
//   public static void main(String[] args) {
//     int month = Calendar.getInstance().get(Calendar.MONTH) + 1;

//     String season = "";

//     switch (month) {
//       case 12 : case 1 : case 2 : 
//       season = "겨울";
//               break;        
//       case 3 : case 4 : case 5 : 
//       season = "봄";
//               break;
//       case 6 : case 7 : case 8 : 
//       season = "여름";
//               break;        
//       case 9 : case 10 : case 11 : 
//       season = "가을";
//               break;
 
//     }
//     System.out.println(season);
//   }
// }

// public class Main {
//   public static void main(String[] args) {
//     int month = 12;
//     String monthString = "";

//     switch (month) {
//       case 1 : monthString = "jan";
//               break;
//       case 2 : monthString = "feb";
//               break;        
//       case 3 : monthString = "mar";
//               break;
//       case 4 : monthString = "apr";
//               break;
//       case 5 : monthString = "may";
//               break;
//       case 6 : monthString = "jun";
//               break;
//       case 7 : monthString = "jul";
//               break;
//       case 8 : monthString = "aug";
//               break;        
//       case 9 : monthString = "sep";
//               break;
//       case 10 : monthString = "oct";
//               break;
//       case 11 : monthString = "nov";
//               break;
//       case 12 : monthString = "dec";
//               break; 
//     }
//     System.out.println(monthString);
//   }
// }




/*
  if
*/

// class Main {
//    public int IfTest(int value){
//     int ret =0;
//     if(value %3 ==0) {
//       ret = 3;
//     } else if (value % 4 ==0) {
//       ret = 4;
//     }
//     return ret;
//   }
// public static void main(String[] args) {
//   Main exam = new Main();
//   System.out.println(exam.IfTest(6));
//   System.out.println(exam.IfTest(8));
//   System.out.println(exam.IfTest(10));
// }
// }

// class Main {
//   public static void main(String[] args) {
//    int x = 50;
//    int y = 60;

//    if(x ==y) {
//      System.out.println("x는 y와 같습니다.");
//    }else {
//     System.out.println("x는 y와 다릅니다.");
//    }
//   }
// }

// import java.util.ArrayList;
// class Main {
//   public static void main(String[] args) {
//     ArrayList<String> pocket = new ArrayList<String>();

//     pocket.add("paper");
//     pocket.add("handphone");
//     pocket.add("money");

//     if (pocket.contains("card")) {
//       System.out.println("택시탄다.");
//     } else if (pocket.contains("money")) {
//       System.out.println("택시탄다.");
//     } else {
//        System.out.println("걸어간다.");
//     }


//     //경우의 수가 여러개일때 if안에 if형태로 구성하게 되면 가동성이 많이 저하->쓰지말자.

//     // if (pocket.contains("card")) {
//     //   System.out.println("택시탄다.");
//     // } else {
//     //   if (pocket.contains("money")) {
//     //     System.out.println("택시탄다.");
//     //   } else {System.out.println("걸어간다.");
//     //   }
//     // }
//   }
// }

// import java.util.ArrayList;
// class Main {
//   public static void main(String[] args) {
//     ArrayList<String> pocket = new ArrayList<String>();

//     pocket.add("paper");
//     pocket.add("handphone");
//     pocket.add("money");

//     if (pocket.contains("money")) {
//       System.out.println("택시탄다.");
//     } else {
//       System.out.println("걸어간다.");
//     }
//   }
// }

// class Main {
//   public static void main(String[] args) {
    
//     int money = 2000;
//     boolean card = true;

//     if (money >= 5000 & card) {
//       System.out.println("택시탄다.");
//     } else {
//       System.out.println("걸어간다.");
//     }

//   }
// }

// class Main {
//   public static void main(String[] args) {
    
//     int money = 2000;
//     boolean card = true;

//     if (money>=5000|| card) {
//       System.out.println("택시탄다.");
//     } else {
//       System.out.println("걸어간다.");
//     }
//   }
// }

// class Main {
//   public static void main(String[] args) {
    
//     int money = 2000;

//     if (money >= 5000) {
//       System.out.println("택시탄다.");
//     } else {
//       System.out.println("걸어간다.");
//     }
//   }
// }

// class Main {
//   public static void main(String[] args) {
    
//     boolean money = true;

//     if (money) {
//       System.out.println("택시");
//     } else {
//       System.out.println("걷기");
//     }
//   }
// }

// class Main {
//   public static void main(String[] args) {
//     if (true) {
//       System.out.println("yes");
//     }else {
//       System.out.println("no");
//     }
//   }
// }




/*
Map 맵 - 파이썬의 딕셔너리와 같은 자료구조. JS에서는 json
         데이터를 키값과 밸류값의 쌍으로 저장하는 구조
         순서(인덱스)가 없이 키값으로만 밸류값을 얻는다.

         key   value
         name  홍길동
         age   16 
*/

// import java.util.HashMap;
// class Main {
//   public static void main(String[] args) {
//     HashMap<String, String> map = new HashMap<String, String>();

//     map.put("people", "사람");
//     map.put("baseball", "야구");

//     System.out.println(map.get("people"));
//     System.out.println(map.containsKey("people"));
//     System.out.println(map.size());
//     System.out.println(map.remove("people"));
//     System.out.println(map.size());
//   }
// }


// class Main {
//   public static void main(String[] args) {
//     System.out.println("Hello world!");
//   }
// }