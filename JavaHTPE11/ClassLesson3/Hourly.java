package JavaHTPE11.ClassLesson3;

public class Hourly extends Employee {
    public Hourly(String name, double rate, double hours) {
        super(name); //!!!!
        setRate(rate);
        setHours(hours);
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getRate() {
        return rate;
    }

    public double getHours() {
        return hours;
    }
    //@Override
//   private double pay()  { 
//		  double res = super.minSal();
//		  if (res<rate * hours )
//			  return rate * hours;
//		  else
//			  return res;
//	   } 


    private void stamPrivate() {
        System.out.println("Hourly.stamPrivate");
    }

    public double pay() {
        //  stamPrivate();
        double res = super.minSal();
        if (res < rate * hours)
            return rate * hours;
        else
            return res;
    }

    @Override
    public String toString() {
        return super.toString() + " (rate is ..................................................... " + rate + " and hours are " + hours + ')';
    }

    private double rate;
    private double hours;


} 