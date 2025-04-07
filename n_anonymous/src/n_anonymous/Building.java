package n_anonymous;

public class Building {
   public static void main(String[] args) {
   
      Nike gangnam = new Nike();
      gangnam.register(new Form() {
         @Override
         public void sell(String order) {
            String[] menu = getMenu();
            for (int i = 0; i < menu.length; i++) {
               if (menu[i].equals(order)) {
                  System.out.println(menu[i] + " 판매 완료");
               }
            }
         }
         @Override
         public String[] getMenu() {
            return new String[] { "운동화", "셔츠", "축구공" };
         }
      });
      
      
      
      
      
      Nike jamsil = new Nike();
      jamsil.register(new FormAdapter() {
    	  public String[] getMenu() {
          return new String[] { "운동화", "축구화", "농구화" };
       }
	});
   }
}
