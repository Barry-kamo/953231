public class stopwatch {
    private long StartTime = 0;
    private long StopTime = 0;
    public stopwatch() {
    }
    public void star(long time1){
        StartTime=time1;
    }
    public void stop(long time2){
        StopTime=time2;
    }
    public void getElapsedTime(){
        long time=StopTime-StartTime;
        long t1=time/1000;
        long t2=(t1-time%60)/60;
        long t3=(t2-t2%60)/60;
        long t4=(t3-t3%24)/24;
        System.out.println("Elapsed time in milliseconds : "+time);
        System.out.println("Elapsed time in seconds: "+t1);
        System.out.println("Elapsed time in minutes: "+t2);
        System.out.println("Elapsed time in hours: "+t3);
        System.out.println("Elapsed time in days: "+t4);


    }

}
