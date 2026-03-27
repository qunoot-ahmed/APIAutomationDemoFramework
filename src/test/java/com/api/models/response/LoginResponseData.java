package com.api.models.response;

	public class LoginResponseData {
	    private String access;
	    private String idToken;
	    private String accessToken;
	    private String refreshToken;
	    private boolean emailVerified;
	    private int expiresIn;
	    
	    public LoginResponseData() {
	    }
	    
		@Override
		public String toString() {
			return "LoginResponseData [access=" + access + ", idToken=" + idToken + ", accessToken=" + accessToken
					+ ", refreshToken=" + refreshToken + ", emailVerified=" + emailVerified + ", expiresIn=" + expiresIn
					+ "]";
		}
		
		public String getAccess() {
			return access;
		}
		
		public void setAccess(String access) {
			this.access = access;
		}
		
		public String getIdToken() {
			return idToken;
		}
		
		public void setIdToken(String idToken) {
			this.idToken = idToken;
		}
		
		public String getAccessToken() {
			return accessToken;
		}
		
		public void setAccessToken(String accessToken) {
			this.accessToken = accessToken;
		}
		
		public String getRefreshToken() {
			return refreshToken;
		}
		
		public void setRefreshToken(String refreshToken) {
			this.refreshToken = refreshToken;
		}
		
		public boolean isEmailVerified() {
			return emailVerified;
		}
		
		public void setEmailVerified(boolean emailVerified) {
			this.emailVerified = emailVerified;
		}
		
		public int getExpiresIn() {
			return expiresIn;
		}
		
		public void setExpiresIn(int expiresIn) {
			this.expiresIn = expiresIn;
		}
		
		public LoginResponseData(String access, String idToken, String accessToken, String refreshToken,
				boolean emailVerified, int expiresIn) {
			super();
			this.access = access;
			this.idToken = idToken;
			this.accessToken = accessToken;
			this.refreshToken = refreshToken;
			this.emailVerified = emailVerified;
			this.expiresIn = expiresIn;
		}  
	}
