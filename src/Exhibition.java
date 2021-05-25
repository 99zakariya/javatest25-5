import java.text.DecimalFormat;
class Exhibition extends Event {
    
    private static int gst = 5;
    private int noOfStalls;
    private DecimalFormat format;
    
    public Exhibition(String name, String type, Double costPerDay, Integer noOfDays, Integer noOfStalls){
        super(name, type, costPerDay, noOfDays);
        this.noOfStalls = noOfStalls;
        format = new DecimalFormat(".##");
    }
    
    public int getNoOfStalls(){
        return noOfStalls;
    }
    public void setNoOfStalls(int noOfStalls){
        this.noOfStalls = noOfStalls;
    }
    
   
    public Double totalCost() {
        Double total = super.getCostPerDay()*super.getNoOfDays();
        Double totalAmount = total + total*0.05;
       return totalAmount;
    }
    
    
    public String toString() {
       String str = "Event Details" +"\n";
       str += "Name:" + super.getName()+ "\n";
       str += "Type:" + super.getType()+ "\n";
       str += "Number of stalls:" + getNoOfStalls()+ "\n";
       Double total = totalCost();
       str += "Total amount:" + String.format("%.2f", total);
       return str;
       
    }
}