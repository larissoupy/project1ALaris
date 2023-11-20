 
public class woah1A
{
    public void celsuisToFarenheit(){
        double C = 30;
        double F = 0;
        
        F = C * 1.8 + 32;
        
        System.out.print(C + " = " + F); 
        
    }
    
    public void elapsedTime(){
        //double seconds = 0;
        //double minutes = 0;
        double hours = 12;
        
        double totalSeconds = 24*60*60;
        
        double timePassed = 0;
        double timeLeft = totalSeconds;
        double percentDone = 0;
        timePassed = hours * 60 * 60;
        timeLeft = timeLeft - timePassed;
        percentDone = timePassed /totalSeconds * 100 ; //not working 
        
        System.out.println(timePassed + " seconds have passed in the day");
        System.out.println(timeLeft + " seconds left in the day");
        System.out.print(percentDone + "% of the day has passed");
    }
    
    public void secondsToHMS(){
        int setSeconds = 3601;
        int seconds = 0;
        int minutes = 0;
        int hours = 0;
        
        //mess around till it works
        seconds = setSeconds % 60;
        minutes = setSeconds / 60;
        hours = minutes / 60;
        minutes = minutes % 60;
        
        System.out.print(hours + " hours " + minutes + " minutes " + seconds + " seconds");
        
        
        
        
    }
 
    
}
