public class Eagle extends Bird implements Fly{

	 private boolean flying;
	    private int altitude;

	   
	    
	    public Eagle(String name, boolean flying, int altitude) {
			super(name);
			this.flying = flying;
			this.altitude = altitude;
		}
	    public Eagle(String name) {
			super(name);
	    }

		public void setFlying(boolean flying) {
			this.flying = flying;
		}

		public int getAltitude() {
			return altitude;
		}

		public void setAltitude(int altitude) {
			this.altitude = altitude;
				}
		
		

	    public boolean isFlying() {
	        return flying;
	    }
	   
		@Override
		public void takeOff() {
			
		            System.out.printf("%s takes off in the sky.%n", this.getName());
		     
			
		}

	
		public void ascend(int meters) {
			this.setAltitude(meters);
	        System.out.println(this.getName()+" lands on the ground : "+this.getAltitude());
			
		}

		@Override
		public void glide() {
			 if(this.altitude >110) {
				 System.out.println("It glides into the air.");
			 }
			
		}

		@Override
		public void land() {
			if (this.flying && this.altitude < 10) {
	            System.out.printf("%s is too high, it can't lands.%n", this.getName(),this.getAltitude());
	        } else {
	            System.out.printf("%s lands on the ground.%n", this.getName());
	        }
			
		}

		
		
		public void descend(int meters) {
			this.setAltitude(meters);
	        System.out.println(this.getName()+" flies downward, altitude  "+this.getAltitude());
			
		}
		@Override
		public void ascend() {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void descend() {
			// TODO Auto-generated method stub
			
		}
		@Override
		public String sing() {
			// TODO Auto-generated method stub
			return null;
		}

		
}
