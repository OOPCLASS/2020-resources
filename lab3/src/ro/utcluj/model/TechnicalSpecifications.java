package ro.utcluj.model;

public class TechnicalSpecifications {

  private Integer ramMemorySizeInMb;
  private Integer cpuFrequencyInMhz;

  public Integer getRamMemorySizeInMb() {
    return ramMemorySizeInMb;
  }

  public void setRamMemorySizeInMb(Integer ramMemorySizeInMb) {
    this.ramMemorySizeInMb = ramMemorySizeInMb;
  }

  public Integer getCpuFrequencyInMhz() {
    return cpuFrequencyInMhz;
  }

  public void setCpuFrequencyInMhz(Integer cpuFrequencyInMhz) {
    this.cpuFrequencyInMhz = cpuFrequencyInMhz;
  }
}
