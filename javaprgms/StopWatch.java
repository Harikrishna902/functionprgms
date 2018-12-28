package javaprgms;

import bridgelabz.utility.utility;

public class StopWatch 
{
public long start=0;
public long stop=0;
public long elasped;
 public void  start()
 {
	 start=System.currentTimeMillis();
	 System.out.println("start time is:"+start);
	 }
 public void stop()
 {
	 stop=System.currentTimeMillis();
	 System.out.println("stop time is:"+stop);
 }
 public long getelaspedTime()
 {
	 elasped=stop-start;
	 return elasped;
	 
 }
 public static void main(String[] args)
 {
	StopWatch sw=new StopWatch();
   System.out.println("press 0 to start");
    utility.getint();
    sw.start();
    System.out.println("press 1 to stop ");
     utility.getint();
    sw.stop();

	long l=sw.getelaspedTime();
	System.out.println();
	System.out.println("Total Time Elapsed(in millisec) is:"+l);
	System.out.println();
	System.out.println("Converting millisec to seconds: "+(l/1000)+" sec");
}

}
 


