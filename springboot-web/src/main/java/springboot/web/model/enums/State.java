package springboot.web.model.enums;

public enum State {
	Disabled(0, "Ω˚”√"), 
	Enabled(1, "∆Ù”√");

	private int code;
	private String desc;

	State(int code, String desc) {
		this.code = code;
		this.desc = desc;
	}
	
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	
	public static State getStateByCode(Integer code) {
        switch (code) {
            case 1:
                return Enabled;
            default:
                return Disabled;
        }
    }
}
