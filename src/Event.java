class Event{
    
    protected String name;
    protected String type;
    protected Double costPerDay;
    protected int noOfDays;
    
    public Event(String name, String type, Double costPerDay, int noOfDays) {
    setName(name);
    setType(type);
    setCostPerDay(costPerDay);
    setNoOfDays(noOfDays);
  }
    public Event(){
        super();
    }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }
  public Double getCostPerDay() {
    return costPerDay;
  }
  public void setCostPerDay(Double costPerDay) {
    this.costPerDay = costPerDay;
  }
  public int getNoOfDays() {
    return noOfDays;
  }
  public void setNoOfDays(int noOfDays) {
    this.noOfDays = noOfDays;
  }
}