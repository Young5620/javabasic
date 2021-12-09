

// public class Main {
//   public static void main(String[] args) {
//     // if (5>4) {
//     //   System.out.println(50);
//     // } else {
//     //   System.out.println(40);
//     // }


//     //if를 사용하지 않고 조건문 -> 삼황 연산자
//     System.out.println((5>4) ? 50 :40);
//   } 
// }



/*
  반복문 - for
*/

// for each
// public class Main {
//   public static void main(String[] args) {
//     String[] number = {"one", "two", "three"};
//     for(String num:number)
//     System.out.println(num);
    
//     // for(int i = 0; i < number.length ; i++) {
//     //   System.out.println(number[i]);
//     // }
//   }
// }

// 1부터 50까지의 수들의 누적합계(break사용)
// public class Main {
//   public static void main(String[] args) {
//     int sum = 0; 

//     for(int i = 1; i <=100; i++) {
//       sum = sum + i;
//       if(i==50) {
//         break;
//       }
//     }

//     System.out.println(sum);
//   }
// }

// 1부터 100까지의 숫자중 홀수들의 합계
// public class Main {
//   public static void main(String[] args) {
//     int sum = 0;

//     for (int i = 1; i <=100 ; i++) {
//       if(i%2==0) {
//         continue;
//       }
//       sum = sum + i;
//     }
//     System.out.println(sum);
//   }
// }

// 1부터 100까지 합계
// public class Main {
//   public static void main(String[] args) {
//     int sum = 0;
//     for (int i = 1; i<=100 ; i++) {
//       sum = sum + i;
//       System.out.println("i = " + i +" sum = +" + sum);
//     }
//     System.out.println(sum);
//   }
// }




/*
  do while
  조건이 참일 동안 반복 실행한다.
  무조건 한 번은 반드시 실행된다.
*/


// import java.util.Scanner;
// public class Main{
// public static void main (String[] args) {
//   int i = 0;
//   Scanner scan = new Scanner(System.in);

//   do {
//     i = scan.nextInt();
//     System.out.println("입력받은값:" + i);
//   } while (i !=0);
//   System.out.println("종료");
// }
// }


/*
  반복문 - while
  while 은 조건이 참일 동안 계속 반복실행한다.
*/


// public class Main {
//   public static void main(String[] args) {
//     int i = 1;
//     while(i<11) {
//       if(i%2==0) {
//         System.out.println(i);
//       }
//       i++;
//     }
//   }
// }

// public class Main {
//   public static void main(String[] args) {
//     int sum = 0;
//     int i = 1;

//     while (i<=100) {
//       sum = sum + i;
//       System.out.println("i = " + i + " sum = +" +sum);
//       i++;
//       System.out.println(sum);
//     }
//   }
// }

// continue 조건에 맞지 않는 경우 실행하지 않고 다시 반복문의 처음으로 돌아가도록 하는 방법
// public class Main {
//   public static void main (String[] args) {
//     int i = 0;

//     while (i<10) {
//       i++;
//       if (i%2 ==0) {
//         System.out.println("continue로 인쇄를 하지 않는 수" + i);
//         continue;
//       }
//       System.out.println(i);
//     }
//   }
// }

//break 반복문 실행하다가 break를 만나면 구문을 빠져나간다.

// public class Main {
//   public static void main(String[] args) {
//     int coffee = 10;
//     int money = 300;

//     while(money>0) {
//       System.out.println("커피를 드립니다.");
//       coffee --;
//       System.out.println("남은 커피는" + coffee+ "입니다.");
//       if (coffee==0) {
//         System.out.println("커피가 다 떨어졌습니다.");
//         break;
//       }
//     }
//   }
// }

// public class Main {
//   public static void main(String[] args) {
//     int i =0;

//     while(true) {
//       i++;
//       System.out.println("나무를" + i + "번 찍었습니다.");
//       if(i==9) {
//         System.out.println("나무 넘어간다.");
//         break;
//       }
//     }
//   }
// }

// public class Main {
//   public static void main(String[] args) {
//     int i = 0;

//     while(i<10) {
//       i++;
//       System.out.println("나무를" + i + "번 찍었습니다.");
//       if(i==10) {
//         System.out.println("나무 넘어간다~");
//       }
//     }
//   }
// }

// public class Main{
//   public static void main(String[] args) {
//     int i = 0;

//     while(i<10) {
//       System.out.println(i+"hi~");
//       i++;
//     }
//   }
// }


/*
  switch-case 구문 - if문과 비슷하지만 좀 더 절차를 단순화 시키는 조건 판단문
*/

// import java.util.Calendar;
// public class Main {
//   public static void main(String[] args) {
//     int month = Calendar.getInstance().get(Calendar.MONTH) +1;
//     String season = "";

//     if (month <= 2) {
//       System.out.println("겨울");
//     } else if (month <=5) {
//       System.out.println("봄");
//     } else if (month <=8) {
//       System.out.println("mar");
//     } else if (month <=11) {
//       System.out.println("apr");
//     } else {
//       System.out.println("겨울");
//     }
//   }
// }

// public class Main {
//   public static void main(String[] args) {
//     int month = 3;
//     String monthString = "";

//     if (month == 1) {
//       System.out.println("jan");
//     } else if (month ==2) {
//       System.out.println("feb");
//     } else if (month ==3) {
//       System.out.println("mar");
//     } else if (month ==4) {
//       System.out.println("apr");
//     } else if (month ==5) {
//       System.out.println("may");
//     } else if (month ==6) {
//       System.out.println("jun");
//     } else if (month ==7) {
//       System.out.println("jul");
//     } else if (month ==8) {
//       System.out.println("agu");
//     } else if (month ==9) {
//       System.out.println("sep");
//     } else if (month ==10) {
//       System.out.println("oct");
//     } else if (month ==11) {
//       System.out.println("nov");
//     } else if (month ==12) {
//       System.out.println("dec");
//     }
//   }
// }

// import java.util.Calendar;
// public class Main {
//   public static void main(String[] args) {
//     int month = Calendar.getInstance().get(Calendar.MONTH) + 1;

//     String season = "";

//     if(month == 12 || month == 1 || month==2) {
//       System.out.println("겨울");
//     } else if(month == 3 || month  ==4 || month==5) {
//       System.out.println("봄");
//     } else if(month == 6||month == 7||month == 8) {
//         System.out.println("여름");
//     } else if(month == 9||month == 10||month == 11) {
//         System.out.println("겨울");
//   }
// }
// }

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