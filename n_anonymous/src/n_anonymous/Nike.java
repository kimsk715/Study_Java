package n_anonymous;
//	판매 방식의 등록 여부는 지점의 상태에 따라 다름.
public class Nike{
   public void register(Form form) {
      String[] menu = form.getMenu();
      for (int i = 0; i < menu.length; i++) {
         System.out.println(menu[i]);
      }
      if(form instanceof FormAdapter) {
    	  System.out.println("무료 나눔 행사");
      }
      else {
    	  form.sell("운동화");  // 일반 판매 중.
   }
   }
   }

