package get_all_methods;

import get_all_methods.interfaces.GTIPModule;
import get_all_methods.interfaces.NCSModule;
import get_all_methods.interfaces.RTMSModule;
import get_all_methods.interfaces.SAPModule;

public class ReportGenerator {
    private GTIPModule gtip;
    private RTMSModule rtms;
    private NCSModule ncs;
    private SAPModule sap;

    public GTIPModule getGtipModule() { return this.gtip; }
    public RTMSModule getRtmsModule() { return this.rtms; }
    public NCSModule getNCSModule() { return this.ncs; }
    public SAPModule getSapModule() { return this.sap; }

    public void setGtipModule(GTIPModule gtip) { this.gtip = gtip; }
    public void setRtmsModule(RTMSModule rtms) { this.rtms = rtms; }
    public void setNcsModule(NCSModule ncs) { this.ncs = ncs; }
    public void setSapModule(SAPModule sap) { this.sap = sap; }
}
