package info.java.tips.data;

public class StateData {
	private String stateId;
	private String stateName;

	public String getStateId() {
		return stateId;
	}

	public void setStateId(String stateId) {
		this.stateId = stateId;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public StateData(String stateId, String stateName) {
		super();
		this.stateId = stateId;
		this.stateName = stateName;
	}

	public StateData() {
		super();
	}

}
