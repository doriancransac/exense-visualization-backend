package ch.exense.viz.persistence.model;

import java.util.List;

public class ManagerState {

	private List<Object> globalsettings;
	private boolean globalsettingsautorefresh;
	private boolean globalsettingschevron;
	private String globalsettingsname;
	private String gsautorefreshInterval;
	
	public List<Object> getGlobalsettings() {
		return globalsettings;
	}
	public void setGlobalsettings(List<Object> globalsettings) {
		this.globalsettings = globalsettings;
	}
	public boolean isGlobalsettingsautorefresh() {
		return globalsettingsautorefresh;
	}
	public void setGlobalsettingsautorefresh(boolean globalsettingsautorefresh) {
		this.globalsettingsautorefresh = globalsettingsautorefresh;
	}
	public boolean isGlobalsettingschevron() {
		return globalsettingschevron;
	}
	public void setGlobalsettingschevron(boolean globalsettingschevron) {
		this.globalsettingschevron = globalsettingschevron;
	}
	public String getGlobalsettingsname() {
		return globalsettingsname;
	}
	public void setGlobalsettingsname(String globalsettingsname) {
		this.globalsettingsname = globalsettingsname;
	}
	public String getGsautorefreshInterval() {
		return gsautorefreshInterval;
	}
	public void setGsautorefreshInterval(String gsautorefreshInterval) {
		this.gsautorefreshInterval = gsautorefreshInterval;
	}
}
