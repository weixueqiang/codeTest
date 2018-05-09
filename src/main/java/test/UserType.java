package test;

public enum UserType {
	TEACHER("教师", "staredu_teacher", "abc7456e2d19953eaf86e362baf0f9e8"), STUDENT("学生", "", ""), GUARDIAN("监护人", "staredu", "cef7456e2d19403eaf86e362baf0f9e8");

	private String title;
	private String appId;
	private String appSecret;

	private UserType(String title, String appId, String appSecret) {
		this.title = title;
		this.appId = appId;
		this.appSecret = appSecret;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getAppSecret() {
		return appSecret;
	}

	public void setAppSecret(String appSecret) {
		this.appSecret = appSecret;
	}

	public static UserType getType(String appId) {
		for (UserType type : UserType.values()) {
			if (type.getAppId().equals(appId)) {
				return type;
			}
		}
		return null;
	}

	
	
}
