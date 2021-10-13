
public class helloworld2 {
	public static void main(String[] args) {
		int in = 65;
                byte by = 1;
		short sh = 2;
		long lo = -123L;

		float fl = 12.3f;
		double dou = 12.3;
		
		boolean bo = true;
		
		char ch = 'c';
		
		int a;
		a = 5;
		
		String s = "Hello world";
		s = new String("Hi");
                String s2 = "hello world";
                
                if(in == 4){
                        System.out.println("in is equal to 4");
                } else if( in == 6){
                        System.out.println("Something else");
                } 
                else {
                        System.out.println("Actually in is equal to: " + in);
                }
                for(int i = 0; i < in; i++) {
                        if(i%2 == 0){
                                System.out.println("This is iteration: " + i);
                        }
                }
                String s3 = new String("Hi");
                System.out.println("is s == s3 ; " + (s ==s3));
            }
          }
