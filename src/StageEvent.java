class StageEvent extends Event{

    private static int gst = 15;
    private int noOfSeats;
    
    public StageEvent(String name, String type, Double costPerDay, Integer noOfDays, Integer noOfSeats){
        super(name, type, costPerDay, noOfDays);
        this.noOfSeats = noOfSeats;
    }
    
    public int getNoOfSeats(){
        return noOfSeats;
    }
    public void setNoOfSeats(int noOfSeats){
        this.noOfSeats = noOfSeats;
    }

  public Double totalCost() {
        Double total = super.getCostPerDay()*super.getNoOfDays();
        Double totalAmount = total + total*0.15;
       return totalAmount;
    }
    
   public String toString() {
       String str = "Event Details" +"\n";
       str += "Name:" + super.getName()+ "\n";
       str += "Type:" + super.getType()+ "\n";
       str += "Number of seats:" + getNoOfSeats() + "\n";
       Double total = totalCost();
       str += "Total amount:" + String.format("%.2f", total);
       return str;
       
    }
}