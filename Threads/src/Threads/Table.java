package Threads;

class Table{  
void printTable(int n){//method not synchronized  
   for(int i=1;i<=5;i++){  
     System.out.println(n*i);  
     try{  
      Thread.sleep(400);  
     }catch(Exception e){System.out.println(e);}  
   }  
   class MyThread1 extends Thread{  
		Table t;  
		MyThread1(Table t){  
		this.t=t;  
		}  
		public void run(){  
		t.printTable(5);   
   }
   public static void main(String args[]){  
		Table t = new Table();//only one object  
		MyThread1 t1= new MyThread1(t);  
		My
	t1.start();  
		}  
   }
}
}
 

  
